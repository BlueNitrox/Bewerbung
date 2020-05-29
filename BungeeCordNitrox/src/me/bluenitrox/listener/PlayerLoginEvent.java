package me.bluenitrox.listener;

import me.bluenitrox.main.Main;
import net.md_5.bungee.api.event.LoginEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class PlayerLoginEvent implements Listener {
    public PlayerLoginEvent() {
    }

    @EventHandler
    public void on(LoginEvent e) {
        String playername = e.getConnection().getName();
        if (Main.MAINTENANCE) {
            if (!Main.whitelist.contains(playername)) {
                e.setCancelled(true);
                e.setCancelReason(Main.MAINTENANCEMESSAGE);
            } else {
                e.setCancelled(false);
            }

        }
    }
}
