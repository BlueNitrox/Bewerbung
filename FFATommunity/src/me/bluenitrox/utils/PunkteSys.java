package me.bluenitrox.utils;

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



public class PunkteSys implements CommandExecutor {

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
        Player p = (Player) cs;
        if (args.length == 0) {
            p.sendMessage(Main.pre + "§3Dein Punktestand: " + getpunkte(p.getUniqueId()));
        } else if (args.length == 1) {
            Player target = Bukkit.getPlayer(args[0]);
            if (p.hasPermission("Tom.Punkte")) {
                p.sendMessage(Main.pre + "§3Punktestand von §e" + target.getPlayer().getName() + ":§3 " + getpunkte(target.getUniqueId()));
            } else {
                p.sendMessage(Main.pre + "§3Dein Punktestand: " + getpunkte(p.getUniqueId()));
            }
        } else if (args.length == 3) {

            if (p.hasPermission("Tom.Punkte")) {
                if (args[0].equalsIgnoreCase("add")) {
                    Player target = Bukkit.getPlayer(args[1]);
                    if (target != null) {
                        Integer amount = Integer.valueOf(args[2]);
                        addpunkte(target.getUniqueId(), amount);
                        p.sendMessage(Main.pre + "§3Du hast §e" + target.getPlayer().getName() + " §a" + amount + " § §3gegeben");
                    } else {
                        p.sendMessage("§cDieser Spieler ist nicht online");
                    }
                } else if (args[0].equalsIgnoreCase("remove")) {
                    Player target = Bukkit.getPlayer(args[1]);
                    if (target != null) {
                        Integer amount = Integer.valueOf(args[2]);
                        removepunkte(target.getUniqueId(), amount);
                        p.sendMessage(Main.pre + "§cDu hast §e" + target.getPlayer().getName() + "§a " + amount + "$ §cabgezogen");
                    } else {
                        p.sendMessage("§cDieser Spieler ist nicht online");
                    }
                } else if (args[0].equalsIgnoreCase("set")) {
                    Player target = Bukkit.getPlayer(args[1]);
                    if (target != null) {
                        Integer amount = Integer.valueOf(args[2]);
                        setMoney(target.getUniqueId(), amount);
                        p.sendMessage(Main.pre + "§3Du hast das Geld von §e" + target.getPlayer().getName() + "§3 auf §a" + amount + "$§3 gesetzt!");
                    } else {
                        p.sendMessage("§cDieser Spieler ist nicht online");
                    }
                }

            } else {
                p.sendMessage(Main.pre + " §cDazu hast du keine Rechte!");
            }
        } else {
            p.sendMessage(Main.pre + "§cBitte benutze §6/Punkte <add/set/remove> <Spieler> <Betrag>!");
            return true;
        }
        return false;

    }

    public Integer getpunkte(UUID uuid) {
        File file = new File("plugins//TommUnityFFA" , "Punkte.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

        int punkte = cfg.getInt(uuid + ".punkte");
        return punkte;

    }

    public void addpunkte(UUID uuid, int amount) {
        File file = new File("plugins//TommUnityFFA" , "Punkte.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

        int punkte = cfg.getInt(uuid + ".punkte");
        punkte = punkte + amount;
        cfg.set(uuid + ".punkte", punkte);
        try {
            cfg.save(file);
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    public void removepunkte(UUID uuid, int amount) {
        File file = new File("plugins//TommUnityFFA" , "Punkte.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

        int punkte = cfg.getInt(uuid + ".punkte");
        punkte = punkte - amount;
        cfg.set(uuid + ".punkte", punkte);
        try {
            cfg.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void setMoney(UUID uuid, int amount) {
        File file = new File("plugins//TommUnityFFA" , "Punkte.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

        cfg.set(uuid + ".punkte", amount);
        int punkte = cfg.getInt(uuid + ".punkte");
        punkte = punkte + amount;
        try {
            cfg.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean hasEnoughpunkte(UUID uuid, int amount) {
        File file = new File("plugins//TommUnityFFA" , "Punkte.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

        int punkte = cfg.getInt(uuid + ".punkte");
        if (punkte >= amount) {
            return true;
        } else
            return false;

    }

    public int getpunkte(String string) {
        File file = new File("plugins//TommUnityFFA" , "Punkte.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

        int punkte = cfg.getInt(string + ".punkte");
        return punkte;
    }



}