package de.Tommunity.Mobzone;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Tommunity.Main.Main;
import ru.tehkode.permissions.bukkit.PermissionsEx;



public class Mobzone1 implements CommandExecutor {


	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		Player p = (Player) cs;
		Zombies z = new Zombies();
		if(!PermissionsEx.getUser(p).inGroup("Tom.Zone2")) {
			if(!p.hasPermission("Mobzone.start")) {
			p.sendMessage("§aJäger §7| §2Schön, dass du auch der Meinung bist, dass Zombies was für Anfänger sind. Du möchtest nun auch Spinnen töten? Bei mir bist du genau richtig!");
			p.sendMessage("§2 Um zu beweisen, dass du wirklich der richtige bist, musst du aber noch 800 Zombies töten!");
			p.sendMessage(Main.pre + "§7Quest §8[Zone 2] §7wurde gestartet!");
			PermissionsEx.getUser(p).addPermission("Mobzone.start");
		}else if(z.hasEnoughzombie(p.getUniqueId(), 800)){
			PermissionsEx.getUser(p).removePermission("Mobzone.start");
			PermissionsEx.getUser(p).addGroup("Tom.Zone2");
			p.sendMessage(Main.pre + "§7Quest abgeschlossen! §8[Zone 2]");
			p.playSound(p.getLocation(), Sound.NOTE_PIANO, 10L, 10L);
			p.sendMessage(Main.pre + "§dDu bekommst :");
			p.sendMessage(Main.pre + "§e Zutritt in Mobzone 2");
			p.sendMessage("§aJäger §7| §2Perfekt! Nun kannst du mit mir und den anderen Spielern in Zone 2 Zombies und Spinnen töten und besseren Loot bekommen!");
		}else {
			p.sendMessage("§aJäger §7| §2Du musst noch " + (800- z.getzombie(p.getUniqueId())) + "§2 Töten");
		}
		}else p.sendMessage(Main.err);
		return false;
	}
}
