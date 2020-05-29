package de.Tommunity.Listener;

import de.Tommunity.Utils.Scoremanager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinTab implements Listener {

    @EventHandler
    public void Join(final PlayerJoinEvent e){
        Scoremanager.update();
    }

}
