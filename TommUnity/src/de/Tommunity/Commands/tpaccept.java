package de.Tommunity.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Tommunity.Listener.WorldListener;
import de.Tommunity.Main.Main;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class tpaccept implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(!(sender instanceof Player)) {
			sender.sendMessage(Main.pre + " §cDazu musst du ein Spieler sein!");
		}
			Player p = (Player) sender;

		if(WorldListener.fight.contains(p)){
			p.sendMessage(Main.pre + "§cDas kannst du im Kampf leider nicht machen!");
			return true;
		}
			
			if(args.length == 0) {
				if(Main.tpa.containsKey(p)) {
				Player t = Main.tpa.get(p);
//					if(!(p.getLocation() == wz)) {
						t.teleport(p.getLocation());
						
						
							if(PermissionsEx.getUser(p.getName()).inGroup("Owner")) {
								t.sendMessage(Main.pre + " §3Du wurdest erfolgreich zu §4§lOwner | " + p.getPlayer().getName() + " §3teleportiert");
							}else if(PermissionsEx.getUser(p.getName()).inGroup("Admin")) {
								t.sendMessage(Main.pre + " §3Du wurdest erfolgreich zu §c§lAdmin | " + p.getPlayer().getName() + " §3teleportiert");
							}else if(PermissionsEx.getUser(p.getName()).inGroup("Developer")) {
								t.sendMessage(Main.pre + " §3Du wurdest erfolgreich zu §b§lDev | " + p.getPlayer().getName() + " §3teleportiert");
							}else if(PermissionsEx.getUser(p.getName()).inGroup("Moderator")) {
								t.sendMessage(Main.pre + " §3Du wurdest erfolgreich zu §2Mod | " + p.getPlayer().getName() + " §3teleportiert");
							}else if(PermissionsEx.getUser(p.getName()).inGroup("Supporter")) {
								t.sendMessage(Main.pre + " §3Du wurdest erfolgreich zu §aSup | " + p.getPlayer().getName() + " §3teleportiert");
							}else if(PermissionsEx.getUser(p.getName()).inGroup("Builder")) {
								t.sendMessage(Main.pre + " §3Du wurdest erfolgreich zu §eBuilder | " + p.getPlayer().getName() + " §3teleportiert");
							}else if(PermissionsEx.getUser(p.getName()).inGroup("Youtuber")) {
								t.sendMessage(Main.pre + " §3Du wurdest erfolgreich zu §5YT | " + p.getPlayer().getName() + " §3teleportiert");
							}else if(PermissionsEx.getUser(p.getName()).inGroup("Hero")) {
								t.sendMessage(Main.pre + " §3Du wurdest erfolgreich zu §9Hero | " + p.getPlayer().getName() + " §3teleportiert");
							}else if(PermissionsEx.getUser(p.getName()).inGroup("Master")) {
								t.sendMessage(Main.pre + " §3Du wurdest erfolgreich zu §dMaster | " + p.getPlayer().getName() + " §3teleportiert");
							}else if(PermissionsEx.getUser(p.getName()).inGroup("Business")) {
								t.sendMessage(Main.pre + " §3Du wurdest erfolgreich zu §6Business | " + p.getPlayer().getName() + " §3teleportiert");
							}else if(PermissionsEx.getUser(p.getName()).inGroup("Spieler")) {
								t.sendMessage(Main.pre + " §3Du wurdest erfolgreich zu §7Spieler | " + p.getPlayer().getName() + " §3teleportiert");
							}
							
							if(PermissionsEx.getUser(t.getName()).inGroup("Owner")) {
							  p.sendMessage(Main.pre + " §4§lOwner | " + t.getPlayer().getName() + " §3wurde erfolgreich zu dir teleportiert");
							}else if(PermissionsEx.getUser(t.getName()).inGroup("Admin")) {
								p.sendMessage(Main.pre + " §c§lAdmin | " + t.getPlayer().getName() + " §3wurde erfolgreich zu dir teleportiert");
							}else if(PermissionsEx.getUser(t.getName()).inGroup("Developer")) {
								p.sendMessage(Main.pre + " §b§lDev | " + t.getPlayer().getName() + " §3wurde erfolgreich zu dir teleportiert");
							}else if(PermissionsEx.getUser(t.getName()).inGroup("Moderator")) {
								p.sendMessage(Main.pre + " §2Mod |" + t.getPlayer().getName() + " §3wurde erfolgreich zu dir teleportiert");
							}else if(PermissionsEx.getUser(t.getName()).inGroup("Supporter")) {
								p.sendMessage(Main.pre + " §aSup | " + t.getPlayer().getName() + " §3wurde erfolgreich zu dir teleportiert");
							}else if(PermissionsEx.getUser(t.getName()).inGroup("Builder")) {
								p.sendMessage(Main.pre + " §eBuilder | " + t.getPlayer().getName() + " §3wurde erfolgreich zu dir teleportiert");
							}else if(PermissionsEx.getUser(t.getName()).inGroup("Youtuber")) {
								p.sendMessage(Main.pre + " §5YT | " + t.getPlayer().getName() + " §3wurde erfolgreich zu dir teleportiert");
							}else if(PermissionsEx.getUser(t.getName()).inGroup("Hero")) {
								p.sendMessage(Main.pre + " §9Hero | " + t.getPlayer().getName() + " §3wurde erfolgreich zu dir teleportiert");
							}else if(PermissionsEx.getUser(t.getName()).inGroup("Master")) {
								p.sendMessage(Main.pre + " §dMaster | " + t.getPlayer().getName() + " §3wurde erfolgreich zu dir teleportiert");
							}else if(PermissionsEx.getUser(t.getName()).inGroup("Business")) {
								p.sendMessage(Main.pre + " §6Business | " + t.getPlayer().getName() + " §3wurde erfolgreich zu dir teleportiert");
							}else if(PermissionsEx.getUser(t.getName()).inGroup("Spieler")) {
								p.sendMessage(Main.pre + " §7Spieler | " + t.getPlayer().getName() + " §3wurde erfolgreich zu dir teleportiert");
							}
							
								Main.tpa.remove(p);
				
//					}else {
//						p.sendMessage(Main.tp + "§cDu kannst eine Tpa-Anfragen in der Warzone annehmen");
//						Main.tpa.remove(p);
//					}
				}else {
					p.sendMessage(Main.pre + " §cDir wurde keine Tpa-Anfrage geschickt");
				}
			}else {
				p.sendMessage(Main.pre + " §cBitte benutze §6/tpaccept");
			}
			
			return false;
}
}