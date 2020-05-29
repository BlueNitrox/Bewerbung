package me.bluenitrox.commands;

import me.bluenitrox.main.Main;
import net.md_5.bungee.BungeeCord;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.Listener;

public class YT_Command extends Command {


    public YT_Command(String name) {
        super(name);
    }

    @Override
    public void execute(CommandSender cs, String[] args) {
        ProxiedPlayer p = (ProxiedPlayer)cs;
        p.sendMessage(Main.pre + "§6Anforderungen für den YouTuber-Rang:");
        p.sendMessage(Main.pre + "§c  -200 Abonennten");
        p.sendMessage(Main.pre + "§c  -Servervorstellung ");
        p.sendMessage(Main.pre + "§c  -ausreichend Videos auf dem Server");
        p.sendMessage(Main.pre + "§c  -ausreichend Klicks auf jedem Video ");
        p.sendMessage(Main.pre + "§c  -Noch nie einen Ban/Mute gehabt");
        p.sendMessage(Main.pre + "§c  -Minecraft content");
        p.sendMessage(Main.pre + "§c  -Bei einem Regelverstoß wird der Rang weggenommen");
        p.sendMessage(Main.pre + "§bAuch wenn du alle Anforderungen erfüllst, entscheiden wir in jedem Fall extra, ob du den YouTuber-Rang bekommst oder nicht!");
    }
}
