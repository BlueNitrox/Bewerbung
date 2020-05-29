package me.bluenitrox.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class hunger_Listener implements Listener {

    @EventHandler
    public void onHunger(final FoodLevelChangeEvent e){
        e.setCancelled(true);
    }

}
