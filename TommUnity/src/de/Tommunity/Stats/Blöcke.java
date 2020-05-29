package de.Tommunity.Stats;
 
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

 
public class Blöcke implements CommandExecutor {

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
        Player p = (Player) cs;
        if (args.length == 0) {
            p.sendMessage(Main.pre + "ï¿½3Deine Blï¿½cke: " + getbreak(p.getUniqueId()));
        } else if (args.length == 1) {
            Player target = Bukkit.getPlayer(args[0]);
            if (p.hasPermission("Tom.break")) {
                p.sendMessage(Main.pre + "ï¿½3Abgebaute Blï¿½cke von ï¿½e" + target.getPlayer().getName() + ":ï¿½3 " + getbreak(target.getUniqueId()));
            } else {
                p.sendMessage(Main.pre + "ï¿½3Deine Blï¿½cke: " + getbreak(p.getUniqueId()));
            }
        } else if (args.length == 3) {
 
            if (p.hasPermission("Tom.break")) {
                if (args[0].equalsIgnoreCase("add")) {
                    Player target = Bukkit.getPlayer(args[1]);
                    if (target != null) {
                        Integer amount = Integer.valueOf(args[2]);
                        addbreak(target.getUniqueId(), amount);
                        p.sendMessage(Main.pre + "ï¿½3Du hast ï¿½e" + target.getPlayer().getName() + " ï¿½a" + amount + " ï¿½ ï¿½3gegeben");
                    } else {
                        p.sendMessage("ï¿½cDieser Spieler ist nicht online");
                    }
                } else if (args[0].equalsIgnoreCase("remove")) {
                    Player target = Bukkit.getPlayer(args[1]);
                    if (target != null) {
                        Integer amount = Integer.valueOf(args[2]);
                        removebreak(target.getUniqueId(), amount);
                        p.sendMessage(Main.pre + "ï¿½cDu hast ï¿½e" + target.getPlayer().getName() + "ï¿½a " + amount + "$ ï¿½cabgezogen");
                    } else {
                        p.sendMessage("ï¿½cDieser Spieler ist nicht online");
                    }
                } else if (args[0].equalsIgnoreCase("set")) {
                    Player target = Bukkit.getPlayer(args[1]);
                    if (target != null) {
                        Integer amount = Integer.valueOf(args[2]);
                        setbreak(target.getUniqueId(), amount);
                        p.sendMessage(Main.pre + "ï¿½3Du hast die Kisten von ï¿½e" + target.getPlayer().getName() + "ï¿½3 auf ï¿½a" + amount + "$ï¿½3 gesetzt!");
                    } else {
                        p.sendMessage("ï¿½cDieser Spieler ist nicht online");
                    }
                }
 
            } else {
                p.sendMessage(Main.pre + " ï¿½cDazu hast du keine Rechte!");
            }
        } else {
            p.sendMessage(Main.pre + "ï¿½cBitte benutze ï¿½6/break <add/set/remove> <Spieler> <Betrag>!");
            return true;
        }
        return false;
 
    }
 
    public Integer getbreak(UUID uuid) {
        File file = new File("plugins//TommUnity", "break.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
 
        int onbreak = cfg.getInt(uuid + ".break");
        return onbreak;
 
    }
 
    public void addbreak(UUID uuid, int amount) {
        File file = new File("plugins//TommUnity", "break.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
 
        int onbreak = cfg.getInt(uuid + ".break");
        onbreak = onbreak + amount;
        cfg.set(uuid + ".break", onbreak);
        try {
            cfg.save(file);
        } catch (IOException e) {
            e.printStackTrace();
 
        }
 
    }
 
    public void removebreak(UUID uuid, int amount) {
        File file = new File("plugins//TommUnity", "break.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
 
        int onbreak = cfg.getInt(uuid + ".break");
        onbreak = onbreak - amount;
        cfg.set(uuid + ".break", onbreak);
        try {
            cfg.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
 
    public void setbreak(UUID uuid, int amount) {
        File file = new File("plugins//TommUnity", "break.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
 
        cfg.set(uuid + ".break", amount);
        int onbreak = cfg.getInt(uuid + ".break");
        onbreak = onbreak + amount;
        try {
            cfg.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    public boolean hasEnoughbreak(UUID uuid, int amount) {
        File file = new File("plugins/TommUnity", "break.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
 
        int onbreak = cfg.getInt(uuid + ".break");
        if (onbreak >= amount) {
            return true;
        } else
            return false;
 
    }

	public int getbreak(String string) {
        File file = new File("plugins//TommUnity", "break.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
 
        int onbreak = cfg.getInt(string + ".break");
		return onbreak;
	}


 
}