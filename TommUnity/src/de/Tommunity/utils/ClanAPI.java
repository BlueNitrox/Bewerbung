package de.Tommunity.utils;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.Tommunity.Main.Main;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class ClanAPI implements CommandExecutor {

	public String clan;
	
	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		Player p = (Player)cs;
		
		if(p.hasPermission("Tom.*")) {
		
		if(args.length == 0) {
			p.sendMessage(Main.pre + "§cBitte benutze /Clan help");
		}
		if(args.length >= 1) {
		if(args[0].equalsIgnoreCase("info")) {
			if(!hasClan(p.getUniqueId(), clan)) {
			p.sendMessage(Main.pre + "§3Dein Clan: §6" + getClan(p.getUniqueId() + "§3!"));
		}else p.sendMessage(Main.pre + "§3Du musst erst einen Clan erstellen!");
		}
		else if(args[0].equalsIgnoreCase("help")) {
			p.sendMessage(Main.pre + "§3/Clan create ");
			p.sendMessage(Main.pre + "§3/Clan invite ");
			p.sendMessage(Main.pre + "§3/Clan leave ");	
			p.sendMessage(Main.pre + "§3/Clan join ");
			p.sendMessage(Main.pre + "§3/Clan info ");
			p.sendMessage(Main.pre + "§3/Clan msg ");
			
		}
		else if(args[0].equalsIgnoreCase("create")) {
			if(hasClan(p.getUniqueId(), null)) {
			if(args.length == 2) {
				String s = "";
				for(int i = 1; i<args.length; i++)
					s = s + args[i] + " ";
				
				s = s.trim();
			
			p.sendMessage(Main.pre + "§3Dein Clan §6" + s + "§3 wurde erstellt");
			PermissionsEx.getUser(p).addPermission("Tom.Class." + s);
			clan = s;
			setClan(p.getUniqueId(), clan);
			
			}
			}else p.sendMessage(Main.pre + "§cDu hast bereits einen Clan");
		}
		else if(args[0].equalsIgnoreCase("invite")) {
			if(!hasClan(p.getUniqueId(), clan)) {
				Player t = Bukkit.getPlayer(args[0]);
			p.sendMessage(Main.pre + "§3Du hast §6" + t.getName() + "§3 in deinen Clan eingeladen!");
			t.sendMessage(Main.pre + "§3Du wurdest von §6" + p.getName() + " §3in §6" + clan + " §3eingeladen!");
		}else p.sendMessage(Main.pre + "§3Du musst erst einen Clan erstellen!");
		}
		else if(args[0].equalsIgnoreCase("msg")) {
			if(!hasClan(p.getUniqueId(), clan)) {
			if(args.length == 2) {
				String s = "";
				for(int i = 1; i<args.length; i++)
					s = s + args[i] + " ";
				
				s = s.trim();
			for(Player all : Bukkit.getOnlinePlayers()) {
				if(all.hasPermission("Tom.Class." + clan)) {
					all.sendMessage("§e " + clan + " §7» §3" + s);
				} 
			}
			}
			}else p.sendMessage(Main.pre + "§3Du musst erst einen Clan erstellen!");
					}
		}
		
		
		
		}else p.sendMessage(Main.pre + "§cDazu hast du keine Rechte!");
		
		return false;
	}

    public void getClan(UUID uuid) {
        File file = new File("plugins//TommUnity", "Clan.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
 
        cfg.getInt(uuid + ".clan");
        return;
 
    }
    public String getClan(String string) {
        File file = new File("plugins//TommUnity", "Clan.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
        String clan = cfg.getString(string + ".clan");
        return clan;
 
    }
    public void setClan(UUID uuid, String clan) {
        File file = new File("plugins//TommUnity", "Clan.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
 
        cfg.set(uuid + ".clan", clan);
        try {
            cfg.save(file);
        } catch (IOException e) {
            e.printStackTrace();
 
        }
 
    }
    public boolean hasClan(UUID uuid, String clan) {
        File file = new File("plugins/TommUnity", "Clan.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
 
        cfg.getString(uuid + ".clan");
            return false;
 
    }
}
