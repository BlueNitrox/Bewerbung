package me.bluenitrox.commands;

import me.bluenitrox.main.Main;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class Hero_Command extends Command {

    public Hero_Command(String name) {
        super(name);
    }

    @Override
    public void execute(CommandSender cs, String[] args) {
        ProxiedPlayer p = (ProxiedPlayer)cs;
        if(!(cs instanceof ProxiedPlayer)){
            cs.sendMessage(Main.keinP);
            return;
        }
        if(args.length == 0){
            p.sendMessage(Main.pre + "§9Hero §7: §e20€");
            p.sendMessage(Main.pre + "§cDeine Rechte: §eBlauer Prefix, Doppelsprung in der Lobby, Hero + Master kit, /mine [mine]");
            p.sendMessage(Main.pre + "§e/craft, /chatclear, /kopf, /sign, /dailyreward, Pay all Rechte (/paya * [betrag]), /ec.");
        }else {
            p.sendMessage(Main.pre +"§cBenutze: §6/hero§c!");
        }
    }
}
