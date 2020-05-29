package de.Tommunity.Clan;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ClanMessage implements CommandExecutor {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("ClanMessage")) {
			if(args.length >= 1) {
				if(sender.hasPermission("Clan.create")) {
					if(!(de.Tommunity.Clan.Player.getClan(Bukkit.getOfflinePlayer(sender.getName())) == null)) {
						StringBuilder builder = new StringBuilder();
				        for (int i = 0; i < args.length; i++) {
				            builder.append(args[i]);
				            builder.append(" ");
				        }
				        String result = builder.toString();
				        de.Tommunity.Clan.Clanfunktionen.sendMessage(Bukkit.getOfflinePlayer(sender.getName()), de.Tommunity.Clan.Player.getClan(Bukkit.getOfflinePlayer(sender.getName())), result);
					} else {
						sender.sendMessage(Config.prefix() + " " + Config.DubistinkeinemClan());
					}
				} else {
					sender.sendMessage(Config.prefix() + " " + Config.noperm());
				}
			} else {
				sender.sendMessage(Config.prefix() + " " + "§eVerwende: §c§l/ClanMessage [Text]");
			}
			
		}
		return false;
	}

}
