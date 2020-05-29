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

 
public class Kisten implements CommandExecutor {

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
        Player p = (Player) cs;
        if (args.length == 0) {
            p.sendMessage(Main.pre + "§3Deine Kisten: " + getopenchest(p.getUniqueId()));
        } else if (args.length == 1) {
            Player target = Bukkit.getPlayer(args[0]);
            if (p.hasPermission("Tom.openchest")) {
                p.sendMessage(Main.pre + "§3Geöffneten Kisten von §e" + target.getPlayer().getName() + ":§3 " + getopenchest(target.getUniqueId()));
            } else {
                p.sendMessage(Main.pre + "§3Deine Kisten: " + getopenchest(p.getUniqueId()));
            }
        } else if (args.length == 3) {
 
            if (p.hasPermission("Tom.openchest")) {
                if (args[0].equalsIgnoreCase("add")) {
                    Player target = Bukkit.getPlayer(args[1]);
                    if (target != null) {
                        Integer amount = Integer.valueOf(args[2]);
                        addopenchest(target.getUniqueId(), amount);
                        p.sendMessage(Main.pre + "§3Du hast §e" + target.getPlayer().getName() + " §a" + amount + " § §3gegeben");
                    } else {
                        p.sendMessage("§cDieser Spieler ist nicht online");
                    }
                } else if (args[0].equalsIgnoreCase("remove")) {
                    Player target = Bukkit.getPlayer(args[1]);
                    if (target != null) {
                        Integer amount = Integer.valueOf(args[2]);
                        removeopenchest(target.getUniqueId(), amount);
                        p.sendMessage(Main.pre + "§cDu hast §e" + target.getPlayer().getName() + "§a " + amount + "$ §cabgezogen");
                    } else {
                        p.sendMessage("§cDieser Spieler ist nicht online");
                    }
                } else if (args[0].equalsIgnoreCase("set")) {
                    Player target = Bukkit.getPlayer(args[1]);
                    if (target != null) {
                        Integer amount = Integer.valueOf(args[2]);
                        setopenchest(target.getUniqueId(), amount);
                        p.sendMessage(Main.pre + "§3Du hast die Kisten von §e" + target.getPlayer().getName() + "§3 auf §a" + amount + "$§3 gesetzt!");
                    } else {
                        p.sendMessage("§cDieser Spieler ist nicht online");
                    }
                }
 
            } else {
                p.sendMessage(Main.pre + " §cDazu hast du keine Rechte!");
            }
        } else {
            p.sendMessage(Main.pre + "§cBitte benutze §6/chest <add/set/remove> <Spieler> <Betrag>!");
            return true;
        }
        return false;
 
    }
 
    public Integer getopenchest(UUID uuid) {
        File file = new File("plugins//TommUnity", "chest.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
 
        int chest = cfg.getInt(uuid + ".chest");
        return chest;
 
    }
 
    public void addopenchest(UUID uuid, int amount) {
        File file = new File("plugins//TommUnity", "chest.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
 
        int chest = cfg.getInt(uuid + ".chest");
        chest = chest + amount;
        cfg.set(uuid + ".chest", chest);
        try {
            cfg.save(file);
        } catch (IOException e) {
            e.printStackTrace();
 
        }
 
    }
 
    public void removeopenchest(UUID uuid, int amount) {
        File file = new File("plugins//TommUnity", "chest.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
 
        int chest = cfg.getInt(uuid + ".chest");
        chest = chest - amount;
        cfg.set(uuid + ".chest", chest);
        try {
            cfg.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
 
    public void setopenchest(UUID uuid, int amount) {
        File file = new File("plugins//TommUnity", "chest.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
 
        cfg.set(uuid + ".chest", amount);
        int chest = cfg.getInt(uuid + ".chest");
        chest = chest + amount;
        try {
            cfg.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    public boolean hasEnoughopenchest(UUID uuid, int amount) {
        File file = new File("plugins/TommUnity", "chest.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
 
        int chest = cfg.getInt(uuid + ".chest");
        if (chest >= amount) {
            return true;
        } else
            return false;
 
    }

	public int getopenchest(String string) {
        File file = new File("plugins//TommUnity", "chest.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
 
        int chest = cfg.getInt(string + ".chest");
		return chest;
	}


 
}