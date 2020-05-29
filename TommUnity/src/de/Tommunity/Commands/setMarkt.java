package de.Tommunity.Commands;

import de.Tommunity.API.SpawnAPI.setPoint;
import de.Tommunity.Main.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class setMarkt implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String s, String[] args) {
        Player p = (Player)cs;
        if(!(cs instanceof Player)){
            cs.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein!");
            return true;
        }
        if(args.length == 0) {
            if(p.hasPermission("Tom.*")){
                setPoint.setPoint("markt",p.getLocation());
            }else {
                p.sendMessage(Main.err);
            }
        }else {
            p.sendMessage(Main.err);
        }
        return false;
    }
}
