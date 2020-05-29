package de.Tommunity.Clan;

import java.util.List;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Tommunity.Main.Main;
public class Clan implements CommandExecutor {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	@SuppressWarnings({ "deprecation" })
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if (args.length == 0) {
			help(p);
		} else if (args.length == 1) {
			if (args[0].equalsIgnoreCase("info")) {
				if (!(de.Tommunity.Clan.Player.getClan(p) == null)) {
					p.sendMessage("§e§m---------<" + Config.prefix() + "§e>§m---------");
					p.sendMessage("§8[§cClans§8] §6Informationen");
					p.sendMessage("§eName§7: §6" + de.Tommunity.Clan.Player.getClan(p));
					p.sendMessage("§eKürzel§7: §6"
							+ de.Tommunity.Clan.ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)));
					p.sendMessage("§eClanleaders§7:");
					for (String uuid : de.Tommunity.Clan.ClanM
							.getAdmins(de.Tommunity.Clan.Player.getClan(p))) {
						p.sendMessage("§7- §8" + Bukkit.getOfflinePlayer(UUID.fromString(uuid)).getName());
					}
					p.sendMessage("§eClanmitglieder:");
					for (String uuid : de.Tommunity.Clan.ClanM
							.getMember(de.Tommunity.Clan.Player.getClan(p))) {
						p.sendMessage("§7- §8" + Bukkit.getOfflinePlayer(UUID.fromString(uuid)).getName());
					}
					p.sendMessage("§e§m---------<" + Config.prefix() + "§e>§m---------");
				} else {
					p.sendMessage(Config.prefix() + " " + Config.DubistinkeinemClan());
				}
			} else if (args[0].equalsIgnoreCase("leave")) {
					if (de.Tommunity.Clan.Player.getClan(p) == null) {
						p.sendMessage(Config.prefix() + " " + Config.DubistinkeinemClan());
						return false;
					} else {
						String clan = de.Tommunity.Clan.Player.getClan(p);
						if (de.Tommunity.Clan.Player.isadmin(p, clan)) {
							de.Tommunity.Clan.ClanM.deleteClan(clan);
						}
						de.Tommunity.Clan.Player.leaveClan(p, clan);
						p.sendMessage(Config.prefix() + " " + Config.Clanverlassen());
					}
			} else if (args[0].equalsIgnoreCase("invites")) {
				List<String> invites = de.Tommunity.Clan.Player.getInvites(p);
				p.sendMessage(Config.prefix() + " " + Config.Clanseinladen());
				for (String clan : invites) {
					p.sendMessage("§e-§c§l " + clan);
				}
			} else {
				help(p);
			}
		} else if (args.length == 2) {
			if (args[0].equalsIgnoreCase("delete")) {
				String clan = args[1];
				if (de.Tommunity.Clan.Player.isadmin(p, clan) || p.hasPermission("Clan.delete.admin") || p.hasPermission("Tom.*")) {
					de.Tommunity.Clan.ClanM.deleteClan(clan);
				} else {
					p.sendMessage(Config.prefix() + " " + Config.noperm());
				}
			} else if (args[0].equalsIgnoreCase("invite")) {
				String player = args[1];
				if (!(de.Tommunity.Clan.Player.getClan(p) == null)) {
					if ((de.Tommunity.Clan.Player.getClan(Bukkit.getOfflinePlayer(player)) == null)) {
						if (de.Tommunity.Clan.Player.isadmin(p, de.Tommunity.Clan.Player.getClan(p))) {
								de.Tommunity.Clan.Player.invitePlayer(Bukkit.getOfflinePlayer(player),
										de.Tommunity.Clan.Player.getClan(p));
								p.sendMessage(Config.prefix() + " " + Config.Spielereingeladen());
								if (Bukkit.getOfflinePlayer(player).isOnline()) {
									Bukkit.getPlayer(player).sendMessage(Config.prefix() + " " + Config.Einladungerhalten(de.Tommunity.Clan.Player.getClan(p)));
									Bukkit.getPlayer(player).sendMessage(Config.prefix() + " " + Config.joinoderdeny());
								}
						
						} else {
							p.sendMessage(Config.prefix() + " " + Config.noperm());
						}
					} else {
						p.sendMessage(Config.prefix() + " " + Config.SpielerbereitsinClan());
					}
				} else {
					p.sendMessage(Config.prefix() + " " + Config.DubistinkeinemClan());
				}
			} else if (args[0].equalsIgnoreCase("kick")) {
				String player = args[1];
				if (!(de.Tommunity.Clan.Player.getClan(p) == null)) {
					if (de.Tommunity.Clan.Player.isadmin(p, de.Tommunity.Clan.Player.getClan(p))) {
						if (de.Tommunity.Clan.Player.getClan(p).equalsIgnoreCase(
								de.Tommunity.Clan.Player.getClan(Bukkit.getOfflinePlayer(player)))) {
							de.Tommunity.Clan.Player.leaveClan(Bukkit.getOfflinePlayer(player),
									de.Tommunity.Clan.Player.getClan(p));
							p.sendMessage(Config.prefix() + " " + Config.Spielergekickt());
							if (Bukkit.getOfflinePlayer(player).isOnline()) {
								Bukkit.getPlayer(player).sendMessage(Config.prefix() + " " + Config.Dugekickt());
							}
						} else {
							p.sendMessage(Config.prefix() + " " + Config.noperm());
						}
					} else {
						p.sendMessage(Config.prefix() + " " + Config.noperm());
					}
				} else {
					p.sendMessage(Config.prefix() + " " + Config.DubistinkeinemClan());
				}
			} else if (args[0].equalsIgnoreCase("promote")) {
				OfflinePlayer player = Bukkit.getOfflinePlayer(args[1]);
				if (!(de.Tommunity.Clan.Player.getClan(p) == null)) {
					if (de.Tommunity.Clan.Player.isadmin(p, de.Tommunity.Clan.Player.getClan(p))) {
						if (de.Tommunity.Clan.Player.getClan(p)
								.equalsIgnoreCase(de.Tommunity.Clan.Player.getClan(player))) {
							de.Tommunity.Clan.ClanM.promotePlayer(player,
									de.Tommunity.Clan.Player.getClan(p));
							p.sendMessage(Config.prefix() + " " + Config.Spielerpromotet());
						} else {
							p.sendMessage(Config.prefix() + " " + Config.noperm());
						}
					} else {
						p.sendMessage(Config.prefix() + " " + Config.noperm());
					}
				} else {
					p.sendMessage(Config.prefix() + " " + Config.DubistinkeinemClan());
				}
			} else if (args[0].equalsIgnoreCase("join")) {
				if (de.Tommunity.Clan.Invitemet.PlayerJoin(p, args[1])) {
					p.sendMessage(Config.prefix() + " " + Config.gejoint());
				} else {
					p.sendMessage(Config.prefix() + " "
							+ "§cDu wurdest nicht eingeladen, der Clan existiert nicht mehr oder der Clan ist voll!");
				}
			} else if (args[0].equalsIgnoreCase("deny")) {
				de.Tommunity.Clan.Invitemet.PlayerDeny(p, args[1]);
				p.sendMessage(Config.prefix() + " " + Config.einladungnichtangenommen());
			} else if (args[0].equalsIgnoreCase("stats")) {
				String clan = args[1];
				int kills = de.Tommunity.Clan.Stats.getkills(clan);
				int deaths = de.Tommunity.Clan.Stats.getdeaths(clan);
				p.sendMessage("§e§m---------<" + Config.prefix() + "§e>§m---------");
				p.sendMessage("§8[§cClans§8] §6Stats");
				p.sendMessage("§eKills§7: §6" + kills);
				p.sendMessage("§eDeaths§7: §6" + deaths);
				p.sendMessage("§e§m---------<" + Config.prefix() + "§e>§m---------");
			} else {
				help(p);
			}
		}
		if (args.length == 3) {
			if (args[0].equalsIgnoreCase("create")) {
				String clan = args[1];
				String prefix = args[2];
				if ((prefix.length() == 3) || (prefix.length() == 4) || (prefix.length() == 5)) {
					if (p.hasPermission("Clan.create") || p.hasPermission("Tom.*")) {
						if (de.Tommunity.Clan.Player.getClan(p) == null) {
							if (de.Tommunity.Clan.Clandata.Clan.getString("Clan." + clan) == null) {
								de.Tommunity.Clan.ClanM.createClan(p, clan, prefix);
								p.sendMessage(Config.prefix() + " " + Config.Clanerstellt());
							} else {
								p.sendMessage(Config.prefix() + " " + Config.Clangibtsschon());
							}
						} else {
							p.sendMessage(Config.prefix() + " " + Config.Dubistbereitsineinemclan());
						}
					} else {
						p.sendMessage(Config.prefix() + " " + Config.noperm());
					}
				}else {
					p.sendMessage(Config.prefix() + " " + "§7Der §cTag §7darf nur zwischen 3 und 5 Buchstaben haben§8.");
					return false;
				}
				
			} else {
				help(p);
			}
		}
		return false;
	}

	private void help(Player p) {
		p.sendMessage("§8§m---------------" + Config.prefix() + "§8§m---------------");
		p.sendMessage(Main.pre + "§c/Clan create [Name] [Tag/Prefix]");
		p.sendMessage(Main.pre + "§c/Clan delete [Name]");
		p.sendMessage(Main.pre + "§c/Clan leave");
		p.sendMessage(Main.pre + "§c/Clan info");
		p.sendMessage(Main.pre + "§c/Clan invite [Player]");
		p.sendMessage(Main.pre + "§c/Clan invites");
		p.sendMessage(Main.pre + "§c/Clan Join [Clan]");
		p.sendMessage(Main.pre + "§c/Clan Deny [Clan]");
		p.sendMessage(Main.pre + "§c/Clan promote [Player]");
		p.sendMessage(Main.pre + "§c/Clan kick [Player]");
		p.sendMessage(Main.pre + "§c/ClanMessage [Text]");
		p.sendMessage(Main.pre + "§c/CM [Text]");
		p.sendMessage("§8§m---------------" + Config.prefix() + "§8§m---------------");
	}
}
