package me.bluenitrox.commands;

import me.bluenitrox.main.Main;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class Master_Command extends Command {

    public Master_Command(String name) {
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
            p.sendMessage(Main.pre + "§dMaster §7: §e10€");
            p.sendMessage(Main.pre + "§cDeine Rechte: §ePinker Prefix, Doppelsprung in der Lobby, Master kit, /mine [mine]");
            p.sendMessage(Main.pre + "§e/craft, /chatclear, /dailyreward, /ec.");
        }else {
            p.sendMessage(Main.pre +"§cBenutze: §6/master§c!");
        }
    }
}
