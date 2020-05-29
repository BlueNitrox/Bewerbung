package de.Tommunity.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Tommunity.Main.Main;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class Tphere implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(!(sender instanceof Player)) {
			sender.sendMessage(Main.pre + " §cDazu musst du ein Spieler sein!");
		}
			Player p = (Player) sender;
			if(p.hasPermission("Tom.tp")) {
			if(args.length == 1) {
				Player t = Bukkit.getPlayer(args[0]);
				
				if(t != null) {
				t.teleport(p.getLocation());
				
				if(PermissionsEx.getUser(t.getName()).inGroup("Owner")) {
					p.sendMessage(Main.pre + " §3Du hast §4§lOwner | " + t.getPlayer().getName() + " §3zu dir teleportiert");
					}else if(PermissionsEx.getUser(t.getName()).inGroup("Admin")) {
					p.sendMessage(Main.pre + " §3Du hast §c§lAdmin | " + t.getPlayer().getName() + " §3zu dir teleportiert");
					}else if(PermissionsEx.getUser(t.getName()).inGroup("Developer")) {
					p.sendMessage(Main.pre + " §3Du hast §b§lDev | " + t.getPlayer().getName() + " §3zu dir teleportiert");
					}else if(PermissionsEx.getUser(t.getName()).inGroup("Moderator")) {
					p.sendMessage(Main.pre + " §3Du hast §2Mod | " + t.getPlayer().getName() + " §3zu dir teleportiert");
					}else if(PermissionsEx.getUser(t.getName()).inGroup("Supporter")) {
					p.sendMessage(Main.pre + " §3Du hast §aSup | " + t.getPlayer().getName() + " §3zu dir teleportiert");
					}else if(PermissionsEx.getUser(t.getName()).inGroup("Builder")) {
					p.sendMessage(Main.pre + " §3Du hast §eBuilder | " + t.getPlayer().getName() + " §3zu dir teleportiert");
					}else if(PermissionsEx.getUser(t.getName()).inGroup("Youtuber")) {
					p.sendMessage(Main.pre + " §3Du hast §5YT | " + t.getPlayer().getName() + " §3zu dir teleportiert");
					}else if(PermissionsEx.getUser(t.getName()).inGroup("Hero")) {
					p.sendMessage(Main.pre + " §3Du hast §9Hero | " + t.getPlayer().getName() + " §3zu dir teleportiert");
					}else if(PermissionsEx.getUser(t.getName()).inGroup("Master")) {
					p.sendMessage(Main.pre + " §3Du hast §dMaster | " + t.getPlayer().getName() + " §3zu dir teleportiert");
					}else if(PermissionsEx.getUser(t.getName()).inGroup("Business")) {
					p.sendMessage(Main.pre + " §3Du hast §6Business | " + t.getPlayer().getName() + " §3zu dir teleportiert");
					}else if(PermissionsEx.getUser(t.getName()).inGroup("Spieler")) {
					p.sendMessage(Main.pre + " §3Du hast §7Spieler | " + t.getPlayer().getName() + " §3zu dir teleportiert");
					}
				
				}else {
					p.sendMessage(Main.pre + " §cDieser Spieler ist nicht online");
				}
			}else {
				p.sendMessage(Main.pre + " §cBitte benutze §6/tphere <Spieler>");
			}
		}else {
			p.sendMessage(Main.pre + " §cDazu hast keine Rechte");
		}
			
			return false;
}
}
