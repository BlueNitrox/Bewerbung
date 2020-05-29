package me.bluenitrox.commands;

import me.bluenitrox.main.Main;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class Ping_Command extends Command {


    public Ping_Command(String name) {
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
            p.sendMessage(Main.pre +"§3Dein Ping beträgt: §6§l" + p.getPing() +"ms.");
        }else {
            p.sendMessage(Main.pre + "§cBenutze: §6/ping§c!");
        }
    }
}
