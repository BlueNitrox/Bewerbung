package de.Tommunity.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLevelChangeEvent;

import de.Tommunity.Booster.Xpbooster;
import de.Tommunity.Main.Main;

public class LevelListener implements Listener{

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */
	
    @EventHandler
    public void onXp(PlayerLevelChangeEvent e) {
         if(e.getNewLevel() > e.getOldLevel()) {
        	if(Main.getPlugin().getBoostermanager().isAktiv(new Xpbooster())) {
               e.getPlayer().setLevel((int) (e.getPlayer().getExpToLevel() + (e.getOldLevel() *2)));
            }
        }
    }
}