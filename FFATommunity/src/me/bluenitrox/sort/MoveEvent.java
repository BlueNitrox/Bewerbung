package me.bluenitrox.sort;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class MoveEvent implements Listener {

    @EventHandler
    public void onMove(final PlayerMoveEvent e){
        Player p = (Player)e.getPlayer();
        if(p.getLocation().getX() <= -21 && p.getLocation().getX() >= -39){
            if(p.getLocation().getY() <= 192 && p.getLocation().getY() >= 174){
                if(p.getLocation().getZ() <= 15 && p.getLocation().getZ() >= -3) {
                    p.getInventory().clear();
                    ItemStack invsort = new ItemStack(Material.ENDER_CHEST);
                    ItemMeta invs = invsort.getItemMeta();
                    invs.setDisplayName("§a§l➜Inventarsortierung");
                    invs.setLore(Arrays.asList("§7Hier kannst du dein", "§7Inventar sortieren!"));
                    invsort.setItemMeta(invs);



                    p.getInventory().setItem(4, invsort);
                }
            }
        }
        if(p.getLocation().getY() <= 174 && p.getLocation().getY() >= 168){
            if(!(p.getGameMode() == GameMode.CREATIVE)) {
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 1L, 1L);
                p.getInventory().setContents(InventorySort.getBank(p.getUniqueId().toString()).getContents());

                for (int i = 0; i < p.getInventory().getSize(); i++) {
                    if (p.getInventory().getItem(i) != null) {
                        ItemStack itemstack = p.getInventory().getItem(i);
                        ItemMeta meta = itemstack.getItemMeta();
                        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', itemstack.getItemMeta().getDisplayName()));
                        itemstack.setItemMeta(meta);
                    }
                }
            }
        }
    }

}
