package de.Tommunity.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Tommunity.Main.Main;

public class Teamreport implements CommandExecutor {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		Player p = (Player) cs;
		if (!(cs instanceof Player)) {
			cs.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein!");
			return true;
		}
		if (p.hasPermission("Tom.report")) {
			if (args.length == 1) {
				if (args[0].equalsIgnoreCase("hacking")) {
					if (ReportSys.hacking.isEmpty() == false) {
						p.sendMessage(Main.pre + "§eOffener Hacking report : §c" + ReportSys.hacking.get(0).getPlayer().getName());
						ReportSys.hacking.remove(0);
					}else {
						p.sendMessage(Main.pre + "§3Gerade ist kein Report offen zu diesem Thema!");
					}
				}else if(args[0].equalsIgnoreCase("beleidigung")) {
					if (ReportSys.beleidigung.isEmpty() == false) {
						p.sendMessage(Main.pre + "§eOffener Beleidigungs report : §c" + ReportSys.beleidigung.get(0).getPlayer().getName());
						ReportSys.beleidigung.remove(0);
					}else {
						p.sendMessage(Main.pre + "§3Gerade ist kein Report offen zu diesem Thema!");
					}
				}else if(args[0].equalsIgnoreCase("Spam")) {
					if (ReportSys.spam.isEmpty() == false) {
						p.sendMessage(Main.pre + "§eOffener Spam report : §c" + ReportSys.spam.get(0).getPlayer().getName());
						ReportSys.spam.remove(0);
					}else {
						p.sendMessage(Main.pre + "§3Gerade ist kein Report offen zu diesem Thema!");
					}
				}else if(args[0].equalsIgnoreCase("bugusing")) {
					if (ReportSys.bugusing.isEmpty() == false) {
						p.sendMessage(Main.pre + "§eOffener Bugusing report : §c" + ReportSys.bugusing.get(0).getPlayer().getName());
						ReportSys.bugusing.remove(0);
					}else {
						p.sendMessage(Main.pre + "§3Gerade ist kein Report offen zu diesem Thema!");
					}
				}else if(args[0].equalsIgnoreCase("sonstiges")) {
					if (ReportSys.Sonstiges.isEmpty() == false) {
						p.sendMessage(Main.pre + "§eOffener Bugusing report : §c" + ReportSys.Sonstiges.get(0).getPlayer().getName());
						ReportSys.Sonstiges.remove(0);
					}else {
						p.sendMessage(Main.pre + "§3Gerade ist kein Report offen zu diesem Thema!");
					}
				}

			} else {
				p.sendMessage(Main.pre + "§cBenutzung : §6/reportopen <Reportgruppe>§c!");
			}
		} else {
			p.sendMessage(Main.err);
		}
		return false;
	}

}
