package de.Tommunity.Listener;
 
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import de.Tommunity.Commands.Vanish;
 
public class PlayerJoin_Vanish implements Listener {
   
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
       
        for (Player vanish : Vanish.vanished) {
           
            if (!e.getPlayer().hasPermission("Tom.vanish.see")) {
                e.getPlayer().hidePlayer(vanish);
            }
           
        }
       
    }
 
}