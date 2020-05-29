package de.Tommunity.Stats;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Tommunity.Commands.EXpSystem;
import de.Tommunity.Main.Main;

public class Stats implements CommandExecutor {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		Player p = (Player)cs;
		if(!(cs instanceof Player)) {
			return true;
		}
		if(args.length == 1) {
        Player t =Bukkit.getPlayer(args[0]);
        if(t == null){
        	p.sendMessage(Main.pre + "§cDieser Spieler ist aktuell nicht Online!");
        	return true;
		}
        if(t.isOnline()) {
        	Kisten k = new Kisten();
        	Blöcke b = new Blöcke();
        	Deaths d = new Deaths();
        	KilledPlayer kp = new KilledPlayer();
        	EXpSystem ex = new EXpSystem();
        	p.sendMessage(Main.pre + "§dStats von §6" + t.getName());
        	p.sendMessage(Main.pre + "§eKills :§4 " + kp.getKill(t.getUniqueId()));
        	p.sendMessage(Main.pre + "§eDeaths :§4 " + d.getDeath(t.getUniqueId()));
        	p.sendMessage(Main.pre + "§eKD : §4" + kp.getKill(t.getUniqueId()) + "/" + d.getDeath(t.getUniqueId()));
        	p.sendMessage(Main.pre + "§eAbgebaute Blöcke : §4" + b.getbreak(t.getUniqueId()));
        	p.sendMessage(Main.pre + "§eGeöffnete Kisten : §4" + k.getopenchest(t.getUniqueId()));
        	p.sendMessage(Main.pre + "§eAktuelle EXP : §4" + ex.getEXP(t.getUniqueId()));
        }
        	
        }else if (args.length == 0) {
        	Kisten k = new Kisten();
        	Blöcke b = new Blöcke();
        	Deaths d = new Deaths();
        	KilledPlayer kp = new KilledPlayer();
        	EXpSystem ex = new EXpSystem();
        	p.sendMessage(Main.pre + "§dStats von §6" + p.getName());
        	p.sendMessage(Main.pre + "§eKills :§4 " + kp.getKill(p.getUniqueId()));
        	p.sendMessage(Main.pre + "§eDeaths :§4 " + d.getDeath(p.getUniqueId()));
        	p.sendMessage(Main.pre + "§eKD : §4" + kp.getKill(p.getUniqueId()) + "/" + d.getDeath(p.getUniqueId()));
        	p.sendMessage(Main.pre + "§eAbgebaute Blöcke : §4" + b.getbreak(p.getUniqueId()));
        	p.sendMessage(Main.pre + "§eGeöffnete Kisten : §4" + k.getopenchest(p.getUniqueId()));
        	p.sendMessage(Main.pre + "§eAktuelle EXP : §4" + ex.getEXP(p.getUniqueId()));
        }
		return false;
	}

}
