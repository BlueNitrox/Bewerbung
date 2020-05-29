package de.Tommunity.Commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Tommunity.Listener.WorldListener;
import de.Tommunity.Main.Main;

public class Spec implements CommandExecutor {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		Player p = (Player) cs;
		if (!(cs instanceof Player))
			;

		if(WorldListener.fight.contains(p)){
			p.sendMessage(Main.pre + "§cDas kannst du im Kampf leider nicht machen!");
			return true;
		}
		GameMode gm = null;

		if (args.length == 1) {
			p.sendMessage(Main.pre + "§3Bitte benutze /spec!");
			return true;
		}

		if (p.hasPermission("Tom.spec")) {
			p.setGameMode(gm = GameMode.SPECTATOR);
			p.sendMessage(Main.pre + "§3Du wurdest in den GameMode 3 Gesetzt!");
			return true;
		} else
			p.sendMessage(Main.pre + "§cDazu hast du keine Rechte!");

		return false;
	}

}
