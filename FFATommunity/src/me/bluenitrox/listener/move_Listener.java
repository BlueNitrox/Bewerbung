package me.bluenitrox.listener;

import me.bluenitrox.utils.ScoreboardManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public class move_Listener implements Listener {

    @EventHandler
    public void onMove(final PlayerMoveEvent e){
        if(e.getPlayer().getLocation().getY() < 60){
            e.getPlayer().setHealth(0);
            e.getPlayer().spigot().respawn();
        }
    }

    @EventHandler
    public void onSneak(final PlayerToggleSneakEvent e){
        Player p = (Player)e.getPlayer();
        ScoreboardManager.sendTabAndScoreboard(p);
    }


}
