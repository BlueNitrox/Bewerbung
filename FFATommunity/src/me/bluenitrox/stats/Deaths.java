package me.bluenitrox.stats;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import me.bluenitrox.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;



public class Deaths implements CommandExecutor {

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
        Player p = (Player) cs;
        if (args.length == 0) {
            p.sendMessage(Main.pre + "§3Deine Tode: " + getDeath(p.getUniqueId()));
        } else if (args.length == 1) {
            Player target = Bukkit.getPlayer(args[0]);
            if (p.hasPermission("Tom.Death")) {
                p.sendMessage(Main.pre + "§3Tode von §e" + target.getPlayer().getName() + ":§3 " + getDeath(target.getUniqueId()));
            } else {
                p.sendMessage(Main.pre + "§3Deine Tode: " + getDeath(p.getUniqueId()));
            }
        } else if (args.length == 3) {

            if (p.hasPermission("Tom.Death")) {
                if (args[0].equalsIgnoreCase("add")) {
                    Player target = Bukkit.getPlayer(args[1]);
                    if (target != null) {
                        Integer amount = Integer.valueOf(args[2]);
                        addDeath(target.getUniqueId(), amount);
                        p.sendMessage(Main.pre + "§3Du hast §e" + target.getPlayer().getName() + " §a" + amount + " § §3gegeben");
                    } else {
                        p.sendMessage("§cDieser Spieler ist nicht online");
                    }
                } else if (args[0].equalsIgnoreCase("remove")) {
                    Player target = Bukkit.getPlayer(args[1]);
                    if (target != null) {
                        Integer amount = Integer.valueOf(args[2]);
                        removeDeath(target.getUniqueId(), amount);
                        p.sendMessage(Main.pre + "§cDu hast §e" + target.getPlayer().getName() + "§a " + amount + "$ §cabgezogen");
                    } else {
                        p.sendMessage("§cDieser Spieler ist nicht online");
                    }
                } else if (args[0].equalsIgnoreCase("set")) {
                    Player target = Bukkit.getPlayer(args[1]);
                    if (target != null) {
                        Integer amount = Integer.valueOf(args[2]);
                        setDeath(target.getUniqueId(), amount);
                        p.sendMessage(Main.pre + "§3Du hast die Kisten von §e" + target.getPlayer().getName() + "§3 auf §a" + amount + "$§3 gesetzt!");
                    } else {
                        p.sendMessage("§cDieser Spieler ist nicht online");
                    }
                }

            } else {
                p.sendMessage(Main.pre + " §cDazu hast du keine Rechte!");
            }
        } else {
            p.sendMessage(Main.pre + "§cBitte benutze §6/Death <add/set/remove> <Spieler> <Betrag>!");
            return true;
        }
        return false;

    }

    public Integer getDeath(UUID uuid) {
        File file = new File("plugins//TommUnity", "Death.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

        int onDeath = cfg.getInt(uuid + ".Death");
        return onDeath;

    }

    public void addDeath(UUID uuid, int amount) {
        File file = new File("plugins//TommUnity", "Death.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

        int onDeath = cfg.getInt(uuid + ".Death");
        onDeath = onDeath + amount;
        cfg.set(uuid + ".Death", onDeath);
        try {
            cfg.save(file);
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    public void removeDeath(UUID uuid, int amount) {
        File file = new File("plugins//TommUnity", "Death.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

        int onDeath = cfg.getInt(uuid + ".Death");
        onDeath = onDeath - amount;
        cfg.set(uuid + ".Death", onDeath);
        try {
            cfg.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void setDeath(UUID uuid, int amount) {
        File file = new File("plugins//TommUnity", "Death.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

        cfg.set(uuid + ".Death", amount);
        int onDeath = cfg.getInt(uuid + ".Death");
        onDeath = onDeath + amount;
        try {
            cfg.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean hasEnoughDeath(UUID uuid, int amount) {
        File file = new File("plugins/TommUnity", "Death.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

        int onDeath = cfg.getInt(uuid + ".Death");
        if (onDeath >= amount) {
            return true;
        } else
            return false;

    }

    public int getDeath(String string) {
        File file = new File("plugins//TommUnity", "Death.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

        int onDeath = cfg.getInt(string + ".Death");
        return onDeath;
    }



}