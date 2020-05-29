package de.Tommunity.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Tommunity.Main.Main;

public class ByTom implements CommandExecutor {


	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		Player p = (Player)cs;
		
		p.sendMessage(Main.pre + "§3Hier der YouTube-Kanal von §6zByTom:§c https://www.youtube.com/channel/UCYd4ux9LncCV3MkHbwC4JvA");
		
		
		return false;
	}

}
