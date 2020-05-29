package de.Tommunity.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Tommunity.Main.Main;

public class Eventmine implements CommandExecutor {

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

    public static boolean EventMine;

    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String s, String[] args) {
        Player p = (Player)cs;
        if(!(cs instanceof Player)){
            cs.sendMessage(Main.pre +"§cDazu musst du ein Spieler sein!");
            return true;
        }
        if(args.length == 0){
            if(p.hasPermission("Tom.*")) {
                if (EventMine == true) {
                    EventMine = false;
                    p.sendMessage(Main.pre + "§3Du hast die Eventmine geschlossen!");
                } else if (EventMine == false) {
                    EventMine = true;
                    p.sendMessage(Main.pre + "§3Du hast die Eventmine geöffnet!");
                }
            }else {
                p.sendMessage(Main.err);
            }
        }else {
            p.sendMessage(Main.pre + "§cBenutzung: §6Eventmine§c!");
        }
        return false;
    }
}
