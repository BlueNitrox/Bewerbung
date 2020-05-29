package de.Tommunity.Mobzone;

import de.Tommunity.Main.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Zone2mehr implements CommandExecutor {

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String s, String[] agrs) {
        Player p = (Player)cs;
        if(p.hasPermission("Tom.*")) {
            if (agrs.length == 1) {
                if(agrs[0].equalsIgnoreCase("1")){
                    mobzone_tp.setZone("Zone1", p.getLocation());
                    p.sendMessage(Main.pre + "§3Du hast Mobzone 1 Gesetzt");
                }else if(agrs[0].equalsIgnoreCase("2")){
                    mobzone_tp.setZone("Zone2", p.getLocation());
                    p.sendMessage(Main.pre + "§3Du hast Mobzone 2 Gesetzt");
                }else {
                    p.sendMessage(Main.pre + "§cSchreib bitte 1BlueNitrox an denn mehr Zonen sollte es noch nicht geben!");
                }
            } else {
                p.sendMessage(Main.pre + "§cBenutze /setzone <Zone>");
            }
        }else {
            p.sendMessage(Main.err);
        }
        return false;
    }
}
