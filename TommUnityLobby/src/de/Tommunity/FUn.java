package de.Tommunity;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class FUn implements Listener {

    @EventHandler
    public void onMove(final PlayerMoveEvent e){
        Player p =(Player)e.getPlayer();
        if(p.isSprinting() || !p.isSprinting()){
            if(!p.isFlying()) {
                if (Perk.contains(p)) {
                    //partikel
                }
            }
        }

    }

}
