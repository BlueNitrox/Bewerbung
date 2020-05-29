package de.Tommunity.Enchant;

import de.Tommunity.Commands.EconomySystem;
import de.Tommunity.Main.Main;
import de.Tommunity.utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LevelUp implements CommandExecutor, Listener {

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

    private final String GUI_NAME = "§4Special Anvil";

    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
        Player p = (Player) cs;
        Inventory inv = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

        ItemStack slime = new ItemBuilder(Material.SLIME_BALL).setDisplayname("§a§lBestätigen")
                .setLore(Arrays.asList("§cKosten: 2000$")).build();

        ItemStack glas = new ItemBuilder(Material.STAINED_GLASS_PANE, (short) 15).setDisplayname("§7Glasscheibe").build();
        for (int i = 0; i != 9; i++) {
            inv.setItem(i, glas);
        }
        for (int i = 18; i != 27; i++) {
            inv.setItem(i, glas);
        }
        inv.setItem(9, glas);
        inv.setItem(10, glas);
        inv.setItem(12, glas);
        inv.setItem(14, glas);
        inv.setItem(16, glas);
        inv.setItem(17, glas);
        inv.setItem(15, slime);

        p.openInventory(inv);

        return false;
    }

    @EventHandler
    public void handleAnvilMenuClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getClickedInventory().getTitle().equals(GUI_NAME)
                && e.getCurrentItem().getType() == Material.STAINED_GLASS_PANE) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cSchließe das Inventar nicht wenn du Items darin hast!");
        }

        if (e.getCurrentItem().getType().equals(Material.SLIME_BALL)) {
            e.setCancelled(true);
            if (e.getClickedInventory().getItem(11).getType() != Material.AIR) {
                if (e.getClickedInventory().getItem(13).getType() != Material.AIR) {
                    if (e.getClickedInventory().getItem(13).getType() == Material.BOOK) {
                        ItemStack is = e.getClickedInventory().getItem(11);
                        ItemStack is1 = e.getClickedInventory().getItem(13);
                        EconomySystem es = new EconomySystem();
                        if (es.hasEnoughMoney(p.getUniqueId(), 2000)) {
                            if (is.getItemMeta().getLore() == null && is1.getItemMeta().getLore() != null) {
                                //Nur Bücher auf items

                                craft("§a§lTank I", is, is1, p, es);
                                craft("§a§lTank II", is, is1, p, es);
                                craft("§a§lTank III", is, is1, p, es);
                                craft("§a§lTank IV", is, is1, p, es);
                                craft("§a§lTank V", is, is1, p, es);

                                craft("§a§lLebensretter I", is, is1, p, es);
                                craft("§a§lLebensretter II", is, is1, p, es);
                                craft("§a§lLebensretter III", is, is1, p, es);
                                craft("§a§lLebensretter IV", is, is1, p, es);
                                craft("§a§lLebensretter V", is, is1, p, es);

                                craft("§6§lLevel I", is, is1, p, es);
                                craft("§6§lLevel II", is, is1, p, es);
                                craft("§6§lLevel III", is, is1, p, es);
                                craft("§6§lLevel IV", is, is1, p, es);
                                craft("§6§lLevel V", is, is1, p, es);

                                craft("§c§lRauch I", is, is1, p, es);
                                craft("§c§lRauch II", is, is1, p, es);
                                craft("§c§lRauch III", is, is1, p, es);
                                craft("§c§lRauch IV", is, is1, p, es);
                                craft("§c§lRauch V", is, is1, p, es);

                                craft("§c§lSegen I", is, is1, p, es);
                                craft("§c§lSegen II", is, is1, p, es);
                                craft("§c§lSegen III", is, is1, p, es);
                                craft("§c§lSegen IV", is, is1, p, es);
                                craft("§c§lSegen V", is, is1, p, es);

                                craft("§c§lVampir I", is, is1, p, es);
                                craft("§c§lVampir II", is, is1, p, es);
                                craft("§c§lVampir III", is, is1, p, es);
                                craft("§c§lVampir IV", is, is1, p, es);
                                craft("§c§lVampir V", is, is1, p, es);

                                craft("§6§lMining I", is, is1, p, es);
                                craft("§6§lMining II", is, is1, p, es);
                                craft("§6§lMining III", is, is1, p, es);
                                craft("§6§lMining IV", is, is1, p, es);
                                craft("§6§lMining V", is, is1, p, es);

                                craft("§6§lHaste I", is, is1, p, es);
                                craft("§6§lHaste II", is, is1, p, es);
                                craft("§6§lHaste III", is, is1, p, es);

                                craft("§c§lSchaden I", is, is1, p, es);
                                craft("§c§lSchaden II", is, is1, p, es);
                                craft("§c§lSchaden III", is, is1, p, es);
                                craft("§c§lSchaden IV", is, is1, p, es);
                                craft("§c§lSchaden V", is, is1, p, es);
                                return;
                            } else {
                                //Nur Bücher auf items wenn schon ein Enchant drauf
                                //Tank + Lebensretter
                                if (is.getType() != Material.BOOK) {
                                    if (is.getItemMeta().getLore() != null && is1.getItemMeta().getLore() != null) {
                                        if (is1.getItemMeta().getLore().contains("§a§lLebensretter I") || is1.getItemMeta().getLore().contains("§a§lLebensretter II") || is1.getItemMeta().getLore().contains("§a§lLebensretter III") || is1.getItemMeta().getLore().contains("§a§lLebensretter IV") || is1.getItemMeta().getLore().contains("§a§lLebensretter V")) {
                                            craftIfOn("§a§lTank I", "§a§lLebensretter I", is, is1, p, es);
                                            craftIfOn("§a§lTank I", "§a§lLebensretter II", is, is1, p, es);
                                            craftIfOn("§a§lTank I", "§a§lLebensretter III", is, is1, p, es);
                                            craftIfOn("§a§lTank I", "§a§lLebensretter IV", is, is1, p, es);
                                            craftIfOn("§a§lTank I", "§a§lLebensretter V", is, is1, p, es);
                                            craftIfOn("§a§lTank II", "§a§lLebensretter I", is, is1, p, es);
                                            craftIfOn("§a§lTank II", "§a§lLebensretter II", is, is1, p, es);
                                            craftIfOn("§a§lTank II", "§a§lLebensretter III", is, is1, p, es);
                                            craftIfOn("§a§lTank II", "§a§lLebensretter IV", is, is1, p, es);
                                            craftIfOn("§a§lTank II", "§a§lLebensretter V", is, is1, p, es);
                                            craftIfOn("§a§lTank III", "§a§lLebensretter I", is, is1, p, es);
                                            craftIfOn("§a§lTank III", "§a§lLebensretter II", is, is1, p, es);
                                            craftIfOn("§a§lTank III", "§a§lLebensretter III", is, is1, p, es);
                                            craftIfOn("§a§lTank III", "§a§lLebensretter IV", is, is1, p, es);
                                            craftIfOn("§a§lTank III", "§a§lLebensretter V", is, is1, p, es);
                                            craftIfOn("§a§lTank IV", "§a§lLebensretter I", is, is1, p, es);
                                            craftIfOn("§a§lTank IV", "§a§lLebensretter II", is, is1, p, es);
                                            craftIfOn("§a§lTank IV", "§a§lLebensretter III", is, is1, p, es);
                                            craftIfOn("§a§lTank IV", "§a§lLebensretter IV", is, is1, p, es);
                                            craftIfOn("§a§lTank IV", "§a§lLebensretter V", is, is1, p, es);
                                            craftIfOn("§a§lTank V", "§a§lLebensretter I", is, is1, p, es);
                                            craftIfOn("§a§lTank V", "§a§lLebensretter II", is, is1, p, es);
                                            craftIfOn("§a§lTank V", "§a§lLebensretter III", is, is1, p, es);
                                            craftIfOn("§a§lTank V", "§a§lLebensretter IV", is, is1, p, es);
                                            craftIfOn("§a§lTank V", "§a§lLebensretter V", is, is1, p, es);
                                            return;
                                        }
                                        //Lebensretter + Tank
                                        if (is1.getItemMeta().getLore().contains("§a§lTank I") || is1.getItemMeta().getLore().contains("§a§lTank II") || is1.getItemMeta().getLore().contains("§a§lTank III") || is1.getItemMeta().getLore().contains("§a§lTank IV") || is1.getItemMeta().getLore().contains("§a§lTank V")) {
                                            craftIfOn("§a§lLebensretter I", "§a§lTank I", is, is1, p, es);
                                            craftIfOn("§a§lLebensretter I", "§a§lTank II", is, is1, p, es);
                                            craftIfOn("§a§lLebensretter I", "§a§lTank III", is, is1, p, es);
                                            craftIfOn("§a§lLebensretter I", "§a§lTank IV", is, is1, p, es);
                                            craftIfOn("§a§lLebensretter I", "§a§lTank V", is, is1, p, es);
                                            craftIfOn("§a§lLebensretter II", "§a§lTank I", is, is1, p, es);
                                            craftIfOn("§a§lLebensretter II", "§a§lTank II", is, is1, p, es);
                                            craftIfOn("§a§lLebensretter II", "§a§lTank III", is, is1, p, es);
                                            craftIfOn("§a§lLebensretter II", "§a§lTank IV", is, is1, p, es);
                                            craftIfOn("§a§lLebensretter II", "§a§lTank V", is, is1, p, es);
                                            craftIfOn("§a§lLebensretter III", "§a§lTank I", is, is1, p, es);
                                            craftIfOn("§a§lLebensretter III", "§a§lTank II", is, is1, p, es);
                                            craftIfOn("§a§lLebensretter III", "§a§lTank III", is, is1, p, es);
                                            craftIfOn("§a§lLebensretter III", "§a§lTank IV", is, is1, p, es);
                                            craftIfOn("§a§lLebensretter III", "§a§lTank V", is, is1, p, es);
                                            craftIfOn("§a§lLebensretter IV", "§a§lTank I", is, is1, p, es);
                                            craftIfOn("§a§lLebensretter IV", "§a§lTank II", is, is1, p, es);
                                            craftIfOn("§a§lLebensretter IV", "§a§lTank III", is, is1, p, es);
                                            craftIfOn("§a§lLebensretter IV", "§a§lTank IV", is, is1, p, es);
                                            craftIfOn("§a§lLebensretter IV", "§a§lTank V", is, is1, p, es);
                                            craftIfOn("§a§lLebensretter V", "§a§lTank I", is, is1, p, es);
                                            craftIfOn("§a§lLebensretter V", "§a§lTank II", is, is1, p, es);
                                            craftIfOn("§a§lLebensretter V", "§a§lTank III", is, is1, p, es);
                                            craftIfOn("§a§lLebensretter V", "§a§lTank IV", is, is1, p, es);
                                            craftIfOn("§a§lLebensretter V", "§a§lTank V", is, is1, p, es);
                                            return;
                                        }

                                        //Rauch + Segen
                                        if (is1.getItemMeta().getLore().contains("§c§lSegen I") || is1.getItemMeta().getLore().contains("§c§lSegen II") || is1.getItemMeta().getLore().contains("§c§lSegen III") || is1.getItemMeta().getLore().contains("§c§lSegen IV") || is1.getItemMeta().getLore().contains("§c§lSegen V")) {
                                            craftIfOn("§c§lRauch I", "§c§lSegen I", is, is1, p, es);
                                            craftIfOn("§c§lRauch I", "§c§lSegen II", is, is1, p, es);
                                            craftIfOn("§c§lRauch I", "§c§lSegen III", is, is1, p, es);
                                            craftIfOn("§c§lRauch I", "§c§lSegen IV", is, is1, p, es);
                                            craftIfOn("§c§lRauch I", "§c§lSegen V", is, is1, p, es);
                                            craftIfOn("§c§lRauch II", "§c§lSegen I", is, is1, p, es);
                                            craftIfOn("§c§lRauch II", "§c§lSegen II", is, is1, p, es);
                                            craftIfOn("§c§lRauch II", "§c§lSegen III", is, is1, p, es);
                                            craftIfOn("§c§lRauch II", "§c§lSegen IV", is, is1, p, es);
                                            craftIfOn("§c§lRauch II", "§c§lSegen V", is, is1, p, es);
                                            craftIfOn("§c§lRauch III", "§c§lSegen I", is, is1, p, es);
                                            craftIfOn("§c§lRauch III", "§c§lSegen II", is, is1, p, es);
                                            craftIfOn("§c§lRauch III", "§c§lSegen III", is, is1, p, es);
                                            craftIfOn("§c§lRauch III", "§c§lSegen IV", is, is1, p, es);
                                            craftIfOn("§c§lRauch III", "§c§lSegen V", is, is1, p, es);
                                            craftIfOn("§c§lRauch IV", "§c§lSegen I", is, is1, p, es);
                                            craftIfOn("§c§lRauch IV", "§c§lSegen II", is, is1, p, es);
                                            craftIfOn("§c§lRauch IV", "§c§lSegen III", is, is1, p, es);
                                            craftIfOn("§c§lRauch IV", "§c§lSegen IV", is, is1, p, es);
                                            craftIfOn("§c§lRauch IV", "§c§lSegen V", is, is1, p, es);
                                            craftIfOn("§c§lRauch V", "§c§lSegen I", is, is1, p, es);
                                            craftIfOn("§c§lRauch V", "§c§lSegen II", is, is1, p, es);
                                            craftIfOn("§c§lRauch V", "§c§lSegen III", is, is1, p, es);
                                            craftIfOn("§c§lRauch V", "§c§lSegen IV", is, is1, p, es);
                                            craftIfOn("§c§lRauch V", "§c§lSegen V", is, is1, p, es);
                                            return;
                                        }

                                        //Rauch + Vampir
                                        if (is1.getItemMeta().getLore().contains("§c§lVampir I") || is1.getItemMeta().getLore().contains("§c§lVampir II") || is1.getItemMeta().getLore().contains("§c§lVampir III") || is1.getItemMeta().getLore().contains("§c§lVampir IV") || is1.getItemMeta().getLore().contains("§c§lVampir V")) {
                                            craftIfOn("§c§lRauch I", "§c§lVampir I", is, is1, p, es);
                                            craftIfOn("§c§lRauch I", "§c§lVampir II", is, is1, p, es);
                                            craftIfOn("§c§lRauch I", "§c§lVampir III", is, is1, p, es);
                                            craftIfOn("§c§lRauch I", "§c§lVampir IV", is, is1, p, es);
                                            craftIfOn("§c§lRauch I", "§c§lVampir V", is, is1, p, es);
                                            craftIfOn("§c§lRauch II", "§c§lVampir I", is, is1, p, es);
                                            craftIfOn("§c§lRauch II", "§c§lVampir II", is, is1, p, es);
                                            craftIfOn("§c§lRauch II", "§c§lVampir III", is, is1, p, es);
                                            craftIfOn("§c§lRauch II", "§c§lVampir IV", is, is1, p, es);
                                            craftIfOn("§c§lRauch II", "§c§lVampir V", is, is1, p, es);
                                            craftIfOn("§c§lRauch III", "§c§lVampir I", is, is1, p, es);
                                            craftIfOn("§c§lRauch III", "§c§lVampir II", is, is1, p, es);
                                            craftIfOn("§c§lRauch III", "§c§lVampir III", is, is1, p, es);
                                            craftIfOn("§c§lRauch III", "§c§lVampir IV", is, is1, p, es);
                                            craftIfOn("§c§lRauch III", "§c§lVampir V", is, is1, p, es);
                                            craftIfOn("§c§lRauch IV", "§c§lVampir I", is, is1, p, es);
                                            craftIfOn("§c§lRauch IV", "§c§lVampir II", is, is1, p, es);
                                            craftIfOn("§c§lRauch IV", "§c§lVampir III", is, is1, p, es);
                                            craftIfOn("§c§lRauch IV", "§c§lVampir IV", is, is1, p, es);
                                            craftIfOn("§c§lRauch IV", "§c§lVampir V", is, is1, p, es);
                                            craftIfOn("§c§lRauch V", "§c§lVampir I", is, is1, p, es);
                                            craftIfOn("§c§lRauch V", "§c§lVampir II", is, is1, p, es);
                                            craftIfOn("§c§lRauch V", "§c§lVampir III", is, is1, p, es);
                                            craftIfOn("§c§lRauch V", "§c§lVampir IV", is, is1, p, es);
                                            craftIfOn("§c§lRauch V", "§c§lVampir V", is, is1, p, es);
                                            return;
                                        }

                                        //Rauch + Schaden
                                        if (is1.getItemMeta().getLore().contains("§c§lSchaden I") || is1.getItemMeta().getLore().contains("§c§lSchaden II") || is1.getItemMeta().getLore().contains("§c§lSchaden III") || is1.getItemMeta().getLore().contains("§c§lSchaden IV") || is1.getItemMeta().getLore().contains("§c§lSchaden V")) {
                                            craftIfOn("§c§lRauch I", "§c§lSchaden I", is, is1, p, es);
                                            craftIfOn("§c§lRauch I", "§c§lSchaden II", is, is1, p, es);
                                            craftIfOn("§c§lRauch I", "§c§lSchaden III", is, is1, p, es);
                                            craftIfOn("§c§lRauch I", "§c§lSchaden IV", is, is1, p, es);
                                            craftIfOn("§c§lRauch I", "§c§lSchaden V", is, is1, p, es);
                                            craftIfOn("§c§lRauch II", "§c§lSchaden I", is, is1, p, es);
                                            craftIfOn("§c§lRauch II", "§c§lSchaden II", is, is1, p, es);
                                            craftIfOn("§c§lRauch II", "§c§lSchaden III", is, is1, p, es);
                                            craftIfOn("§c§lRauch II", "§c§lSchaden IV", is, is1, p, es);
                                            craftIfOn("§c§lRauch II", "§c§lSchaden V", is, is1, p, es);
                                            craftIfOn("§c§lRauch III", "§c§lSchaden I", is, is1, p, es);
                                            craftIfOn("§c§lRauch III", "§c§lSchaden II", is, is1, p, es);
                                            craftIfOn("§c§lRauch III", "§c§lSchaden III", is, is1, p, es);
                                            craftIfOn("§c§lRauch III", "§c§lSchaden IV", is, is1, p, es);
                                            craftIfOn("§c§lRauch III", "§c§lSchaden V", is, is1, p, es);
                                            craftIfOn("§c§lRauch IV", "§c§lSchaden I", is, is1, p, es);
                                            craftIfOn("§c§lRauch IV", "§c§lSchaden II", is, is1, p, es);
                                            craftIfOn("§c§lRauch IV", "§c§lSchaden III", is, is1, p, es);
                                            craftIfOn("§c§lRauch IV", "§c§lSchaden IV", is, is1, p, es);
                                            craftIfOn("§c§lRauch IV", "§c§lSchaden V", is, is1, p, es);
                                            craftIfOn("§c§lRauch V", "§c§lSchaden I", is, is1, p, es);
                                            craftIfOn("§c§lRauch V", "§c§lSchaden II", is, is1, p, es);
                                            craftIfOn("§c§lRauch V", "§c§lSchaden III", is, is1, p, es);
                                            craftIfOn("§c§lRauch V", "§c§lSchaden IV", is, is1, p, es);
                                            craftIfOn("§c§lRauch V", "§c§lSchaden V", is, is1, p, es);
                                            return;
                                        }

                                        //Segen + Rauch
                                        if (is1.getItemMeta().getLore().contains("§c§lRauch I") || is1.getItemMeta().getLore().contains("§c§lRauch II") || is1.getItemMeta().getLore().contains("§c§lRauch III") || is1.getItemMeta().getLore().contains("§c§lRauch IV") || is1.getItemMeta().getLore().contains("§c§lRauch V")) {
                                            craftIfOn("§c§lSegen I", "§c§lRauch I", is, is1, p, es);
                                            craftIfOn("§c§lSegen I", "§c§lRauch II", is, is1, p, es);
                                            craftIfOn("§c§lSegen I", "§c§lRauch III", is, is1, p, es);
                                            craftIfOn("§c§lSegen I", "§c§lRauch IV", is, is1, p, es);
                                            craftIfOn("§c§lSegen I", "§c§lRauch V", is, is1, p, es);
                                            craftIfOn("§c§lSegen II", "§c§lRauch I", is, is1, p, es);
                                            craftIfOn("§c§lSegen II", "§c§lRauch II", is, is1, p, es);
                                            craftIfOn("§c§lSegen II", "§c§lRauch III", is, is1, p, es);
                                            craftIfOn("§c§lSegen II", "§c§lRauch IV", is, is1, p, es);
                                            craftIfOn("§c§lSegen II", "§c§lRauch V", is, is1, p, es);
                                            craftIfOn("§c§lSegen III", "§c§lRauch I", is, is1, p, es);
                                            craftIfOn("§c§lSegen III", "§c§lRauch II", is, is1, p, es);
                                            craftIfOn("§c§lSegen III", "§c§lRauch III", is, is1, p, es);
                                            craftIfOn("§c§lSegen III", "§c§lRauch IV", is, is1, p, es);
                                            craftIfOn("§c§lSegen III", "§c§lRauch V", is, is1, p, es);
                                            craftIfOn("§c§lSegen IV", "§c§lRauch I", is, is1, p, es);
                                            craftIfOn("§c§lSegen IV", "§c§lRauch II", is, is1, p, es);
                                            craftIfOn("§c§lSegen IV", "§c§lRauch III", is, is1, p, es);
                                            craftIfOn("§c§lSegen IV", "§c§lRauch IV", is, is1, p, es);
                                            craftIfOn("§c§lSegen IV", "§c§lRauch V", is, is1, p, es);
                                            craftIfOn("§c§lSegen V", "§c§lRauch I", is, is1, p, es);
                                            craftIfOn("§c§lSegen V", "§c§lRauch II", is, is1, p, es);
                                            craftIfOn("§c§lSegen V", "§c§lRauch III", is, is1, p, es);
                                            craftIfOn("§c§lSegen V", "§c§lRauch IV", is, is1, p, es);
                                            craftIfOn("§c§lSegen V", "§c§lRauch V", is, is1, p, es);
                                            return;
                                        }

                                        //Segen + Vampir
                                        if (is1.getItemMeta().getLore().contains("§c§lVampir I") || is1.getItemMeta().getLore().contains("§c§lVampir II") || is1.getItemMeta().getLore().contains("§c§lVampir III") || is1.getItemMeta().getLore().contains("§c§lVampir IV") || is1.getItemMeta().getLore().contains("§c§lVampir V")) {
                                            craftIfOn("§c§lSegen I", "§c§lVampir I", is, is1, p, es);
                                            craftIfOn("§c§lSegen I", "§c§lVampir II", is, is1, p, es);
                                            craftIfOn("§c§lSegen I", "§c§lVampir III", is, is1, p, es);
                                            craftIfOn("§c§lSegen I", "§c§lVampir IV", is, is1, p, es);
                                            craftIfOn("§c§lSegen I", "§c§lVampir V", is, is1, p, es);
                                            craftIfOn("§c§lSegen II", "§c§lVampir I", is, is1, p, es);
                                            craftIfOn("§c§lSegen II", "§c§lVampir II", is, is1, p, es);
                                            craftIfOn("§c§lSegen II", "§c§lVampir III", is, is1, p, es);
                                            craftIfOn("§c§lSegen II", "§c§lVampir IV", is, is1, p, es);
                                            craftIfOn("§c§lSegen II", "§c§lVampir V", is, is1, p, es);
                                            craftIfOn("§c§lSegen III", "§c§lVampir I", is, is1, p, es);
                                            craftIfOn("§c§lSegen III", "§c§lVampir II", is, is1, p, es);
                                            craftIfOn("§c§lSegen III", "§c§lVampir III", is, is1, p, es);
                                            craftIfOn("§c§lSegen III", "§c§lVampir IV", is, is1, p, es);
                                            craftIfOn("§c§lSegen III", "§c§lVampir V", is, is1, p, es);
                                            craftIfOn("§c§lSegen IV", "§c§lVampir I", is, is1, p, es);
                                            craftIfOn("§c§lSegen IV", "§c§lVampir II", is, is1, p, es);
                                            craftIfOn("§c§lSegen IV", "§c§lVampir III", is, is1, p, es);
                                            craftIfOn("§c§lSegen IV", "§c§lVampir IV", is, is1, p, es);
                                            craftIfOn("§c§lSegen IV", "§c§lVampir V", is, is1, p, es);
                                            craftIfOn("§c§lSegen V", "§c§lVampir I", is, is1, p, es);
                                            craftIfOn("§c§lSegen V", "§c§lVampir II", is, is1, p, es);
                                            craftIfOn("§c§lSegen V", "§c§lVampir III", is, is1, p, es);
                                            craftIfOn("§c§lSegen V", "§c§lVampir IV", is, is1, p, es);
                                            craftIfOn("§c§lSegen V", "§c§lVampir V", is, is1, p, es);
                                            return;
                                        }

                                        //Segen + Schaden
                                        if (is1.getItemMeta().getLore().contains("§c§lSchaden I") || is1.getItemMeta().getLore().contains("§c§lSchaden II") || is1.getItemMeta().getLore().contains("§c§lSchaden III") || is1.getItemMeta().getLore().contains("§c§lSchaden IV") || is1.getItemMeta().getLore().contains("§c§lSchaden V")) {
                                            craftIfOn("§c§lSegen I", "§c§lSchaden I", is, is1, p, es);
                                            craftIfOn("§c§lSegen I", "§c§lSchaden II", is, is1, p, es);
                                            craftIfOn("§c§lSegen I", "§c§lSchaden III", is, is1, p, es);
                                            craftIfOn("§c§lSegen I", "§c§lSchaden IV", is, is1, p, es);
                                            craftIfOn("§c§lSegen I", "§c§lSchaden V", is, is1, p, es);
                                            craftIfOn("§c§lSegen II", "§c§lSchaden I", is, is1, p, es);
                                            craftIfOn("§c§lSegen II", "§c§lSchaden II", is, is1, p, es);
                                            craftIfOn("§c§lSegen II", "§c§lSchaden III", is, is1, p, es);
                                            craftIfOn("§c§lSegen II", "§c§lSchaden IV", is, is1, p, es);
                                            craftIfOn("§c§lSegen II", "§c§lSchaden V", is, is1, p, es);
                                            craftIfOn("§c§lSegen III", "§c§lSchaden I", is, is1, p, es);
                                            craftIfOn("§c§lSegen III", "§c§lSchaden II", is, is1, p, es);
                                            craftIfOn("§c§lSegen III", "§c§lSchaden III", is, is1, p, es);
                                            craftIfOn("§c§lSegen III", "§c§lSchaden IV", is, is1, p, es);
                                            craftIfOn("§c§lSegen III", "§c§lSchaden V", is, is1, p, es);
                                            craftIfOn("§c§lSegen IV", "§c§lSchaden I", is, is1, p, es);
                                            craftIfOn("§c§lSegen IV", "§c§lSchaden II", is, is1, p, es);
                                            craftIfOn("§c§lSegen IV", "§c§lSchaden III", is, is1, p, es);
                                            craftIfOn("§c§lSegen IV", "§c§lSchaden IV", is, is1, p, es);
                                            craftIfOn("§c§lSegen IV", "§c§lSchaden V", is, is1, p, es);
                                            craftIfOn("§c§lSegen V", "§c§lSchaden I", is, is1, p, es);
                                            craftIfOn("§c§lSegen V", "§c§lSchaden II", is, is1, p, es);
                                            craftIfOn("§c§lSegen V", "§c§lSchaden III", is, is1, p, es);
                                            craftIfOn("§c§lSegen V", "§c§lSchaden IV", is, is1, p, es);
                                            craftIfOn("§c§lSegen V", "§c§lSchaden V", is, is1, p, es);
                                            return;
                                        }

                                        //Schaden + Rauch
                                        if (is1.getItemMeta().getLore().contains("§c§lRauch I") || is1.getItemMeta().getLore().contains("§c§lRauch II") || is1.getItemMeta().getLore().contains("§c§lRauch III") || is1.getItemMeta().getLore().contains("§c§lRauch IV") || is1.getItemMeta().getLore().contains("§c§lRauch V")) {
                                            craftIfOn("§c§lSchaden I", "§c§lRauch I", is, is1, p, es);
                                            craftIfOn("§c§lSchaden I", "§c§lRauch II", is, is1, p, es);
                                            craftIfOn("§c§lSchaden I", "§c§lRauch III", is, is1, p, es);
                                            craftIfOn("§c§lSchaden I", "§c§lRauch IV", is, is1, p, es);
                                            craftIfOn("§c§lSchaden I", "§c§lRauch V", is, is1, p, es);
                                            craftIfOn("§c§lSchaden II", "§c§lRauch I", is, is1, p, es);
                                            craftIfOn("§c§lSchaden II", "§c§lRauch II", is, is1, p, es);
                                            craftIfOn("§c§lSchaden II", "§c§lRauch III", is, is1, p, es);
                                            craftIfOn("§c§lSchaden II", "§c§lRauch IV", is, is1, p, es);
                                            craftIfOn("§c§lSchaden II", "§c§lRauch V", is, is1, p, es);
                                            craftIfOn("§c§lSchaden III", "§c§lRauch I", is, is1, p, es);
                                            craftIfOn("§c§lSchaden III", "§c§lRauch II", is, is1, p, es);
                                            craftIfOn("§c§lSchaden III", "§c§lRauch III", is, is1, p, es);
                                            craftIfOn("§c§lSchaden III", "§c§lRauch IV", is, is1, p, es);
                                            craftIfOn("§c§lSchaden III", "§c§lRauch V", is, is1, p, es);
                                            craftIfOn("§c§lSchaden IV", "§c§lRauch I", is, is1, p, es);
                                            craftIfOn("§c§lSchaden IV", "§c§lRauch II", is, is1, p, es);
                                            craftIfOn("§c§lSchaden IV", "§c§lRauch III", is, is1, p, es);
                                            craftIfOn("§c§lSchaden IV", "§c§lRauch IV", is, is1, p, es);
                                            craftIfOn("§c§lSchaden IV", "§c§lRauch V", is, is1, p, es);
                                            craftIfOn("§c§lSchaden V", "§c§lRauch I", is, is1, p, es);
                                            craftIfOn("§c§lSchaden V", "§c§lRauch II", is, is1, p, es);
                                            craftIfOn("§c§lSchaden V", "§c§lRauch III", is, is1, p, es);
                                            craftIfOn("§c§lSchaden V", "§c§lRauch IV", is, is1, p, es);
                                            craftIfOn("§c§lSchaden V", "§c§lRauch V", is, is1, p, es);
                                            return;
                                        }

                                        //Schaden + Vampir
                                        if (is1.getItemMeta().getLore().contains("§c§lVampir I") || is1.getItemMeta().getLore().contains("§c§lVampir II") || is1.getItemMeta().getLore().contains("§c§lVampir III") || is1.getItemMeta().getLore().contains("§c§lVampir IV") || is1.getItemMeta().getLore().contains("§c§lVampir V")) {
                                            craftIfOn("§c§lSchaden I", "§c§lVampir I", is, is1, p, es);
                                            craftIfOn("§c§lSchaden I", "§c§lVampir II", is, is1, p, es);
                                            craftIfOn("§c§lSchaden I", "§c§lVampir III", is, is1, p, es);
                                            craftIfOn("§c§lSchaden I", "§c§lVampir IV", is, is1, p, es);
                                            craftIfOn("§c§lSchaden I", "§c§lVampir V", is, is1, p, es);
                                            craftIfOn("§c§lSchaden II", "§c§lVampir I", is, is1, p, es);
                                            craftIfOn("§c§lSchaden II", "§c§lVampir II", is, is1, p, es);
                                            craftIfOn("§c§lSchaden II", "§c§lVampir III", is, is1, p, es);
                                            craftIfOn("§c§lSchaden II", "§c§lVampir IV", is, is1, p, es);
                                            craftIfOn("§c§lSchaden II", "§c§lVampir V", is, is1, p, es);
                                            craftIfOn("§c§lSchaden III", "§c§lVampir I", is, is1, p, es);
                                            craftIfOn("§c§lSchaden III", "§c§lVampir II", is, is1, p, es);
                                            craftIfOn("§c§lSchaden III", "§c§lVampir III", is, is1, p, es);
                                            craftIfOn("§c§lSchaden III", "§c§lVampir IV", is, is1, p, es);
                                            craftIfOn("§c§lSchaden III", "§c§lVampir V", is, is1, p, es);
                                            craftIfOn("§c§lSchaden IV", "§c§lVampir I", is, is1, p, es);
                                            craftIfOn("§c§lSchaden IV", "§c§lVampir II", is, is1, p, es);
                                            craftIfOn("§c§lSchaden IV", "§c§lVampir III", is, is1, p, es);
                                            craftIfOn("§c§lSchaden IV", "§c§lVampir IV", is, is1, p, es);
                                            craftIfOn("§c§lSchaden IV", "§c§lVampir V", is, is1, p, es);
                                            craftIfOn("§c§lSchaden V", "§c§lVampir I", is, is1, p, es);
                                            craftIfOn("§c§lSchaden V", "§c§lVampir II", is, is1, p, es);
                                            craftIfOn("§c§lSchaden V", "§c§lVampir III", is, is1, p, es);
                                            craftIfOn("§c§lSchaden V", "§c§lVampir IV", is, is1, p, es);
                                            craftIfOn("§c§lSchaden V", "§c§lVampir V", is, is1, p, es);
                                            return;
                                        }

                                        //Schaden + Segen
                                        if (is1.getItemMeta().getLore().contains("§c§lSegen I") || is1.getItemMeta().getLore().contains("§c§lSegen II") || is1.getItemMeta().getLore().contains("§c§lSegen III") || is1.getItemMeta().getLore().contains("§c§lSegen IV") || is1.getItemMeta().getLore().contains("§c§lSegen V")) {
                                            craftIfOn("§c§lSchaden I", "§c§lSegen I", is, is1, p, es);
                                            craftIfOn("§c§lSchaden I", "§c§lSegen II", is, is1, p, es);
                                            craftIfOn("§c§lSchaden I", "§c§lSegen III", is, is1, p, es);
                                            craftIfOn("§c§lSchaden I", "§c§lSegen IV", is, is1, p, es);
                                            craftIfOn("§c§lSchaden I", "§c§lSegen V", is, is1, p, es);
                                            craftIfOn("§c§lSchaden II", "§c§lSegen I", is, is1, p, es);
                                            craftIfOn("§c§lSchaden II", "§c§lSegen II", is, is1, p, es);
                                            craftIfOn("§c§lSchaden II", "§c§lSegen III", is, is1, p, es);
                                            craftIfOn("§c§lSchaden II", "§c§lSegen IV", is, is1, p, es);
                                            craftIfOn("§c§lSchaden II", "§c§lSegen V", is, is1, p, es);
                                            craftIfOn("§c§lSchaden III", "§c§lSegen I", is, is1, p, es);
                                            craftIfOn("§c§lSchaden III", "§c§lSegen II", is, is1, p, es);
                                            craftIfOn("§c§lSchaden III", "§c§lSegen III", is, is1, p, es);
                                            craftIfOn("§c§lSchaden III", "§c§lSegen IV", is, is1, p, es);
                                            craftIfOn("§c§lSchaden III", "§c§lSegen V", is, is1, p, es);
                                            craftIfOn("§c§lSchaden IV", "§c§lSegen I", is, is1, p, es);
                                            craftIfOn("§c§lSchaden IV", "§c§lSegen II", is, is1, p, es);
                                            craftIfOn("§c§lSchaden IV", "§c§lSegen III", is, is1, p, es);
                                            craftIfOn("§c§lSchaden IV", "§c§lSegen IV", is, is1, p, es);
                                            craftIfOn("§c§lSchaden IV", "§c§lSegen V", is, is1, p, es);
                                            craftIfOn("§c§lSchaden V", "§c§lSegen I", is, is1, p, es);
                                            craftIfOn("§c§lSchaden V", "§c§lSegen II", is, is1, p, es);
                                            craftIfOn("§c§lSchaden V", "§c§lSegen III", is, is1, p, es);
                                            craftIfOn("§c§lSchaden V", "§c§lSegen IV", is, is1, p, es);
                                            craftIfOn("§c§lSchaden V", "§c§lSegen V", is, is1, p, es);
                                            return;
                                        }

                                        //Vampir + Rauch
                                        if (is1.getItemMeta().getLore().contains("§c§lRauch I") || is1.getItemMeta().getLore().contains("§c§lRauch II") || is1.getItemMeta().getLore().contains("§c§lRauch III") || is1.getItemMeta().getLore().contains("§c§lRauch IV") || is1.getItemMeta().getLore().contains("§c§lRauch V")) {
                                            craftIfOn("§c§lVampir I", "§c§lRauch I", is, is1, p, es);
                                            craftIfOn("§c§lVampir I", "§c§lRauch II", is, is1, p, es);
                                            craftIfOn("§c§lVampir I", "§c§lRauch III", is, is1, p, es);
                                            craftIfOn("§c§lVampir I", "§c§lRauch IV", is, is1, p, es);
                                            craftIfOn("§c§lVampir I", "§c§lRauch V", is, is1, p, es);
                                            craftIfOn("§c§lVampir II", "§c§lRauch I", is, is1, p, es);
                                            craftIfOn("§c§lVampir II", "§c§lRauch II", is, is1, p, es);
                                            craftIfOn("§c§lVampir II", "§c§lRauch III", is, is1, p, es);
                                            craftIfOn("§c§lVampir II", "§c§lRauch IV", is, is1, p, es);
                                            craftIfOn("§c§lVampir II", "§c§lRauch V", is, is1, p, es);
                                            craftIfOn("§c§lVampir III", "§c§lRauch I", is, is1, p, es);
                                            craftIfOn("§c§lVampir III", "§c§lRauch II", is, is1, p, es);
                                            craftIfOn("§c§lVampir III", "§c§lRauch III", is, is1, p, es);
                                            craftIfOn("§c§lVampir III", "§c§lRauch IV", is, is1, p, es);
                                            craftIfOn("§c§lVampir III", "§c§lRauch V", is, is1, p, es);
                                            craftIfOn("§c§lVampir IV", "§c§lRauch I", is, is1, p, es);
                                            craftIfOn("§c§lVampir IV", "§c§lRauch II", is, is1, p, es);
                                            craftIfOn("§c§lVampir IV", "§c§lRauch III", is, is1, p, es);
                                            craftIfOn("§c§lVampir IV", "§c§lRauch IV", is, is1, p, es);
                                            craftIfOn("§c§lVampir IV", "§c§lRauch V", is, is1, p, es);
                                            craftIfOn("§c§lVampir V", "§c§lRauch I", is, is1, p, es);
                                            craftIfOn("§c§lVampir V", "§c§lRauch II", is, is1, p, es);
                                            craftIfOn("§c§lVampir V", "§c§lRauch III", is, is1, p, es);
                                            craftIfOn("§c§lVampir V", "§c§lRauch IV", is, is1, p, es);
                                            craftIfOn("§c§lVampir V", "§c§lRauch V", is, is1, p, es);
                                            return;
                                        }
                                        //Vampir + Schaden
                                        if (is1.getItemMeta().getLore().contains("§c§lSchaden I") || is1.getItemMeta().getLore().contains("§c§lSchaden II") || is1.getItemMeta().getLore().contains("§c§lSchaden III") || is1.getItemMeta().getLore().contains("§c§lSchaden IV") || is1.getItemMeta().getLore().contains("§c§lSchaden V")) {
                                            craftIfOn("§c§lVampir I", "§c§lSchaden I", is, is1, p, es);
                                            craftIfOn("§c§lVampir I", "§c§lSchaden II", is, is1, p, es);
                                            craftIfOn("§c§lVampir I", "§c§lSchaden III", is, is1, p, es);
                                            craftIfOn("§c§lVampir I", "§c§lSchaden IV", is, is1, p, es);
                                            craftIfOn("§c§lVampir I", "§c§lSchaden V", is, is1, p, es);
                                            craftIfOn("§c§lVampir II", "§c§lSchaden I", is, is1, p, es);
                                            craftIfOn("§c§lVampir II", "§c§lSchaden II", is, is1, p, es);
                                            craftIfOn("§c§lVampir II", "§c§lSchaden III", is, is1, p, es);
                                            craftIfOn("§c§lVampir II", "§c§lSchaden IV", is, is1, p, es);
                                            craftIfOn("§c§lVampir II", "§c§lSchaden V", is, is1, p, es);
                                            craftIfOn("§c§lVampir III", "§c§lSchaden I", is, is1, p, es);
                                            craftIfOn("§c§lVampir III", "§c§lSchaden II", is, is1, p, es);
                                            craftIfOn("§c§lVampir III", "§c§lSchaden III", is, is1, p, es);
                                            craftIfOn("§c§lVampir III", "§c§lSchaden IV", is, is1, p, es);
                                            craftIfOn("§c§lVampir III", "§c§lSchaden V", is, is1, p, es);
                                            craftIfOn("§c§lVampir IV", "§c§lSchaden I", is, is1, p, es);
                                            craftIfOn("§c§lVampir IV", "§c§lSchaden II", is, is1, p, es);
                                            craftIfOn("§c§lVampir IV", "§c§lSchaden III", is, is1, p, es);
                                            craftIfOn("§c§lVampir IV", "§c§lSchaden IV", is, is1, p, es);
                                            craftIfOn("§c§lVampir IV", "§c§lSchaden V", is, is1, p, es);
                                            craftIfOn("§c§lVampir V", "§c§lSchaden I", is, is1, p, es);
                                            craftIfOn("§c§lVampir V", "§c§lSchaden II", is, is1, p, es);
                                            craftIfOn("§c§lVampir V", "§c§lSchaden III", is, is1, p, es);
                                            craftIfOn("§c§lVampir V", "§c§lSchaden IV", is, is1, p, es);
                                            craftIfOn("§c§lVampir V", "§c§lSchaden V", is, is1, p, es);
                                            return;
                                        }

                                        //Vampir + Segen
                                        if (is1.getItemMeta().getLore().contains("§c§lSegen I") || is1.getItemMeta().getLore().contains("§c§lSegen II") || is1.getItemMeta().getLore().contains("§c§lSegen III") || is1.getItemMeta().getLore().contains("§c§lSegen IV") || is1.getItemMeta().getLore().contains("§c§lSegen V")) {
                                            craftIfOn("§c§lVampir I", "§c§lSegen I", is, is1, p, es);
                                            craftIfOn("§c§lVampir I", "§c§lSegen II", is, is1, p, es);
                                            craftIfOn("§c§lVampir I", "§c§lSegen III", is, is1, p, es);
                                            craftIfOn("§c§lVampir I", "§c§lSegen IV", is, is1, p, es);
                                            craftIfOn("§c§lVampir I", "§c§lSegen V", is, is1, p, es);
                                            craftIfOn("§c§lVampir II", "§c§lSegen I", is, is1, p, es);
                                            craftIfOn("§c§lVampir II", "§c§lSegen II", is, is1, p, es);
                                            craftIfOn("§c§lVampir II", "§c§lSegen III", is, is1, p, es);
                                            craftIfOn("§c§lVampir II", "§c§lSegen IV", is, is1, p, es);
                                            craftIfOn("§c§lVampir II", "§c§lSegen V", is, is1, p, es);
                                            craftIfOn("§c§lVampir III", "§c§lSegen I", is, is1, p, es);
                                            craftIfOn("§c§lVampir III", "§c§lSegen II", is, is1, p, es);
                                            craftIfOn("§c§lVampir III", "§c§lSegen III", is, is1, p, es);
                                            craftIfOn("§c§lVampir III", "§c§lSegen IV", is, is1, p, es);
                                            craftIfOn("§c§lVampir III", "§c§lSegen V", is, is1, p, es);
                                            craftIfOn("§c§lVampir IV", "§c§lSegen I", is, is1, p, es);
                                            craftIfOn("§c§lVampir IV", "§c§lSegen II", is, is1, p, es);
                                            craftIfOn("§c§lVampir IV", "§c§lSegen III", is, is1, p, es);
                                            craftIfOn("§c§lVampir IV", "§c§lSegen IV", is, is1, p, es);
                                            craftIfOn("§c§lVampir IV", "§c§lSegen V", is, is1, p, es);
                                            craftIfOn("§c§lVampir V", "§c§lSegen I", is, is1, p, es);
                                            craftIfOn("§c§lVampir V", "§c§lSegen II", is, is1, p, es);
                                            craftIfOn("§c§lVampir V", "§c§lSegen III", is, is1, p, es);
                                            craftIfOn("§c§lVampir V", "§c§lSegen IV", is, is1, p, es);
                                            craftIfOn("§c§lVampir V", "§c§lSegen V", is, is1, p, es);
                                            return;
                                        }
                                        //Drachenatem + Level
                                        if (is1.getItemMeta().getLore().contains("§a§lLevel I") || is1.getItemMeta().getLore().contains("§a§lLevel II") || is1.getItemMeta().getLore().contains("§a§lLevel III") || is1.getItemMeta().getLore().contains("§a§lLevel IV") || is1.getItemMeta().getLore().contains("§a§lLevel V")) {
                                            craftIfOn("§6§lDrachenatem I", "§6§lLevel I", is, is1, p, es);
                                            craftIfOn("§6§lDrachenatem I", "§6§lLevel II", is, is1, p, es);
                                            craftIfOn("§6§lDrachenatem I", "§6§lLevel III", is, is1, p, es);
                                            craftIfOn("§6§lDrachenatem I", "§6§lLevel IV", is, is1, p, es);
                                            craftIfOn("§6§lDrachenatem I", "§6§lLevel V", is, is1, p, es);
                                            craftIfOn("§6§lDrachenatem II", "§6§lLevel I", is, is1, p, es);
                                            craftIfOn("§6§lDrachenatem II", "§6§lLevel II", is, is1, p, es);
                                            craftIfOn("§6§lDrachenatem II", "§6§lLevel III", is, is1, p, es);
                                            craftIfOn("§6§lDrachenatem II", "§6§lLevel IV", is, is1, p, es);
                                            craftIfOn("§6§lDrachenatem II", "§6§lLevel V", is, is1, p, es);
                                            craftIfOn("§6§lDrachenatem III", "§6§lLevel I", is, is1, p, es);
                                            craftIfOn("§6§lDrachenatem III", "§6§lLevel II", is, is1, p, es);
                                            craftIfOn("§6§lDrachenatem III", "§6§lLevel III", is, is1, p, es);
                                            craftIfOn("§6§lDrachenatem III", "§6§lLevel IV", is, is1, p, es);
                                            craftIfOn("§6§lDrachenatem III", "§6§lLevel V", is, is1, p, es);
                                            craftIfOn("§6§lDrachenatem IV", "§6§lLevel I", is, is1, p, es);
                                            craftIfOn("§6§lDrachenatem IV", "§6§lLevel II", is, is1, p, es);
                                            craftIfOn("§6§lDrachenatem IV", "§6§lLevel III", is, is1, p, es);
                                            craftIfOn("§6§lDrachenatem IV", "§6§lLevel IV", is, is1, p, es);
                                            craftIfOn("§6§lDrachenatem IV", "§6§lLevel V", is, is1, p, es);
                                            craftIfOn("§6§lDrachenatem V", "§6§lLevel I", is, is1, p, es);
                                            craftIfOn("§6§lDrachenatem V", "§6§lLevel II", is, is1, p, es);
                                            craftIfOn("§6§lDrachenatem V", "§6§lLevel III", is, is1, p, es);
                                            craftIfOn("§6§lDrachenatem V", "§6§lLevel IV", is, is1, p, es);
                                            craftIfOn("§6§lDrachenatem V", "§6§lLevel V", is, is1, p, es);
                                            return;
                                        }

                                        //Level + Mining
                                        if (is1.getItemMeta().getLore().contains("§a§lMining I") || is1.getItemMeta().getLore().contains("§a§lMining II") || is1.getItemMeta().getLore().contains("§a§lMining III") || is1.getItemMeta().getLore().contains("§a§lMining IV") || is1.getItemMeta().getLore().contains("§a§lMining V")) {
                                            craftIfOn("§6§lLevel I", "§6§lMining I", is, is1, p, es);
                                            craftIfOn("§6§lLevel I", "§6§lMining II", is, is1, p, es);
                                            craftIfOn("§6§lLevel I", "§6§lMining III", is, is1, p, es);
                                            craftIfOn("§6§lLevel I", "§6§lMining IV", is, is1, p, es);
                                            craftIfOn("§6§lLevel I", "§6§lMining V", is, is1, p, es);
                                            craftIfOn("§6§lLevel II", "§6§lMining I", is, is1, p, es);
                                            craftIfOn("§6§lLevel II", "§6§lMining II", is, is1, p, es);
                                            craftIfOn("§6§lLevel II", "§6§lMining III", is, is1, p, es);
                                            craftIfOn("§6§lLevel II", "§6§lMining IV", is, is1, p, es);
                                            craftIfOn("§6§lLevel II", "§6§lMining V", is, is1, p, es);
                                            craftIfOn("§6§lLevel III", "§6§lMining I", is, is1, p, es);
                                            craftIfOn("§6§lLevel III", "§6§lMining II", is, is1, p, es);
                                            craftIfOn("§6§lLevel III", "§6§lMining III", is, is1, p, es);
                                            craftIfOn("§6§lLevel III", "§6§lMining IV", is, is1, p, es);
                                            craftIfOn("§6§lLevel III", "§6§lMining V", is, is1, p, es);
                                            craftIfOn("§6§lLevel IV", "§6§lMining I", is, is1, p, es);
                                            craftIfOn("§6§lLevel IV", "§6§lMining II", is, is1, p, es);
                                            craftIfOn("§6§lLevel IV", "§6§lMining III", is, is1, p, es);
                                            craftIfOn("§6§lLevel IV", "§6§lMining IV", is, is1, p, es);
                                            craftIfOn("§6§lLevel IV", "§6§lMining V", is, is1, p, es);
                                            craftIfOn("§6§lLevel V", "§6§lMining I", is, is1, p, es);
                                            craftIfOn("§6§lLevel V", "§6§lMining II", is, is1, p, es);
                                            craftIfOn("§6§lLevel V", "§6§lMining III", is, is1, p, es);
                                            craftIfOn("§6§lLevel V", "§6§lMining IV", is, is1, p, es);
                                            craftIfOn("§6§lLevel V", "§6§lMining V", is, is1, p, es);
                                            return;
                                        }
                                            //Level + Haste
                                        if (is1.getItemMeta().getLore().contains("§a§lHaste I") || is1.getItemMeta().getLore().contains("§a§lHaste II") || is1.getItemMeta().getLore().contains("§a§lHaste III") || is1.getItemMeta().getLore().contains("§a§lHaste IV") || is1.getItemMeta().getLore().contains("§a§lHaste V")) {
                                            craftIfOn("§6§lLevel I", "§6§lHaste I", is, is1, p, es);
                                            craftIfOn("§6§lLevel I", "§6§lHaste II", is, is1, p, es);
                                            craftIfOn("§6§lLevel I", "§6§lHaste III", is, is1, p, es);
                                            craftIfOn("§6§lLevel II", "§6§lHaste I", is, is1, p, es);
                                            craftIfOn("§6§lLevel II", "§6§lHaste II", is, is1, p, es);
                                            craftIfOn("§6§lLevel II", "§6§lHaste III", is, is1, p, es);
                                            craftIfOn("§6§lLevel III", "§6§lHaste I", is, is1, p, es);
                                            craftIfOn("§6§lLevel III", "§6§lHaste II", is, is1, p, es);
                                            craftIfOn("§6§lLevel III", "§6§lHaste III", is, is1, p, es);
                                            craftIfOn("§6§lLevel IV", "§6§lHaste I", is, is1, p, es);
                                            craftIfOn("§6§lLevel IV", "§6§lHaste II", is, is1, p, es);
                                            craftIfOn("§6§lLevel IV", "§6§lHaste III", is, is1, p, es);
                                            craftIfOn("§6§lLevel V", "§6§lHaste I", is, is1, p, es);
                                            craftIfOn("§6§lLevel V", "§6§lHaste II", is, is1, p, es);
                                            craftIfOn("§6§lLevel V", "§6§lHaste III", is, is1, p, es);
                                            return;
                                        }
                                        //Mining + Level
                                        if (is1.getItemMeta().getLore().contains("§a§lLevel I") || is1.getItemMeta().getLore().contains("§a§lLevel II") || is1.getItemMeta().getLore().contains("§a§lLevel III") || is1.getItemMeta().getLore().contains("§a§lLevel IV") || is1.getItemMeta().getLore().contains("§a§lLevel V")) {
                                            craftIfOn("§6§lMining I", "§6§lLevel I", is, is1, p, es);
                                            craftIfOn("§6§lMining I", "§6§lLevel II", is, is1, p, es);
                                            craftIfOn("§6§lMining I", "§6§lLevel III", is, is1, p, es);
                                            craftIfOn("§6§lMining I", "§6§lLevel IV", is, is1, p, es);
                                            craftIfOn("§6§lMining I", "§6§lLevel V", is, is1, p, es);
                                            craftIfOn("§6§lMining II", "§6§lLevel I", is, is1, p, es);
                                            craftIfOn("§6§lMining II", "§6§lLevel II", is, is1, p, es);
                                            craftIfOn("§6§lMining II", "§6§lLevel III", is, is1, p, es);
                                            craftIfOn("§6§lMining II", "§6§lLevel IV", is, is1, p, es);
                                            craftIfOn("§6§lMining II", "§6§lLevel V", is, is1, p, es);
                                            craftIfOn("§6§lMining III", "§6§lLevel I", is, is1, p, es);
                                            craftIfOn("§6§lMining III", "§6§lLevel II", is, is1, p, es);
                                            craftIfOn("§6§lMining III", "§6§lLevel III", is, is1, p, es);
                                            craftIfOn("§6§lMining III", "§6§lLevel IV", is, is1, p, es);
                                            craftIfOn("§6§lMining III", "§6§lLevel V", is, is1, p, es);
                                            craftIfOn("§6§lMining IV", "§6§lLevel I", is, is1, p, es);
                                            craftIfOn("§6§lMining IV", "§6§lLevel II", is, is1, p, es);
                                            craftIfOn("§6§lMining IV", "§6§lLevel III", is, is1, p, es);
                                            craftIfOn("§6§lMining IV", "§6§lLevel IV", is, is1, p, es);
                                            craftIfOn("§6§lMining IV", "§6§lLevel V", is, is1, p, es);
                                            craftIfOn("§6§lMining V", "§6§lLevel I", is, is1, p, es);
                                            craftIfOn("§6§lMining V", "§6§lLevel II", is, is1, p, es);
                                            craftIfOn("§6§lMining V", "§6§lLevel III", is, is1, p, es);
                                            craftIfOn("§6§lMining V", "§6§lLevel IV", is, is1, p, es);
                                            craftIfOn("§6§lMining V", "§6§lLevel V", is, is1, p, es);
                                            return;
                                        }
                                        //Mining + Haste
                                        if (is1.getItemMeta().getLore().contains("§a§lHaste I") || is1.getItemMeta().getLore().contains("§a§lHaste II") || is1.getItemMeta().getLore().contains("§a§lHaste III") || is1.getItemMeta().getLore().contains("§a§lHaste IV") || is1.getItemMeta().getLore().contains("§a§lHaste V")) {
                                            craftIfOn("§6§lMining I", "§6§lHaste I", is, is1, p, es);
                                            craftIfOn("§6§lMining I", "§6§lHaste II", is, is1, p, es);
                                            craftIfOn("§6§lMining I", "§6§lHaste III", is, is1, p, es);
                                            craftIfOn("§6§lMining II", "§6§lHaste I", is, is1, p, es);
                                            craftIfOn("§6§lMining II", "§6§lHaste II", is, is1, p, es);
                                            craftIfOn("§6§lMining II", "§6§lHaste III", is, is1, p, es);
                                            craftIfOn("§6§lMining III", "§6§lHaste I", is, is1, p, es);
                                            craftIfOn("§6§lMining III", "§6§lHaste II", is, is1, p, es);
                                            craftIfOn("§6§lMining III", "§6§lHaste III", is, is1, p, es);
                                            craftIfOn("§6§lMining IV", "§6§lHaste I", is, is1, p, es);
                                            craftIfOn("§6§lMining IV", "§6§lHaste II", is, is1, p, es);
                                            craftIfOn("§6§lMining IV", "§6§lHaste III", is, is1, p, es);
                                            craftIfOn("§6§lMining V", "§6§lHaste I", is, is1, p, es);
                                            craftIfOn("§6§lMining V", "§6§lHaste II", is, is1, p, es);
                                            craftIfOn("§6§lMining V", "§6§lHaste III", is, is1, p, es);
                                            return;
                                        }

                                        //Haste + Level
                                        if (is1.getItemMeta().getLore().contains("§a§lLevel I") || is1.getItemMeta().getLore().contains("§a§lLevel II") || is1.getItemMeta().getLore().contains("§a§lLevel III") || is1.getItemMeta().getLore().contains("§a§lLevel IV") || is1.getItemMeta().getLore().contains("§a§lLevel V")) {
                                            craftIfOn("§6§lHaste I", "§6§lLevel I", is, is1, p, es);
                                            craftIfOn("§6§lHaste I", "§6§lLevel II", is, is1, p, es);
                                            craftIfOn("§6§lHaste I", "§6§lLevel III", is, is1, p, es);
                                            craftIfOn("§6§lHaste I", "§6§lLevel IV", is, is1, p, es);
                                            craftIfOn("§6§lHaste I", "§6§lLevel V", is, is1, p, es);
                                            craftIfOn("§6§lHaste II", "§6§lLevel I", is, is1, p, es);
                                            craftIfOn("§6§lHaste II", "§6§lLevel II", is, is1, p, es);
                                            craftIfOn("§6§lHaste II", "§6§lLevel III", is, is1, p, es);
                                            craftIfOn("§6§lHaste II", "§6§lLevel IV", is, is1, p, es);
                                            craftIfOn("§6§lHaste II", "§6§lLevel V", is, is1, p, es);
                                            craftIfOn("§6§lHaste III", "§6§lLevel I", is, is1, p, es);
                                            craftIfOn("§6§lHaste III", "§6§lLevel II", is, is1, p, es);
                                            craftIfOn("§6§lHaste III", "§6§lLevel III", is, is1, p, es);
                                            craftIfOn("§6§lHaste III", "§6§lLevel IV", is, is1, p, es);
                                            craftIfOn("§6§lHaste III", "§6§lLevel V", is, is1, p, es);
                                            return;
                                        }
                                        //Haste + Mining
                                        if (is1.getItemMeta().getLore().contains("§a§lMining I") || is1.getItemMeta().getLore().contains("§a§lMining II") || is1.getItemMeta().getLore().contains("§a§lMining III") || is1.getItemMeta().getLore().contains("§a§lMining IV") || is1.getItemMeta().getLore().contains("§a§lMining V")) {
                                            craftIfOn("§6§lHaste I", "§6§lMining I", is, is1, p, es);
                                            craftIfOn("§6§lHaste I", "§6§lMining II", is, is1, p, es);
                                            craftIfOn("§6§lHaste I", "§6§lMining III", is, is1, p, es);
                                            craftIfOn("§6§lHaste I", "§6§lMining IV", is, is1, p, es);
                                            craftIfOn("§6§lHaste I", "§6§lMining V", is, is1, p, es);
                                            craftIfOn("§6§lHaste II", "§6§lMining I", is, is1, p, es);
                                            craftIfOn("§6§lHaste II", "§6§lMining II", is, is1, p, es);
                                            craftIfOn("§6§lHaste II", "§6§lMining III", is, is1, p, es);
                                            craftIfOn("§6§lHaste II", "§6§lMining IV", is, is1, p, es);
                                            craftIfOn("§6§lHaste II", "§6§lMining V", is, is1, p, es);
                                            craftIfOn("§6§lHaste III", "§6§lMining I", is, is1, p, es);
                                            craftIfOn("§6§lHaste III", "§6§lMining II", is, is1, p, es);
                                            craftIfOn("§6§lHaste III", "§6§lMining III", is, is1, p, es);
                                            craftIfOn("§6§lHaste III", "§6§lMining IV", is, is1, p, es);
                                            craftIfOn("§6§lHaste III", "§6§lMining V", is, is1, p, es);
                                            return;
                                        }
                                    }
                                } else {
                                    //Bücher zsm craften
                                    //Rauch
                                    if (is.getType() == Material.BOOK && is1.getType() == Material.BOOK) {
                                        if (is.getItemMeta().getLore() != null && is1.getItemMeta().getLore() != null) {
                                            bookcraft("§a§lTank I", "§a§lTank II", is, is1, p, es);
                                            bookcraft("§a§lTank II", "§a§lTank III", is, is1, p, es);
                                            bookcraft("§a§lTank III", "§a§lTank IV", is, is1, p, es);
                                            bookcraft("§a§lTank IV", "§a§lTank V", is, is1, p, es);

                                            //Lebensretter

                                            bookcraft("§a§lLebensretter I", "§a§lLebensretter II", is, is1, p, es);
                                            bookcraft("§a§lLebensretter II", "§a§lLebensretter III", is, is1, p, es);
                                            bookcraft("§a§lLebensretter III", "§a§lLebensretter IV", is, is1, p, es);
                                            bookcraft("§a§lLebensretter IV", "§a§lLebensretter V", is, is1, p, es);

                                            //Rauch

                                            bookcraft("§c§lRauch I", "§c§lRauch II", is, is1, p, es);
                                            bookcraft("§c§lRauch II", "§c§lRauch III", is, is1, p, es);
                                            bookcraft("§c§lRauch III", "§c§lRauch IV", is, is1, p, es);
                                            bookcraft("§c§lRauch IV", "§c§lRauch V", is, is1, p, es);

                                            //Segen

                                            bookcraft("§c§lSegen I", "§c§lSegen II", is, is1, p, es);
                                            bookcraft("§c§lSegen II", "§c§lSegen III", is, is1, p, es);
                                            bookcraft("§c§lSegen III", "§c§lSegen IV", is, is1, p, es);
                                            bookcraft("§c§lSegen IV", "§c§lSegen V", is, is1, p, es);

                                            //Vampir

                                            bookcraft("§c§lVampir I", "§c§lVampir II", is, is1, p, es);
                                            bookcraft("§c§lVampir II", "§c§lVampir III", is, is1, p, es);
                                            bookcraft("§c§lVampir III", "§c§lVampir IV", is, is1, p, es);
                                            bookcraft("§c§lVampir IV", "§c§lVampir V", is, is1, p, es);

                                            //Schaden

                                            bookcraft("§c§lSchaden I", "§c§lSchaden II", is, is1, p, es);
                                            bookcraft("§c§lSchaden II", "§c§lSchaden III", is, is1, p, es);
                                            bookcraft("§c§lSchaden III", "§c§lSchaden IV", is, is1, p, es);
                                            bookcraft("§c§lSchaden IV", "§c§lSchaden V", is, is1, p, es);

                                            //Level

                                            bookcraft("§6§lLevel I", "§6§lLevel II", is, is1, p, es);
                                            bookcraft("§6§lLevel II", "§6§lLevel III", is, is1, p, es);
                                            bookcraft("§6§lLevel III", "§6§lLevel IV", is, is1, p, es);
                                            bookcraft("§6§lLevel IV", "§6§lLevel V", is, is1, p, es);

                                            //Haste

                                            bookcraft("§6§lHaste I", "§6§lHaste II", is, is1, p, es);
                                            bookcraft("§6§lHaste II", "§6§lHaste III", is, is1, p, es);

                                            //Mining

                                            bookcraft("§6§lMining I", "§6§lMining II", is, is1, p, es);
                                            bookcraft("§6§lMining II", "§6§lMining III", is, is1, p, es);
                                            bookcraft("§6§lMining III", "§6§lMining IV", is, is1, p, es);
                                            bookcraft("§6§lMining IV", "§6§lMining V", is, is1, p, es);

                                            //Drachenatem

                                            bookcraft("§6§lDrachenatem I", "§6§lDrachenatem II", is, is1, p, es);
                                            bookcraft("§6§lDrachenatem II", "§6§lDrachenatem III", is, is1, p, es);
                                            bookcraft("§6§lDrachenatem III", "§6§lDrachenatem IV", is, is1, p, es);
                                            bookcraft("§6§lDrachenatem IV", "§6§lDrachenatem V", is, is1, p, es);

                                            p.sendMessage(Main.pre + "§aDeine Items wurden zusammengemacht!");
                                        }
                                    }
                                }
                            }
                        } else {
                            p.sendMessage(Main.pre + "§cDazu hast du nicht genug Geld!");
                        }
                    }
                }
            }
        }
    }


    public void craft(String enchantNeu, ItemStack is, ItemStack is1, Player p, EconomySystem es){
        if (is.getItemMeta().getLore() == null && is1.getItemMeta().getLore().contains(enchantNeu)) {
            ItemStack isn = is;
            ItemMeta imn = is.getItemMeta();
            imn.setLore(Arrays.asList(enchantNeu));
            p.closeInventory();
            isn.setItemMeta(imn);
            p.getInventory().addItem(isn);
            es.removeMoney(p.getUniqueId(), 2000);
            p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
            return;
        }
    }

    public void craftIfOn(String enchantalt, String enchantNeu, ItemStack is, ItemStack is1, Player p, EconomySystem es){
        if (is.getItemMeta().getLore().contains(enchantalt) && is1.getItemMeta().getLore().contains(enchantNeu)) {
            ItemStack isn = is;
            ItemMeta imn = is.getItemMeta();
            List<String> imnn = imn.getLore();
            ArrayList<String> lore = new ArrayList<String>();
            lore.addAll(imnn);
            lore.add(enchantNeu);
            imn.setLore(lore);
            isn.setItemMeta(imn);;
            p.getInventory().addItem(isn);
            p.closeInventory();
            es.removeMoney(p.getUniqueId(), 2000);
            p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
            return;
        }
    }

    public void bookcraft(String enchant, String enchantHoch,ItemStack is, ItemStack is1, Player p, EconomySystem es){
        if (is.getItemMeta().getLore().contains(enchant) && is1.getItemMeta().getLore().contains(enchant)) {
            ItemStack isn = is;
            ItemMeta imn = is.getItemMeta();
            imn.setLore(Arrays.asList(enchantHoch));
            isn.setItemMeta(imn);
            p.getInventory().addItem(isn);
            p.closeInventory();
            es.removeMoney(p.getUniqueId(), 2000);
            p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
            return;
        }
    }


}
