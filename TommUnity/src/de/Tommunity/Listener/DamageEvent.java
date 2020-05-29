package de.Tommunity.Listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

public class DamageEvent implements Listener{

    @EventHandler
    public void handleDamage(EntityDamageEvent e) {
    	if(e.getEntity() instanceof Player) {
        if(e.getCause().equals(DamageCause.FALL)) {
            e.setCancelled(true);
        }
    	}

    }
}