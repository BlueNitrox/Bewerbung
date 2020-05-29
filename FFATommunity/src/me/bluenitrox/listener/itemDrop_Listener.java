package me.bluenitrox.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class itemDrop_Listener implements Listener {

    @EventHandler
    public void onDrop(final PlayerDropItemEvent e){
        e.setCancelled(true);
    }

}
