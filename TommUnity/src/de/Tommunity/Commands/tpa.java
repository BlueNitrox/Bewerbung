package de.Tommunity.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Tommunity.Listener.WorldListener;
import de.Tommunity.Main.Main;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ClickEvent.Action;
import net.md_5.bungee.api.chat.TextComponent;
import ru.tehkode.permissions.bukkit.PermissionsEx;


public class tpa implements CommandExecutor{

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

		if(args.length == 1) {
			try {
				Player t = Bukkit.getPlayer(args[0]);
				if(t != p) {
				Main.tpa.put(t, p);
				
				TextComponent tc = new TextComponent();
				TextComponent tc1 = new TextComponent();
				
				if(PermissionsEx.getUser(p.getName()).inGroup("Owner")) {
					t.sendMessage(Main.pre + " §3Der Spieler §4§lOwner | " + p.getPlayer().getName() + " §3hat dir eine Tpa-Anfrage geschickt:");
				}else if(PermissionsEx.getUser(p.getName()).inGroup("Admin")) {
					t.sendMessage(Main.pre + " §3Der Spieler §c§lAdmin" + p.getPlayer().getName() + " §3hat dir eine Tpa-Anfrage geschickt:");
				}else if(PermissionsEx.getUser(p.getName()).inGroup("Developer")) {
					t.sendMessage(Main.pre + " §3Der Spieler §b§lDev | " + p.getPlayer().getName() + " §3hat dir eine Tpa-Anfrage geschickt:");
				}else if(PermissionsEx.getUser(p.getName()).inGroup("Moderator")) {
					t.sendMessage(Main.pre + " §3Der Spieler §2Mod | " + p.getPlayer().getName() + " §3hat dir eine Tpa-Anfrage geschickt:");
				}else if(PermissionsEx.getUser(p.getName()).inGroup("Supporter")) {
					t.sendMessage(Main.pre + " §3Der Spieler §aSup | " + p.getPlayer().getName() + " §3hat dir eine Tpa-Anfrage geschickt:");
				}else if(PermissionsEx.getUser(p.getName()).inGroup("Builder")) {
					t.sendMessage(Main.pre + " §3Der Spieler §eBuilder | " + p.getPlayer().getName() + " §3hat dir eine Tpa-Anfrage geschickt:");
				}else if(PermissionsEx.getUser(p.getName()).inGroup("Youtuber")) {
					t.sendMessage(Main.pre + " §3Der Spieler §5YT | " + p.getPlayer().getName() + " §3hat dir eine Tpa-Anfrage geschickt:");
				}else if(PermissionsEx.getUser(p.getName()).inGroup("Hero")) {
					t.sendMessage(Main.pre + " §3Der Spieler §9Hero | " + p.getPlayer().getName() + " §3hat dir eine Tpa-Anfrage geschickt:");
				}else if(PermissionsEx.getUser(p.getName()).inGroup("Master")) {
					t.sendMessage(Main.pre + " §3Der Spieler §dMaster | " + p.getPlayer().getName() + " §3hat dir eine Tpa-Anfrage geschickt:");
				}else if(PermissionsEx.getUser(p.getName()).inGroup("Business")) {
					t.sendMessage(Main.pre + " §3Der Spieler §6Business | " + p.getPlayer().getName() + " §3hat dir eine Tpa-Anfrage geschickt:");
				}else if(PermissionsEx.getUser(p.getName()).inGroup("Spieler")) {
					t.sendMessage(Main.pre + " §3Der Spieler §7Spieler | " + p.getPlayer().getName() + " §3hat dir eine Tpa-Anfrage geschickt:");
				}
				
				
					
				tc.setText(Main.pre + " §8[§aAnnehmen§8]: §a/tpaccept");
				tc.setClickEvent(new ClickEvent(Action.RUN_COMMAND, "/tpaccept"));
				t.spigot().sendMessage(tc);
				tc1.setText(Main.pre + " §8[§cAblehnen§8]: §c/tpdeny");
				tc1.setClickEvent(new ClickEvent(Action.RUN_COMMAND, "/tpdeny"));
				t.spigot().sendMessage(tc1);
				
				
				if(PermissionsEx.getUser(t.getName()).inGroup("Owner")) {
					p.sendMessage(Main.pre + " §aDu hast §4§lOwner | " + t.getPlayer().getName() + " §aeine Tpa-Anfrage geschickt");
				}else if(PermissionsEx.getUser(t.getName()).inGroup("Admin")) {
					p.sendMessage(Main.pre + " §aDu hast §c§lAdmin | " + t.getPlayer().getName() + " §aeine Tpa-Anfrage geschickt");
				}else if(PermissionsEx.getUser(t.getName()).inGroup("Developer")) {
					p.sendMessage(Main.pre + " §aDu hast §b§lDev | " + t.getPlayer().getName() + " §aeine Tpa-Anfrage geschickt");
				}else if(PermissionsEx.getUser(t.getName()).inGroup("Moderator")) {
					p.sendMessage(Main.pre + " §aDu hast §2Mod | " + t.getPlayer().getName() + " §aeine Tpa-Anfrage geschickt");
				}else if(PermissionsEx.getUser(t.getName()).inGroup("Supporter")) {
					p.sendMessage(Main.pre + " §aDu hast §aSup | " + t.getPlayer().getName() + " §aeine Tpa-Anfrage geschickt");
				}else if(PermissionsEx.getUser(t.getName()).inGroup("Builder")) {
					p.sendMessage(Main.pre + " §aDu hast §eBuilder | " + t.getPlayer().getName() + " §aeine Tpa-Anfrage geschickt");
				}else if(PermissionsEx.getUser(t.getName()).inGroup("Youtuber")) {
					p.sendMessage(Main.pre + " §aDu hast §5YT | " + t.getPlayer().getName() + " §aeine Tpa-Anfrage geschickt");
				}else if(PermissionsEx.getUser(t.getName()).inGroup("Hero")) {
					p.sendMessage(Main.pre + " §aDu hast §9Hero | " + t.getPlayer().getName() + " §aeine Tpa-Anfrage geschickt");
				}else if(PermissionsEx.getUser(t.getName()).inGroup("Master")) {
					p.sendMessage(Main.pre + " §aDu hast §aMaster | " + t.getPlayer().getName() + " §aeine Tpa-Anfrage geschickt");
				}else if(PermissionsEx.getUser(t.getName()).inGroup("Business")) {
					p.sendMessage(Main.pre + " §aDu hast §6Business | " + t.getPlayer().getName() + " §aeine Tpa-Anfrage geschickt");
				}else if(PermissionsEx.getUser(t.getName()).inGroup("Spieler")) {
					p.sendMessage(Main.pre + " §aDu hast §7Spieler | " + t.getPlayer().getName() + " §aeine Tpa-Anfrage geschickt");
				}
				
			}else {
					p.sendMessage(Main.pre + " §cDu kannst dir nicht selber eine Tpa-Anfage schicken");
				}
			}catch(Exception e) {
				p.sendMessage(Main.pre + " §cDieser Spieler ist nicht online");
			}
		}else {
			p.sendMessage(Main.pre + " §cBitte benutze §6/tpa <Spieler>");
		}
		
		return false;
	}
}




