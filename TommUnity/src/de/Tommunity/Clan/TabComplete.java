package de.Tommunity.Clan;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

public class TabComplete implements TabCompleter {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	public TabComplete() {
	}
	@Override
	public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
		List<String> mm = new ArrayList<>();

		if (args.length == 1) {

			if (args[0].startsWith("c")) {
				if(sender.hasPermission("Clan.create")) {
					mm.add("create");
					return mm;
				}
			} else if (args[0].startsWith("p")) {
				mm.add("promote");
				return mm;
			} else if (args[0].startsWith("l")) {
				mm.add("leave");
				return mm;
			} else if (args[0].startsWith("j")) {
				mm.add("Join");
				return mm;
			} else if (args[0].startsWith("k")) {
				mm.add("kick");
				return mm;
			} else if (args[0].startsWith("d")) {
				mm.add("deny");
				mm.add("delete");
				return mm;
			} else if (args[0].startsWith("del")) {
				mm.add("delete");
				return mm;
			} else if (args[0].startsWith("den")) {
				mm.add("deny");
				return mm;
			} else if (args[0].startsWith("i")) {
				mm.add("info");
				mm.add("invite");
				mm.add("invites");
				return mm;
			} else if (args[0].startsWith("inf")) {
				mm.add("info");
				return mm;
			} else if (args[0].startsWith("inv")) {
				mm.add("invite");
				mm.add("invites");
				return mm;
			} else if (args[0].startsWith("invite")) {
				mm.add("invite");
				mm.add("invites");
				return mm;
			} else if (args[0].startsWith("invites")) {
				mm.add("invites");
				return mm;
			}
			else {
				if(sender.hasPermission("Clan.create")) {
					mm.add("create");
				}
				mm.add("delete");
				mm.add("promote");
				mm.add("leave");
				mm.add("Join");
				mm.add("kick");
				mm.add("deny");
				mm.add("info");
				mm.add("invite");
				mm.add("invites");
				return mm;
			}
		}
		return mm;
	}
}
