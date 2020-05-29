package de.Tommunity.Booster;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.FireworkMeta;

import de.Tommunity.Main.Main;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class BoosterAPI implements CommandExecutor {



	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		Player p = (Player) cs;
		if(args.length == 0) {
			p.sendMessage(Main.pre + "§aHier sind deine Booster:");
			p.sendMessage(Main.pre + "§d§lFly-Booster: §6" + getFlyBooster(p.getUniqueId()));
			p.sendMessage(Main.pre + "§d§lXp-Booster: §6" + getXpBooster(p.getUniqueId()));
			p.sendMessage(Main.pre + "§d§lMoney-Booster: §6" + getMoneyBooster(p.getUniqueId()));
		}else if(args.length == 1) {

			if(args[0].equalsIgnoreCase("help")) {
				p.sendMessage(Main.pre + "§6[]-----------Booster-----------[]");
				p.sendMessage("§6/booster ->§f Hiermit kannst du sehen welche booster du besitzt");
				p.sendMessage("§6/booster <Boostername> -> §fHiermit aktivierst du einen booster");
				p.sendMessage("§6/booster info -> §fHier mit siehst du welche booster aktiv sind");
				if(p.hasPermission("Tom.GiveBooster")) {
					p.sendMessage("§6/booster <add/remove> <Spieler> <Boostername> <anzahl> -> §fHier mit kannst du Spielern booster geb  en und wieder wegnehmen");
				}
				p.sendMessage(Main.pre + "§6[]-----------Booster-----------[]");
			}else if(args[0].equalsIgnoreCase("fly")) {
				Flybooster fb = new Flybooster();
				if(hasEnoughFlyBooster(p.getUniqueId(), 1)) {
					if(!Main.getPlugin().getBoostermanager().getAktivboost().stream().anyMatch((b -> b.getName().equals(fb.getName())))) {

						if(PermissionsEx.getUser(p.getName()).inGroup("Owner")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§4§lOwner | " + p.getName() + "§a hat einen:");
							});
						}else if(PermissionsEx.getUser(p.getName()).inGroup("Admin")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§c§lAdmin | " + p.getName() + "§a hat einen:");
							});
						}else if(PermissionsEx.getUser(p.getName()).inGroup("Developer")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§b§lDev | " + p.getName() + "§a hat einen:");
							});
						}else if(PermissionsEx.getUser(p.getName()).inGroup("Moderator")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§2Mod | " + p.getName() + "§a hat einen:");
							});
						}else if(PermissionsEx.getUser(p.getName()).inGroup("Supporter")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§aSup | " + p.getName() + "§a hat einen:");
							});
						}else if(PermissionsEx.getUser(p.getName()).inGroup("Builder")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§eBuilder | " + p.getName() + "§a hat einen:");
							});
						}else if(PermissionsEx.getUser(p.getName()).inGroup("Youtuber")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§5YT | " + p.getName() + "§a hat einen:");
							});
						}else if(PermissionsEx.getUser(p.getName()).inGroup("Hero")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§9Hero | " + p.getName() + "§a hat einen:");
							});
						}else if(PermissionsEx.getUser(p.getName()).inGroup("Master")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§dMaster | " + p.getName() + "§a hat einen:");
							});
						}else if(PermissionsEx.getUser(p.getName()).inGroup("Business")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§6Business | " + p.getName() + "§a hat einen:");
							});
						}else if(PermissionsEx.getUser(p.getName()).inGroup("Spieler")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§7Spieler | " + p.getName() + "§a hat einen:");
							});
						}

						Main.getPlugin().getBoostermanager().startBoost(new Flybooster());

						Firework firework = p.getWorld().spawn(p.getLocation(), Firework.class);
						FireworkEffect effect = FireworkEffect.builder()
								.withColor(Color.RED)
								.flicker(true)
								.trail(true)
								.withFade(Color.AQUA)
								.with(FireworkEffect.Type.BALL_LARGE)
								.build();

						FireworkMeta meta = firework.getFireworkMeta();
						meta.addEffect(effect);
						meta.setPower(1);

						firework.setFireworkMeta(meta);

						removeFlyBooster(p.getUniqueId(), 1);
					}else {
						p.sendMessage(Main.pre + "§cDu kannst keinen §d§l" + fb.getName() + " §cda bereits einer aktiv ist");
					}

				}else {
					p.sendMessage(Main.pre + "§cDu besitzt keinen Fly-Booster. Wenn du welche haben willst sprich einen Admin oder Owner an.");
				}
			}else if(args[0].equalsIgnoreCase("xp")) {
				Xpbooster xp = new Xpbooster();
				if(hasEnoughXpBooster(p.getUniqueId(), 1)) {
					if(!Main.getPlugin().getBoostermanager().getAktivboost().stream().anyMatch((b -> b.getName().equals(xp.getName())))) {

						if(PermissionsEx.getUser(p.getName()).inGroup("Owner")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§4§lOwner | " + p.getName() + "§a hat einen:");
							});
						}else if(PermissionsEx.getUser(p.getName()).inGroup("Admin")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§c§lAdmin | " + p.getName() + "§a hat einen:");
							});
						}else if(PermissionsEx.getUser(p.getName()).inGroup("Developer")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§b§lDev | " + p.getName() + "§a hat einen:");
							});
						}else if(PermissionsEx.getUser(p.getName()).inGroup("Moderator")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§2Mod | " + p.getName() + "§a hat einen:");
							});
						}else if(PermissionsEx.getUser(p.getName()).inGroup("Supporter")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§aSup | " + p.getName() + "§a hat einen:");
							});
						}else if(PermissionsEx.getUser(p.getName()).inGroup("Builder")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§eBuilder | " + p.getName() + "§a hat einen:");
							});
						}else if(PermissionsEx.getUser(p.getName()).inGroup("Youtuber")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§5YT | " + p.getName() + "§a hat einen:");
							});
						}else if(PermissionsEx.getUser(p.getName()).inGroup("Hero")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§9Hero | " + p.getName() + "§a hat einen:");
							});
						}else if(PermissionsEx.getUser(p.getName()).inGroup("Master")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§dMaster | " + p.getName() + "§a hat einen:");
							});
						}else if(PermissionsEx.getUser(p.getName()).inGroup("Business")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§6Business | " + p.getName() + "§a hat einen:");
							});
						}else if(PermissionsEx.getUser(p.getName()).inGroup("Spieler")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§7Spieler | " + p.getName() + "§a hat einen:");
							});
						}

						Main.getPlugin().getBoostermanager().startBoost(new Xpbooster());

						Firework firework = p.getWorld().spawn(p.getLocation(), Firework.class);
						FireworkEffect effect = FireworkEffect.builder()
								.withColor(Color.RED)
								.flicker(true)
								.trail(true)
								.withFade(Color.AQUA)
								.with(FireworkEffect.Type.BALL_LARGE)
								.build();

						FireworkMeta meta = firework.getFireworkMeta();
						meta.addEffect(effect);
						meta.setPower(1);

						firework.setFireworkMeta(meta);

						removeXpBooster(p.getUniqueId(), 1);
					}else {
						p.sendMessage(Main.pre + "§cDu kannst keinen §d§l" + xp.getName() + " §cda bereits einer aktiv ist");
					}

				}else {
					p.sendMessage(Main.pre + "§cDu besitzt keinen Xp-Booster. Wenn du welche haben willst sprich einen Admin oder Owner an.");
				}
			}else if(args[0].equalsIgnoreCase("money")) {
				Moneybooster money = new Moneybooster();
				if(hasEnoughMoneyBooster(p.getUniqueId(), 1)) {
					if(!Main.getPlugin().getBoostermanager().getAktivboost().stream().anyMatch((b -> b.getName().equals(money.getName())))) {

						if(PermissionsEx.getUser(p.getName()).inGroup("Owner")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§4§lOwner | " + p.getName() + "§a hat einen:");
							});
						}else if(PermissionsEx.getUser(p.getName()).inGroup("Admin")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§c§lAdmin | " + p.getName() + "§a hat einen:");
							});
						}else if(PermissionsEx.getUser(p.getName()).inGroup("Developer")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§b§lDev | " + p.getName() + "§a hat einen:");
							});
						}else if(PermissionsEx.getUser(p.getName()).inGroup("Moderator")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§2Mod | " + p.getName() + "§a hat einen:");
							});
						}else if(PermissionsEx.getUser(p.getName()).inGroup("Supporter")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§aSup | " + p.getName() + "§a hat einen:");
							});
						}else if(PermissionsEx.getUser(p.getName()).inGroup("Builder")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§eBuilder | " + p.getName() + "§a hat einen:");
							});
						}else if(PermissionsEx.getUser(p.getName()).inGroup("Youtuber")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§5YT | " + p.getName() + "§a hat einen:");
							});
						}else if(PermissionsEx.getUser(p.getName()).inGroup("Hero")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§9Hero | " + p.getName() + "§a hat einen:");
							});
						}else if(PermissionsEx.getUser(p.getName()).inGroup("Master")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§dMaster | " + p.getName() + "§a hat einen:");
							});
						}else if(PermissionsEx.getUser(p.getName()).inGroup("Business")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§6Business | " + p.getName() + "§a hat einen:");
							});
						}else if(PermissionsEx.getUser(p.getName()).inGroup("Spieler")) {
							Bukkit.getOnlinePlayers().forEach(players -> {
								players.sendMessage(Main.pre + "§7Spieler | " + p.getName() + "§a hat einen:");
							});
						}





						Main.getPlugin().getBoostermanager().startBoost(new Moneybooster());

						Firework firework = p.getWorld().spawn(p.getLocation(), Firework.class);
						FireworkEffect effect = FireworkEffect.builder()
								.withColor(Color.RED)
								.flicker(true)
								.trail(true)
								.withFade(Color.AQUA)
								.with(FireworkEffect.Type.BALL_LARGE)
								.build();

						FireworkMeta meta = firework.getFireworkMeta();
						meta.addEffect(effect);
						meta.setPower(1);

						firework.setFireworkMeta(meta);

						removeMoneyBooster(p.getUniqueId(), 1);
					}else {
						p.sendMessage(Main.pre + "§cDu kannst keinen §d§l" + money.getName() + " §cda bereits einer aktiv ist");
					}
				}else {
					p.sendMessage(Main.pre + "§cDu besitzt keinen Money-Booster. Wenn du welche haben willst sprich einen Admin oder Owner an.");
				}
			}else if(args[0].equalsIgnoreCase("info")) {
				p.sendMessage(Main.pre + "§6Hier siehst du die derzeit Aktiven Booster:");
				Flybooster fb = new Flybooster();
				if(Main.getPlugin().getBoostermanager().getAktivboost().stream().anyMatch((b -> b.getName().equals(fb.getName())))) {
					p.sendMessage(Main.pre + "§d§lFly-Booster: §aan");
				}else {
					p.sendMessage(Main.pre + "§d§lFly-Booster: §4aus");
				}
				Xpbooster xp = new Xpbooster();
				if(Main.getPlugin().getBoostermanager().getAktivboost().stream().anyMatch((b -> b.getName().equals(xp.getName())))) {
					p.sendMessage(Main.pre + "§d§lXp-Booster: §aan");
				}else {
					p.sendMessage(Main.pre + "§d§lXp-Booster §4aus");
				}
				Moneybooster money = new Moneybooster();
				if(Main.getPlugin().getBoostermanager().getAktivboost().stream().anyMatch((b -> b.getName().equals(money.getName())))) {
					p.sendMessage(Main.pre + "§d§lMoney-Booster: §aan");
				}else {
					p.sendMessage(Main.pre + "§d§lMoney-Booster: §4aus");
				}
			}else {
				p.sendMessage(Main.pre + "§cFalsche Eingabe des Commands. Bitte benutze §6/booster help §c");
			}
		}else  if (args.length == 4) {
			if (p.hasPermission("Tom.GiveBooster") || p.hasPermission("Tom.*")) {
				if (args[0].equalsIgnoreCase("add")) {
					Player target = Bukkit.getPlayer(args[1]);
					if(target != null) {
						String name = args[2];
						Integer amount = Integer.valueOf(args[3]);
						if (name.equalsIgnoreCase("fly")) {
							addFlyBooster(target.getUniqueId(), amount);
							p.sendMessage(Main.pre + "§e" + target.getPlayer().getName() + " §3hat §a" + amount + "x §d§lFly-Booster §3bekommen");
						} else if (name.equalsIgnoreCase("xp")) {
							addXpBooster(target.getUniqueId(), amount);
							p.sendMessage(Main.pre + "§e" + target.getPlayer().getName() + " §3hat §a" + amount + "x §d§lXp-Booster §3bekommen");
						} else if (name.equalsIgnoreCase("money")) {
							addMoneyBooster(target.getUniqueId(), amount);
							p.sendMessage(Main.pre + "§e" + target.getPlayer().getName() + " §3hat §a" + amount + "x §d§lMoney-Booster §3bekommen");
						} else {
							p.sendMessage(Main.pre + "§4" + name + " §cist eine ungültige Angabe");
						}
					}else {
						p.sendMessage(Main.pre + "§cDieser Spieler ist nicht online");
					}
				} else if (args[0].equalsIgnoreCase("remove")) {
					Player target = Bukkit.getPlayer(args[1]);
					if(target != null) {
						String name = args[2];
						Integer amount = Integer.valueOf(args[3]);
						if (name.equalsIgnoreCase("fly")) {
							removeFlyBooster(target.getUniqueId(), amount);
							p.sendMessage(Main.pre + "§cDu hast §e" + target.getPlayer().getName() + "§a " + amount + "x §d§lFly-Booster §cremovt");
						} else if (name.equalsIgnoreCase("xp")) {
							removeXpBooster(target.getUniqueId(), amount);
							p.sendMessage(Main.pre + "§cDu hast §e" + target.getPlayer().getName() + "§a " + amount + "x §d§lXp-Booster §cremovt");
						} else if (name.equalsIgnoreCase("money")) {
							removeMoneyBooster(target.getUniqueId(), amount);
							p.sendMessage(Main.pre + "§cDu hast §e" + target.getPlayer().getName() + "§a " + amount + "x §d§lMoney-Booster §cremovt");
						}

					}else {
						p.sendMessage(Main.pre + "§cDieser Spieler ist nicht online");
					}
				}

			} else {
				p.sendMessage(Main.err);
			}
		} else {
			p.sendMessage(Main.pre + "§cBitte benutze §6/booster add/remove <Spieler> <Boostername> <Anzahl>");
			return true;
		}
		return false;

	}

	public Integer getFlyBooster(UUID uuid) {
		File file = new File("plugins//TommUnity", "booster.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		int fly = cfg.getInt(uuid + ".flybooster");
		return fly;

	}

	public Integer getXpBooster(UUID uuid) {
		File file = new File("plugins//TommUnity", "booster.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		int xp = cfg.getInt(uuid + ".xpbooster");
		return xp;

	}

	public Integer getMoneyBooster(UUID uuid) {
		File file = new File("plugins//TommUnity", "booster.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		int money = cfg.getInt(uuid + ".moneybooster");
		return money;

	}

	public void addFlyBooster(UUID uuid, int amount) {
		File file = new File("plugins//TommUnity", "booster.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		int fly = cfg.getInt(uuid + ".flybooster");
		fly = fly + amount;
		cfg.set(uuid + ".flybooster", fly);
		try {
			cfg.save(file);
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	public void addXpBooster(UUID uuid, int amount) {
		File file = new File("plugins//TommUnity", "booster.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		int xp = cfg.getInt(uuid + ".xpbooster");
		xp = xp + amount;
		cfg.set(uuid + ".xpbooster", xp);
		try {
			cfg.save(file);
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	public void addMoneyBooster(UUID uuid, int amount) {
		File file = new File("plugins//TommUnity", "booster.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		int money = cfg.getInt(uuid + ".moneybooster");
		money = money + amount;
		cfg.set(uuid + ".moneybooster", money);
		try {
			cfg.save(file);
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	public void removeFlyBooster(UUID uuid, int amount) {
		File file = new File("plugins//TommUnity", "booster.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		int fly = cfg.getInt(uuid + ".flybooster");
		fly = fly - amount;
		cfg.set(uuid + ".flybooster", fly);
		try {
			cfg.save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void removeXpBooster(UUID uuid, int amount) {
		File file = new File("plugins//TommUnity", "booster.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		int xp = cfg.getInt(uuid + ".xpbooster");
		xp = xp - amount;
		cfg.set(uuid + ".xpbooster", xp);
		try {
			cfg.save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void removeMoneyBooster(UUID uuid, int amount) {
		File file = new File("plugins//TommUnity", "booster.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		int money = cfg.getInt(uuid + ".moneybooster");
		money = money - amount;
		cfg.set(uuid + ".moneybooster", money);
		try {
			cfg.save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public boolean hasEnoughFlyBooster(UUID uuid, int amount) {
		File file = new File("plugins//TommUnity", "booster.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		int fly = cfg.getInt(uuid + ".flybooster");
		if (fly >= amount) {
			return true;
		} else
			return false;

	}

	public boolean hasEnoughXpBooster(UUID uuid, int amount) {
		File file = new File("plugins//TommUnity", "booster.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		int xp = cfg.getInt(uuid + ".xpbooster");
		if (xp >= amount) {
			return true;
		} else
			return false;

	}

	public boolean hasEnoughMoneyBooster(UUID uuid, int amount) {
		File file = new File("plugins//TommUnity", "booster.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		int money = cfg.getInt(uuid + ".moneybooster");
		if (money >= amount) {
			return true;
		} else
			return false;

	}
}