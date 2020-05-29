package de.Tommunity.Clan;

import java.util.List;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;

public class Clanfunktionen {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	public static void sendMessage(OfflinePlayer player, String clan, String msg) {
		List<String> list = de.Tommunity.Clan.ClanM.getAdmins(clan);
		for(String uuid : list) {
			OfflinePlayer pl = Bukkit.getOfflinePlayer(UUID.fromString(uuid));
			if(pl.isOnline()) {
				Bukkit.getPlayer(UUID.fromString(uuid)).sendMessage("§8[§e" + "Clan-Chat" + "§8] §e" + player.getName() + "§8: §7" + msg);
			}
		}
		List<String> listm = de.Tommunity.Clan.ClanM.getMember(clan);
		for(String uuid : listm) {
			OfflinePlayer pl = Bukkit.getOfflinePlayer(UUID.fromString(uuid));
			if(pl.isOnline()) {
				Bukkit.getPlayer(UUID.fromString(uuid)).sendMessage("§8[§e" + "Clan-Chat" + "§8] §e" + player.getName() + "§8: §7" + msg);
			}
		}
	}
	public static void msgisonline(OfflinePlayer p, String clan) {
		List<String> list = de.Tommunity.Clan.ClanM.getAdmins(clan);
		for(String uuid : list) {
			OfflinePlayer pl = Bukkit.getOfflinePlayer(UUID.fromString(uuid));
			if(pl.isOnline()) {
				Bukkit.getPlayer(UUID.fromString(uuid)).sendMessage("§8[§e" + "Clan" + "§8] " + Config.Spielergehtonline(p.getName()));
			}
		}
		List<String> listm = de.Tommunity.Clan.ClanM.getMember(clan);
		for(String uuid : listm) {
			OfflinePlayer pl = Bukkit.getOfflinePlayer(UUID.fromString(uuid));
			if(pl.isOnline()) {
				Bukkit.getPlayer(UUID.fromString(uuid)).sendMessage("§8[§e" + "Clan" + "§8] " + Config.Spielergehtonline(p.getName()));
			}
		}
	}
	public static void msgisoffline(OfflinePlayer p, String clan) {
		List<String> list = de.Tommunity.Clan.ClanM.getAdmins(clan);
		for(String uuid : list) {
			OfflinePlayer pl = Bukkit.getOfflinePlayer(UUID.fromString(uuid));
			if(pl.isOnline()) {
				Bukkit.getPlayer(UUID.fromString(uuid)).sendMessage("§8[§e" + "Clan" + "§8] " + Config.Spielergehtoffline(p.getName()));
			}
		}
		List<String> listm = de.Tommunity.Clan.ClanM.getMember(clan);
		for(String uuid : listm) {
			OfflinePlayer pl = Bukkit.getOfflinePlayer(UUID.fromString(uuid));
			if(pl.isOnline()) {
				Bukkit.getPlayer(UUID.fromString(uuid)).sendMessage("§8[§e" + "Clan" + "§8] " + Config.Spielergehtoffline(p.getName()));
			}
		}
	}
	public static void Playergejoint(OfflinePlayer player, String clan) {
		List<String> list = de.Tommunity.Clan.ClanM.getAdmins(clan);
		for(String uuid : list) {
			OfflinePlayer pl = Bukkit.getOfflinePlayer(UUID.fromString(uuid));
			if(pl.isOnline()) {
				Bukkit.getPlayer(UUID.fromString(uuid)).sendMessage(Config.prefix() + " " + Config.Spielergejoint(player.getName()));
			}
		}
		List<String> listm = de.Tommunity.Clan.ClanM.getMember(clan);
		for(String uuid : listm) {
			OfflinePlayer pl = Bukkit.getOfflinePlayer(UUID.fromString(uuid));
			if(pl.isOnline()) {
				Bukkit.getPlayer(UUID.fromString(uuid)).sendMessage(Config.prefix() + " " + Config.Spielergejoint(player.getName()));
			}
		}
	}
	public static void Einladungabgelehnt(OfflinePlayer player, String clan) {
		List<String> list = de.Tommunity.Clan.ClanM.getAdmins(clan);
		for(String uuid : list) {
			OfflinePlayer pl = Bukkit.getOfflinePlayer(UUID.fromString(uuid));
			if(pl.isOnline()) {
				Bukkit.getPlayer(UUID.fromString(uuid)).sendMessage(Config.prefix() + " " + Config.Einladungabgelehnt(player.getName()));
			}
		}
		List<String> listm = de.Tommunity.Clan.ClanM.getMember(clan);
		for(String uuid : listm) {
			OfflinePlayer pl = Bukkit.getOfflinePlayer(UUID.fromString(uuid));
			if(pl.isOnline()) {
				Bukkit.getPlayer(UUID.fromString(uuid)).sendMessage(Config.prefix() + " " + Config.Einladungabgelehnt(player.getName()));
			}
		}
	}
}
