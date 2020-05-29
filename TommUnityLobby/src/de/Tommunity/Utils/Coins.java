package de.Tommunity.Utils;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import de.Tommunity.Main.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;



public class Coins implements CommandExecutor {

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
        Player p = (Player) cs;
        if (args.length == 0) {
            p.sendMessage(Main.pre + "§3Dein Coinsstand: " + getCoins(p.getUniqueId()));
        } else if (args.length == 1) {
            Player target = Bukkit.getPlayer(args[0]);
            if (p.hasPermission("Tom.Coins")) {
                p.sendMessage(Main.pre + "§3Coinsstand von §e" + target.getPlayer().getName() + ":§3 " + getCoins(target.getUniqueId()));
            } else {
                p.sendMessage(Main.pre + "§3Dein Coinsstand: " + getCoins(p.getUniqueId()));
            }
        } else if (args.length == 3) {

            if (p.hasPermission("Tom.Coins")) {
                if (args[0].equalsIgnoreCase("add")) {
                    Player target = Bukkit.getPlayer(args[1]);
                    if (target != null) {
                        Integer amount = Integer.valueOf(args[2]);
                        addCoins(target.getUniqueId(), amount);
                        p.sendMessage(Main.pre + "§3Du hast §e" + target.getPlayer().getName() + " §a" + amount + " § §3gegeben");
                    } else {
                        p.sendMessage("§cDieser Spieler ist nicht online");
                    }
                } else if (args[0].equalsIgnoreCase("remove")) {
                    Player target = Bukkit.getPlayer(args[1]);
                    if (target != null) {
                        Integer amount = Integer.valueOf(args[2]);
                        removeCoins(target.getUniqueId(), amount);
                        p.sendMessage(Main.pre + "§cDu hast §e" + target.getPlayer().getName() + "§a " + amount + "$ §cabgezogen");
                    } else {
                        p.sendMessage("§cDieser Spieler ist nicht online");
                    }
                } else if (args[0].equalsIgnoreCase("set")) {
                    Player target = Bukkit.getPlayer(args[1]);
                    if (target != null) {
                        Integer amount = Integer.valueOf(args[2]);
                        setCoins(target.getUniqueId(), amount);
                        p.sendMessage(Main.pre + "§3Du hast Coins von §e" + target.getPlayer().getName() + "§3 auf §a" + amount + "$§3 gesetzt!");
                    } else {
                        p.sendMessage("§cDieser Spieler ist nicht online");
                    }
                }

            } else {
                p.sendMessage(Main.pre + " §cDazu hast du keine Rechte!");
            }
        } else {
            p.sendMessage(Main.pre + "§cBitte benutze §6/Coins <add/set/remove> <Spieler> <Betrag>!");
            return true;
        }
        return false;

    }

    public Integer getCoins(UUID uuid) {
        File file = new File("//home//Server2//plugins//TommUnityFFA" , "Coins.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

        int Coins = cfg.getInt(uuid + ".Coins");
        return Coins;

    }

    public void addCoins(UUID uuid, int amount) {
        File file = new File("//home//Server2//plugins//TommUnityFFA" , "Coins.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

        int Coins = cfg.getInt(uuid + ".Coins");
        Coins = Coins + amount;
        cfg.set(uuid + ".Coins", Coins);
        try {
            cfg.save(file);
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    public void removeCoins(UUID uuid, int amount) {
        File file = new File("//home//Server2//plugins//TommUnityFFA" , "Coins.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

        int Coins = cfg.getInt(uuid + ".Coins");
        Coins = Coins - amount;
        cfg.set(uuid + ".Coins", Coins);
        try {
            cfg.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void setCoins(UUID uuid, int amount) {
        File file = new File("//home//Server2//plugins//TommUnityFFA" , "Coins.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

        cfg.set(uuid + ".Coins", amount);
        int Coins = cfg.getInt(uuid + ".Coins");
        Coins = Coins + amount;
        try {
            cfg.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean hasEnoughCoins(UUID uuid, int amount) {
        File file = new File("//home//Server2//plugins//TommUnityFFA" , "Coins.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

        int Coins = cfg.getInt(uuid + ".Coins");
        if (Coins >= amount) {
            return true;
        } else
            return false;

    }

    public int getCoins(String string) {
        File file = new File("//home//Server2//plugins//TommUnityFFA" , "Coins.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

        int Coins = cfg.getInt(string + ".Coins");
        return Coins;
    }



}