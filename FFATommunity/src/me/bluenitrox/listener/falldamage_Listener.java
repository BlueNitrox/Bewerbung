package me.bluenitrox.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class falldamage_Listener implements Listener {

    @EventHandler
    public void handleDamage(EntityDamageEvent e) {
        if(e.getEntity() instanceof Player) {
            if(e.getCause().equals(EntityDamageEvent.DamageCause.FALL)) {
                e.setCancelled(true);
            }
        }

    }
}
