package de.Tommunity.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;

import de.Tommunity.Commands.Build;


public class ItemListener implements Listener {

    @EventHandler
    public void onItemDrop(PlayerDropItemEvent e){
        if(Build.build.contains(e.getPlayer())){
            e.setCancelled(false);
        } else {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onItemPickup(PlayerPickupItemEvent e){
        if(Build.build.contains(e.getPlayer())){
            e.setCancelled(false);
        } else {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onItemMove(InventoryClickEvent e){
        if(Build.build.contains(e.getWhoClicked())){
            e.setCancelled(false);
        } else {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onItemPlace(BlockPlaceEvent e){
        if(Build.build.contains(e.getPlayer())){
            e.setCancelled(false);
        } else {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onItemBreak(BlockBreakEvent e){
        if(Build.build.contains(e.getPlayer())){
            e.setCancelled(false);
        } else {
            e.setCancelled(true);
        }
    }

}
