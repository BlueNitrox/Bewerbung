package de.Tommunity.Extra;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Tommunity.Main.Main;

public class AhOnOff implements CommandExecutor {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		Player p = (Player) cs;
		if (!(cs instanceof Player)) {
			cs.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein!");
			return true;
		}
		if(p.hasPermission("Tom.AhOnOff")) {
		if (args.length == 1) {
			if (args[0].equalsIgnoreCase("on")) {
				Ah.Ah = true;
				p.sendMessage(Main.pre + "§3Du hast den Markt §aaktiviert!");
			} else if (args[0].equalsIgnoreCase("off")) {
				Ah.Ah = false;
				p.sendMessage(Main.pre + "§3Du hast den Markt §cdeaktiviert!");
			}
		} else {
			p.sendMessage(Main.pre + "§cBenutzung : §6/markttoggle <On/Off>§c!");
		}
		}else {
			p.sendMessage(Main.err);
		}
		return false;
	}

}
