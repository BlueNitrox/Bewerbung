package de.Tommunity.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Tommunity.Main.Main;

public class Report implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		
		if(!(cs instanceof Player)) 
			return true; {
		
		Player p = (Player) cs;
		Player t = Bukkit.getPlayer(args[1]);
		
		if(args.length == 0) {
			p.sendMessage(Main.pre + "§3Benutze /report <Spieler> <Grund>!");
			//p.sendMessage(Main.pre + "");
			return true;
		}
		if(args.length == 1) {
			p.sendMessage(Main.pre + "§3Benutze /report <Spieler> <Grund>!");
			return true;
		}
			
		
		if(args.length >= 2) {
			
			
			if(t == null);
			p.sendMessage(Main.pre + "§cDieser Spieler Befindet sich nicht auf dem Server");
			
			
		}
		 
		if(args[0].equals(p.getName())) {
			p.sendMessage(Main.pre + "§cDu kannst dich nicht selber Reporten!");
			return false;
			
		}
		
		
		String s = "";
		
		for(int i = 1; i<args.length; i++ )
			s = s + args[i] + " ";
		
		s = s.trim();
		
		p.sendMessage(Main.pre + "§3Du hast " + args[0] + " reportet!");
		
		for(Player all : Bukkit.getOnlinePlayers()) {
			if(all.hasPermission("Tom.report.see")) {
				all.sendMessage(Main.pre + "§4[]--------- §f§lReport §4---------[]");
				all.sendMessage(Main.pre + "");
				all.sendMessage(Main.pre + "§4 > Von: §e" + p.getName());
				all.sendMessage(Main.pre + "§4 > An: §e" + t.getName());
				all.sendMessage(Main.pre + "§4 > Grund: §e" + s);
				all.sendMessage(Main.pre + "");
				all.sendMessage(Main.pre + "§4[]--------- §f§lReport §4---------[]");

			}
		}
		
		
		
		return false;
	}
	
	
	

}
}