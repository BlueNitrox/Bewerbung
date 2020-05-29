package de.Tommunity.Clan;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class onDeaths implements Listener {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	@EventHandler
	public void onPlayerDeaths(PlayerDeathEvent e) {
		Player gestorben = e.getEntity();
		de.Tommunity.Clan.Stats.addDeath(gestorben);
		try {
			Player killer = gestorben.getKiller();
			de.Tommunity.Clan.Stats.addKill(killer);
		} catch(Exception k) {
		}
	}
}
