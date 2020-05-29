package de.Tommunity.Mobzone;
 
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

 
public class Zombies implements CommandExecutor {

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
        Player p = (Player) cs;
        if (args.length == 0) {
            p.sendMessage(Main.pre + "§3Deine Zombies: " + getzombie(p.getUniqueId()));
        } else if (args.length == 1) {
            Player target = Bukkit.getPlayer(args[0]);
            if (p.hasPermission("Tom.zombie")) {
                p.sendMessage(Main.pre + "§3Zombies von §e" + target.getPlayer().getName() + ":§3 " + getzombie(target.getUniqueId()));
            } else {
                p.sendMessage(Main.pre + "§3Deine Zombies: " + getzombie(p.getUniqueId()));
            }
        } else if (args.length == 3) {
 
            if (p.hasPermission("Tom.zombie")) {
                if (args[0].equalsIgnoreCase("add")) {
                    Player target = Bukkit.getPlayer(args[1]);
                    if (target != null) {
                        Integer amount = Integer.valueOf(args[2]);
                        addzombie(target.getUniqueId(), amount);
                        p.sendMessage(Main.pre + "§3Du hast §e" + target.getPlayer().getName() + " §a" + amount + " § §3gegeben");
                    } else {
                        p.sendMessage("§cDieser Spieler ist nicht online");
                    }
                } else if (args[0].equalsIgnoreCase("remove")) {
                    Player target = Bukkit.getPlayer(args[1]);
                    if (target != null) {
                        Integer amount = Integer.valueOf(args[2]);
                        removezombie(target.getUniqueId(), amount);
                        p.sendMessage(Main.pre + "§cDu hast §e" + target.getPlayer().getName() + "§a " + amount + "$ §cabgezogen");
                    } else {
                        p.sendMessage("§cDieser Spieler ist nicht online");
                    }
                } else if (args[0].equalsIgnoreCase("set")) {
                    Player target = Bukkit.getPlayer(args[1]);
                    if (target != null) {
                        Integer amount = Integer.valueOf(args[2]);
                        setzombie(target.getUniqueId(), amount);
                        p.sendMessage(Main.pre + "§3Du hast die Kisten von §e" + target.getPlayer().getName() + "§3 auf §a" + amount + "$§3 gesetzt!");
                    } else {
                        p.sendMessage("§cDieser Spieler ist nicht online");
                    }
                }
 
            } else {
                p.sendMessage(Main.pre + " §cDazu hast du keine Rechte!");
            }
        } else {
            p.sendMessage(Main.pre + "§cBitte benutze §6/zombie <add/set/remove> <Spieler> <Betrag>!");
            return true;
        }
        return false;
 
    }
 
    public Integer getzombie(UUID uuid) {
        File file = new File("plugins//TommUnity", "zombie.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
 
        int onzombie = cfg.getInt(uuid + ".zombie");
        return onzombie;
 
    }
 
    public void addzombie(UUID uuid, int amount) {
        File file = new File("plugins//TommUnity", "zombie.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
 
        int onzombie = cfg.getInt(uuid + ".zombie");
        onzombie = onzombie + amount;
        cfg.set(uuid + ".zombie", onzombie);
        try {
            cfg.save(file);
        } catch (IOException e) {
            e.printStackTrace();
 
        }
 
    }
 
    public void removezombie(UUID uuid, int amount) {
        File file = new File("plugins//TommUnity", "zombie.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
 
        int onzombie = cfg.getInt(uuid + ".zombie");
        onzombie = onzombie - amount;
        cfg.set(uuid + ".zombie", onzombie);
        try {
            cfg.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
 
    public void setzombie(UUID uuid, int amount) {
        File file = new File("plugins//TommUnity", "zombie.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
 
        cfg.set(uuid + ".zombie", amount);
        int onzombie = cfg.getInt(uuid + ".zombie");
        onzombie = onzombie + amount;
        try {
            cfg.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    public boolean hasEnoughzombie(UUID uuid, int amount) {
        File file = new File("plugins/TommUnity", "zombie.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
 
        int onzombie = cfg.getInt(uuid + ".zombie");
        if (onzombie >= amount) {
            return true;
        } else
            return false;
 
    }

	public int getzombie(String string) {
        File file = new File("plugins//TommUnity", "zombie.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
 
        int onzombie = cfg.getInt(string + ".zombie");
		return onzombie;
	}


 
}