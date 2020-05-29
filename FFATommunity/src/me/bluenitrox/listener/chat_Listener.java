package me.bluenitrox.listener;

import java.util.Iterator;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class chat_Listener implements Listener {
    public chat_Listener() {
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();
        String message = e.getMessage();
        if (e.getMessage().startsWith("%")) {
            e.setCancelled(true);
        }

        if (PermissionsEx.getUser(p).inGroup("Owner")) {
            e.setFormat("§4§lOwner | " + p.getName() + " §7» " + message);
        } else if (PermissionsEx.getUser(p).inGroup("Admin")) {
            e.setFormat("§4§lAdmin | " + p.getName() + " §7» " + message);
        } else if (PermissionsEx.getUser(p).inGroup("Developer")) {
            e.setFormat("§b§lDev | " + p.getName() + " §7» " + message);
        } else if (PermissionsEx.getUser(p).inGroup("Moderator")) {
            e.setFormat("§2Mod | " + p.getName() + " §7» " + message);
        } else if (PermissionsEx.getUser(p).inGroup("Supporter")) {
            e.setFormat("§aSup | " + p.getName() + " §7» " + message);
        } else if (PermissionsEx.getUser(p).inGroup("Builder")) {
            e.setFormat("§eBuilder | " + p.getName() + " §7» " + message);
        } else if (PermissionsEx.getUser(p).inGroup("Youtuber")) {
            e.setFormat("§5YT | " + p.getName() + " §7» " + message);
        } else if (PermissionsEx.getUser(p).inGroup("Hero")) {
            e.setFormat("§9Hero | " + p.getName() + " §7» " + message);
        } else if (PermissionsEx.getUser(p).inGroup("Master")) {
            e.setFormat("§dMaster | " + p.getName() + " §7» " + message);
        } else if (PermissionsEx.getUser(p).inGroup("Business")) {
            e.setFormat("§6Business | " + p.getName() + " §7» " + message);
        } else {
            e.setFormat("§7" + p.getName() + " §7» " + message);
        }

        if (e.getMessage().equalsIgnoreCase("7stats")) {
            p.sendMessage("§6Da fehlt wohl das §b/");
            e.setCancelled(true);
        }

        if (e.getMessage().equalsIgnoreCase("7troll")) {
            p.sendMessage("§6Da fehlt wohl das §b/");
            e.setCancelled(true);
        }

        if (e.getMessage().startsWith("@team") && p.hasPermission("Tom.Teamsend")) {
            String msg = e.getMessage();
            Iterator var6 = Bukkit.getOnlinePlayers().iterator();

            while(var6.hasNext()) {
                Player team = (Player)var6.next();
                if (team.hasPermission("Tom.Teamsee")) {
                    e.setCancelled(true);
                    if (PermissionsEx.getUser(p).inGroup("Owner")) {
                        team.sendMessage("§7[§aTeam§7] §4§l" + p.getName() + " §7: " + msg.replaceAll("@team", "§7"));
                    } else if (PermissionsEx.getUser(p).inGroup("Admin")) {
                        team.sendMessage("§7[§aTeam§7] §4§l" + p.getName() + " §7: " + msg.replaceAll("@team", "§7"));
                    } else if (PermissionsEx.getUser(p).inGroup("Developer")) {
                        team.sendMessage("§7[§aTeam§7] §b§l" + p.getName() + " §7: " + msg.replaceAll("@team", "§7"));
                    } else if (PermissionsEx.getUser(p).inGroup("Moderator")) {
                        team.sendMessage("§7[§aTeam§7] §2" + p.getName() + " §7: " + msg.replaceAll("@team", "§7"));
                    } else if (PermissionsEx.getUser(p).inGroup("Supporter")) {
                        team.sendMessage("§7[§aTeam§7] §a" + p.getName() + " §7: " + msg.replaceAll("@team", "§7"));
                    } else if (PermissionsEx.getUser(p).inGroup("Builder")) {
                        team.sendMessage("§7[§aTeam§7] §e" + p.getName() + " §7: " + msg.replaceAll("@team", "§7"));
                    }
                }
            }
        }

    }
}
