package de.Tommunity.Clan;

import java.util.List;

import org.bukkit.OfflinePlayer;

public class Invitemet {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	public static boolean PlayerJoin(OfflinePlayer p, String clan) {
		List<String> invites = Player.getInvites(p);
		System.out.println("lel");
		System.out.println("lellel");
		if(invites.contains(clan)) {
			System.out.println("lellellel");
			int players = de.Tommunity.Clan.ClanM.getAdmins(clan).size() + de.Tommunity.Clan.ClanM.getMember(clan).size();
			if(players < Config.maxperclan()) {
				System.out.println("lellellellel");
				if(!(de.Tommunity.Clan.Clandata.Clan.getString("Clan." + clan) == null)) {
					Player.setClan(p, clan);
					Player.removeInvite(p, clan);
					Clanfunktionen.Playergejoint(p, clan);
					return true;
				}else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	public static void PlayerDeny(OfflinePlayer p, String clan) {
		List<String> invites = Player.getInvites(p);
		if(invites.contains(clan)) {
			Player.removeInvite(p, clan);
			de.Tommunity.Clan.Clanfunktionen.Einladungabgelehnt(p, clan);
		}
	}
}
