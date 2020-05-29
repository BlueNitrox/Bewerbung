package de.Tommunity.Listener;

import de.Tommunity.Commands.Vanish;
import de.Tommunity.Main.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import ru.tehkode.permissions.bukkit.PermissionsEx;
import sun.jvm.hotspot.ui.ObjectHistogramPanel;

import java.security.Permission;

public class SilentJoin implements Listener {

    @EventHandler
    public void onJoin(final PlayerJoinEvent e){
        Player p = (Player)e.getPlayer();
        if(PermissionsEx.getUser(p).inGroup("Admin") || PermissionsEx.getUser(p).inGroup("Owner")){
            Vanish.vanished.add(p);
            p.sendMessage(Main.pre + "§3Du hast den Vanishmodus betreten!");
            for(Player all : Bukkit.getOnlinePlayers()) {
                if(!all.hasPermission("Tom.vanish.see")) {
                    all.hidePlayer(p);
                }
            }
        }
    }

}
