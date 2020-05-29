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
import org.bukkit.event.Listener;

import de.Tommunity.Booster.Moneybooster;
import de.Tommunity.Commands.EconomySystem;
import de.Tommunity.Main.Main;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class Timo implements CommandExecutor, Listener {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		Player p = (Player) cs;
		Moneybooster money = new Moneybooster();
		EconomySystem es = new EconomySystem();
		if (!(cs instanceof Player)) {
			return true;
		}

		if (isTimo(p.getUniqueId(), 3)) {
				p.sendMessage("§1Timo §7| §aFabio lässt mich grüßen? Wie nett von ihm. Jetzt geh fleißig Exp sammeln. Du bekommst eine Kleine Überraschung von mir! Aber farm noch 5k EXP");
				PermissionsEx.getUser(p).removePermission("Fabio");
				PermissionsEx.getUser(p).removePermission("Timo");
				PermissionsEx.getUser(p).addPermission("Timo.fertig");
				p.sendMessage(Main.pre + "§7Quest abgeschlossen! §8[Levelup]");
				p.playSound(p.getLocation(), Sound.NOTE_PIANO, 10L, 10L);
				p.sendMessage(Main.pre + "§dDu bekommst :");
				p.sendMessage(Main.pre + "§e 2000$");
				p.sendMessage(Main.pre + "§e 2 Tokens");
				setTimo(p.getUniqueId(), 4);

				if (!Main.getPlugin().getBoostermanager().getAktivboost().stream().anyMatch((b -> b.getName().equals(money.getName())))) {
					es.addMoney(p.getUniqueId(), 2000);
				} else {
					es.addMoney(p.getUniqueId(), 2500);
				}

			} else if (isTimo(p.getUniqueId(), 2)) {
				p.sendMessage("§1Fabio §7| §ahm, lass mich Raten... Timo schickt dich und ich soll dir das Levelsystem erklären, richtig? Da bist du nicht der erste heute. Na gut...");
				p.sendMessage("§aHier gibt es viele Level, welche du durch das Sammeln von Exp erreichen kannst. Dieses so genannte Exp kannst durch das Abbauen von Blöcken,");
				p.sendMessage("§adas Töten von Monstern und durch viele andere Wege bekommen. Um zu sehen, wie viel Exp du aktuell hast gib einfach /exp ein. Um zu sehen, wie viel du für das nächste Level brauchst, gib /level ein.");
				p.sendMessage("§aWenn du irgendwann genug Exp gesammelt hast, um das neue Level zu erreichen, wirst du wenn du das nächste mal auf den Server kommst automatisch ins nächste Level gesetzt.");
				p.sendMessage("§aNatürlich bekommst du dann eine tolle Belohnung. Und jetzt geh zurück zu Timo und grüß ihn  von mir.");
				p.playSound(p.getLocation(), Sound.NOTE_PIANO, 10L, 10L);
				setTimo(p.getUniqueId(), 3);
			} else if(isTimo(p.getUniqueId(), 0)){
				p.sendMessage("§1Timo §7| §aDu hast also auch schon von dem Levelsystem hier gehört, aber bist ein wenig verwirrt, nach den ganzen Veränderungen des Levelsystem's? ");
				p.sendMessage("§aKeine Panik, ich kann dich verstehen. Mein Kollege Fabio kennt sich bestens aus mit dem Levelsystem!");
				p.sendMessage("§aDu musst nur herausfinden, wo er sich mal wieder herumtreibt.");
				p.sendMessage(Main.pre + "§7Quest §8[Levelup] §7wurde gestartet!");
				p.playSound(p.getLocation(), Sound.NOTE_PIANO, 10L, 10L);
				setTimo(p.getUniqueId(), 2);
			}else {
			p.sendMessage("§1Timo §7 | §aDu hast die Quest bereits gemacht!");
		}
			return false;
		}


	public boolean isTimo(UUID uuid, int amount) {
		File file = new File("plugins/TommUnity", "Timo.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		int Timo = cfg.getInt(uuid + ".Timo");
		if (Timo == amount) {
			return true;
		} else
			return false;

	}

	public void setTimo(UUID uuid, int amount) {
		File file = new File("plugins//TommUnity", "Timo.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		cfg.set(uuid + ".Timo", amount);
		int Timo = cfg.getInt(uuid + ".Timo");
		Timo = Timo + amount;
		try {
			cfg.save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
