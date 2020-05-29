package de.Tommunity.Clan;

import org.bukkit.OfflinePlayer;

public class Stats {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	public static void addKill(OfflinePlayer p) {
		String clan = de.Tommunity.Clan.Player.getClan(p);
		try{
			int newkills = de.Tommunity.Clan.Clandata.Clan.getInt("Clan." + clan + ".kills")+1;
			de.Tommunity.Clan.Clandata.Clan.set("Clan." + clan + ".kills", newkills);
		}
		catch(Exception k) {
			int newkills = 1;
			de.Tommunity.Clan.Clandata.Clan.set("Clan." + clan + ".kills", newkills);
		}
		de.Tommunity.Clan.Clandata.saveClanFile();
	}
	public static void addDeath(OfflinePlayer p) {
		String clan = de.Tommunity.Clan.Player.getClan(p);
		try{
			int newdeaths = de.Tommunity.Clan.Clandata.Clan.getInt("Clan." + clan + ".deaths")+1;
			de.Tommunity.Clan.Clandata.Clan.set("Clan." + clan + ".deaths", newdeaths);
		}
		catch(Exception k) {
			int newdeaths = 1;
			de.Tommunity.Clan.Clandata.Clan.set("Clan." + clan + ".kills", newdeaths);
		}
		de.Tommunity.Clan.Clandata.saveClanFile();
	}
	public static int getkills(String clan) {
		try{
			return de.Tommunity.Clan.Clandata.Clan.getInt("Clan." + clan + ".kills");
		}
		catch(Exception k) {
			return 0;
		}
	}
	public static int getdeaths(String clan) {
		try{
			return de.Tommunity.Clan.Clandata.Clan.getInt("Clan." + clan + ".deaths");
		}
		catch(Exception k) {
			return 0;
		}
	}
}
