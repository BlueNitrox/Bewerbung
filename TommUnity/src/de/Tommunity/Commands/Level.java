package de.Tommunity.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Tommunity.Main.Main;

public class Level implements CommandExecutor {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		Player p = (Player)cs;
		if(!(cs instanceof Player)) {
			cs.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein");
			return true;
		}
		if(args.length == 0) {
			p.sendMessage(Main.pre + "Hier siehst du die nötigen XP für die Level!");
			p.sendMessage(Main.pre + "§3Level 1 >> Level 2 §d10000");
			p.sendMessage(Main.pre + "§3Level 2 >> Level 3 §d15000");
			p.sendMessage(Main.pre + "§3Level 3 >> Level 4 §d20000");
			p.sendMessage(Main.pre + "§3Level 4 >> Level 5 §d25000");
			p.sendMessage(Main.pre + "§3Level 5 >> Level 6 §d30000");
			p.sendMessage(Main.pre + "§3Level 6 >> Level 7 §d50000");
			p.sendMessage(Main.pre + "§3Level 7 >> Level 8 §d80000");
			p.sendMessage(Main.pre + "§3Level 8 >> Level 9 §d100000");
			p.sendMessage(Main.pre + "§3Level 9 >> Level 10 §d200000");
			p.sendMessage(Main.pre + "§3Level 10 >> Level 11 §d215000");
			p.sendMessage(Main.pre + "§3Level 11 >> Level 12 §d230000");
			p.sendMessage(Main.pre + "§3Level 12 >> Level 13 §d250000");
			p.sendMessage(Main.pre + "§3Level 13 >> Level 14 §d300000");
			p.sendMessage(Main.pre + "§3Level 14 >> Level 15 §d350000");
			p.sendMessage(Main.pre + "§3Level 15 >> Level 16 §d380000");
			p.sendMessage(Main.pre + "§3Level 16 >> Level 17 §d410000");
			p.sendMessage(Main.pre + "§3Level 17 >> Level 18 §d470000");
			p.sendMessage(Main.pre + "§3Level 18 >> Level 19 §d515000");
			p.sendMessage(Main.pre + "§3Level 19 >> Level 20 §d540000");
			p.sendMessage(Main.pre + "§3Level 20 >> Level 21 §d580000");
			p.sendMessage(Main.pre + "§3Level 21 >> Level 22 §d630000");
			p.sendMessage(Main.pre + "§3Level 22 >> Level 23 §d650000");
			p.sendMessage(Main.pre + "§3Level 23 >> Level 24 §d680000");
			p.sendMessage(Main.pre + "§3Level 24 >> Level 25 §d710000");
			p.sendMessage(Main.pre + "§3Level 25 >> Level 26 §d760000");
			p.sendMessage(Main.pre + "§3Level 26 >> Level 27 §d800000");
			p.sendMessage(Main.pre + "§3Level 27 >> Level 28 §d850000");
			p.sendMessage(Main.pre + "§3Level 28 >> Level 29 §d900000");
			p.sendMessage(Main.pre + "§3Level 29 >> Level 30 §d1000000");

		}
		
		
		return false;
	}
	
}	
	