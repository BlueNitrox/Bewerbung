package de.Tommunity.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Tommunity.Main.Main;

public class DC implements CommandExecutor {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		Player p = (Player) cs;
		if(args.length == 0) {
			p.sendMessage(Main.pre + "§3Unser Discord:§c https://discord.gg/KuEfTAQ");
		}
		else p.sendMessage(Main.pre + "§3Bitte Benutze: /Discord");
		
		
		
		return false;
	}

}
