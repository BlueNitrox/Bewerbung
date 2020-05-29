package de.Tommunity.Utils;

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


public class MoneySystem implements CommandExecutor {

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
        Player p = (Player) cs;
        if (args.length == 0) {
            p.sendMessage(Main.pre + "§3Dein Kontostand: " + getMoney(p.getUniqueId()));
        } else if (args.length == 1) {
            Player target = Bukkit.getPlayer(args[0]);
            if (p.hasPermission("Tom.Money")) {
                p.sendMessage(Main.pre + "§3Kontostand von §e" + target.getPlayer().getName() + ":§3 " + getMoney(target.getUniqueId()));
            } else {
                p.sendMessage(Main.pre + "§3Dein Kontostand: " + getMoney(p.getUniqueId()));
            }
        } else if (args.length == 3) {

            if (p.hasPermission("Tom.Money")) {
                if (args[0].equalsIgnoreCase("add")) {
                    Player target = Bukkit.getPlayer(args[1]);
                    if (target != null) {
                        Integer amount = Integer.valueOf(args[2]);
                        addMoney(target.getUniqueId(), amount);
                        p.sendMessage(Main.pre + "§3Du hast §e" + target.getPlayer().getName() + " §a" + amount + " § §3gegeben");
                    } else {
                        p.sendMessage("§cDieser Spieler ist nicht online");
                    }
                } else if (args[0].equalsIgnoreCase("remove")) {
                    Player target = Bukkit.getPlayer(args[1]);
                    if (target != null) {
                        Integer amount = Integer.valueOf(args[2]);
                        removeMoney(target.getUniqueId(), amount);
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
            p.sendMessage(Main.pre + "§cBitte benutze §6/money <add/set/remove> <Spieler> <Betrag>!");
            return true;
        }
        return false;

    }

    public Integer getMoney(UUID uuid) {
        File file = new File("//home//Server1//plugins//TommUnity" , "money.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

        int money = cfg.getInt(uuid + ".money");
        return money;

    }

    public void addMoney(UUID uuid, int amount) {
        File file = new File("//home//Server1//plugins//TommUnity", "money.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

        int money = cfg.getInt(uuid + ".money");
        money = money + amount;
        cfg.set(uuid + ".money", money);
        try {
            cfg.save(file);
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    public void removeMoney(UUID uuid, int amount) {
        File file = new File("//home//Server1//plugins//TommUnity", "money.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

        int money = cfg.getInt(uuid + ".money");
        money = money - amount;
        cfg.set(uuid + ".money", money);
        try {
            cfg.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void setMoney(UUID uuid, int amount) {
        File file = new File("//home//Server1//plugins//TommUnity", "money.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

        cfg.set(uuid + ".money", amount);
        int money = cfg.getInt(uuid + ".money");
        money = money + amount;
        try {
            cfg.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean hasEnoughMoney(UUID uuid, int amount) {
        File file = new File("//home//Server1//plugins//TommUnity", "money.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

        int money = cfg.getInt(uuid + ".money");
        if (money >= amount) {
            return true;
        } else
            return false;

    }

    public int getMoney(String string) {
        File file = new File("//home//Server1//plugins//TommUnity", "money.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

        int money = cfg.getInt(string + ".money");
        return money;
    }



}