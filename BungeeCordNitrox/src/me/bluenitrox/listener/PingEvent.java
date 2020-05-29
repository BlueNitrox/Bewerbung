package me.bluenitrox.listener;

import me.bluenitrox.main.Main;
import net.md_5.bungee.api.ServerPing;
import net.md_5.bungee.api.ServerPing.PlayerInfo;
import net.md_5.bungee.api.ServerPing.Players;
import net.md_5.bungee.api.ServerPing.Protocol;
import net.md_5.bungee.api.event.ProxyPingEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class PingEvent implements Listener {
    public PingEvent() {
    }

    @EventHandler
    public void onProxyPing(ProxyPingEvent e) {
        ServerPing ping = e.getResponse();
        Players players = ping.getPlayers();
        PlayerInfo[] pi;
        if (Main.MAINTENANCE) {
            pi = new PlayerInfo[]{Main.MAINTENANCEINFO};
            players.setSample(pi);
            ping.setVersion(new Protocol(Main.VERSIONTEXT, ping.getVersion().getProtocol() - 1));
            ping.setDescription(Main.MAINTENANCEMODT);
            e.setResponse(ping);
        } else {
            pi = new PlayerInfo[]{Main.DEFAULTINFO};
            players.setSample(pi);
            ping.setDescription(Main.DEFAULTMODT);
        }

    }
}
