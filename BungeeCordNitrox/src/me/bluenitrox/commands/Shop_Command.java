package me.bluenitrox.commands;

import me.bluenitrox.main.Main;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class Shop_Command extends Command {

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

    public Shop_Command(String name) {
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
            p.sendMessage(Main.pre + "§cRechte: §eSichtbar bei /hero");
            p.sendMessage(Main.pre + "§dMaster §7: §e10€");
            p.sendMessage(Main.pre + "§cRechte: §eSichtbar bei /Master");
            p.sendMessage(Main.pre + "§7Money Booster §7: §e1€");
            p.sendMessage(Main.pre + "§eGibt 0.25% mehr Geld!");
            p.sendMessage(Main.pre + "§7XP Booster §7: §e1€");
            p.sendMessage(Main.pre + "§eGibt 2x so viel Tommunity und Vanilla XP");
            p.sendMessage(Main.pre + "§7Fly Booster §7: §e1€");
            p.sendMessage(Main.pre + "§eDu kannst in der Plotworld fliegen!");
            p.sendMessage(Main.pre + "§7Wir nehmen gerne Spenden entgegen als gegengeschenk gibt es die oben stehenden Sachen!");
        }else {
            p.sendMessage(Main.pre + "§cBenutze: §6/shop§c!");
        }
    }
}
