package de.Tommunity.utils;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import de.Tommunity.Main.Main;

public class Arena implements CommandExecutor, Listener {

	private final String GUI_NAME = "§4§lArena";
	public static ArrayList<Player> warte = new ArrayList<>();
	public static ArrayList<Player> warteno = new ArrayList<>();

	public static ArrayList<Player> Arena1 = new ArrayList<>();
	public static ArrayList<Player> Arena2 = new ArrayList<>();
	public static ArrayList<Player> Arena3 = new ArrayList<>();


	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		Player p = (Player) cs;
		if (cs == null) {
			cs.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein!");
			return true;
		}

		if (args.length == 0) {
			Inventory inv = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

			ItemStack item1 = new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname("§fGlasscheibe").build();
			ItemStack item2 = new ItemBuilder(Material.GOLD_CHESTPLATE).setDisplayname("§c§lItems verlieren!")
					.build();
			ItemStack item3 = new ItemBuilder(Material.DIAMOND_CHESTPLATE).setDisplayname("§a§lItems behalten!")
					.build();
			ItemStack item4 = new ItemBuilder(Material.BARRIER).setDisplayname("§c§lAbbruch").build();

			for (int i = 0; i != 9; i++) {
				inv.setItem(i, item1);
			}
			for (int i = 18; i != 27; i++) {
				inv.setItem(i, item1);
			}

			inv.setItem(9, item1);
			inv.setItem(10, item1);
			inv.setItem(12, item1);
			inv.setItem(14, item1);
			inv.setItem(16, item1);
			inv.setItem(17, item1);

			inv.setItem(13, item4);
			inv.setItem(15, item2);
			inv.setItem(11, item3);

			p.openInventory(inv);

		}
		return false;
	}

	@SuppressWarnings("incomplete-switch")
	@EventHandler
	public void handleArenaMenuClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if (e.getClickedInventory().getTitle().equals(GUI_NAME)) {
			e.setCancelled(true);
		}
		if (e.getClickedInventory().getTitle().equals(GUI_NAME)) {
			switch (e.getCurrentItem().getType()) {
				case DIAMOND_CHESTPLATE:
					if (!warteno.contains(p)) {
						if (!warte.contains(p)) {
							if (warte.size() == 0) {
								warte.add(0, p);
								p.sendMessage(Main.pre + "§3Warteschlange hinzugefügt");
							} else if (warte.size() == 1) {
								warte.add(1, p);
								p.sendMessage(Main.pre + "§3Warteschlange hinzugefügt");
							}

							if (warte.size() == 2) {
								Player p1 = warte.get(0);
								Player p2 = warte.get(1);
								p1.sendMessage(Main.pre + "§3Der Kampf beginnt du wirst Teleportiert!");
								p2.sendMessage(Main.pre + "§3Der Kampf beginnt du wirst Teleportiert!");
								for (Player all : Bukkit.getOnlinePlayers()) {
									// Arena 1
									if (!(all.getLocation().getBlockX() >= -37 && all.getLocation().getBlockX() <= 39)) {
										if (!(all.getLocation().getBlockY() >= 20 && all.getLocation().getBlockY() <= 60)) {
											if (!(all.getLocation().getBlockZ() >= -63 && all.getLocation().getBlockZ() <= 8)) {
												FileConfiguration config = Main.getPlugin().getConfig();
												World world = Bukkit.getWorld(config.getString("A1.World"));
												double x = config.getDouble("A1.X");
												double y = config.getDouble("A1.Y");
												double z = config.getDouble("A1.Z");
												float yaw = (float) config.getDouble("A1.Yaw");
												float pitch = (float) config.getDouble("A1.Pitch");
												Location location = new Location(world, x, y, z, yaw, pitch);
												p1.teleport(location);

												Arena1.add(p1);
												Arena1.add(p2);

												FileConfiguration config1 = Main.getPlugin().getConfig();
												World world1 = Bukkit.getWorld(config1.getString("A2.World"));
												double x1 = config1.getDouble("A2.X");
												double y1 = config1.getDouble("A2.Y");
												double z1 = config1.getDouble("A2.Z");
												float yaw1 = (float) config1.getDouble("A2.Yaw");
												float pitch1 = (float) config1.getDouble("A2.Pitch");
												Location location1 = new Location(world1, x1, y1, z1, yaw1, pitch1);
												p2.teleport(location1);
												p1.sendMessage(Main.pre + "§3Der Kampf beginnt!");
												p2.sendMessage(Main.pre + "§3Der Kampf beginnt!");
												p1.setGameMode(GameMode.SURVIVAL);
												p2.setGameMode(GameMode.SURVIVAL);
												p1.setHealth(20);
												p2.setHealth(20);
												warte.clear();
												return;
											}
											return;
										}
										return;
									}
									// Arena 2
									if (!(all.getLocation().getBlockX() >= -172 && all.getLocation().getBlockX() <= -101)) {
										if (!(all.getLocation().getBlockY() >= 21 && all.getLocation().getBlockY() <= 51)) {
											if (!(all.getLocation().getBlockZ() >= -58 && all.getLocation().getBlockZ() <= 9)) {
												FileConfiguration config = Main.getPlugin().getConfig();
												World world = Bukkit.getWorld(config.getString("A3.World"));
												double x = config.getDouble("A3.X");
												double y = config.getDouble("A3.Y");
												double z = config.getDouble("A3.Z");
												float yaw = (float) config.getDouble("A3.Yaw");
												float pitch = (float) config.getDouble("A3.Pitch");
												Location location = new Location(world, x, y, z, yaw, pitch);
												p1.teleport(location);

												Arena2.add(p1);
												Arena2.add(p2);

												FileConfiguration config1 = Main.getPlugin().getConfig();
												World world1 = Bukkit.getWorld(config1.getString("A4.World"));
												double x1 = config1.getDouble("A4.X");
												double y1 = config1.getDouble("A4.Y");
												double z1 = config1.getDouble("A4.Z");
												float yaw1 = (float) config1.getDouble("A4.Yaw");
												float pitch1 = (float) config1.getDouble("A4.Pitch");
												Location location1 = new Location(world1, x1, y1, z1, yaw1, pitch1);
												p2.teleport(location1);
												p1.sendMessage(Main.pre + "§3Der Kampf beginnt!");
												p2.sendMessage(Main.pre + "§3Der Kampf beginnt!");
												p1.setGameMode(GameMode.SURVIVAL);
												p2.setGameMode(GameMode.SURVIVAL);
												p1.setHealth(20);
												p2.setHealth(20);
												warte.clear();
												return;
											}
											return;
										}
										return;
									}
									// Arena 3
									if (!(all.getLocation().getBlockX() >= -170 && all.getLocation().getBlockX() <= -99)) {
										if (!(all.getLocation().getBlockY() >= 14 && all.getLocation().getBlockY() <= 61)) {
											if (!(all.getLocation().getBlockZ() >= -198 && all.getLocation().getBlockZ() <= -130)) {
												FileConfiguration config = Main.getPlugin().getConfig();
												World world = Bukkit.getWorld(config.getString("A5.World"));
												double x = config.getDouble("A5.X");
												double y = config.getDouble("A5.Y");
												double z = config.getDouble("A5.Z");
												float yaw = (float) config.getDouble("A5.Yaw");
												float pitch = (float) config.getDouble("A5.Pitch");
												Location location = new Location(world, x, y, z, yaw, pitch);
												p1.teleport(location);

												Arena3.add(p1);
												Arena3.add(p2);

												FileConfiguration config1 = Main.getPlugin().getConfig();
												World world1 = Bukkit.getWorld(config1.getString("A6.World"));
												double x1 = config1.getDouble("A6.X");
												double y1 = config1.getDouble("A6.Y");
												double z1 = config1.getDouble("A6.Z");
												float yaw1 = (float) config1.getDouble("A6.Yaw");
												float pitch1 = (float) config1.getDouble("A6.Pitch");
												Location location1 = new Location(world1, x1, y1, z1, yaw1, pitch1);
												p2.teleport(location1);
												p1.sendMessage(Main.pre + "§3Der Kampf beginnt!");
												p2.sendMessage(Main.pre + "§3Der Kampf beginnt!");
												p1.setGameMode(GameMode.SURVIVAL);
												p2.setGameMode(GameMode.SURVIVAL);
												p1.setHealth(20);
												p2.setHealth(20);
												warte.clear();
												return;
											}
											return;
										}
										return;
									}

									p2.sendMessage(Main.pre + "§3Derzeit ist keine Arena frei bitte warte einen Moment");
									p1.sendMessage(Main.pre + "§3Derzeit ist keine Arena frei bitte warte einen Moment");

								}

							}
						} else
							p.sendMessage(Main.pre + "§cDu bist schon in der Warteschlange");
					} else
						p.sendMessage(Main.pre + "§cDu bist schon in der Warteschlange");
					break;
				case GOLD_CHESTPLATE:
					p.sendMessage(Main.pre + "§3Dieser Modus wird verfügbar sein sobald der Inventar Behalten Modus bugfrei läuft!");
				/*
				if (!warte.contains(p)) {
					if (!warteno.contains(p)) {
						if (warteno.size() == 0) {
							warteno.add(0, p);
							p.sendMessage(Main.pre + "§3Warteschlange hinzugefügt");
						} else if (warteno.size() == 1) {
							warteno.add(1, p);
							p.sendMessage(Main.pre + "§3Warteschlange hinzugefügt");
						}

						if (warteno.size() == 2) {
							Player p1 = warteno.get(0);
							Player p2 = warteno.get(1);
							p1.sendMessage(Main.pre + "§3Der Kampf beginnt du wirst Teleportiert!");
							p2.sendMessage(Main.pre + "§3Der Kampf beginnt du wirst Teleportiert!");
							for (Player all : Bukkit.getOnlinePlayers()) {
								// Arena 1
								if (!(all.getLocation().getBlockX() >= -156 && all.getLocation().getBlockX() <= -89)) {
									if (!(all.getLocation().getBlockY() >= 13 && all.getLocation().getBlockY() <= 61)) {
										if (!(all.getLocation().getBlockZ() >= -153
												&& all.getLocation().getBlockZ() <= -81)) {
											FileConfiguration config = Main.getPlugin().getConfig();
											World world = Bukkit.getWorld(config.getString("AA1.World"));
											double x = config.getDouble("AA1.X");
											double y = config.getDouble("AA1.Y");
											double z = config.getDouble("AA1.Z");
											float yaw = (float) config.getDouble("AA1.Yaw");
											float pitch = (float) config.getDouble("AA1.Pitch");
											Location location = new Location(world, x, y, z, yaw, pitch);
											p1.teleport(location);

											FileConfiguration config1 = Main.getPlugin().getConfig();
											World world1 = Bukkit.getWorld(config1.getString("AA2.World"));
											double x1 = config1.getDouble("AA2.X");
											double y1 = config1.getDouble("AA2.Y");
											double z1 = config1.getDouble("AA2.Z");
											float yaw1 = (float) config1.getDouble("AA2.Yaw");
											float pitch1 = (float) config1.getDouble("AA2.Pitch");
											Location location1 = new Location(world1, x1, y1, z1, yaw1, pitch1);
											p2.teleport(location1);
											p1.sendMessage(Main.pre + "§3Der Kampf beginnt!");
											p2.sendMessage(Main.pre + "§3Der Kampf beginnt!");
											p1.setGameMode(GameMode.SURVIVAL);
											p2.setGameMode(GameMode.SURVIVAL);
											p1.setHealth(20);
											p2.setHealth(20);
											warteno.clear();
											onArena4 = true;
											onArena1(null);
											return;
										}
									}
								}
								// Arena 2
								if (!(all.getLocation().getBlockX() >= -125 && all.getLocation().getBlockX() <= -55)) {
									if (!(all.getLocation().getBlockY() >= 26 && all.getLocation().getBlockY() <= 77)) {
										if (!(all.getLocation().getBlockZ() >= -69
												&& all.getLocation().getBlockZ() <= 3)) {
											FileConfiguration config = Main.getPlugin().getConfig();
											World world = Bukkit.getWorld(config.getString("AA3.World"));
											double x = config.getDouble("AA3.X");
											double y = config.getDouble("AA3.Y");
											double z = config.getDouble("AA3.Z");
											float yaw = (float) config.getDouble("AA3.Yaw");
											float pitch = (float) config.getDouble("AA3.Pitch");
											Location location = new Location(world, x, y, z, yaw, pitch);
											p1.teleport(location);

											FileConfiguration config1 = Main.getPlugin().getConfig();
											World world1 = Bukkit.getWorld(config1.getString("AA4.World"));
											double x1 = config1.getDouble("AA4.X");
											double y1 = config1.getDouble("AA4.Y");
											double z1 = config1.getDouble("AA4.Z");
											float yaw1 = (float) config1.getDouble("AA4.Yaw");
											float pitch1 = (float) config1.getDouble("AA4.Pitch");
											Location location1 = new Location(world1, x1, y1, z1, yaw1, pitch1);
											p2.teleport(location1);
											p1.sendMessage(Main.pre + "§3Der Kampf beginnt!");
											p2.sendMessage(Main.pre + "§3Der Kampf beginnt!");
											p1.setGameMode(GameMode.SURVIVAL);
											p2.setGameMode(GameMode.SURVIVAL);
											p1.setHealth(20);
											p2.setHealth(20);
											warteno.clear();
											onArena5 = true;
											onArena1(null);
											return;
										}
									}
								}
								// Arena 3
								if (!(all.getLocation().getBlockX() >= -36 && all.getLocation().getBlockX() <= 37)) {
									if (!(all.getLocation().getBlockY() >= 42 && all.getLocation().getBlockY() <= 80)) {
										if (!(all.getLocation().getBlockZ() >= -62
												&& all.getLocation().getBlockZ() <= 0)) {
											FileConfiguration config = Main.getPlugin().getConfig();
											World world = Bukkit.getWorld(config.getString("AA5.World"));
											double x = config.getDouble("AA5.X");
											double y = config.getDouble("AA5.Y");
											double z = config.getDouble("AA5.Z");
											float yaw = (float) config.getDouble("AA5.Yaw");
											float pitch = (float) config.getDouble("AA5.Pitch");
											Location location = new Location(world, x, y, z, yaw, pitch);
											p1.teleport(location);

											FileConfiguration config1 = Main.getPlugin().getConfig();
											World world1 = Bukkit.getWorld(config1.getString("AA6.World"));
											double x1 = config1.getDouble("AA6.X");
											double y1 = config1.getDouble("AA6.Y");
											double z1 = config1.getDouble("AA6.Z");
											float yaw1 = (float) config1.getDouble("AA6.Yaw");
											float pitch1 = (float) config1.getDouble("AA6.Pitch");
											Location location1 = new Location(world1, x1, y1, z1, yaw1, pitch1);
											p2.teleport(location1);
											p1.sendMessage(Main.pre + "§3Der Kampf beginnt!");
											p2.sendMessage(Main.pre + "§3Der Kampf beginnt!");
											p1.setGameMode(GameMode.SURVIVAL);
											p2.setGameMode(GameMode.SURVIVAL);
											p1.setHealth(20);
											p2.setHealth(20);
											warteno.clear();
											onArena6 = true;
											onArena1(null);
											return;
										}
									}
								}
								p2.sendMessage(Main.pre + "§3Derzeit ist keine Arena frei bitte warte einen Moment");
								p1.sendMessage(Main.pre + "§3Derzeit ist keine Arena frei bitte warte einen Moment");

							}

						}
					} else
						p.sendMessage(Main.pre + "§cDu bist schon in der Warteschlange");
				} else
					p.sendMessage(Main.pre + "§cDu bist schon in der Warteschlange");

				 */
					break;
				case BARRIER:
					if (warte.contains(p)) {
						warte.clear();
						p.sendMessage(Main.pre + "§3Du bist aus der Warteschlange rausgegangen");
					} else if (warteno.contains(p)) {
						warteno.clear();
						p.sendMessage(Main.pre + "§3Du bist aus der Warteschlange rausgegangen");
					} else
						p.sendMessage(Main.pre + "§cDu bist in keiner Warteschlange");
					break;

			}
		}
	}

}

