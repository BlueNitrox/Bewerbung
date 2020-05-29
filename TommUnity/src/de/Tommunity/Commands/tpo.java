package de.Tommunity.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Tommunity.Main.Main;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class tpo implements CommandExecutor{

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
				p.teleport(t.getLocation());
				if(PermissionsEx.getUser(t.getName()).inGroup("Owner")) {
				p.sendMessage(Main.pre + " §3Du wurdest zu §4§lOwner | " + t.getPlayer().getName() + " §3teleportiert");
				}else if(PermissionsEx.getUser(t.getName()).inGroup("Admin")) {
				p.sendMessage(Main.pre + " §3Du wurdest zu §c§lAdmin | " + t.getPlayer().getName() + " §3teleportiert");
				}else if(PermissionsEx.getUser(t.getName()).inGroup("Developer")) {
				p.sendMessage(Main.pre + " §3Du wurdest zu §b§lDev | " + t.getPlayer().getName() + " §3teleportiert");
				}else if(PermissionsEx.getUser(t.getName()).inGroup("Moderator")) {
				p.sendMessage(Main.pre + " §3Du wurdest zu §2Mod | " + t.getPlayer().getName() + " §3teleportiert");
				}else if(PermissionsEx.getUser(t.getName()).inGroup("Supporter")) {
				p.sendMessage(Main.pre + " §3Du wurdest zu §aSup |" + t.getPlayer().getName() + " §3teleportiert");
				}else if(PermissionsEx.getUser(t.getName()).inGroup("Builder")) {
				p.sendMessage(Main.pre + " §3Du wurdest zu §eBuilder | " + t.getPlayer().getName() + " §3teleportiert");
				}else if(PermissionsEx.getUser(t.getName()).inGroup("Youtuber")) {
				p.sendMessage(Main.pre + " §3Du wurdest zu §5YT | " + t.getPlayer().getName() + " §3teleportiert");
				}else if(PermissionsEx.getUser(t.getName()).inGroup("Hero")) {
				p.sendMessage(Main.pre + " §3Du wurdest zu §9Hero | " + t.getPlayer().getName() + " §3teleportiert");
				}else if(PermissionsEx.getUser(t.getName()).inGroup("Master")) {
				p.sendMessage(Main.pre + " §3Du wurdest zu §dMaster | " + t.getPlayer().getName() + " §3teleportiert");
				}else if(PermissionsEx.getUser(t.getName()).inGroup("Business")) {
				p.sendMessage(Main.pre + " §3Du wurdest zu §6Business | " + t.getPlayer().getName() + " §3teleportiert");
				}else if(PermissionsEx.getUser(t.getName()).inGroup("Spieler")) {
				p.sendMessage(Main.pre + " §3Du wurdest zu §7Spieler | " + t.getPlayer().getName() + " §3teleportiert");
				}
					
					
				}else {
					p.sendMessage(Main.pre + " §cDieser Spieler ist nicht online");
				}
			}else {
				p.sendMessage(Main.pre + " §cBitte benutze §6/tpo <Spieler>");
			}
		}else {
			p.sendMessage(Main.pre + " §cDazu hast keine Rechte");
		}
			
			return false;
}
}