package de.Tommunity.Villager;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Tommunity.Commands.EconomySystem;
import de.Tommunity.Main.Main;

public class Schmied implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		Player p = (Player) cs;
		EconomySystem es = new EconomySystem();
		if (args.length == 0) {
			if (p.hasPermission("Tom.Koch")) {
				if (!(p.getItemInHand().getType() == Material.AIR)) {
					if (p.getItemInHand().getDurability() != 0) {
						if (es.hasEnoughMoney(p.getUniqueId(), 2000)) {
							p.getItemInHand().setDurability((short) 0);
							es.removeMoney(p.getUniqueId(), 2000);
							p.sendMessage(
									Main.pre + "§3Dein Item wurde gepariert jedoch hat es dich §62.000$ §3gekostet!");
							p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
						} else
							p.sendMessage(Main.pre + "§cDu hast leider nicht genug Geld um das Item zu reparieren!");

					} else
						p.sendMessage(Main.pre + "§cDas Item in deiner Hand ist Repariert!");
				} else
					p.sendMessage(Main.pre + "§cDu hast kein Item in deiner Hand!");
			}
		} else
			p.sendMessage(Main.pre + "§3Dazu hast du keine Berechtigung");

		return false;
	}

}
