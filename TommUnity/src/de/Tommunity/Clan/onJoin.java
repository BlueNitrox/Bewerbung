package de.Tommunity.Clan;

import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class onJoin implements Listener {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		if(!(de.Tommunity.Clan.Player.getClan(p) == null)) {
			de.Tommunity.Clan.Clanfunktionen.msgisonline(p, de.Tommunity.Clan.Player.getClan(p));
		}
		List<String> invites = de.Tommunity.Clan.Player.getInvites(p);
		if(!invites.isEmpty()) {
			p.sendMessage(Config.prefix() + " " + Config.Clanseinladen());
			for(String clan : invites) {
				p.sendMessage("§e-§c§l " + clan);
			}
		}
	}
}
