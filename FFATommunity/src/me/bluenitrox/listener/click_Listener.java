package me.bluenitrox.listener;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class click_Listener implements Listener {

    @EventHandler
    public void onClick(final PlayerInteractEvent e){
        Player p = (Player)e.getPlayer();
        if(e.getPlayer().getItemInHand().getType() == Material.CHEST){
            Inventory inv = Bukkit.createInventory(null ,9*1, "§7» Shop");

            //Item Register

            ItemStack knock = new ItemStack(Material.STICK);
            ItemMeta im = knock.getItemMeta();
            im.setDisplayName("§bKnockback II Stick");
            im.setLore(Arrays.asList("Preis : 100 Punkte"));
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
        }
    }

}
