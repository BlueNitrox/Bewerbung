package de.Tommunity.Commands;

import de.Tommunity.Main.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class UnNick implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String s, String[] args) {
        Player p = (Player)cs;
        if (p.hasPermission("Tom.Nick.Team")) {
            if(Nick.nicked.contains(p)) {
                PermissionsEx.getUser(p).removeGroup("Spieler");
                p.sendMessage(Main.pre + "§cUNNICKT!");
                if (p.hasPermission("Tom.rank.Owner")) {
                    PermissionsEx.getUser(p).addGroup("Owner");
                } else if (p.hasPermission("Tom.rank.Dev")) {
                    PermissionsEx.getUser(p).addGroup("Developer");
                } else if (p.hasPermission("Tom.rank.Admin")) {
                    PermissionsEx.getUser(p).addGroup("Admin");
                } else if (p.hasPermission("Tom.rank.Mod")) {
                    PermissionsEx.getUser(p).addGroup("Moderator");
                } else if (p.hasPermission("Tom.rank.Sup")) {
                    PermissionsEx.getUser(p).addGroup("Supporter");
                } else if (p.hasPermission("Tom.rank.Builder")) {
                    PermissionsEx.getUser(p).addGroup("Builder");
                }
            }
        }else {
            p.sendMessage(Main.err);
        }
        return false;
    }
}
