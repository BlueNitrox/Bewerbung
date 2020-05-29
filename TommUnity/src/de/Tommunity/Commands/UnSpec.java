package de.Tommunity.Commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Tommunity.Main.Main;

public class UnSpec implements CommandExecutor {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {

		if(!(cs instanceof Player));
		
		Player p = (Player) cs;
		GameMode gm = null;
		
		if(args.length == 1) {
			p.sendMessage(Main.pre + "§3Bitte benutze /spec!");
			return true;
		}

		if(p.hasPermission("Tom.unspec")) {
			for(Player all : Bukkit.getOnlinePlayers()){
				all.showPlayer(p);
			}
			p.setGameMode(gm = GameMode.SURVIVAL);
			p.sendMessage(Main.pre + "§3Du wurdest in den GameMode 0 Gesetzt!");
			return true;
		}
		else p.sendMessage(Main.pre + "§cDazu hast du keine Rechte!");
		
		
		return false;
	}

}
