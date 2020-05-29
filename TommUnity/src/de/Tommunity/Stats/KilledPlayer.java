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

 
public class KilledPlayer implements CommandExecutor {

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
        Player p = (Player) cs;
        if (args.length == 0) {
            p.sendMessage(Main.pre + "§3Deine Kills: " + getKill(p.getUniqueId()));
        } else if (args.length == 1) {
            Player target = Bukkit.getPlayer(args[0]);
            if (p.hasPermission("Tom.Kill")) {
                p.sendMessage(Main.pre + "§3Kills von §e" + target.getPlayer().getName() + ":§3 " + getKill(target.getUniqueId()));
            } else {
                p.sendMessage(Main.pre + "§3Deine Kills: " + getKill(p.getUniqueId()));
            }
        } else if (args.length == 3) {
 
            if (p.hasPermission("Tom.Kill")) {
                if (args[0].equalsIgnoreCase("add")) {
                    Player target = Bukkit.getPlayer(args[1]);
                    if (target != null) {
                        Integer amount = Integer.valueOf(args[2]);
                        addKill(target.getUniqueId(), amount);
                        p.sendMessage(Main.pre + "§3Du hast §e" + target.getPlayer().getName() + " §a" + amount + " § §3gegeben");
                    } else {
                        p.sendMessage("§cDieser Spieler ist nicht online");
                    }
                } else if (args[0].equalsIgnoreCase("remove")) {
                    Player target = Bukkit.getPlayer(args[1]);
                    if (target != null) {
                        Integer amount = Integer.valueOf(args[2]);
                        removeKill(target.getUniqueId(), amount);
                        p.sendMessage(Main.pre + "§cDu hast §e" + target.getPlayer().getName() + "§a " + amount + "$ §cabgezogen");
                    } else {
                        p.sendMessage("§cDieser Spieler ist nicht online");
                    }
                } else if (args[0].equalsIgnoreCase("set")) {
                    Player target = Bukkit.getPlayer(args[1]);
                    if (target != null) {
                        Integer amount = Integer.valueOf(args[2]);
                        setKill(target.getUniqueId(), amount);
                        p.sendMessage(Main.pre + "§3Du hast die Kisten von §e" + target.getPlayer().getName() + "§3 auf §a" + amount + "$§3 gesetzt!");
                    } else {
                        p.sendMessage("§cDieser Spieler ist nicht online");
                    }
                }
 
            } else {
                p.sendMessage(Main.pre + " §cDazu hast du keine Rechte!");
            }
        } else {
            p.sendMessage(Main.pre + "§cBitte benutze §6/Kill <add/set/remove> <Spieler> <Betrag>!");
            return true;
        }
        return false;
 
    }
 
    public Integer getKill(UUID uuid) {
        File file = new File("plugins//TommUnity", "Kill.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
 
        int onKill = cfg.getInt(uuid + ".Kill");
        return onKill;
 
    }
 
    public void addKill(UUID uuid, int amount) {
        File file = new File("plugins//TommUnity", "Kill.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
 
        int onKill = cfg.getInt(uuid + ".Kill");
        onKill = onKill + amount;
        cfg.set(uuid + ".Kill", onKill);
        try {
            cfg.save(file);
        } catch (IOException e) {
            e.printStackTrace();
 
        }
 
    }
 
    public void removeKill(UUID uuid, int amount) {
        File file = new File("plugins//TommUnity", "Kill.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
 
        int onKill = cfg.getInt(uuid + ".Kill");
        onKill = onKill - amount;
        cfg.set(uuid + ".Kill", onKill);
        try {
            cfg.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
 
    public void setKill(UUID uuid, int amount) {
        File file = new File("plugins//TommUnity", "Kill.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
 
        cfg.set(uuid + ".Kill", amount);
        int onKill = cfg.getInt(uuid + ".Kill");
        onKill = onKill + amount;
        try {
            cfg.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    public boolean hasEnoughKill(UUID uuid, int amount) {
        File file = new File("plugins/TommUnity", "Kill.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
 
        int onKill = cfg.getInt(uuid + ".Kill");
        if (onKill >= amount) {
            return true;
        } else
            return false;
 
    }

	public int getKill(String string) {
        File file = new File("plugins//TommUnity", "Kill.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
 
        int onKill = cfg.getInt(string + ".Kill");
		return onKill;
	}


 
}