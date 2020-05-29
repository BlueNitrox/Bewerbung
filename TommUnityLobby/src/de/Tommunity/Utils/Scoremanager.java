package de.Tommunity.Utils;
 
import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import ru.tehkode.permissions.bukkit.PermissionsEx;
 
public class Scoremanager {
 
    public static HashMap<UUID, Scoreboard> scoreboardhashmap = new HashMap<>();
   
    public static void checkTablistPrefix(Player a, org.bukkit.scoreboard.Scoreboard sb) {
        if(PermissionsEx.getUser(a).inGroup("Owner")) {
			sb.getTeam("001Owner").addEntry(a.getName());
        }else if(PermissionsEx.getUser(a).inGroup("Admin")) {
            sb.getTeam("002Admin").addEntry(a.getName());
        }else if(PermissionsEx.getUser(a).inGroup("Developer")) {
            sb.getTeam("003Dev").addEntry(a.getName());
        }else if(PermissionsEx.getUser(a).inGroup("Moderator")) {
            sb.getTeam("004Mod").addEntry(a.getName());
        }else if(PermissionsEx.getUser(a).inGroup("Supporter")) {
            sb.getTeam("005Sup").addEntry(a.getName());
        }else if(PermissionsEx.getUser(a).inGroup("Builder")) {
            sb.getTeam("006Builder").addEntry(a.getName());
        }else if(PermissionsEx.getUser(a).inGroup("Youtuber")) {
            sb.getTeam("007YT").addEntry(a.getName());
        }else if(PermissionsEx.getUser(a).inGroup("Hero")) {
            sb.getTeam("008Hero").addEntry(a.getName());
        }else if(PermissionsEx.getUser(a).inGroup("Master")) {
            sb.getTeam("009Master").addEntry(a.getName());
        }else if(PermissionsEx.getUser(a).inGroup("Business")) {
            sb.getTeam("010Business").addEntry(a.getName());
        }else if(PermissionsEx.getUser(a).inGroup("Spieler")) {
            sb.getTeam("011Spieler").addEntry(a.getName());
        }
    }
   
 
    public static void sendTabAndScoreboard(Player p) {
       
        new de.Tommunity.Utils.Scoreboard(p).sendToPlayer(p);
   
        if(PermissionsEx.getUser(p).inGroup("Owner")) {
            for(Player a : Bukkit.getOnlinePlayers()) {
                scoreboardhashmap.get(a.getUniqueId()).sb.getTeam("001Owner").addEntry(a.getName());
            }
       
        }else if(PermissionsEx.getUser(p).inGroup("Admin")) {
            for(Player a : Bukkit.getOnlinePlayers()) {
                scoreboardhashmap.get(a.getUniqueId()).sb.getTeam("002Admin").addEntry(a.getName());
            }
        }else if(PermissionsEx.getUser(p).inGroup("Developer")) {
            for(Player a : Bukkit.getOnlinePlayers()) {
                scoreboardhashmap.get(a.getUniqueId()).sb.getTeam("003Developer").addEntry(a.getName());
            }
        }else if(PermissionsEx.getUser(p).inGroup("Moderator")) {
            for(Player a : Bukkit.getOnlinePlayers()) {
                scoreboardhashmap.get(a.getUniqueId()).sb.getTeam("004Moderator").addEntry(a.getName());
            }
        }else if(PermissionsEx.getUser(p).inGroup("Supporter")) {
            for(Player a : Bukkit.getOnlinePlayers()) {
                scoreboardhashmap.get(a.getUniqueId()).sb.getTeam("005Supporter").addEntry(a.getName());
            }
        }else if(PermissionsEx.getUser(p).inGroup("Builder")) {
            for(Player a : Bukkit.getOnlinePlayers()) {
                scoreboardhashmap.get(a.getUniqueId()).sb.getTeam("006Builder").addEntry(a.getName());
            }
        }else if(PermissionsEx.getUser(p).inGroup("Youtuber")) {
            for(Player a : Bukkit.getOnlinePlayers()) {
                scoreboardhashmap.get(a.getUniqueId()).sb.getTeam("007YT").addEntry(a.getName());
            }
        }else if(PermissionsEx.getUser(p).inGroup("Hero")) {
            for(Player a : Bukkit.getOnlinePlayers()) {
                scoreboardhashmap.get(a.getUniqueId()).sb.getTeam("008Hero").addEntry(a.getName());
            }
        }else if(PermissionsEx.getUser(p).inGroup("Master")) {
            for(Player a : Bukkit.getOnlinePlayers()) {
                scoreboardhashmap.get(a.getUniqueId()).sb.getTeam("009Master").addEntry(a.getName());
            }
        }else if(PermissionsEx.getUser(p).inGroup("Business")) {
            for(Player a : Bukkit.getOnlinePlayers()) {
                scoreboardhashmap.get(a.getUniqueId()).sb.getTeam("010Business").addEntry(a.getName());
            }
        }else if(PermissionsEx.getUser(p).inGroup("Spieler")) {
            for(Player a : Bukkit.getOnlinePlayers()) {
                scoreboardhashmap.get(a.getUniqueId()).sb.getTeam("011Spieler").addEntry(a.getName());
            }
        }
    }

    public static void update(){
        for(Player p : Bukkit.getOnlinePlayers()){
            sendTabAndScoreboard(p);
        }
    }
}