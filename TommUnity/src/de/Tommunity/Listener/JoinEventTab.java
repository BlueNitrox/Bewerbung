package de.Tommunity.Listener;

import de.Tommunity.Main.Main;
import de.Tommunity.utils.ScoreboardManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEventTab implements Listener {

    @EventHandler
    public void join(final PlayerJoinEvent e){
        Player p = (Player)e.getPlayer();
        ScoreboardManager.update();
        p.sendMessage(Main.pre +"§ctest");
    }

}
