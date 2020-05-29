package de.Tommunity.Clan;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class onQuit implements Listener {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		if(!(de.Tommunity.Clan.Player.getClan(p) == null)) {
			de.Tommunity.Clan.Clanfunktionen.msgisoffline(p, de.Tommunity.Clan.Player.getClan(p));
		}
	}
}
