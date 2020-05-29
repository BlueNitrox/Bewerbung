package de.Tommunity.Commands;

import de.Tommunity.Main.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import ru.tehkode.permissions.bukkit.PermissionsEx;

import java.security.Permission;
import java.util.ArrayList;

public class Nick implements CommandExecutor, Listener {

    public static ArrayList<Player> nicked = new ArrayList<>();

    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String s, String[] args) {
        Player p = (Player)cs;

        if(args.length == 0){
            if(p.hasPermission("Tom.Nick.Team")){
                if(!nicked.contains(p)) {
                    if(PermissionsEx.getUser(p).inGroup("Owner")){
                        PermissionsEx.getUser(p).removeGroup("Owner");
                        PermissionsEx.getUser(p).addGroup("Spieler");
                        p.sendMessage(Main.pre + "§cGENICKT!");
                        return true;
                    }
                    if(PermissionsEx.getUser(p).inGroup("Admin")){
                        PermissionsEx.getUser(p).removeGroup("Admin");
                        PermissionsEx.getUser(p).addGroup("Spieler");
                        p.sendMessage(Main.pre + "§cGENICKT!");
                        return true;
                    }
                    if(PermissionsEx.getUser(p).inGroup("Developer")){
                        PermissionsEx.getUser(p).removeGroup("Developer");
                        PermissionsEx.getUser(p).addGroup("Spieler");
                        p.sendMessage(Main.pre + "§cGENICKT!");
                        return true;
                    }
                    if(PermissionsEx.getUser(p).inGroup("Moderator")){
                        PermissionsEx.getUser(p).removeGroup("Moderator");
                        PermissionsEx.getUser(p).addGroup("Spieler");
                        p.sendMessage(Main.pre + "§cGENICKT!");
                        return true;
                    }
                    if(PermissionsEx.getUser(p).inGroup("Supporter")){
                        PermissionsEx.getUser(p).removeGroup("Supporter");
                        PermissionsEx.getUser(p).addGroup("Spieler");
                        p.sendMessage(Main.pre + "§cGENICKT!");
                        return true;
                    }
                }
            }else {
                p.sendMessage(Main.err);
            }
        }else {
            p.sendMessage(Main.pre + "§cBenutze: §6/nick§c!");
        }
        return false;
    }

    @EventHandler
    public void onQuit(final PlayerQuitEvent e){
        Player p = (Player)e.getPlayer();
        if(nicked.contains(p)){
            PermissionsEx.getUser(p).removeGroup("Spieler");
            if(p.hasPermission("Tom.rank.Owner")){
                PermissionsEx.getUser(p).addGroup("Owner");
            }else if(p.hasPermission("Tom.rank.Dev")){
                PermissionsEx.getUser(p).addGroup("Developer");
            }else if(p.hasPermission("Tom.rank.Admin")){
                PermissionsEx.getUser(p).addGroup("Admin");
            }else if(p.hasPermission("Tom.rank.Mod")){
                PermissionsEx.getUser(p).addGroup("Moderator");
            }else if(p.hasPermission("Tom.rank.Sup")){
                PermissionsEx.getUser(p).addGroup("Supporter");
            }else if(p.hasPermission("Tom.rank.Builder")){
                PermissionsEx.getUser(p).addGroup("Builder");
            }
        }
    }

}
