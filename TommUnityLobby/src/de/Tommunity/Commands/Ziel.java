package de.Tommunity.Commands;

import de.Tommunity.Listener.Navigator;
import de.Tommunity.Main.Main;
import de.Tommunity.Utils.Coins;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Arrays;

public class Ziel implements CommandExecutor {


    public static ArrayList<Player> eins = new ArrayList<>();
    public static ArrayList<Player> zwei = new ArrayList<>();
    public static ArrayList<Player> drei = new ArrayList<>();
    public static ArrayList<Player> vier = new ArrayList<>();
    public static ArrayList<Player> fünf = new ArrayList<>();
    public static ArrayList<Player> sechs = new ArrayList<>();
    public static ArrayList<Player> sieben = new ArrayList<>();
    public static ArrayList<Player> acht = new ArrayList<>();
    public static ArrayList<Player> neun = new ArrayList<>();



    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String s, String[] args) {
        Player p = (Player)cs;
        if(!(cs instanceof Player)){
            p.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein!");
        }
        if(args.length == 0){
            //Runs
            //9
            if(p.getLocation().getZ() <= -104 && p.getLocation().getZ() >= -110){
                if(p.getLocation().getX() <= 55 && p.getLocation().getX() >= 49){
                    if(p.getLocation().getY() <= 94 && p.getLocation().getY() >= 87){
                        if(!neun.contains(p)) {
                            p.sendMessage(Main.pre + "§cDu hast das Jump and Run geschafft! Du hast 60 Coins erhalten");
                            p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L ,1L);
                            teleport(p);
                            Coins c = new Coins();
                            c.addCoins(p.getUniqueId(), 60);
                            neun.add(p);
                            return true;
                        }else {
                            p.sendMessage(Main.pre +"§cDu hast dieses Jump and Run heute schonmal gemacht!");
                            p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1L, 1L);
                            return true;
                        }
                    }
                }
            }
            //8
            if(p.getLocation().getZ() <= -120 && p.getLocation().getZ() >= -124){
                if(p.getLocation().getX() <= 135 && p.getLocation().getX() >= 131){
                    if(p.getLocation().getY() <= 90 && p.getLocation().getY() >= 86){
                        if(!acht.contains(p)) {
                            p.sendMessage(Main.pre + "§cDu hast das Jump and Run geschafft! Du hast 60 Coins erhalten");
                            p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L ,1L);
                            teleport(p);
                            Coins c = new Coins();
                            c.addCoins(p.getUniqueId(), 60);
                            acht.add(p);
                            return true;
                        }else {
                            p.sendMessage(Main.pre + "§cDu hast dieses Jump and Run heute schonmal gemacht!");
                            p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1L, 1L);
                            return true;
                        }
                    }
                }
            }
            //7
            if(p.getLocation().getZ() <= -92 && p.getLocation().getZ() >= -97){
                if(p.getLocation().getX() <= 112 && p.getLocation().getX() >= 108){
                    if(p.getLocation().getY() <= 89 && p.getLocation().getY() >= 84){
                        if(!sieben.contains(p)) {
                            p.sendMessage(Main.pre + "§cDu hast das Jump and Run geschafft! Du hast 60 Coins erhalten");
                            p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L ,1L);
                            teleport(p);
                            Coins c = new Coins();
                            c.addCoins(p.getUniqueId(), 60);
                            sieben.add(p);
                            return true;
                        }else {
                            p.sendMessage(Main.pre + "§cDu hast dieses Jump and Run heute schonmal gemacht!");
                            p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1L, 1L);
                            return true;
                        }
                    }
                }
            }
            //6
            if(p.getLocation().getZ() <= -41 && p.getLocation().getZ() >= -45){
                if(p.getLocation().getX() <= 72 && p.getLocation().getX() >= 68){
                    if(p.getLocation().getY() <= 98 && p.getLocation().getY() >= 94){
                        if(!sechs.contains(p)) {
                            p.sendMessage(Main.pre + "§cDu hast das Jump and Run geschafft! Du hast 40 Coins erhalten");
                            p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L ,1L);
                            teleport(p);
                            Coins c = new Coins();
                            c.addCoins(p.getUniqueId(), 40);
                            sechs.add(p);
                            return true;
                        }else {
                            p.sendMessage(Main.pre + "§cDu hast dieses Jump and Run heute schonmal gemacht!");
                            p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1L, 1L);
                            return true;
                        }
                    }
                }
            }
            //5
            if(p.getLocation().getZ() <= 43 && p.getLocation().getZ() >= 40){
                if(p.getLocation().getX() <= -11 && p.getLocation().getX() >= -14){
                    if(p.getLocation().getY() <= 62 && p.getLocation().getY() >= 59){
                        if(!fünf.contains(p)) {
                            p.sendMessage(Main.pre + "§cDu hast das Jump and Run geschafft! Du hast 40 Coins erhalten");
                            p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L ,1L);
                            teleport(p);
                            Coins c = new Coins();
                            c.addCoins(p.getUniqueId(), 40);
                            fünf.add(p);
                            return true;
                        }else {
                            p.sendMessage(Main.pre + "§cDu hast dieses Jump and Run heute schonmal gemacht!");
                            p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1L, 1L);
                            return true;
                        }
                    }
                }
            }
            //4
            if(p.getLocation().getZ() <= -20 && p.getLocation().getZ() >= -23){
                if(p.getLocation().getX() <= -48 && p.getLocation().getX() >= -52){
                    if(p.getLocation().getY() <= 79 && p.getLocation().getY() >= 74){
                        if(!vier.contains(p)) {
                            p.sendMessage(Main.pre + "§cDu hast das Jump and Run geschafft! Du hast 40 Coins erhalten");
                            p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L ,1L);
                            teleport(p);
                            Coins c = new Coins();
                            c.addCoins(p.getUniqueId(), 40);
                            vier.add(p);
                            return true;
                        }else {
                            p.sendMessage(Main.pre + "§cDu hast dieses Jump and Run heute schonmal gemacht!");
                            p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1L, 1L);
                            return true;
                        }
                    }
                }
            }
            //3
            if(p.getLocation().getZ() <= -39 && p.getLocation().getZ() >= -43){
                if(p.getLocation().getX() <= -24 && p.getLocation().getX() >= -28){
                    if(p.getLocation().getY() <= 89 && p.getLocation().getY() >= 82){
                        if(!drei.contains(p)) {
                            p.sendMessage(Main.pre + "§cDu hast das Jump and Run geschafft! Du hast 20 Coins erhalten");
                            p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L ,1L);
                            teleport(p);
                            Coins c = new Coins();
                            c.addCoins(p.getUniqueId(), 20);
                            drei.add(p);
                            return true;
                        }else {
                            p.sendMessage(Main.pre + "§cDu hast dieses Jump and Run heute schonmal gemacht!");
                            p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1L, 1L);
                            return true;
                        }
                    }
                }
            }
            //2
            if(p.getLocation().getZ() <= -11 && p.getLocation().getZ() >= -15){
                if(p.getLocation().getX() <= 6 && p.getLocation().getX() >= 2){
                    if(p.getLocation().getY() <= 91 && p.getLocation().getY() >= 86){
                        if(!zwei.contains(p)) {
                            p.sendMessage(Main.pre + "§cDu hast das Jump and Run geschafft! Du hast 20 Coins erhalten");
                            p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L ,1L);
                            teleport(p);
                            Coins c = new Coins();
                            c.addCoins(p.getUniqueId(), 20);
                            zwei.add(p);
                            return true;
                        }else {
                            p.sendMessage(Main.pre + "§cDu hast dieses Jump and Run heute schonmal gemacht!");
                            p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1L, 1L);
                            return true;
                        }
                    }
                }
            }
            //1
            if(p.getLocation().getZ() <= -52 && p.getLocation().getZ() >= -56){
                if(p.getLocation().getX() <= 15 && p.getLocation().getX() >= 11){
                    if(p.getLocation().getY() <= 95 && p.getLocation().getY() >= 91){
                        if(!eins.contains(p)) {
                            p.sendMessage(Main.pre + "§cDu hast das Jump and Run geschafft! Du hast 20 Coins erhalten");
                            p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L ,1L);
                            teleport(p);
                            Coins c = new Coins();
                            c.addCoins(p.getUniqueId(), 20);
                            eins.add(p);
                            return true;
                        }else {
                            p.sendMessage(Main.pre + "§cDu hast dieses Jump and Run heute schonmal gemacht!");
                            p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1L, 1L);
                            return true;
                        }
                    }
                }
            }
            p.sendMessage(Main.pre +"§cDu bist in keinem Ziel!");
        }else {
            p.sendMessage(Main.pre +"§cBenutze: §6/ziel§c!");
        }
        return false;
    }

    public void teleport(Player p){
        FileConfiguration config2 = Main.getPlugin().getConfig();
        World world2 = Bukkit.getWorld(config2.getString("Spawn1.World"));
        double x2 = config2.getDouble("Spawn1.X");
        double y2 = config2.getDouble("Spawn1.Y");
        double z2 = config2.getDouble("Spawn1.Z");
        float yaw2 = (float) config2.getDouble("Spawn1.Yaw");
        float pitch2 = (float) config2.getDouble("Spawn1.Pitch");
        org.bukkit.Location location2 = new Location(world2, x2, y2, z2, yaw2, pitch2);
        Navigator.teleporthigh(p, location2);
    }

}
