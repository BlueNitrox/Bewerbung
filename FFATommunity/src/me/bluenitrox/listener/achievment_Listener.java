package me.bluenitrox.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerAchievementAwardedEvent;

public class achievment_Listener implements Listener {

    @EventHandler
    public void onAchiev(final PlayerAchievementAwardedEvent e){
        e.setCancelled(true);
    }

}
