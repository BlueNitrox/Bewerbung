package de.Tommunity.Enchant;

import de.Tommunity.API.ActionbarAPI.ActionBarAPI;
import de.Tommunity.Commands.EconomySystem;
import de.Tommunity.Main.Main;
import de.Tommunity.utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anvil implements Listener {

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */


    public static String GUI_NAME = "§7Amboss";

    @EventHandler
    public void onrightAnvil(final PlayerInteractEvent e){
        Player p = (Player)e.getPlayer();
        if(e.getAction() == Action.RIGHT_CLICK_BLOCK){
            if(e.getClickedBlock().getType() == Material.ANVIL){
                e.setCancelled(true);
                Inventory inv = Bukkit.createInventory(null, 3*9, GUI_NAME);
                ItemStack anvil = new ItemStack(Material.ANVIL);
                ItemMeta anvil1 = anvil.getItemMeta();
                anvil1.setDisplayName("§7Normaler Amboss");
                anvil1.setLore(Arrays.asList("§7Klicke hier um einen Normal Amboss zu öffnen!"));
                anvil.setItemMeta(anvil1);


                ItemStack slime = new ItemBuilder(Material.SLIME_BALL).setDisplayname("§a§lBestätigen")
                        .setLore(Arrays.asList("§cKosten: 2000$")).build();

                ItemStack glas = new ItemBuilder(Material.STAINED_GLASS_PANE, (short) 15).setDisplayname("§7Glasscheibe").build();
                for (int i = 0; i != 9; i++) {
                    inv.setItem(i, glas);
                }
                for (int i = 19; i != 27; i++) {
                    inv.setItem(i, glas);
                }
                inv.setItem(9, glas);
                inv.setItem(10, glas);
                inv.setItem(12, glas);
                inv.setItem(14, glas);
                inv.setItem(16, glas);
                inv.setItem(17, glas);
                inv.setItem(15, slime);

                inv.setItem(18, anvil);

                p.openInventory(inv);
            }
        }
    }

    @EventHandler
    public void onClickGUI(final InventoryClickEvent e){
        Player p = (Player)e.getWhoClicked();
        if(e.getClickedInventory().getName().equalsIgnoreCase(GUI_NAME)){
            e.setCancelled(true);
            if(e.getCurrentItem().getType() == Material.ANVIL){
                Inventory inv = Bukkit.createInventory(null, InventoryType.ANVIL , "§7Normaler Amboss");
                p.openInventory(inv);
            }else if (e.getCurrentItem().getType().equals(Material.SLIME_BALL)) {
                e.setCancelled(true);
                if (e.getClickedInventory().getItem(11).getType() != Material.AIR) {
                    if (e.getClickedInventory().getItem(13).getType() != Material.AIR) {
                        if (e.getClickedInventory().getItem(11).getType() != Material.BOOK) {
                            ItemStack is = e.getClickedInventory().getItem(11);
                            ItemStack is1 = e.getClickedInventory().getItem(13);
                            EconomySystem es = new EconomySystem();
                            if (es.hasEnoughMoney(p.getUniqueId(), 2000)) {
                                // Keine Enchants auf Item!!
                                if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§a§lTank I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§a§lTank I"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.closeInventory();
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                } else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§a§lTank II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§a§lTank II"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                } else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§a§lTank III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§a§lTank III"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                } else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§a§lTank IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§a§lTank IV"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                }if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§6§lUpgrade I"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.closeInventory();
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§c§lSegen I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§c§lSegen I"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.closeInventory();
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                } else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§c§lSegen II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§c§lSegen II"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                } else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§c§lSegen III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§c§lSegen III"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                } else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§c§lSegen IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§c§lSegen IV"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                } else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§c§lSegen V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§c§lSegen V"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                } else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§a§lLebensretter I"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.closeInventory();

                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                } else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§a§lLebensretter II"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                } else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§a§lLebensretter III"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                } else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§a§lLebensretter IV"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                } else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§a§lLebensretter V"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                } else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§6§lLevel I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§6§lLevel I"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.closeInventory();

                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                } else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§6§lLevel II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§6§lLevel II"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                } else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§6§lLevel III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§6§lLevel III"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                } else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§6§lLevel IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§6§lLevel IV"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                } else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§6§lLevel V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§6§lLevel V"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                } else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§c§lRauch I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§c§lRauch I"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.closeInventory();

                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                } else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§c§lRauch II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§c§lRauch II"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                } else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§c§lRauch III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§c§lRauch III"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                } else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§c§lRauch IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§c§lRauch IV"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                } else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§c§lRauch V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§c§lRauch V"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                } // Enchats auf item
                                else if (is.getItemMeta().getLore().contains("§a§lTank I")
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lLebensretter I");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lTank II")
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lLebensretter I");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lTank III")
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lLebensretter I");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lTank IV")
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lLebensretter I");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lTank V")
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lLebensretter I");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lTank I")
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lLebensretter II");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lTank II")
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lLebensretter II");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lTank III")
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lLebensretter II");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lTank IV")
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lLebensretter II");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lTank V")
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lLebensretter II");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lTank I")
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lLebensretter III");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lTank II")
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lLebensretter III");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lTank III")
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lLebensretter III");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lTank IV")
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lLebensretter III");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lTank V")
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lLebensretter III");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lTank I")
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lLebensretter IV");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lTank II")
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lLebensretter IV");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lTank III")
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lLebensretter IV");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lTank IV")
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lLebensretter IV");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lTank V")
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lLebensretter IV");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lTank I")
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lLebensretter V");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lTank II")
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lLebensretter V");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lTank III")
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lLebensretter V");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lTank IV")
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lLebensretter V");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lTank V")
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lLebensretter V");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lLebensretter I")
                                        && is1.getItemMeta().getLore().contains("§a§lTank I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lTank I");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lLebensretter II")
                                        && is1.getItemMeta().getLore().contains("§a§lTank I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lTank I");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lLebensretter III")
                                        && is1.getItemMeta().getLore().contains("§a§lTank I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lTank I");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lLebensretter IV")
                                        && is1.getItemMeta().getLore().contains("§a§lTank I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lTank I");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lLebensretter V")
                                        && is1.getItemMeta().getLore().contains("§a§lTank I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lTank I");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lLebensretter I")
                                        && is1.getItemMeta().getLore().contains("§a§lTank II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lTank II");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lLebensretter II")
                                        && is1.getItemMeta().getLore().contains("§a§lTank II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lTank II");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lLebensretter III")
                                        && is1.getItemMeta().getLore().contains("§a§lTank II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lTank II");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lLebensretter IV")
                                        && is1.getItemMeta().getLore().contains("§a§lTank II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lTank II");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lLebensretter V")
                                        && is1.getItemMeta().getLore().contains("§a§lTank II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lTank II");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lLebensretter I")
                                        && is1.getItemMeta().getLore().contains("§a§lTank III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lTank III");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lLebensretter II")
                                        && is1.getItemMeta().getLore().contains("§a§lTank III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lTank III");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lLebensretter III")
                                        && is1.getItemMeta().getLore().contains("§a§lTank III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lTank III");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lLebensretter IV")
                                        && is1.getItemMeta().getLore().contains("§a§lTank III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lTank III");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lLebensretter V")
                                        && is1.getItemMeta().getLore().contains("§a§lTank III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lTank III");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lLebensretter I")
                                        && is1.getItemMeta().getLore().contains("§a§lTank IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lTank IV");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lLebensretter II")
                                        && is1.getItemMeta().getLore().contains("§a§lTank IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lTank IV");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lLebensretter III")
                                        && is1.getItemMeta().getLore().contains("§a§lTank IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lTank IV");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lLebensretter IV")
                                        && is1.getItemMeta().getLore().contains("§a§lTank IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lTank IV");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lLebensretter V")
                                        && is1.getItemMeta().getLore().contains("§a§lTank IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lTank IV");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lLebensretter I")
                                        && is1.getItemMeta().getLore().contains("§a§lTank V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lTank V");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lLebensretter II")
                                        && is1.getItemMeta().getLore().contains("§a§lTank V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lTank V");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lLebensretter III")
                                        && is1.getItemMeta().getLore().contains("§a§lTank V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lTank V");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lLebensretter IV")
                                        && is1.getItemMeta().getLore().contains("§a§lTank V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lTank V");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§a§lLebensretter V")
                                        && is1.getItemMeta().getLore().contains("§a§lTank V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§a§lTank V");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lRauch I")
                                        && is1.getItemMeta().getLore().contains("§c§lSegen I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lSegen I");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lRauch II")
                                        && is1.getItemMeta().getLore().contains("§c§lSegen I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lSegen I");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lRauch III")
                                        && is1.getItemMeta().getLore().contains("§c§lSegen I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lSegen I");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lRauch IV")
                                        && is1.getItemMeta().getLore().contains("§c§lSegen I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lSegen I");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lRauch V")
                                        && is1.getItemMeta().getLore().contains("§c§lSegen I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lSegen I");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lRauch I")
                                        && is1.getItemMeta().getLore().contains("§c§lSegen II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lSegen II");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lRauch II")
                                        && is1.getItemMeta().getLore().contains("§c§lSegen II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lSegen II");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lRauch III")
                                        && is1.getItemMeta().getLore().contains("§c§lSegen II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lSegen II");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lRauch IV")
                                        && is1.getItemMeta().getLore().contains("§c§lSegen II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lSegen II");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lRauch V")
                                        && is1.getItemMeta().getLore().contains("§c§lSegen II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lSegen II");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lRauch I")
                                        && is1.getItemMeta().getLore().contains("§c§lSegen III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lSegen III");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lRauch II")
                                        && is1.getItemMeta().getLore().contains("§c§lSegen III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lSegen III");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lRauch III")
                                        && is1.getItemMeta().getLore().contains("§c§lSegen III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lSegen III");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lRauch IV")
                                        && is1.getItemMeta().getLore().contains("§c§lSegen III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lSegen III");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lRauch V")
                                        && is1.getItemMeta().getLore().contains("§c§lSegen III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lSegen III");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lRauch I")
                                        && is1.getItemMeta().getLore().contains("§c§lSegen IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lSegen IV");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lRauch II")
                                        && is1.getItemMeta().getLore().contains("§c§lSegen IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lSegen IV");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lRauch III")
                                        && is1.getItemMeta().getLore().contains("§c§lSegen IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lSegen IV");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lRauch IV")
                                        && is1.getItemMeta().getLore().contains("§c§lSegen IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lSegen IV");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lRauch V")
                                        && is1.getItemMeta().getLore().contains("§c§lSegen IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lSegen IV");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lRauch I")
                                        && is1.getItemMeta().getLore().contains("§c§lSegen V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lSegen V");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lRauch II")
                                        && is1.getItemMeta().getLore().contains("§c§lSegen V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lSegen V");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lRauch III")
                                        && is1.getItemMeta().getLore().contains("§c§lSegen V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lSegen V");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lRauch IV")
                                        && is1.getItemMeta().getLore().contains("§c§lSegen V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lSegen V");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lRauch V")
                                        && is1.getItemMeta().getLore().contains("§c§lSegen V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lSegen V");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lSegen I")
                                        && is1.getItemMeta().getLore().contains("§c§lRauch I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lRauch I");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lSegen II")
                                        && is1.getItemMeta().getLore().contains("§c§lRauch I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lRauch I");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lSegen III")
                                        && is1.getItemMeta().getLore().contains("§c§lRauch I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lRauch I");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lSegen IV")
                                        && is1.getItemMeta().getLore().contains("§c§lRauch I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lRauch I");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lSegen V")
                                        && is1.getItemMeta().getLore().contains("§c§lRauch I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lRauch I");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lSegen I")
                                        && is1.getItemMeta().getLore().contains("§c§lRauch II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lRauch II");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lSegen II")
                                        && is1.getItemMeta().getLore().contains("§c§lRauch II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lRauch II");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lSegen III")
                                        && is1.getItemMeta().getLore().contains("§c§lRauch II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lRauch II");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lSegen IV")
                                        && is1.getItemMeta().getLore().contains("§c§lRauch II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lRauch II");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lSegen V")
                                        && is1.getItemMeta().getLore().contains("§c§lRauch II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lRauch II");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lSegen I")
                                        && is1.getItemMeta().getLore().contains("§c§lRauch III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lRauch III");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lSegen II")
                                        && is1.getItemMeta().getLore().contains("§c§lRauch III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lRauch III");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lSegen III")
                                        && is1.getItemMeta().getLore().contains("§c§lRauch III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lRauch III");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lSegen IV")
                                        && is1.getItemMeta().getLore().contains("§c§lRauch III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lRauch III");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lSegen V")
                                        && is1.getItemMeta().getLore().contains("§c§lRauch III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lRauch III");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lSegen I")
                                        && is1.getItemMeta().getLore().contains("§c§lRauch IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lRauch IV");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lSegen II")
                                        && is1.getItemMeta().getLore().contains("§c§lRauch IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lRauch IV");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lSegen III")
                                        && is1.getItemMeta().getLore().contains("§c§lRauch IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lRauch IV");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lSegen IV")
                                        && is1.getItemMeta().getLore().contains("§c§lRauch IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lRauch IV");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lSegen V")
                                        && is1.getItemMeta().getLore().contains("§c§lRauch IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lRauch IV");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lSegen I")
                                        && is1.getItemMeta().getLore().contains("§c§lRauch V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lRauch V");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lSegen II")
                                        && is1.getItemMeta().getLore().contains("§c§lRauch V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lRauch V");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lSegen III")
                                        && is1.getItemMeta().getLore().contains("§c§lRauch V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lRauch V");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lSegen IV")
                                        && is1.getItemMeta().getLore().contains("§c§lRauch V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lRauch V");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§c§lSegen V")
                                        && is1.getItemMeta().getLore().contains("§c§lRauch V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§c§lRauch V");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lLevel I")
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lUpgrade I");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lLevel II")
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lUpgrade I");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lLevel III")
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lUpgrade I");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lLevel IV")
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lUpgrade I");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lLevel V")
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lUpgrade I");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lLevel I")
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lUpgrade II");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lLevel II")
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lUpgrade II");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lLevel III")
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lUpgrade II");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lLevel IV")
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lUpgrade II");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lLevel V")
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lUpgrade II");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lLevel I")
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lUpgrade III");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lLevel II")
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lUpgrade III");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lLevel III")
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lUpgrade III");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lLevel IV")
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lUpgrade III");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lLevel V")
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lUpgrade III");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lLevel I")
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lUpgrade IV");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lLevel II")
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lUpgrade IV");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lLevel III")
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lUpgrade IV");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lLevel IV")
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lUpgrade IV");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lLevel V")
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lUpgrade IV");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lLevel I")
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lUpgrade V");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lLevel II")
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lUpgrade V");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lLevel III")
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lUpgrade V");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lLevel IV")
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lUpgrade V");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lLevel V")
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lUpgrade V");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lUpgrade I")
                                        && is1.getItemMeta().getLore().contains("§6§lLevel I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lLevel I");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lUpgrade II")
                                        && is1.getItemMeta().getLore().contains("§6§lLevel I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lLevel I");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lUpgrade III")
                                        && is1.getItemMeta().getLore().contains("§6§lLevel I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lLevel I");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lUpgrade IV")
                                        && is1.getItemMeta().getLore().contains("§6§lLevel I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lLevel I");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lUpgrade V")
                                        && is1.getItemMeta().getLore().contains("§6§lLevel I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lLevel I");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lUpgrade I")
                                        && is1.getItemMeta().getLore().contains("§6§lLevel II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lLevel II");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lUpgrade II")
                                        && is1.getItemMeta().getLore().contains("§6§lLevel II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lLevel II");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lUpgrade III")
                                        && is1.getItemMeta().getLore().contains("§6§lLevel II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lLevel II");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lUpgrade IV")
                                        && is1.getItemMeta().getLore().contains("§6§lLevel II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lLevel II");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lUpgrade V")
                                        && is1.getItemMeta().getLore().contains("§6§lLevel II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lLevel II");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lUpgrade I")
                                        && is1.getItemMeta().getLore().contains("§6§lLevel III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lLevel III");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lUpgrade II")
                                        && is1.getItemMeta().getLore().contains("§6§lLevel III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lLevel III");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lUpgrade III")
                                        && is1.getItemMeta().getLore().contains("§6§lLevel III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lLevel III");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lUpgrade IV")
                                        && is1.getItemMeta().getLore().contains("§6§lLevel III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lLevel III");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lUpgrade V")
                                        && is1.getItemMeta().getLore().contains("§6§lLevel III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lLevel III");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lUpgrade I")
                                        && is1.getItemMeta().getLore().contains("§6§lLevel IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lLevel IV");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lUpgrade II")
                                        && is1.getItemMeta().getLore().contains("§6§lLevel IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lLevel IV");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lUpgrade III")
                                        && is1.getItemMeta().getLore().contains("§6§lLevel IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lLevel IV");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lUpgrade IV")
                                        && is1.getItemMeta().getLore().contains("§6§lLevel IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lLevel IV");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lUpgrade V")
                                        && is1.getItemMeta().getLore().contains("§6§lLevel IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lLevel IV");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lUpgrade I")
                                        && is1.getItemMeta().getLore().contains("§6§lLevel V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lLevel V");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lUpgrade II")
                                        && is1.getItemMeta().getLore().contains("§6§lLevel V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lLevel V");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lUpgrade III")
                                        && is1.getItemMeta().getLore().contains("§6§lLevel V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lLevel V");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lUpgrade IV")
                                        && is1.getItemMeta().getLore().contains("§6§lLevel V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lLevel V");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore().contains("§6§lUpgrade V")
                                        && is1.getItemMeta().getLore().contains("§6§lLevel V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    List<String> imnn = imn.getLore();
                                    ArrayList<String> lore = new ArrayList<String>();
                                    lore.addAll(imnn);
                                    lore.add("§6§lLevel V");
                                    imn.setLore(lore);
                                    isn.setItemMeta(imn);;
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);
                                }else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§c§lSegen I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§c§lSegen I"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.closeInventory();
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                } else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§c§lSegen II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§c§lSegen II"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                } else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§c§lSegen III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§c§lSegen III"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                } else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§c§lSegen IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§c§lSegen IV"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                } else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§c§lSegen V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§c§lSegen V"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                }else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§6§lUpgrade I"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.closeInventory();
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                } else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§6§lUpgrade II"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                } else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§6§lUpgrade III"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                } else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§6§lUpgrade IV"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                } else if (is.getItemMeta().getLore() == null
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade V")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§6§lUpgrade V"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1L, 1L);

                                }else {
                                    p.sendMessage(Main.pre + "§cDu kannst dieses Item nichtmehr enchanten!");
                                    p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1L, 1L);
                                }
                            }else p.sendMessage(Main.pre + "§cDazu hast du nicht genug Geld!");
                        }
                        if (e.getClickedInventory().getItem(13).getType() == Material.BOOK
                                && e.getClickedInventory().getItem(11).getType() == Material.BOOK) {
                            EconomySystem es = new EconomySystem();
                            if (es.hasEnoughMoney(p.getUniqueId(), 2000)) {
                                ItemStack is = e.getClickedInventory().getItem(11);
                                ItemStack is1 = e.getClickedInventory().getItem(13);
                                if (is.getItemMeta().getLore().contains("§a§lTank I")
                                        && is1.getItemMeta().getLore().contains("§a§lTank I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§a§lTank II"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);

                                } else if (is.getItemMeta().getLore().contains("§a§lTank II")
                                        && is1.getItemMeta().getLore().contains("§a§lTank II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§a§lTank III"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);

                                } else if (is.getItemMeta().getLore().contains("§a§lTank III")
                                        && is1.getItemMeta().getLore().contains("§a§lTank III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§a§lTank IV"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);

                                } else if (is.getItemMeta().getLore().contains("§a§lTank IV")
                                        && is1.getItemMeta().getLore().contains("§a§lTank IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§a§lTank V"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);

                                } else if (is.getItemMeta().getLore().contains("§a§lLebensretter I")
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§a§lLebensretter II"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);

                                } else if (is.getItemMeta().getLore().contains("§a§lLebensretter II")
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§a§lLebensretter III"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);

                                } else if (is.getItemMeta().getLore().contains("§a§lLebensretter III")
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§a§lLebensretter IV"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);

                                } else if (is.getItemMeta().getLore().contains("§a§lLebensretter IV")
                                        && is1.getItemMeta().getLore().contains("§a§lLebensretter IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§a§lLebensretter V"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);

                                } else if (is.getItemMeta().getLore().contains("§6§lLevel I")
                                        && is1.getItemMeta().getLore().contains("§6§lLevel I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§6§lLevel II"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);

                                } else if (is.getItemMeta().getLore().contains("§6§lLevel II")
                                        && is1.getItemMeta().getLore().contains("§6§lLevel II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§6§lLevel III"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);

                                } else if (is.getItemMeta().getLore().contains("§6§lLevel III")
                                        && is1.getItemMeta().getLore().contains("§6§lLevel III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§6§lLevel IV"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);

                                } else if (is.getItemMeta().getLore().contains("§6§lLevel IV")
                                        && is1.getItemMeta().getLore().contains("§6§lLevel IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§6§lLevel V"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);

                                } else if (is.getItemMeta().getLore().contains("§c§lRauch I")
                                        && is1.getItemMeta().getLore().contains("§c§lRauch I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§c§lRauch II"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);

                                } else if (is.getItemMeta().getLore().contains("§c§lRauch II")
                                        && is1.getItemMeta().getLore().contains("§c§lRauch II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§c§lRauch III"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);

                                } else if (is.getItemMeta().getLore().contains("§c§lRauch III")
                                        && is1.getItemMeta().getLore().contains("§c§lRauch III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§c§lRauch IV"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);

                                } else if (is.getItemMeta().getLore().contains("§c§lRauch IV")
                                        && is1.getItemMeta().getLore().contains("§c§lRauch IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§c§lRauch V"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);

                                } else if (is.getItemMeta().getLore().contains("§c§lSegen I")
                                        && is1.getItemMeta().getLore().contains("§c§lSegen I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§c§lSegen II"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);

                                } else if (is.getItemMeta().getLore().contains("§c§lSegen II")
                                        && is1.getItemMeta().getLore().contains("§c§lSegen II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§c§lSegen III"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);

                                } else if (is.getItemMeta().getLore().contains("§c§lSegen III")
                                        && is1.getItemMeta().getLore().contains("§c§lSegen III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§c§lSegen IV"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);

                                } else if (is.getItemMeta().getLore().contains("§c§lSegen IV")
                                        && is1.getItemMeta().getLore().contains("§c§lSegen IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§c§lSegen V"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);

                                } else if (is.getItemMeta().getLore().contains("§6§lUpgrade I")
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade I")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§6§lUpgrade II"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);

                                } else if (is.getItemMeta().getLore().contains("§6§lUpgrade II")
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade II")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§6§lUpgrade III"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);

                                } else if (is.getItemMeta().getLore().contains("§6§lUpgrade III")
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade III")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§6§lUpgrade IV"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);

                                } else if (is.getItemMeta().getLore().contains("§6§lUpgrade IV")
                                        && is1.getItemMeta().getLore().contains("§6§lUpgrade IV")) {
                                    ItemStack isn = is;
                                    ItemMeta imn = is.getItemMeta();
                                    imn.setLore(Arrays.asList("§6§lUpgrade V"));
                                    isn.setItemMeta(imn);
                                    p.getInventory().addItem(isn);
                                    p.closeInventory();
                                    es.removeMoney(p.getUniqueId(), 2000);
                                    p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);

                                } else
                                    p.sendMessage(Main.pre + "§cDas kannst du so nicht machen!");
                            }
                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public void onClose(final InventoryCloseEvent e) {
        Player p = (Player) e.getPlayer();
        if (e.getInventory().getName().equals(GUI_NAME)) {
            ActionBarAPI.sendActionBar(p, "§7» §cDu hast den Amboss gewechselt oder geschlossen!");
        }
    }


}
