package me.bluenitrox.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

public class WorldManager implements Listener {

    @EventHandler
    public void onchange(final WeatherChangeEvent e) {
        e.setCancelled(true);
    }

}
