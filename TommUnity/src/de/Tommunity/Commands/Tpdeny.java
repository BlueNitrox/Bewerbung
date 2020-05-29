package de.Tommunity.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Tommunity.Main.Main;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class Tpdeny implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(!(sender instanceof Player)) {
			sender.sendMessage(Main.pre + " §cDazu musst du ein Spieler sein!");
		}
			Player p = (Player) sender;
			
			if(args.length == 0) {
				if(Main.tpa.containsKey(p)) {
				Player t = Main.tpa.get(p);
				
				if(PermissionsEx.getUser(t.getName()).inGroup("Owner")) {
					p.sendMessage(Main.pre + " §cDu hast die Tpa-Anfrage von §4§lOwner | " + t.getPlayer().getName() + " §cabgelehnt");
				}else if(PermissionsEx.getUser(t.getName()).inGroup("Admin")) {
					p.sendMessage(Main.pre + " §cDu hast die Tpa-Anfrage von §c§lAdmin" + t.getPlayer().getName() + " §cabgelehnt");
				}else if(PermissionsEx.getUser(t.getName()).inGroup("Developer")) {
					p.sendMessage(Main.pre + " §cDu hast die Tpa-Anfrage von §b§lDev | " + t.getPlayer().getName() + " §cabgelehnt");
				}else if(PermissionsEx.getUser(t.getName()).inGroup("Moderator")) {
					p.sendMessage(Main.pre + " §cDu hast die Tpa-Anfrage von §2Mod | " + t.getPlayer().getName() + " §cabgelehnt");
				}else if(PermissionsEx.getUser(t.getName()).inGroup("Supporter")) {
					p.sendMessage(Main.pre + " §cDu hast die Tpa-Anfrage von §aSup | " + t.getPlayer().getName() + " §cabgelehnt");
				}else if(PermissionsEx.getUser(t.getName()).inGroup("Builder")) {
					p.sendMessage(Main.pre + " §cDu hast die Tpa-Anfrage von §eBuilder | " + t.getPlayer().getName() + " §cabgelehnt");
				}else if(PermissionsEx.getUser(t.getName()).inGroup("Youtuber")) {
					p.sendMessage(Main.pre + " §cDu hast die Tpa-Anfrage von §5YT | " + t.getPlayer().getName() + " §cabgelehnt");
				}else if(PermissionsEx.getUser(t.getName()).inGroup("Hero")) {
					p.sendMessage(Main.pre + " §cDu hast die Tpa-Anfrage von §9Hero | " + t.getPlayer().getName() + " §cabgelehnt");
				}else if(PermissionsEx.getUser(t.getName()).inGroup("Master")) {
					p.sendMessage(Main.pre + " §cDu hast die Tpa-Anfrage von §dMaster | " + t.getPlayer().getName() + " §cabgelehnt");
				}else if(PermissionsEx.getUser(t.getName()).inGroup("Business")) {
					p.sendMessage(Main.pre + " §cDu hast die Tpa-Anfrage von §6Business | " + t.getPlayer().getName() + " §cabgelehnt");
				}else if(PermissionsEx.getUser(t.getName()).inGroup("Spieler")) {
					p.sendMessage(Main.pre + " §cDu hast die Tpa-Anfrage von §7Spieler | " + t.getPlayer().getName() + " §cabgelehnt");
				}
				
				if(PermissionsEx.getUser(p.getName()).inGroup("Owner")) {
					t.sendMessage(Main.pre + " §4§lOwner | " + p.getPlayer().getName() + " §c hat eine Tpa-Anfrage abgelehnt");
				}else if(PermissionsEx.getUser(p.getName()).inGroup("Admin")) {
					t.sendMessage(Main.pre + " §c§lAdmin" + p.getPlayer().getName() + " §c hat eine Tpa-Anfrage abgelehnt");
				}else if(PermissionsEx.getUser(p.getName()).inGroup("Developer")) {
					t.sendMessage(Main.pre + " §b§lDev | " + p.getPlayer().getName() + " §c hat eine Tpa-Anfrage abgelehnt");
				}else if(PermissionsEx.getUser(p.getName()).inGroup("Moderator")) {
					t.sendMessage(Main.pre + " §2Mod | " + p.getPlayer().getName() + " §c hat eine Tpa-Anfrage abgelehnt");
				}else if(PermissionsEx.getUser(p.getName()).inGroup("Supporter")) {
					t.sendMessage(Main.pre + " §aSup | " + p.getPlayer().getName() + " §c hat eine Tpa-Anfrage abgelehnt");
				}else if(PermissionsEx.getUser(p.getName()).inGroup("Builder")) {
					t.sendMessage(Main.pre + " §eBuilder | " + p.getPlayer().getName() + " §c hat eine Tpa-Anfrage abgelehnt");
				}else if(PermissionsEx.getUser(p.getName()).inGroup("Youtuber")) {
					t.sendMessage(Main.pre + " §5YT | " + p.getPlayer().getName() + " §c hat eine Tpa-Anfrage abgelehnt");
				}else if(PermissionsEx.getUser(p.getName()).inGroup("Hero")) {
					t.sendMessage(Main.pre + " §9Hero | " + p.getPlayer().getName() + " §c hat eine Tpa-Anfrage abgelehnt");
				}else if(PermissionsEx.getUser(p.getName()).inGroup("Master")) {
					t.sendMessage(Main.pre + " §dMaster | " + p.getPlayer().getName() + " §c hat eine Tpa-Anfrage abgelehnt");
				}else if(PermissionsEx.getUser(p.getName()).inGroup("Business")) {
					t.sendMessage(Main.pre + " §6Business | " + p.getPlayer().getName() + " §c hat eine Tpa-Anfrage abgelehnt");
				}else if(PermissionsEx.getUser(p.getName()).inGroup("Spieler")) {
					t.sendMessage(Main.pre + " §7Spieler | " + p.getPlayer().getName() + " §c hat eine Tpa-Anfrage abgelehnt");
				}
				
					

					
					
					
					Main.tpa.remove(p);
				}else {
					p.sendMessage(Main.pre + " §cDir wurde keine Tpa-Anfrage geschickt");
				}
			}else {
				p.sendMessage(Main.pre + " §cBitte benutze §6/tpdeny");
			}
			return false;
	}
}