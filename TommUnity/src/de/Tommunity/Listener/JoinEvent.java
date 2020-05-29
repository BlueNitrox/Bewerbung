package de.Tommunity.Listener;

import de.Tommunity.Main.Main;
import de.Tommunity.utils.ScoreboardManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class JoinEvent implements Listener {

    @EventHandler
    public void onJoin(final PlayerJoinEvent e){
        new BukkitRunnable() {
            @Override
            public void run() {
                ScoreboardManager.sendTabAndScoreboard(e.getPlayer());
            }
        }.runTaskTimer(Main.getPlugin(), 20 * 10, 20*60*60*24);

    }

    @EventHandler
    public void onJoin1(final PlayerJoinEvent e){
        Player p = (Player)e.getPlayer();
        p.setFlying(false);
        p.setAllowFlight(false);
    }

}
