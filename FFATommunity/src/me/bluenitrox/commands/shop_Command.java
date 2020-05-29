package me.bluenitrox.commands;

import me.bluenitrox.main.Main;
import me.bluenitrox.utils.PunkteSys;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;

public class shop_Command implements CommandExecutor, Listener {

    public static String GUI_NAME = "§7» Shop";

    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String s, String[] args) {
        Player p = (Player)cs;
        if(!(cs instanceof Player)){
            cs.sendMessage(Main.keinP);
            return true;
        }
        if(args.length == 0){
            Inventory inv = Bukkit.createInventory(null ,9*1, GUI_NAME);

            //Item Register

            ItemStack knock = new ItemStack(Material.STICK);
            ItemMeta im = knock.getItemMeta();
            im.setDisplayName("§bKnockback II Stick");
            im.setLore(Arrays.asList("Preis : 200 Punkte"));
            im.addEnchant(Enchantment.KNOCKBACK, 2, false);
            knock.setItemMeta(im);

            ItemStack cobweb = new ItemStack(Material.WEB);
            ItemMeta im1 = cobweb.getItemMeta();
            im1.setDisplayName("§bSpinnennetz");
            im1.setLore(Arrays.asList("Preis : 50 Punkte"));
            cobweb.setItemMeta(im1);

            ItemStack enderpearl = new ItemStack(Material.ENDER_PEARL);
            ItemMeta im2 = enderpearl.getItemMeta();
            im2.setDisplayName("§bEnderpearlen");
            im2.setLore(Arrays.asList("Preis : 100 Punkte"));
            enderpearl.setItemMeta(im2);

            ItemStack bow = new ItemStack(Material.BOW);
            ItemMeta im3 = bow.getItemMeta();
            im3.setDisplayName("§bBogen");
            im3.setLore(Arrays.asList("Preis : 30 Punkte"));
            bow.setItemMeta(im3);

            ItemStack arrow = new ItemStack(Material.ARROW);
            ItemMeta im4 = arrow.getItemMeta();
            im4.setDisplayName("§bPfeil");
            im4.setLore(Arrays.asList("Preis : 20 Punkte"));
            arrow.setItemMeta(im4);

            inv.setItem(0, knock);
            inv.setItem(1, cobweb);
            inv.setItem(2, enderpearl);
            inv.setItem(3, bow);
            inv.setItem(4, arrow);

            p.openInventory(inv);
        }else {
            p.sendMessage(Main.pre +"§cBenutze: §6/shop§c!");
        }
        return false;
    }

    @EventHandler
    public void onClick(final InventoryClickEvent e){
        Player p = (Player)e.getWhoClicked();
        PunkteSys ps = new PunkteSys();
        if(e.getClickedInventory().getName().equals(GUI_NAME)){
            e.setCancelled(true);
            if(e.getCurrentItem().getType() == Material.STICK){
                if(ps.hasEnoughpunkte(p.getUniqueId(), 200)){

                    ItemStack knock = new ItemStack(Material.STICK);
                    ItemMeta im = knock.getItemMeta();
                    im.setDisplayName("§bKnockback II Stick");
                    im.addEnchant(Enchantment.KNOCKBACK, 2, false);
                    knock.setItemMeta(im);

                    p.getInventory().addItem(knock);

                    ps.removepunkte(p.getUniqueId(), 200);
                }else {
                    p.sendMessage(Main.pre +"§cDu hast leider nicht genug Punkte!");
                }
            }
            if(e.getCurrentItem().getType() == Material.WEB){
                if(ps.hasEnoughpunkte(p.getUniqueId(), 50)){

                    ItemStack cobweb = new ItemStack(Material.WEB);
                    ItemMeta im1 = cobweb.getItemMeta();
                    im1.setDisplayName("§bSpinnennetz");
                    cobweb.setItemMeta(im1);

                    p.getInventory().addItem(cobweb);

                    ps.removepunkte(p.getUniqueId(), 50);
                }else {
                    p.sendMessage(Main.pre +"§cDu hast leider nicht genug Punkte!");
                }
            }
            if(e.getCurrentItem().getType() == Material.ENDER_PEARL){
                if(ps.hasEnoughpunkte(p.getUniqueId(), 100)){

                    ItemStack enderpearl = new ItemStack(Material.ENDER_PEARL);
                    ItemMeta im2 = enderpearl.getItemMeta();
                    im2.setDisplayName("§bEnderpearlen");
                    enderpearl.setItemMeta(im2);

                    p.getInventory().addItem(enderpearl);

                    ps.removepunkte(p.getUniqueId(), 100);
                }else {
                    p.sendMessage(Main.pre +"§cDu hast leider nicht genug Punkte!");
                }
            }
            if(e.getCurrentItem().getType() == Material.BOW){
                if(ps.hasEnoughpunkte(p.getUniqueId(), 30)){

                    ItemStack bow = new ItemStack(Material.BOW);
                    ItemMeta im3 = bow.getItemMeta();
                    im3.setDisplayName("§bBogen");
                    bow.setItemMeta(im3);

                    p.getInventory().addItem(bow);

                    ps.removepunkte(p.getUniqueId(), 30);
                }else {
                    p.sendMessage(Main.pre +"§cDu hast leider nicht genug Punkte!");
                }
            }
            if(e.getCurrentItem().getType() == Material.ARROW){
                if(ps.hasEnoughpunkte(p.getUniqueId(), 20)){

                    ItemStack arrow = new ItemStack(Material.ARROW);
                    ItemMeta im4 = arrow.getItemMeta();
                    im4.setDisplayName("§bPfeil");
                    arrow.setItemMeta(im4);

                    p.getInventory().addItem(arrow);

                    ps.removepunkte(p.getUniqueId(), 20);
                }else {
                    p.sendMessage(Main.pre +"§cDu hast leider nicht genug Punkte!");
                }
            }
        }
    }

}
