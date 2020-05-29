package de.Tommunity.Quest;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.Tommunity.Commands.EXpSystem;
import de.Tommunity.Commands.EconomySystem;
import de.Tommunity.Commands.TokenSystem;
import de.Tommunity.Main.Main;
import de.Tommunity.Stats.Kisten;

public class Warzone implements CommandExecutor {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		Player p = (Player) cs;
		Kisten k = new Kisten();
		EconomySystem es = new EconomySystem();
		EXpSystem ex = new EXpSystem();
		TokenSystem t = new TokenSystem();
		if (!(cs instanceof Player)) {
			cs.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein!");
			return true;
		}
		if (isWarzone(p.getUniqueId(), 0)) {
			setWarzone(p.getUniqueId(), 1);
			p.sendMessage("§2Tim §7| §aStop! Du willst einfach so in die Warzone?! Lass das lieber hohl dir zuerst dein Kit mit /kit ab.");
			p.sendMessage("§aAnschließend geh hinein und such Marco! Der sagt dir deine Mission!");
			p.sendMessage(Main.pre + "§7Quest §8[Warzone] §7wurde gestartet!");
			p.playSound(p.getLocation(), Sound.NOTE_PIANO, 10L, 10L);
		} else if (isWarzone(p.getUniqueId(), 1)) {
			setWarzone(p.getUniqueId(), 2);
			p.sendMessage("§2Marco §7| §aHey, ich sehe du hast dich schon ausgerüstet! Hier in der Warzone findest du Kisten in Form von Endportalrahmen");
			p.sendMessage("§aSuche drei Stück davon und öffne sie. Wenn du diese drei hast geh wieder zurück zu Tim der gibt dir deine Belohnung!");
		} else if (isWarzone(p.getUniqueId(), 2)) {
			if(k.hasEnoughopenchest(p.getUniqueId(), 3)) {
				setWarzone(p.getUniqueId(), 3);
				p.sendMessage("§2Tim §7| §aGut gemacht! Hier deine belohnung. Und schon bald bekommst du eine weitere Aufgabe von mir!");
				p.sendMessage(Main.pre + "§7Quest abgeschlossen! §8[Warzone]");
				p.playSound(p.getLocation(), Sound.NOTE_PIANO, 10L, 10L);
				p.sendMessage(Main.pre + "§dDu bekommst :");
				p.sendMessage(Main.pre + "§e 3000$");
				p.sendMessage(Main.pre + "§e 2000EXP");
				p.sendMessage(Main.pre + "§e 2 Tokens");
				es.addMoney(p.getUniqueId(),3000);
				ex.addEXP(p.getUniqueId(), 2000);
				t.addToken(p.getUniqueId(), 2);

			}else {
				p.sendMessage("§2Tim §7| §aDu hast erst "+ k.getopenchest(p.getUniqueId()) + " geöffnete Kisten");
			}
		} else {
			p.sendMessage(Main.pre + "§3Du hast diese Quest bereits gemacht!");
		}
		return false;
	}

	public boolean isWarzone(UUID uuid, int amount) {
		File file = new File("plugins/TommUnity", "Warzone.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		int Warzone = cfg.getInt(uuid + ".Warzone");
		if (Warzone == amount) {
			return true;
		} else
			return false;

	}

	public void setWarzone(UUID uuid, int amount) {
		File file = new File("plugins//TommUnity", "Warzone.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		cfg.set(uuid + ".Warzone", amount);
		int Warzone = cfg.getInt(uuid + ".Warzone");
		Warzone = Warzone + amount;
		try {
			cfg.save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
