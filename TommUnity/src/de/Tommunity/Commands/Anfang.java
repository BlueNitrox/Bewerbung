package de.Tommunity.Commands;

import de.Tommunity.Main.Main;
import de.Tommunity.utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Anfang implements CommandExecutor, Listener {

    public static String GUI_NAME = "§7Jeder Anfang ist schwer!";

    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String s, String[] args) {
        Player p = (Player)cs;
        if(!(p instanceof Player)){
            cs.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein!");
            return true;
        }
        if(args.length == 0){
            Inventory inv = Bukkit.createInventory(null , 9*1 , GUI_NAME);
            //ITEM REGISTER//
            ItemStack pw = new ItemBuilder(Material.GRASS).setDisplayname("§cPlotworld").setLore("§7Benutze /pw um", "§7auf die Plotworld zu kommen!").addEnchant(Enchantment.SILK_TOUCH,10 , false).build();
            ItemStack mobzone = new ItemBuilder(Material.WOOD_SWORD).setDisplayname("§cMobzone").setLore("§7Benutze /mobzone um", "§7in die Mobzone zu kommen!").addEnchant(Enchantment.SILK_TOUCH,10 , false).build();
            ItemStack mine = new ItemBuilder(Material.DIAMOND_PICKAXE).setDisplayname("§cMinen").setLore("§7Laufe vom Spawn aus rechts in den", "§7Berg hinein!", "§7Upgrades mit /mine").addEnchant(Enchantment.SILK_TOUCH,10 , false).build();
            ItemStack markt = new ItemBuilder(Material.WOOD_STAIRS).setDisplayname("§cMartkplatz").setLore("§7Laufe vom Spawn aus nach links", "§7um zum Marktplatz zu kommen!").addEnchant(Enchantment.SILK_TOUCH, 10, false).build();
            ItemStack kit = new ItemBuilder(Material.DIAMOND_SWORD).setDisplayname("§cKits").setLore("§7Mache /kit und Level deine", "§7Kits höher um die zu verbessern").addEnchant(Enchantment.SILK_TOUCH, 10,false).build();
            ItemStack wz = new ItemBuilder(Material.DIAMOND_CHESTPLATE).setDisplayname("§cWarzone").setLore("§7Dreh dich vom Spawn aus um und laufe zur wüste!").addEnchant(Enchantment.SILK_TOUCH, 10,false).build();
            ItemStack quest= new ItemBuilder(Material.SKULL_ITEM).setDisplayname("§cQuests").setLore("§7/quest um deine Quests zu sehen").addEnchant(Enchantment.SILK_TOUCH, 10, false).build();

            inv.setItem(0, pw);
            inv.setItem(1, mobzone);
            inv.setItem(2, mine);
            inv.setItem(3, markt);
            inv.setItem(4, kit);
            inv.setItem(5, wz);

            p.openInventory(inv);
        }else {
            p.sendMessage(Main.pre +"§cBenutze: §6/anfang§c!");
        }
        return false;
    }

    @EventHandler
    public void onClick(final InventoryClickEvent e){
        Player p = (Player)e.getWhoClicked();
        if(e.getClickedInventory().getName().equals(GUI_NAME)){
            e.setCancelled(true);
        }
    }

}
