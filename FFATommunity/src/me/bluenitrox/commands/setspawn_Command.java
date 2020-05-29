package me.bluenitrox.commands;

import me.bluenitrox.main.Main;
import me.bluenitrox.utils.Spawns;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class setspawn_Command implements CommandExecutor {
    public setspawn_Command() {
    }

    public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
        Player p = (Player)cs;
        if (!(cs instanceof Player)) {
            cs.sendMessage(Main.keinP);
            return true;
        }
        if (!p.hasPermission("Tom.set")) {
            p.sendMessage(Main.err);
            return true;
        }
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("spawn")) {
                Spawns.setspawn(p);
                p.sendMessage(Main.pre + " §aDu hast den Spawn erfolgreich gesetzt");
            } else if (args[0].equalsIgnoreCase("high")) {
                Spawns.sethigh(p);
                p.sendMessage(Main.pre + " §aDu hast den Spawn erfolgreich gesetzt");
            }
        } else {
            p.sendMessage(Main.pre + " §cBitte benutze /set <Name>");
        }

        return false;
    }
}
