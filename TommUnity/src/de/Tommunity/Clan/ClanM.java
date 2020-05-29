package de.Tommunity.Clan;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.configuration.file.FileConfiguration;

public class ClanM {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	private static FileConfiguration data = de.Tommunity.Clan.Clandata.Clan;
	public static void createClan(OfflinePlayer p, String clan, String kurz) {
		data.set("Clan." + clan + ".prefix", kurz);
		Player.setClan(p, clan);
		ClanM.promotePlayer(p, clan);
		de.Tommunity.Clan.Clandata.saveClanFile();
	}
	public static void deleteClan(String clan) {
		for(String uuid : getMember(clan)) {
			Player.leaveClan(Bukkit.getOfflinePlayer(UUID.fromString(uuid)), clan);
			if(Bukkit.getOfflinePlayer(UUID.fromString(uuid)).isOnline()) {
				Bukkit.getPlayer(UUID.fromString(uuid)).sendMessage(Config.prefix() + " " + Config.Clanaufgelost());
			}
		}
		for(String uuid : getAdmins(clan)) {
			Player.leaveClan(Bukkit.getOfflinePlayer(UUID.fromString(uuid)), clan);
			if(Bukkit.getOfflinePlayer(UUID.fromString(uuid)).isOnline()) {
				Bukkit.getPlayer(UUID.fromString(uuid)).sendMessage(Config.prefix() + " " + Config.Clanaufgelost());
			}
		}
		data.set("Clan." + clan, null);
		data.set("Clan." + clan, " ");
		de.Tommunity.Clan.Clandata.saveClanFile();
	}
	public static List<String> getMember(String clan) {
		try {
			List<String> member = data.getStringList("Clan." + clan + ".members");
			return member;
		}
		catch(Exception k) {
			return new ArrayList<String>();
		}
	}
	public static List<String> getAdmins(String clan) {
		try {
			List<String> admins = data.getStringList("Clan." + clan + ".admins");
			return admins;
		}
		catch(Exception k) {
			return new ArrayList<String>();
		}
	}
	public static void addMember(OfflinePlayer p, String clan) {
		try {
			List<String> member = data.getStringList("Clan." + clan + ".members");
			member.add(p.getUniqueId().toString());
			data.set("Clan." + clan + ".members", member);
			de.Tommunity.Clan.Clandata.saveClanFile();
		} catch(Exception k) {
			List<String> member = new ArrayList<String>();
			member.add(p.getUniqueId().toString());
			data.set("Clan." + clan + ".members", member);
			de.Tommunity.Clan.Clandata.saveClanFile();
		}
	}
	public static void removeMember(OfflinePlayer p, String clan) {
		try {
			List<String> member = data.getStringList("Clan." + clan + ".members");
			member.remove(p.getUniqueId().toString());
			data.set("Clan." + clan + ".members", member);
			de.Tommunity.Clan.Clandata.saveClanFile();
		} catch(Exception k) {
			k.printStackTrace();
		}
	}
	public static void addAdmin(OfflinePlayer p, String clan) {
		try {
			List<String> admins = data.getStringList("Clan." + clan + ".admins");
			admins.add(p.getUniqueId().toString());
			data.set("Clan." + clan + ".admins", admins);
			de.Tommunity.Clan.Clandata.saveClanFile();
		} catch(Exception k) {
			List<String> admins = new ArrayList<String>();
			admins.add(p.getUniqueId().toString());
			data.set("Clan." + clan + ".admins", admins);
			de.Tommunity.Clan.Clandata.saveClanFile();
		}
	}
	public static void removeAdmin(OfflinePlayer p, String clan) {
		try {
			List<String> admin = data.getStringList("Clan." + clan + ".admins");
			admin.remove(p.getUniqueId().toString());
			data.set("Clan." + clan + ".admins", admin);
			de.Tommunity.Clan.Clandata.saveClanFile();
		} catch(Exception k) {
			k.printStackTrace();
		}
	}
	public static void editPrefix(String clan, String prefix) {
		data.set("Clan." + clan + "prefix", prefix);
		de.Tommunity.Clan.Clandata.saveClanFile();
	}
	public static String getPrefix(String clan) {
		try{
			return data.getString("Clan." + clan + ".prefix");
		}catch(Exception f) {
			return null;
		}
	}
	public static void promotePlayer(OfflinePlayer p, String clan) {
		removeMember(p, clan);
		addAdmin(p, clan);
	}
}
