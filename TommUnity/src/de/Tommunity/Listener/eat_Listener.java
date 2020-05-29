package de.Tommunity.Listener;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class eat_Listener implements Listener {

    /*@EventHandler
    public void onEat(final PlayerInteractEvent e){
        if(e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR){
           ItemStack im = new ItemStack(Material.GOLDEN_APPLE, 1,(short)1);
           if(e.getPlayer().getItemInHand() == im);
           e.setCancelled(true);
           e.getPlayer().getItemInHand().setType(Material.GOLDEN_APPLE);
        }
    }
*/
}
