package de.Tommunity.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import de.Tommunity.Listener.WorldListener;
import de.Tommunity.Main.Main;
import de.Tommunity.utils.Arena;
import de.Tommunity.utils.ItemBuilder;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class Minen implements CommandExecutor, Listener {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */


	public static String GUI_NAME = "§1Minen-Menü";

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		Player p = (Player) cs;
		if (!(cs instanceof Player)) {
			return true;
		}
		if(WorldListener.fight.contains(p)){
			p.sendMessage(Main.pre + "§cDas kannst du im Kampf leider nicht machen!");
			return true;
		}

		if (args.length == 0) {
			Inventory inv = Bukkit.createInventory(null, 9 * 3, GUI_NAME);
			ItemStack mine1 = new ItemBuilder(Material.STONE).setDisplayname("§bMine 1").addEnchant(Enchantment.DAMAGE_ALL, 1, false).setLore("§aGEKAUFT!").build();
			ItemStack mine2 = new ItemBuilder(Material.WOOD).setDisplayname("§bMine 2").setLore("Preis : 14.000 $").build();
			ItemStack mine3 = new ItemBuilder(Material.ENDER_STONE).setDisplayname("§bMine 3").setLore("Preis : 46.000 $").build();
			ItemStack mine4 = new ItemBuilder(Material.NETHER_BRICK).setDisplayname("§bMine 4").setLore("Preis : 110.000 $").build();
			ItemStack mine5 = new ItemBuilder(Material.QUARTZ_ORE).setDisplayname("§bMine 5").setLore("Preis : 210.000 $").build();
			ItemStack mine6 = new ItemBuilder(Material.COAL_ORE).setDisplayname("§bMine 6").setLore("Preis : 420.000 $").build();
			ItemStack mine7 = new ItemBuilder(Material.IRON_ORE).setDisplayname("§bMine 7").setLore("Preis : 980.000 $").build();
			ItemStack mine8 = new ItemBuilder(Material.GOLD_ORE).setDisplayname("§bMine 8").setLore("Preis : 2,4Mio $").build();
			ItemStack mine9 = new ItemBuilder(Material.DIAMOND_ORE).setDisplayname("§bMine 9").setLore("Preis : 4,8Mio $").build();
			ItemStack mine10 = new ItemBuilder(Material.EMERALD_ORE).setDisplayname("§bMine 10").setLore("Preis : 7,3Mio $").build();

			ItemStack mine2_ = new ItemBuilder(Material.WOOD).setDisplayname("§bMine 2").addEnchant(Enchantment.DAMAGE_ALL, 1, false).setLore("§aGEKAUFT!").build();
			ItemStack mine3_ = new ItemBuilder(Material.ENDER_STONE).setDisplayname("§bMine 3").addEnchant(Enchantment.DAMAGE_ALL, 1, false).setLore("§aGEKAUFT!").build();
			ItemStack mine4_ = new ItemBuilder(Material.NETHER_BRICK).setDisplayname("§bMine 4").addEnchant(Enchantment.DAMAGE_ALL, 1, false).setLore("§aGEKAUFT!").build();
			ItemStack mine5_ = new ItemBuilder(Material.QUARTZ_ORE).setDisplayname("§bMine 5").addEnchant(Enchantment.DAMAGE_ALL, 1, false).setLore("§aGEKAUFT!").build();
			ItemStack mine6_ = new ItemBuilder(Material.COAL_ORE).setDisplayname("§bMine 6").addEnchant(Enchantment.DAMAGE_ALL, 1, false).setLore("§aGEKAUFT!").build();
			ItemStack mine7_ = new ItemBuilder(Material.IRON_ORE).setDisplayname("§bMine 7").addEnchant(Enchantment.DAMAGE_ALL, 1, false).setLore("§aGEKAUFT!").build();
			ItemStack mine8_ = new ItemBuilder(Material.GOLD_ORE).setDisplayname("§bMine 8").addEnchant(Enchantment.DAMAGE_ALL, 1, false).setLore("§aGEKAUFT!").build();
			ItemStack mine9_ = new ItemBuilder(Material.DIAMOND_ORE).setDisplayname("§bMine 9").addEnchant(Enchantment.DAMAGE_ALL, 1, false).setLore("§aGEKAUFT!").build();
			ItemStack mine10_ = new ItemBuilder(Material.EMERALD_ORE).setDisplayname("§bMine 10").addEnchant(Enchantment.DAMAGE_ALL, 1, false).setLore("§aGEKAUFT!").build();

			inv.setItem(0, mine1);
			if (PermissionsEx.getUser(p).inGroup("Tom.Rank2")) {
				inv.setItem(1, mine2_);
			} else {
				inv.setItem(1, mine2);
			}
			if(PermissionsEx.getUser(p).inGroup("Tom.Rank3")) {
				inv.setItem(2, mine3_);
			}else {
				inv.setItem(2, mine3);
			}
			if(PermissionsEx.getUser(p).inGroup("Tom.Rank4")) {
				inv.setItem(3, mine4_);
			}else {
				inv.setItem(3, mine4);
			}
			if(PermissionsEx.getUser(p).inGroup("Tom.Rank5")) {
				inv.setItem(4, mine5_);
			}else {
				inv.setItem(4, mine5);
			}
			if(PermissionsEx.getUser(p).inGroup("Tom.Rank6")) {
				inv.setItem(5, mine6_);
			}else {
				inv.setItem(5, mine6);
			}
			if(PermissionsEx.getUser(p).inGroup("Tom.Rank7")) {
				inv.setItem(6, mine7_);
			}else {
				inv.setItem(6, mine7);
			}
			if(PermissionsEx.getUser(p).inGroup("Tom.Rank8")) {
				inv.setItem(7, mine8_);
			}else {
				inv.setItem(7, mine8);
			}
			if(PermissionsEx.getUser(p).inGroup("Tom.Rank9")) {
				inv.setItem(8, mine9_);
			}else {
				inv.setItem(8, mine9);
			}
			if(PermissionsEx.getUser(p).inGroup("Tom.Rank10")) {
				inv.setItem(9, mine10_);
			}else {
				inv.setItem(9, mine10);
			}

			p.openInventory(inv);

		}else if(args.length == 1) {
			if (args[0].equalsIgnoreCase("1")) {
				if (p.hasPermission("Tom.rank1")) {
					p.sendMessage(Main.pre + "§3Du wurdest zu Mine 1 Teleportiert!");
					FileConfiguration config = Main.getPlugin().getConfig();
					World world = Bukkit.getWorld(config.getString("1.World"));
					double x = config.getDouble("1.X");
					double y = config.getDouble("1.Y");
					double z = config.getDouble("1.Z");
					float yaw = (float) config.getDouble("1.Yaw");
					float pitch = (float) config.getDouble("1.Pitch");
					Location location = new Location(world, x, y, z, yaw, pitch);
					p.teleport(location);

					if (Arena.warte.contains(p)) {
						Arena.warte.clear();
					}
					if (Arena.warteno.contains(p)) {
						Arena.warteno.clear();
					}
				} else
					p.sendMessage(Main.pre + "§cDazu brauchst du den §dMaster-Rang§3!");
			}
			if (args[0].equalsIgnoreCase("2")) {
				if (p.hasPermission("Tom.rank2")) {
					FileConfiguration config2 = Main.getPlugin().getConfig();
					World world2 = Bukkit.getWorld(config2.getString("2.World"));
					double x2 = config2.getDouble("2.X");
					double y2 = config2.getDouble("2.Y");
					double z2 = config2.getDouble("2.Z");
					float yaw2 = (float) config2.getDouble("2.Yaw");
					float pitch2 = (float) config2.getDouble("2.Pitch");
					Location location2 = new Location(world2, x2, y2, z2, yaw2, pitch2);
					p.teleport(location2);

					if (Arena.warte.contains(p)) {
						Arena.warte.clear();
					}
					if (Arena.warteno.contains(p)) {
						Arena.warteno.clear();
					}
					p.sendMessage(Main.pre + "§3Du wurdest zu Mine 2 Teleportiert!");
				} else
					p.sendMessage(Main.pre + "§cDazu brauchst du den §dMaster-Rang§3!");
			}

			if (args[0].equalsIgnoreCase("3")) {
				if (p.hasPermission("Tom.rank3")) {
					FileConfiguration config3 = Main.getPlugin().getConfig();
					World world3 = Bukkit.getWorld(config3.getString("3.World"));
					double x3 = config3.getDouble("3.X");
					double y3 = config3.getDouble("3.Y");
					double z3 = config3.getDouble("3.Z");
					float yaw3 = (float) config3.getDouble("3.Yaw");
					float pitch3 = (float) config3.getDouble("3.Pitch");
					Location location3 = new Location(world3, x3, y3, z3, yaw3, pitch3);
					p.teleport(location3);

					if (Arena.warte.contains(p)) {
						Arena.warte.clear();
					}
					if (Arena.warteno.contains(p)) {
						Arena.warteno.clear();
					}
					p.sendMessage(Main.pre + "§3Du wurdest zu Mine 3 Teleportiert!");
				} else
					p.sendMessage(Main.pre + "§cDazu brauchst du den §dMaster-Rang§3!");
			}

				if (args[0].equalsIgnoreCase("4")) {
					if (p.hasPermission("Tom.rank4")) {
						FileConfiguration config4 = Main.getPlugin().getConfig();
						World world4 = Bukkit.getWorld(config4.getString("4.World"));
						double x4 = config4.getDouble("4.X");
						double y4 = config4.getDouble("4.Y");
						double z4 = config4.getDouble("4.Z");
						float yaw4 = (float) config4.getDouble("4.Yaw");
						float pitch4 = (float) config4.getDouble("4.Pitch");
						Location location4 = new Location(world4, x4, y4, z4, yaw4, pitch4);
						p.teleport(location4);

						if (Arena.warte.contains(p)) {
							Arena.warte.clear();
						}
						if (Arena.warteno.contains(p)) {
							Arena.warteno.clear();
						}
						p.sendMessage(Main.pre + "§3Du wurdest zu Mine 4 Teleportiert!");
					} else
						p.sendMessage(Main.pre + "§c Dazu brauchst du den §dMaster-Rang§3!");

				}
				if (args[0].equalsIgnoreCase("5")) {
					if (p.hasPermission("Tom.rank5")) {
						FileConfiguration config5 = Main.getPlugin().getConfig();
						World world5 = Bukkit.getWorld(config5.getString("5.World"));
						double x5 = config5.getDouble("5.X");
						double y5 = config5.getDouble("5.Y");
						double z5 = config5.getDouble("5.Z");
						float yaw5 = (float) config5.getDouble("5.Yaw");
						float pitch5 = (float) config5.getDouble("5.Pitch");
						Location location5 = new Location(world5, x5, y5, z5, yaw5, pitch5);
						p.teleport(location5);

						if (Arena.warte.contains(p)) {
							Arena.warte.clear();
						}
						if (Arena.warteno.contains(p)) {
							Arena.warteno.clear();
						}
						p.sendMessage(Main.pre + "§3Du wurdest zu Mine 5 Teleportiert!");
					} else
						p.sendMessage(Main.pre + "§c Dazu brauchst du den §dMaster-Rang§3!");

				}
				if (args[0].equalsIgnoreCase("6")) {
					if (p.hasPermission("Tom.rank6")) {
						FileConfiguration config6 = Main.getPlugin().getConfig();
						World world6 = Bukkit.getWorld(config6.getString("6.World"));
						double x6 = config6.getDouble("6.X");
						double y6 = config6.getDouble("6.Y");
						double z6 = config6.getDouble("6.Z");
						float yaw6 = (float) config6.getDouble("6.Yaw");
						float pitch6 = (float) config6.getDouble("6.Pitch");
						Location location6 = new Location(world6, x6, y6, z6, yaw6, pitch6);
						p.teleport(location6);

						if (Arena.warte.contains(p)) {
							Arena.warte.clear();
						}
						if (Arena.warteno.contains(p)) {
							Arena.warteno.clear();
						}
						p.sendMessage(Main.pre + "§3Du wurdest zu Mine 6 Teleportiert!");
					} else
						p.sendMessage(Main.pre + "§c Dazu brauchst du den §dMaster-Rang§3!");

				}
				if (args[0].equalsIgnoreCase("7")) {
					if (p.hasPermission("Tom.rank7")) {
						FileConfiguration config7 = Main.getPlugin().getConfig();
						World world7 = Bukkit.getWorld(config7.getString("7.World"));
						double x7 = config7.getDouble("7.X");
						double y7 = config7.getDouble("7.Y");
						double z7 = config7.getDouble("7.Z");
						float yaw7 = (float) config7.getDouble("7.Yaw");
						float pitch7 = (float) config7.getDouble("7.Pitch");
						Location location7 = new Location(world7, x7, y7, z7, yaw7, pitch7);
						p.teleport(location7);

						if (Arena.warte.contains(p)) {
							Arena.warte.clear();
						}
						if (Arena.warteno.contains(p)) {
							Arena.warteno.clear();
						}
						p.sendMessage(Main.pre + "§3Du wurdest zu Mine 7 Teleportiert!");
					} else
						p.sendMessage(Main.pre + "§c Dazu brauchst du den §dMaster-Rang§3!");

				}
				if (args[0].equalsIgnoreCase("8")) {
					if (p.hasPermission("Tom.rank8")) {
						FileConfiguration config8 = Main.getPlugin().getConfig();
						World world8 = Bukkit.getWorld(config8.getString("8.World"));
						double x8 = config8.getDouble("8.X");
						double y8 = config8.getDouble("8.Y");
						double z8 = config8.getDouble("8.Z");
						float yaw8 = (float) config8.getDouble("8.Yaw");
						float pitch8 = (float) config8.getDouble("8.Pitch");
						Location location8 = new Location(world8, x8, y8, z8, yaw8, pitch8);
						p.teleport(location8);

						if (Arena.warte.contains(p)) {
							Arena.warte.clear();
						}
						if (Arena.warteno.contains(p)) {
							Arena.warteno.clear();
						}
						p.sendMessage(Main.pre + "§3Du wurdest zu Mine 8 Teleportiert!");
					} else
						p.sendMessage(Main.pre + "§c Dazu brauchst du den §dMaster-Rang§3!");

				}
				if (args[0].equalsIgnoreCase("9")) {
					if (p.hasPermission("Tom.rank9")) {
						FileConfiguration config9 = Main.getPlugin().getConfig();
						World world9 = Bukkit.getWorld(config9.getString("9.World"));
						double x9 = config9.getDouble("9.X");
						double y9 = config9.getDouble("9.Y");
						double z9 = config9.getDouble("9.Z");
						float yaw9 = (float) config9.getDouble("9.Yaw");
						float pitch9 = (float) config9.getDouble("9.Pitch");
						Location location9 = new Location(world9, x9, y9, z9, yaw9, pitch9);
						p.teleport(location9);

						if (Arena.warte.contains(p)) {
							Arena.warte.clear();
						}
						if (Arena.warteno.contains(p)) {
							Arena.warteno.clear();
						}
						p.sendMessage(Main.pre + "§3Du wurdest zu Mine 9 Teleportiert!");
					} else
						p.sendMessage(Main.pre + "§c Dazu brauchst du den §dMaster-Rang§3!");

				}
				if (args[0].equalsIgnoreCase("10")) {
					if (p.hasPermission("Tom.rank10")) {
						FileConfiguration config10 = Main.getPlugin().getConfig();
						World world10 = Bukkit.getWorld(config10.getString("10.World"));
						double x10 = config10.getDouble("10.X");
						double y10 = config10.getDouble("10.Y");
						double z10 = config10.getDouble("10.Z");
						float yaw10 = (float) config10.getDouble("10.Yaw");
						float pitch10 = (float) config10.getDouble("10.Pitch");
						Location location10 = new Location(world10, x10, y10, z10, yaw10, pitch10);
						p.teleport(location10);

						if (Arena.warte.contains(p)) {
							Arena.warte.clear();
						}
						if (Arena.warteno.contains(p)) {
							Arena.warteno.clear();
						}
						p.sendMessage(Main.pre + "§3Du wurdest zu Mine 10 Teleportiert!");
					} else
						p.sendMessage(Main.pre + "§c Dazu brauchst du den §dMaster-Rang§3!");

				}

				if (args[0].equalsIgnoreCase("event")) {
					if(Eventmine.EventMine == true) {
						FileConfiguration configevent = Main.getPlugin().getConfig();
						World worldevent = Bukkit.getWorld(configevent.getString("event.World"));
						double xevent = configevent.getDouble("event.X");
						double yevent = configevent.getDouble("event.Y");
						double zevent = configevent.getDouble("event.Z");
						float yawevent = (float) configevent.getDouble("event.Yaw");
						float pitchevent = (float) configevent.getDouble("event.Pitch");
						Location locationevent = new Location(worldevent, xevent, yevent, zevent, yawevent, pitchevent);
						p.teleport(locationevent);

						if (Arena.warte.contains(p)) {
							Arena.warte.clear();
						}
						if (Arena.warteno.contains(p)) {
							Arena.warteno.clear();
						}
						p.sendMessage(Main.pre + "§3Du wurdest zu Mine Event Teleportiert!");
					}else {
					p.sendMessage(Main.pre + "§cGerade ist leider kein Event!");
					}
				}

		}else {
			p.sendMessage(Main.pre + "§cBenutzung: §6/mine [Mine]§c!");
		}
		return true;
	}

	@EventHandler
	public void handleQuestMenuClick (InventoryClickEvent e) {
		EconomySystem es = new EconomySystem();
		Player p = (Player) e.getWhoClicked();
		if (e.getClickedInventory().getName().equalsIgnoreCase(GUI_NAME)) {
			e.setCancelled(true);
			if (e.getCurrentItem().getType() == Material.STONE) {
				if (p.hasPermission("Tom.rank1")) {
					p.sendMessage(Main.pre + "§3Du wurdest zu Mine 1 Teleportiert!");
					FileConfiguration config = Main.getPlugin().getConfig();
					World world = Bukkit.getWorld(config.getString("1.World"));
					double x = config.getDouble("1.X");
					double y = config.getDouble("1.Y");
					double z = config.getDouble("1.Z");
					float yaw = (float) config.getDouble("1.Yaw");
					float pitch = (float) config.getDouble("1.Pitch");
					Location location = new Location(world, x, y, z, yaw, pitch);
					p.teleport(location);

					if (Arena.warte.contains(p)) {
						Arena.warte.clear();
					}
					if (Arena.warteno.contains(p)) {
						Arena.warteno.clear();
					}
				}
			} else if (e.getCurrentItem().getType() == Material.WOOD) {
				if (PermissionsEx.getUser(p).inGroup("Tom.Rank2")) {
					if (p.hasPermission("Tom.rank2")) {
						p.sendMessage(Main.pre + "§3Du wurdest zu Mine 2 Teleportiert!");
						FileConfiguration config = Main.getPlugin().getConfig();
						World world = Bukkit.getWorld(config.getString("2.World"));
						double x = config.getDouble("2.X");
						double y = config.getDouble("2.Y");
						double z = config.getDouble("2.Z");
						float yaw = (float) config.getDouble("2.Yaw");
						float pitch = (float) config.getDouble("2.Pitch");
						Location location = new Location(world, x, y, z, yaw, pitch);
						p.teleport(location);

						if (Arena.warte.contains(p)) {
							Arena.warte.clear();
						}
						if (Arena.warteno.contains(p)) {
							Arena.warteno.clear();
						}

					} else if (PermissionsEx.getUser(p).inGroup("Tom.Rank2")) {
						p.sendMessage(Main.pre + "§cDu besitzt diese Mine bereits!");
						return;
					} else {
						p.sendMessage(Main.err);
					}
					p.sendMessage(Main.pre + "§cDu besitzt diese Mine bereits!");
				} else if (es.hasEnoughMoney(p.getUniqueId(), 14000)) {
					es.removeMoney(p.getUniqueId(), 14000);
					PermissionsEx.getUser(p).addPermission("minenreset.2");
					PermissionsEx.getUser(p).addGroup("Tom.Rank2");
					p.playSound(p.getLocation(), Sound.ENDERDRAGON_WINGS, 1L, 1L);
					p.sendMessage(Main.pre + "§3Du hast dir diese Mine gekauft");
				} else {
					p.sendMessage(Main.pre + "§cDu hast nicht genug geld um dir Mine 2 zu kaufen!");
				}
			} else if (e.getCurrentItem().getType() == Material.ENDER_STONE) {
				if (PermissionsEx.getUser(p).inGroup("Tom.Rank2")) {
					if (PermissionsEx.getUser(p).inGroup("Tom.Rank3")) {
						if (p.hasPermission("Tom.rank3")) {
							p.sendMessage(Main.pre + "§3Du wurdest zu Mine 3 Teleportiert!");
							FileConfiguration config = Main.getPlugin().getConfig();
							World world = Bukkit.getWorld(config.getString("3.World"));
							double x = config.getDouble("3.X");
							double y = config.getDouble("3.Y");
							double z = config.getDouble("3.Z");
							float yaw = (float) config.getDouble("3.Yaw");
							float pitch = (float) config.getDouble("3.Pitch");
							Location location = new Location(world, x, y, z, yaw, pitch);
							p.teleport(location);

							if (Arena.warte.contains(p)) {
								Arena.warte.clear();
							}
							if (Arena.warteno.contains(p)) {
								Arena.warteno.clear();
							}

						} else if (PermissionsEx.getUser(p).inGroup("Tom.Rank3")) {
							p.sendMessage(Main.pre + "§cDu besitzt diese Mine bereits!");
							return;
						} else {
							p.sendMessage(Main.err);
						}
						p.sendMessage(Main.pre + "§cDu besitzt diese Mine bereits!");
					} else if (es.hasEnoughMoney(p.getUniqueId(), 46000)) {
						es.removeMoney(p.getUniqueId(), 46000);
						PermissionsEx.getUser(p).addPermission("minenreset.3");
						PermissionsEx.getUser(p).addGroup("Tom.Rank3");
						p.playSound(p.getLocation(), Sound.ENDERDRAGON_WINGS, 1L, 1L);
						p.sendMessage(Main.pre + "§3Du hast dir diese Mine gekauft");
					} else {
						p.sendMessage(Main.pre + "§cDu hast nicht genug geld um dir Mine 3 zu kaufen!");
					}
				} else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
			} else if (e.getCurrentItem().getType() == Material.NETHER_BRICK) {
				if (PermissionsEx.getUser(p).inGroup("Tom.Rank2")) {
					if (PermissionsEx.getUser(p).inGroup("Tom.Rank3")) {
						if (PermissionsEx.getUser(p).inGroup("Tom.Rank4")) {
							if (p.hasPermission("Tom.rank4")) {
								p.sendMessage(Main.pre + "§3Du wurdest zu Mine 4 Teleportiert!");
								FileConfiguration config = Main.getPlugin().getConfig();
								World world = Bukkit.getWorld(config.getString("4.World"));
								double x = config.getDouble("4.X");
								double y = config.getDouble("4.Y");
								double z = config.getDouble("4.Z");
								float yaw = (float) config.getDouble("4.Yaw");
								float pitch = (float) config.getDouble("4.Pitch");
								Location location = new Location(world, x, y, z, yaw, pitch);
								p.teleport(location);

								if (Arena.warte.contains(p)) {
									Arena.warte.clear();
								}
								if (Arena.warteno.contains(p)) {
									Arena.warteno.clear();
								}

							} else if (PermissionsEx.getUser(p).inGroup("Tom.Rank4")) {
								p.sendMessage(Main.pre + "§cDu besitzt diese Mine bereits!");
								return;
							} else {
								p.sendMessage(Main.err);
							}
							p.sendMessage(Main.pre + "§cDu besitzt diese Mine bereits!");
						} else if (es.hasEnoughMoney(p.getUniqueId(), 110000)) {
							es.removeMoney(p.getUniqueId(), 110000);
							PermissionsEx.getUser(p).addPermission("minenreset.4");
							PermissionsEx.getUser(p).addGroup("Tom.Rank4");
							p.playSound(p.getLocation(), Sound.ENDERDRAGON_WINGS, 1L, 1L);
							p.sendMessage(Main.pre + "§3Du hast dir diese Mine gekauft");
						} else {
							p.sendMessage(Main.pre + "§cDu hast nicht genug geld um dir Mine 4 zu kaufen!");
						}
					} else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
				} else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
			} else if (e.getCurrentItem().getType() == Material.QUARTZ_ORE) {
				if (PermissionsEx.getUser(p).inGroup("Tom.Rank2")) {
					if (PermissionsEx.getUser(p).inGroup("Tom.Rank3")) {
						if (PermissionsEx.getUser(p).inGroup("Tom.Rank4")) {
							if (PermissionsEx.getUser(p).inGroup("Tom.Rank5")) {
								if (p.hasPermission("Tom.rank5")) {
									p.sendMessage(Main.pre + "§3Du wurdest zu Mine 5 Teleportiert!");
									FileConfiguration config = Main.getPlugin().getConfig();
									World world = Bukkit.getWorld(config.getString("5.World"));
									double x = config.getDouble("5.X");
									double y = config.getDouble("5.Y");
									double z = config.getDouble("5.Z");
									float yaw = (float) config.getDouble("5.Yaw");
									float pitch = (float) config.getDouble("5.Pitch");
									Location location = new Location(world, x, y, z, yaw, pitch);
									p.teleport(location);

									if (Arena.warte.contains(p)) {
										Arena.warte.clear();
									}
									if (Arena.warteno.contains(p)) {
										Arena.warteno.clear();
									}

								} else if (PermissionsEx.getUser(p).inGroup("Tom.Rank5")) {
									p.sendMessage(Main.pre + "§cDu besitzt diese Mine bereits!");
									return;
								} else {
									p.sendMessage(Main.err);
								}
								p.sendMessage(Main.pre + "§cDu besitzt diese Mine bereits!");
							} else if (es.hasEnoughMoney(p.getUniqueId(), 210000)) {
								es.removeMoney(p.getUniqueId(), 210000);
								PermissionsEx.getUser(p).addPermission("minenreset.5");
								PermissionsEx.getUser(p).addGroup("Tom.Rank5");
								p.playSound(p.getLocation(), Sound.ENDERDRAGON_WINGS, 1L, 1L);
								p.sendMessage(Main.pre + "§3Du hast dir diese Mine gekauft");
							} else {
								p.sendMessage(Main.pre + "§cDu hast nicht genug geld um dir Mine 5 zu kaufen!");
							}
						}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
					}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
				}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
			}else if (e.getCurrentItem().getType() == Material.COAL_ORE) {
				if (PermissionsEx.getUser(p).inGroup("Tom.Rank2")) {
					if (PermissionsEx.getUser(p).inGroup("Tom.Rank3")) {
						if (PermissionsEx.getUser(p).inGroup("Tom.Rank4")) {
							if (PermissionsEx.getUser(p).inGroup("Tom.Rank5")) {
								if (PermissionsEx.getUser(p).inGroup("Tom.Rank6")) {
									if (p.hasPermission("Tom.rank6")) {
										p.sendMessage(Main.pre + "§3Du wurdest zu Mine 6 Teleportiert!");
										FileConfiguration config = Main.getPlugin().getConfig();
										World world = Bukkit.getWorld(config.getString("6.World"));
										double x = config.getDouble("6.X");
										double y = config.getDouble("6.Y");
										double z = config.getDouble("6.Z");
										float yaw = (float) config.getDouble("6.Yaw");
										float pitch = (float) config.getDouble("6.Pitch");
										Location location = new Location(world, x, y, z, yaw, pitch);
										p.teleport(location);

										if (Arena.warte.contains(p)) {
											Arena.warte.clear();
										}
										if (Arena.warteno.contains(p)) {
											Arena.warteno.clear();
										}

									}else if(PermissionsEx.getUser(p).inGroup("Tom.Rank6")){
										p.sendMessage(Main.pre + "§cDu besitzt diese Mine bereits!");
										return;
									}else {
										p.sendMessage(Main.err);
									}
									p.sendMessage(Main.pre + "§cDu besitzt diese Mine bereits!");
								}else if(es.hasEnoughMoney(p.getUniqueId(), 420000)){
									es.removeMoney(p.getUniqueId(), 420000);
									PermissionsEx.getUser(p).addPermission("minenreset.6");
									PermissionsEx.getUser(p).addGroup("Tom.Rank6");
									p.playSound(p.getLocation(), Sound.ENDERDRAGON_WINGS, 1L ,1L);
									p.sendMessage(Main.pre + "§3Du hast dir diese Mine gekauft");
								}else {
									p.sendMessage(Main.pre + "§cDu hast nicht genug geld um dir Mine 6 zu kaufen!");
								}
							}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
						}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
					}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
				}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
			}else if (e.getCurrentItem().getType() == Material.IRON_ORE) {
				if (PermissionsEx.getUser(p).inGroup("Tom.Rank2")) {
					if (PermissionsEx.getUser(p).inGroup("Tom.Rank3")) {
						if (PermissionsEx.getUser(p).inGroup("Tom.Rank4")) {
							if (PermissionsEx.getUser(p).inGroup("Tom.Rank5")) {
								if (PermissionsEx.getUser(p).inGroup("Tom.Rank6")) {
									if (PermissionsEx.getUser(p).inGroup("Tom.Rank7")) {
										if (p.hasPermission("Tom.rank7")) {
											p.sendMessage(Main.pre + "§3Du wurdest zu Mine 7 Teleportiert!");
											FileConfiguration config = Main.getPlugin().getConfig();
											World world = Bukkit.getWorld(config.getString("7.World"));
											double x = config.getDouble("7.X");
											double y = config.getDouble("7.Y");
											double z = config.getDouble("7.Z");
											float yaw = (float) config.getDouble("7.Yaw");
											float pitch = (float) config.getDouble("7.Pitch");
											Location location = new Location(world, x, y, z, yaw, pitch);
											p.teleport(location);

											if (Arena.warte.contains(p)) {
												Arena.warte.clear();
											}
											if (Arena.warteno.contains(p)) {
												Arena.warteno.clear();
											}

										}else if(PermissionsEx.getUser(p).inGroup("Tom.Rank7")){
											p.sendMessage(Main.pre + "§cDu besitzt diese Mine bereits!");
											return;
										}else {
											p.sendMessage(Main.err);
										}
										p.sendMessage(Main.pre + "§cDu besitzt diese Mine bereits!");
									}else if(es.hasEnoughMoney(p.getUniqueId(), 980000)){
										es.removeMoney(p.getUniqueId(), 980000);
										PermissionsEx.getUser(p).addPermission("minenreset.7");
										PermissionsEx.getUser(p).addGroup("Tom.Rank7");
										p.playSound(p.getLocation(), Sound.ENDERDRAGON_WINGS, 1L ,1L);
										p.sendMessage(Main.pre + "§3Du hast dir diese Mine gekauft");
									}else {
										p.sendMessage(Main.pre + "§cDu hast nicht genug geld um dir Mine 7 zu kaufen!");
									}
								}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
							}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
						}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
					}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
				}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
			}else if (e.getCurrentItem().getType() == Material.GOLD_ORE) {
				if (PermissionsEx.getUser(p).inGroup("Tom.Rank2")) {
					if (PermissionsEx.getUser(p).inGroup("Tom.Rank3")) {
						if (PermissionsEx.getUser(p).inGroup("Tom.Rank4")) {
							if (PermissionsEx.getUser(p).inGroup("Tom.Rank5")) {
								if (PermissionsEx.getUser(p).inGroup("Tom.Rank6")) {
									if (PermissionsEx.getUser(p).inGroup("Tom.Rank7")) {
										if (PermissionsEx.getUser(p).inGroup("Tom.Rank8")) {
											if (p.hasPermission("Tom.rank8")) {
												p.sendMessage(Main.pre + "§3Du wurdest zu Mine 8 Teleportiert!");
												FileConfiguration config = Main.getPlugin().getConfig();
												World world = Bukkit.getWorld(config.getString("8.World"));
												double x = config.getDouble("8.X");
												double y = config.getDouble("8.Y");
												double z = config.getDouble("8.Z");
												float yaw = (float) config.getDouble("8.Yaw");
												float pitch = (float) config.getDouble("8.Pitch");
												Location location = new Location(world, x, y, z, yaw, pitch);
												p.teleport(location);

												if (Arena.warte.contains(p)) {
													Arena.warte.clear();
												}
												if (Arena.warteno.contains(p)) {
													Arena.warteno.clear();
												}

											}else if(PermissionsEx.getUser(p).inGroup("Tom.Rank8")){
												p.sendMessage(Main.pre + "§cDu besitzt diese Mine bereits!");
												return;
											}else {
												p.sendMessage(Main.err);
											}
											p.sendMessage(Main.pre + "§cDu besitzt diese Mine bereits!");
										}else if(es.hasEnoughMoney(p.getUniqueId(), 2400000)){
											es.removeMoney(p.getUniqueId(), 2400000);
											PermissionsEx.getUser(p).addPermission("minenreset.8");
											PermissionsEx.getUser(p).addGroup("Tom.Rank8");
											p.playSound(p.getLocation(), Sound.ENDERDRAGON_WINGS, 1L ,1L);
											p.sendMessage(Main.pre + "§3Du hast dir diese Mine gekauft");
										}else {
											p.sendMessage(Main.pre + "§cDu hast nicht genug geld um dir Mine 8 zu kaufen!");
										}
									}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
								}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
							}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
						}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
					}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
				}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
			}else if (e.getCurrentItem().getType() == Material.DIAMOND_ORE) {
				if (PermissionsEx.getUser(p).inGroup("Tom.Rank2")) {
					if (PermissionsEx.getUser(p).inGroup("Tom.Rank3")) {
						if (PermissionsEx.getUser(p).inGroup("Tom.Rank4")) {
							if (PermissionsEx.getUser(p).inGroup("Tom.Rank5")) {
								if (PermissionsEx.getUser(p).inGroup("Tom.Rank6")) {
									if (PermissionsEx.getUser(p).inGroup("Tom.Rank7")) {
										if (PermissionsEx.getUser(p).inGroup("Tom.Rank8")) {
											if (PermissionsEx.getUser(p).inGroup("Tom.Rank9")) {
												if (p.hasPermission("Tom.rank9")) {
													p.sendMessage(Main.pre + "§3Du wurdest zu Mine 9 Teleportiert!");
													FileConfiguration config = Main.getPlugin().getConfig();
													World world = Bukkit.getWorld(config.getString("9.World"));
													double x = config.getDouble("9.X");
													double y = config.getDouble("9.Y");
													double z = config.getDouble("9.Z");
													float yaw = (float) config.getDouble("9.Yaw");
													float pitch = (float) config.getDouble("9.Pitch");
													Location location = new Location(world, x, y, z, yaw, pitch);
													p.teleport(location);

													if (Arena.warte.contains(p)) {
														Arena.warte.clear();
													}
													if (Arena.warteno.contains(p)) {
														Arena.warteno.clear();
													}

												}else if(PermissionsEx.getUser(p).inGroup("Tom.Rank9")){
													p.sendMessage(Main.pre + "§cDu besitzt diese Mine bereits!");
													return;
												}else {
													p.sendMessage(Main.err);
												}

												p.sendMessage(Main.pre + "§cDu besitzt diese Mine bereits!");
											}else if(es.hasEnoughMoney(p.getUniqueId(), 4800000)){
												es.removeMoney(p.getUniqueId(), 4800000);
												PermissionsEx.getUser(p).addPermission("minenreset.9");
												PermissionsEx.getUser(p).addGroup("Tom.Rank9");
												p.playSound(p.getLocation(), Sound.ENDERDRAGON_WINGS, 1L ,1L);
												p.sendMessage(Main.pre + "§3Du hast dir diese Mine gekauft");
											}else {
												p.sendMessage(Main.pre + "§cDu hast nicht genug geld um dir Mine 9 zu kaufen!");
											}
										}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
									}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
								}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
							}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
						}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
					}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
				}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
			}else if (e.getCurrentItem().getType() == Material.EMERALD_ORE) {
				if (PermissionsEx.getUser(p).inGroup("Tom.Rank2")) {
					if (PermissionsEx.getUser(p).inGroup("Tom.Rank3")) {
						if (PermissionsEx.getUser(p).inGroup("Tom.Rank4")) {
							if (PermissionsEx.getUser(p).inGroup("Tom.Rank5")) {
								if (PermissionsEx.getUser(p).inGroup("Tom.Rank6")) {
									if (PermissionsEx.getUser(p).inGroup("Tom.Rank7")) {
										if (PermissionsEx.getUser(p).inGroup("Tom.Rank8")) {
											if (PermissionsEx.getUser(p).inGroup("Tom.Rank9")) {
												if (PermissionsEx.getUser(p).inGroup("Tom.Rank10")) {
													if (p.hasPermission("Tom.rank10")) {
														p.sendMessage(Main.pre + "§3Du wurdest zu Mine 10 Teleportiert!");
														FileConfiguration config = Main.getPlugin().getConfig();
														World world = Bukkit.getWorld(config.getString("10.World"));
														double x = config.getDouble("10.X");
														double y = config.getDouble("10.Y");
														double z = config.getDouble("10.Z");
														float yaw = (float) config.getDouble("10.Yaw");
														float pitch = (float) config.getDouble("10.Pitch");
														Location location = new Location(world, x, y, z, yaw, pitch);
														p.teleport(location);

														if (Arena.warte.contains(p)) {
															Arena.warte.clear();
														}
														if (Arena.warteno.contains(p)) {
															Arena.warteno.clear();
														}

													}else if(PermissionsEx.getUser(p).inGroup("Tom.Rank10")){
														p.sendMessage(Main.pre + "§cDu besitzt diese Mine bereits!");
														return;
													}else {
														p.sendMessage(Main.err);
													}
													p.sendMessage(Main.pre + "§cDu besitzt diese Mine bereits!");
												}else if(es.hasEnoughMoney(p.getUniqueId(), 7300000)){
													es.removeMoney(p.getUniqueId(), 7300000);
													PermissionsEx.getUser(p).addPermission("minenreset.10");
													PermissionsEx.getUser(p).addGroup("Tom.Rank10");
													p.playSound(p.getLocation(), Sound.ENDERDRAGON_WINGS, 1L ,1L);
													p.sendMessage(Main.pre + "§3Du hast dir diese Mine gekauft");
												}else {
													p.sendMessage(Main.pre + "§cDu hast nicht genug geld um dir Mine 10 zu kaufen!");
												}
											}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
										}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
									}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
								}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
							}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
						}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
					}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
				}else p.sendMessage(Main.pre + "§cDu kannst dir diese Mine noch nicht Kaufen!");
			}
		}
	}
}