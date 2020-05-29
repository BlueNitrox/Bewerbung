package de.Tommunity.Listener;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class Armor_Listener implements Listener {

    @EventHandler
    public void onPlace(final PlayerInteractEvent e){
        if(e.getAction() == Action.RIGHT_CLICK_BLOCK){
            if(e.getPlayer().getItemInHand().getType() == Material.ARMOR_STAND){
                e.setCancelled(true);
            }
        }
    }

}
