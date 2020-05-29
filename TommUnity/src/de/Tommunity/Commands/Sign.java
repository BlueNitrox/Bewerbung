package de.Tommunity.Commands;

import java.util.Arrays;
import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.Tommunity.Main.Main;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class Sign implements CommandExecutor, Listener {

	private HashMap<String, Long> cooldowns = new HashMap<String, Long>();

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein!");
		}
		Player p = (Player) sender;

		if (p.hasPermission("Tom.Team")) {
			if (p.getItemInHand().getType() == Material.AIR) {
				p.sendMessage(Main.pre + "§cDu musst ein Item in der Hand halten um es signieren zu können!");
				return false;
			}

			if (p.getItemInHand().getItemMeta().getLore() == null) {

				String message = "";
				for (int i = 0; i < args.length; i++) {
					message = message + args[i] + " ";
				}

				ItemStack item = p.getItemInHand();
				ItemMeta im = item.getItemMeta();
				if (PermissionsEx.getUser(p.getName()).inGroup("Owner")) {
					im.setLore(Arrays.asList("", "§7" + message,
							"§5§oDieses Item wurde von §4§l" + p.getPlayer().getName() + " §5signiert"));
					item.setItemMeta(im);
				} else if (PermissionsEx.getUser(p.getName()).inGroup("Admin")) {
					im.setLore(Arrays.asList("", "§7" + message,
							"§5§oDieses Item wurde von §c§l" + p.getPlayer().getName() + " §5signiert"));
					item.setItemMeta(im);
				} else if (PermissionsEx.getUser(p.getName()).inGroup("Developer")) {
					im.setLore(Arrays.asList("", "§7" + message,
							"§5§oDieses Item wurde von §b§l" + p.getPlayer().getName() + " §5signiert"));
					item.setItemMeta(im);
				} else if (PermissionsEx.getUser(p.getName()).inGroup("Moderator")) {
					im.setLore(Arrays.asList("", "§7" + message,
							"§5§oDieses Item wurde von §2" + p.getPlayer().getName() + " §5signiert"));
					item.setItemMeta(im);
				}

				p.sendMessage(Main.pre + "§3Du hast dieses Item erfolgreich signiert");

			} else {
				p.sendMessage(Main.pre + "§cDieses Item wurde schon signiert");
			}
		} else if (p.hasPermission("Tom.Normal")) {
			if (args.length >= 1) {

				Long time = System.currentTimeMillis();
				if (this.cooldowns.containsKey(p.getName())) {
					Long lastUsage = this.cooldowns.get(p.getName());
					if (lastUsage + 1800 * 10 > time) {
						p.sendMessage(Main.pre + "§cDu musst noch warten bis du wieder ein Item signieren kannst!");
						return false;

					}
				}
				if (p.getItemInHand().getType() == Material.AIR) {
					p.sendMessage(Main.pre + "§cDu musst ein Item in der Hand halten um es signieren zu können!");
					return false;
				}

				if (p.getItemInHand().getItemMeta().getLore() == null) {

					String message = "";
					for (int i = 0; i < args.length; i++) {
						message = message + args[i] + " ";
					}

					ItemStack item = p.getItemInHand();
					ItemMeta im = item.getItemMeta();
					if (PermissionsEx.getUser(p.getName()).inGroup("YouTuber")) {
						im.setLore(Arrays.asList("", "§7" + message,
								"§5§oDieses Item wurde von §5" + p.getPlayer().getName() + " §5signiert"));
						item.setItemMeta(im);
					} else if (PermissionsEx.getUser(p.getName()).inGroup("Supporter")) {
						im.setLore(Arrays.asList("", "§7" + message,
								"§5§oDieses Item wurde von §a" + p.getPlayer().getName() + " §5signiert"));
						item.setItemMeta(im);
					} else if (PermissionsEx.getUser(p.getName()).inGroup("Builder")) {
						im.setLore(Arrays.asList("", "§7" + message,
								"§5§oDieses Item wurde von §e" + p.getPlayer().getName() + " §5signiert"));
						item.setItemMeta(im);
					} else if (PermissionsEx.getUser(p.getName()).inGroup("Hero")) {
						im.setLore(Arrays.asList("", "§7" + message,
								"§5§oDieses Item wurde von §9" + p.getPlayer().getName() + " §5signiert"));
						item.setItemMeta(im);
					} else if (PermissionsEx.getUser(p.getName()).inGroup("Master")) {
						im.setLore(Arrays.asList("", "§7" + message,
								"§5§oDieses Item wurde von §d" + p.getPlayer().getName() + " §5signiert"));
						item.setItemMeta(im);
					}

					p.sendMessage(Main.pre + "§3Du hast dieses Item erfolgreich signiert");
					cooldowns.put(p.getName(), time);

				} else {
					p.sendMessage(Main.pre + "§cDieses Item wurde schon signiert");
				}

			} else {
				p.sendMessage(Main.pre + "§cBitte benutze §6/sign <Text>");
			}

		} else
			p.sendMessage(Main.pre + " §cDazu hast du keine Rechte");
		return false;
	}
}