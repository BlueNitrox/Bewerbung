package de.Tommunity.Commands;

import de.Tommunity.Main.Main;
import de.Tommunity.Utils.LocationManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.io.File;

public class Location implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args){
        Player p = (Player) sender;

        File ordner = new File("plugins//Lobby//");
        File file = new File("plugins//Lobby//" + args[0] + ".yml");

        if(p.hasPermission("lobby.admin")){
            LocationManager.setLocation(args[0], p);
            p.sendMessage(Main.pre + "Du hast die Location §c" + args[0] + " §fgesetzt");
        } else {
            p.sendMessage(Main.err_noperms);
        }
        return false;
    }

}
