package de.Tommunity.utils;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Teammitglieder implements CommandExecutor{
    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
        Player p = (Player) cs;

        if(args.length == 0) {
            p.sendMessage("§6Das Team von Tommunity.de:");
            p.sendMessage("  §4§lOwner | zByTom");
            p.sendMessage("  §4§lAdmin | 1BlueNitrox");
            p.sendMessage("  §b§lDev | 1BlauNitrox");
            p.sendMessage("  §2Mod | xByNilzz");
            p.sendMessage("  §aSup | YoloNico_TV");
            p.sendMessage("  §eBuilder | zJonaah");

        }
        return false;
        }
}