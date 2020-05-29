package de.Tommunity.Clan;

public class Config {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	public static String prefix() {
		return de.Tommunity.Main.Main.instance.getConfig().getString("prefix").replaceAll("&", "§");
	}
	public static Integer maxperclan() {
		return de.Tommunity.Main.Main.instance.getConfig().getInt("max players", 50);
	}
	public static String noperm() {
		return de.Tommunity.Main.Main.instance.getConfig().getString("noperm").replaceAll("&", "§");
	}
	public static String DubistinkeinemClan() {
		return de.Tommunity.Main.Main.instance.getConfig().getString("message.Du bist in keinem Clan").replaceAll("&", "§");
	}
	public static String Clanverlassen() {
		return de.Tommunity.Main.Main.instance.getConfig().getString("message.Clan verlassen").replaceAll("&", "§");
	}
	public static String Clanseinladen() {
		return de.Tommunity.Main.Main.instance.getConfig().getString("message.Folgende Clans wollen einladen").replaceAll("&", "§");
	}
	public static String Spielereingeladen() {
		return de.Tommunity.Main.Main.instance.getConfig().getString("message.Spieler eingeladen").replaceAll("&", "§");
	}
	public static String SpielerbereitsinClan() {
		return de.Tommunity.Main.Main.instance.getConfig().getString("message.Spieler bereits in Clan").replaceAll("&", "§");
	}
	public static String Spielergekickt() {
		return de.Tommunity.Main.Main.instance.getConfig().getString("message.Spieler aus Clan gekickt").replaceAll("&", "§");
	}
	public static String Dugekickt() {
		return de.Tommunity.Main.Main.instance.getConfig().getString("message.Du wurdest aus dem Clan gekickt").replaceAll("&", "§");
	}
	public static String Spielerpromotet() {
		return de.Tommunity.Main.Main.instance.getConfig().getString("message.Spieler promotet").replaceAll("&", "§");
	}
	public static String gejoint() {
		return de.Tommunity.Main.Main.instance.getConfig().getString("message.in Clan gejoint").replaceAll("&", "§");
	}
	public static String Spielergejoint(String name) {
		return de.Tommunity.Main.Main.instance.getConfig().getString("message.Spieler in Clan beigetreten").replaceAll("&", "§").replaceAll("%player%", name);
	}
	public static String einladungnichtangenommen() {
		return de.Tommunity.Main.Main.instance.getConfig().getString("message.Einladung nicht angenommen").replaceAll("&", "§");
	}
	public static String Clanerstellt() {
		return de.Tommunity.Main.Main.instance.getConfig().getString("message.clan erstellt").replaceAll("&", "§");
	}
	public static String Clangibtsschon() {
		return de.Tommunity.Main.Main.instance.getConfig().getString("message.Clan gibt es schon").replaceAll("&", "§");
	}
	public static String Dubistbereitsineinemclan() {
		return de.Tommunity.Main.Main.instance.getConfig().getString("message.Du bist schon in einem Clan").replaceAll("&", "§");
	}
	public static String Clanaufgelost() {
		return de.Tommunity.Main.Main.instance.getConfig().getString("message.Clan wurde aufgelost").replaceAll("&", "§");
	}
	public static String Spielergehtonline(String name) {
		return de.Tommunity.Main.Main.instance.getConfig().getString("message.Spieler ist nun online").replaceAll("&", "§").replaceAll("%player%", name);
	}
	public static String Spielergehtoffline(String name) {
		return de.Tommunity.Main.Main.instance.getConfig().getString("message.Spieler ist nun offline").replaceAll("&", "§").replaceAll("%player%", name);
	}
	public static String joinoderdeny() {
		return de.Tommunity.Main.Main.instance.getConfig().getString("message.clan Einladung annehmen/ablehnen").replaceAll("&", "§");
	}
	public static String Einladungerhalten(String name) {
		return de.Tommunity.Main.Main.instance.getConfig().getString("message.clan Einladung erhalten").replaceAll("&", "§").replaceAll("%clan%", name);
	}
	public static String Einladungabgelehnt(String name) {
		return de.Tommunity.Main.Main.instance.getConfig().getString("message.Clan Einladung nicht angenommen").replaceAll("&", "§").replaceAll("%player%", name);
	}
	public static String Spielernochnieonline() {
		return de.Tommunity.Main.Main.instance.getConfig().getString("message.Spieler war noch nie online").replaceAll("&", "§");
	}
}
