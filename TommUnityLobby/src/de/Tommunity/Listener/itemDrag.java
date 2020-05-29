package de.Tommunity.Listener;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;

public class itemDrag implements Listener {

    @EventHandler
    public void onDrag(final PlayerItemHeldEvent e){
        Player p = (Player)e.getPlayer();
        if(e.getNewSlot() != e.getPreviousSlot()){
            p.playSound(p.getLocation(), Sound.NOTE_STICKS, 10L, 10L);
        }
    }

}
