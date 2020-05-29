package me.bluenitrox.commands;

import me.bluenitrox.main.Main;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class build_Command implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String s, String[] args) {
        Player p = (Player)cs;
        if(!(cs instanceof Player)){
            cs.sendMessage(Main.keinP);
            return true;
        }
        if(p.hasPermission("Tom.*")){
            if(args.length == 0){
                if(Main.build.contains(p)){
                    Main.build.remove(p);
                    p.sendMessage(Main.pre + "§aDu bist nun nichtmehr im Baumodus!");
                    p.setGameMode(GameMode.SURVIVAL);
                }else {
                    Main.build.add(p);
                    p.sendMessage(Main.pre + "§aDu bist nun im Baumodus!");
                    p.setGameMode(GameMode.CREATIVE);
                }
            }else {
                p.sendMessage(Main.pre + "§cBenutze: §6/build§c!");
            }
        }else {
            p.sendMessage(Main.err);
        }
        return false;
    }
}
