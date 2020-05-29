package me.bluenitrox.commands;

import me.bluenitrox.main.Main;
import me.bluenitrox.stats.Deaths;
import me.bluenitrox.stats.Kills;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class stats_Command implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String s, String[] args) {
        Player p = (Player)cs;
        if(!(cs instanceof Player)){
            cs.sendMessage(Main.keinP);
            return true;
        }
        Kills k = new Kills();
        Deaths d = new Deaths();
        if(args.length == 0){
            p.sendMessage(Main.pre +"§cStats von §e"+ p.getName() +"§c:");
            p.sendMessage(Main.pre +"§9Kills: §d" + k.getKill(p.getUniqueId()));
            p.sendMessage(Main.pre +"§9Tode: §d" + d.getDeath(p.getUniqueId()));
        }else if(args.length == 1){
            Player t = Bukkit.getPlayer(args[0]);
            if(t == null){
                p.sendMessage(Main.pre +"§cDieser Spieler ist nicht Online!");
                return true;
            }

            p.sendMessage(Main.pre +"§cStats von §e"+ t.getName() +"§c:");
            p.sendMessage(Main.pre +"§9Kills: §d" + k.getKill(t.getUniqueId()));
            p.sendMessage(Main.pre +"§9Tode: §d" + d.getDeath(t.getUniqueId()));
        }
        return false;
    }
}
