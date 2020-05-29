package me.bluenitrox.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class quit_Listener implements Listener {

    @EventHandler
    public void onQuit(final PlayerQuitEvent e){
        e.setQuitMessage(" ");
    }

}
