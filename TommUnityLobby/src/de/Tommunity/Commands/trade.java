package de.Tommunity.Commands;

import de.Tommunity.Main.Main;
import de.Tommunity.Utils.Coins;
import de.Tommunity.Utils.ItemManager;
import de.Tommunity.Utils.MoneySystem;
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

import java.util.Arrays;

public class trade implements CommandExecutor, Listener {

    public static String GUI_NAME = "§7CityBuild-Trade";

    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String s, String[] args) {
        Player p = (Player)cs;
        if(!(cs instanceof Player)){
            p.sendMessage(Main.pre +"§cDazu musst du ein Spieler sein!");
            return true;
        }
        if(args.length == 0){
            Inventory inv = Bukkit.createInventory(null,9, GUI_NAME);

            inv.setItem(0, ItemManager.createItem(Material.GOLD_INGOT,1,0,"§72000Coins für 10k"));
            inv.setItem(1, ItemManager.createItem(Material.DIAMOND, 1,0,"§710000Coins für 55k"));
            inv.setItem(2, ItemManager.createItem(Material.EMERALD, 1, 0, "§720000Coins für 115k"));

            ItemStack im = new ItemStack(Material.BOOK);
            ItemMeta im1 = im.getItemMeta();
            im1.setDisplayName("§cErklärung");
            im1.setLore(Arrays.asList("§7Durch LobbyCoins kannst du dir", "§7CityBuild Money erkaufen", "§7Die Preise siehst du auf", "§7Slot 1,2 und 3"));
            im.setItemMeta(im1);

            inv.setItem(8,im);

            p.openInventory(inv);
        }else {
            p.sendMessage(Main.pre +"§cBenutze: §6/trade§c!");
        }
        return false;
    }

    @EventHandler
    public void onClick(final InventoryClickEvent e){
        Player p = (Player)e.getWhoClicked();
        Coins c = new Coins();
        MoneySystem ms = new MoneySystem();
        if(e.getClickedInventory().getName().equals(GUI_NAME)){
            if(e.getCurrentItem().getType() == Material.GOLD_INGOT){
                e.setCancelled(true);
                if(c.hasEnoughCoins(p.getUniqueId(), 2000)){
                    c.removeCoins(p.getUniqueId(), 2000);
                    ms.addMoney(p.getUniqueId(), 10000);
                    p.sendMessage(Main.pre +"§aDu hast deine 10.000$ erhalten!");
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 10L, 10L);
                }else {
                    p.sendMessage(Main.pre +"§cDu hast nicht genug Coins!");
                }
            }else if(e.getCurrentItem().getType() == Material.DIAMOND){
                e.setCancelled(true);
                if(c.hasEnoughCoins(p.getUniqueId(), 10000)){
                    c.removeCoins(p.getUniqueId(), 10000);
                    ms.addMoney(p.getUniqueId(), 55000);
                    p.sendMessage(Main.pre +"§aDu hast deine 55.000$ erhalten!");
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 10L, 10L);
                }else {
                    p.sendMessage(Main.pre +"§cDu hast nicht genug Coins!");
                }
            }else if(e.getCurrentItem().getType() == Material.EMERALD){
                e.setCancelled(true);
                if(c.hasEnoughCoins(p.getUniqueId(), 20000)){
                    c.removeCoins(p.getUniqueId(), 20000);
                    ms.addMoney(p.getUniqueId(), 115000);
                    p.sendMessage(Main.pre +"§aDu hast deine 115.000$ erhalten!");
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 10L, 10L);
                }else {
                    p.sendMessage(Main.pre +"§cDu hast nicht genug Coins!");
                }
            }
        }
    }

}
