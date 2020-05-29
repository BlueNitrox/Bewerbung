package de.Tommunity.Listener;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import de.Tommunity.Main.Main;
import de.Tommunity.utils.ItemBuilder;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class Kit implements CommandExecutor, Listener{

	public final String GUI_NAME = "§1Kits";

	public static File f = new File("plugins//TommUnity//Kits_info.yml");
	public static YamlConfiguration cfg = YamlConfiguration.loadConfiguration(f);

	public static File f1 = new File("plugins//TommUnity//Kits.yml");
	public static YamlConfiguration cfg1 = YamlConfiguration.loadConfiguration(f1);


	public HashMap<UUID, Long> starterdelay = new HashMap<>();

	public HashMap<UUID, Long> holzfällerdelay = new HashMap<>();

	public HashMap<UUID, Long> magierdelay = new HashMap<>();

	public HashMap<UUID, Long> warzonedelay = new HashMap<>();

	public HashMap<UUID, Long> mobdelay = new HashMap<>();

	public HashMap<UUID, Long> expertdelay = new HashMap<>();

	public HashMap<UUID, Long> königdelay = new HashMap<>();

	public HashMap<UUID, Long> masterdelay = new HashMap<>();

	public HashMap<UUID, Long> herodelay = new HashMap<>();



	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Player p = (Player) sender;

		if(args.length == 0) {


			Inventory inv = Bukkit.getServer().createInventory(null, 9*3, GUI_NAME);
			ItemStack glas = new ItemStack(Material.STAINED_GLASS_PANE,1, (short) 15);


			for(int i = 0; i != 9; i++) {
				inv.setItem(i, glas);
			}
			for(int i = 18; i != 27; i++) {
				inv.setItem(i, glas);
			}


			//Items erstellent

			ItemStack starter = new ItemBuilder(Material.STONE_PICKAXE).setDisplayname("§6Starter").setLore("§aKlicken zum abholen").build();
			ItemStack starterabgeholt = new ItemBuilder(Material.STONE_PICKAXE).setDisplayname("§6Starter").setLore("§cAlle 5min verfügbar").build();
			ItemStack holzfäller = new ItemBuilder(Material.IRON_AXE).setDisplayname("§6Holzfäller").setLore("§aKlicken zum abholen").build();
			ItemStack holzfällerabgeholt = new ItemBuilder(Material.IRON_AXE).setDisplayname("§6Holzfäller").setLore("§cAlle 15min verfügbar").build();
			ItemStack magier = new ItemBuilder(Material.POTION).setDisplayname("§6Magier").setLore("§aKlicken zum abholen").build();
			ItemStack magierabgeholt = new ItemBuilder(Material.POTION).setDisplayname("§6Magier").setLore("§cAlle 30min verfügbar").build();
			ItemStack warzone = new ItemBuilder(Material.IRON_CHESTPLATE).setDisplayname("§6Warzone").setLore("§aKlicken zum abholen").build();
			ItemStack warzoneabgeholt = new ItemBuilder(Material.IRON_CHESTPLATE).setDisplayname("§6Warzone").setLore("§cAlle 60min verfügbar").build();
			ItemStack mob = new ItemBuilder(Material.WOOD_SWORD).setDisplayname("§6Mob").setLore("§aKlicken zum abholen").build();
			ItemStack mobabgeholt = new ItemBuilder(Material.WOOD_SWORD).setDisplayname("§6Mob").setLore("§cAlle 1,5 Stunden verfügbar").build();
			ItemStack expert = new ItemBuilder(Material.DIAMOND_PICKAXE).setDisplayname("§6Expert").setLore("§aKlicken zum abholen").build();
			ItemStack expertabgeholt = new ItemBuilder(Material.DIAMOND_PICKAXE).setDisplayname("§6Expert").setLore("§cAlle 2 Stunden verfügbar").build();
			ItemStack könig = new ItemBuilder(Material.GOLDEN_APPLE).setDisplayname("§6König").setLore("§aKlicken zum abholen").build();
			ItemStack königabgeholt = new ItemBuilder(Material.GOLDEN_APPLE).setDisplayname("§6König").setLore("§cAlle 2,5 Stunden verfügbar").build();
			ItemStack master = new ItemBuilder(Material.IRON_SWORD).setDisplayname("§6Master").setLore("§aKlicken zum abholen").build();
			ItemStack masterabgeholt = new ItemBuilder(Material.IRON_SWORD).setDisplayname("§6Master").setLore("§cAlle 1,5 Stunden verfügbar").build();
			ItemStack hero = new ItemBuilder(Material.DIAMOND_SWORD).setDisplayname("§6Hero").setLore("§aKlicken zum abholen").build();
			ItemStack heroabgeholt = new ItemBuilder(Material.DIAMOND_SWORD).setDisplayname("§6Hero").setLore("§cAlle 1,5 Stunden verfügbar").build();

			ItemStack holzfällernicht = new ItemBuilder(Material.IRON_AXE).setDisplayname("§6Holzfäller").setLore("§cDu musst das §6Starter-kit §cnoch §6" + cfg.get(p.getUniqueId() + ".holzfaellerint") + "§c mal abholen").build();
			ItemStack magiernicht = new ItemBuilder(Material.POTION).setDisplayname("§6Magier").setLore("§cDu musst das §6Holzfäller-kit §cnoch §6" + cfg.get(p.getUniqueId() + ".magierint") + "§c mal abholen").build();
			ItemStack warzonenicht = new ItemBuilder(Material.IRON_CHESTPLATE).setDisplayname("§6Warzone").setLore("§cDu musst das §6Magierr-kit §cnoch §6" + cfg.get(p.getUniqueId() + ".warzoneint") + "§c mal abholen").build();
			ItemStack mobnicht = new ItemBuilder(Material.WOOD_SWORD).setDisplayname("§6Mob").setLore("§cDu musst das §6Warzone-kit §cnoch §6" + cfg.get(p.getUniqueId() + ".mobint") + "§c mal abholen").build();
			ItemStack expertnicht = new ItemBuilder(Material.DIAMOND_PICKAXE).setDisplayname("§6Expert").setLore("§cDu musst das §6Mob-kit §cnoch §6" + cfg.get(p.getUniqueId() + ".expertint") + "§c mal abholen").build();
			ItemStack könignicht = new ItemBuilder(Material.GOLDEN_APPLE).setDisplayname("§6König").setLore("§cDu musst das §6Expert-kit §cnoch §6" + cfg.get(p.getUniqueId() + ".koenigint") + "§c mal abholen").build();
			ItemStack masternicht = new ItemBuilder(Material.IRON_SWORD).setDisplayname("§6Master").setLore("§cDu benötigst den §dMaster-Rang").build();
			ItemStack heronicht = new ItemBuilder(Material.DIAMOND_SWORD).setDisplayname("§6Hero").setLore("§cDu benötigst den §9Hero-Rang").build();


			ItemStack magiernichtfreigeschaltet = new ItemBuilder(Material.POTION).setDisplayname("§6Magier").setLore("§cNoch nicht freigeschaltet").build();
			ItemStack warzonenichtfreigeschaltet = new ItemBuilder(Material.IRON_CHESTPLATE).setDisplayname("§6Warzone").setLore("§cNoch nicht freigeschaltet").build();
			ItemStack mobnichtfreigeschaltet = new ItemBuilder(Material.WOOD_SWORD).setDisplayname("§6Mob").setLore("§cNoch nicht freigeschaltet").build();
			ItemStack expertnichtfreigeschaltet = new ItemBuilder(Material.DIAMOND_PICKAXE).setDisplayname("§6Expert").setLore("§cNoch nicht freigeschaltet").build();
			ItemStack könignichtfreigeschaltet = new ItemBuilder(Material.GOLDEN_APPLE).setDisplayname("§6König").setLore("§cNoch nicht freigeschaltet").build();


			//Items ins Menü legen:


			if(!starterdelay.containsKey(p.getUniqueId())) {
				inv.setItem(9, starter);
			}else {
				inv.setItem(9, starterabgeholt);
			}



			if(cfg1.getBoolean(p.getUniqueId() + ".Holzfaeller-Kit")) {
				if(holzfällerdelay.containsKey(p.getUniqueId())) {
					inv.setItem(10, holzfällerabgeholt);
				}else {
					inv.setItem(10, holzfäller);
				}
			}else {
				inv.setItem(10, holzfällernicht);
			}




			if(cfg1.getBoolean(p.getUniqueId() + ".Magier-Kit")) {
				if(magierdelay.containsKey(p.getUniqueId())) {
					inv.setItem(11, magierabgeholt);
				}else {
					inv.setItem(11, magier);
				}
			}else if(cfg1.getBoolean(p.getUniqueId() + ".Holzfaeller-Kit")) {
				inv.setItem(11, magiernicht);
			}else {
				inv.setItem(11, magiernichtfreigeschaltet);
			}





			if(cfg1.getBoolean(p.getUniqueId() + ".Warzone-Kit")) {
				if(warzonedelay.containsKey(p.getUniqueId())) {
					inv.setItem(12, warzoneabgeholt);
				}else {
					inv.setItem(12, warzone);
				}
			}else if(cfg1.getBoolean(p.getUniqueId() + ".Magier-Kit")) {
				inv.setItem(12, warzonenicht);
			}else {
				inv.setItem(12, warzonenichtfreigeschaltet);
			}





			if(cfg1.getBoolean(p.getUniqueId() + ".Mob-Kit")) {
				if(mobdelay.containsKey(p.getUniqueId())) {
					inv.setItem(13, mobabgeholt);
				}else {
					inv.setItem(13, mob);
				}
			}else if(cfg1.getBoolean(p.getUniqueId() + ".Warzone-Kit")){
				inv.setItem(13, mobnicht);
			}else {
				inv.setItem(13, mobnichtfreigeschaltet);
			}






			if(cfg1.getBoolean(p.getUniqueId() + ".Expert-Kit")) {
				if(expertdelay.containsKey(p.getUniqueId())) {
					inv.setItem(14, expertabgeholt);
				}else {
					inv.setItem(14, expert);
				}
			}else if(cfg1.getBoolean(p.getUniqueId() + ".Mob-Kit")){
				inv.setItem(14, expertnicht);
			}else {
				inv.setItem(14, expertnichtfreigeschaltet);
			}





			if(cfg1.getBoolean(p.getUniqueId() + ".Koenig-Kit")) {
				if(königdelay.containsKey(p.getUniqueId())) {
					inv.setItem(15, königabgeholt);
				}else {
					inv.setItem(15, könig);
				}
			}else if(cfg1.getBoolean(p.getUniqueId() + ".Expert-Kit")){
				inv.setItem(15, könignicht);
			}else {
				inv.setItem(15, könignichtfreigeschaltet);
			}





			if(PermissionsEx.getUser(p).inGroup("Master") || PermissionsEx.getUser(p).inGroup("Hero") || PermissionsEx.getUser(p).inGroup("Youtuber") || PermissionsEx.getUser(p).inGroup("Builder") || PermissionsEx.getUser(p).inGroup("Supporter") || PermissionsEx.getUser(p).inGroup("Moderator") || PermissionsEx.getUser(p).inGroup("Developer") || PermissionsEx.getUser(p).inGroup("Admin") || PermissionsEx.getUser(p).inGroup("Owner")) {
				if(masterdelay.containsKey(p.getUniqueId())) {
					inv.setItem(16, masterabgeholt);
				}else {
					inv.setItem(16, master);
				}
			}else {
				inv.setItem(16, masternicht);
			}





			if(PermissionsEx.getUser(p).inGroup("Hero") || PermissionsEx.getUser(p).inGroup("Youtuber") || PermissionsEx.getUser(p).inGroup("Builder") || PermissionsEx.getUser(p).inGroup("Supporter") || PermissionsEx.getUser(p).inGroup("Moderator") || PermissionsEx.getUser(p).inGroup("Developer") || PermissionsEx.getUser(p).inGroup("Admin") || PermissionsEx.getUser(p).inGroup("Owner")) {
				if(herodelay.containsKey(p.getUniqueId())) {
					inv.setItem(17, heroabgeholt);
				}else {
					inv.setItem(17, hero);
				}
			}else {
				inv.setItem(17, heronicht);
			}


			p.openInventory(inv);

		}else {
			p.sendMessage(Main.pre + "§cBitte benutze §6/kit");
		}

		return false;
	}

	@EventHandler
	public void onClick(final InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if(e.getClickedInventory().getTitle().equals(GUI_NAME) && e.getCurrentItem() != null) {
			e.setCancelled(true);

			switch (e.getCurrentItem().getItemMeta().getDisplayName()) {
				case "§6Starter": {

					Long time = System.currentTimeMillis();
					if (this.starterdelay.containsKey(p.getUniqueId())) {
						Long lastUsage = this.starterdelay.get(p.getUniqueId());
						if (lastUsage + 1000 * 60 * 5 > time) {
							p.sendMessage(Main.pre + "§cDu musst noch etwas warten");
							p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1L, 1L);
							return;

						}
					}

					Kit_Items.addStarterItems(p);
					p.closeInventory();
					p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1L, 1L);
					this.starterdelay.put(p.getUniqueId(), time);

					if (cfg.getInt(p.getUniqueId() + ".holzfaellerint") == 1) {
						cfg1.set(p.getUniqueId() + ".Holzfaeller-Kit", true);
						try {
							cfg1.save(f1);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					} else {
						cfg.set(p.getUniqueId() + ".holzfaellerint", (cfg.getInt(p.getUniqueId() + ".holzfaellerint") - 1));
						try {
							cfg.save(f);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}

					break;
				}
				case "§6Holzfäller": {
					e.setCancelled(true);

					if (!cfg1.getBoolean(p.getUniqueId() + ".Holzfaeller-Kit")) {
						p.sendMessage(Main.pre + "§cDu hast dieses Kit noch nicht freigeschaltet");
						p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1L, 1L);
						return;
					}

					Long time = System.currentTimeMillis();
					if (this.holzfällerdelay.containsKey(p.getUniqueId())) {
						Long lastUsage = this.holzfällerdelay.get(p.getUniqueId());
						if (lastUsage + 1000 * 60 * 15 > time) {
							p.sendMessage(Main.pre + "§cDu musst noch etwas warten");
							p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1L, 1L);
							return;

						}
					}

					if (cfg.getInt(p.getUniqueId() + ".magierint") == 1) {
						cfg1.set(p.getUniqueId() + ".Magier-Kit", true);
						try {
							cfg1.save(f1);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					} else {
						cfg.set(p.getUniqueId() + ".magierint", (cfg.getInt(p.getUniqueId() + ".magierint") - 1));
						try {
							cfg.save(f);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}

					Kit_Items.addHolzfällerItems(p);
					p.closeInventory();
					p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1L, 1L);
					this.holzfällerdelay.put(p.getUniqueId(), time);

					break;
				}
				case "§6Magier": {
					e.setCancelled(true);

					if (!cfg1.getBoolean(p.getUniqueId() + ".Magier-Kit")) {
						p.sendMessage(Main.pre + "§cDu hast dieses Kit noch nicht freigeschaltet");
						p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1L, 1L);
						return;
					}

					Long time = System.currentTimeMillis();
					if (this.magierdelay.containsKey(p.getUniqueId())) {
						Long lastUsage = this.magierdelay.get(p.getUniqueId());
						if (lastUsage + 1000 * 60 * 30 > time) {
							p.sendMessage(Main.pre + "§cDu musst noch etwas warten");
							p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1L, 1L);
							return;

						}
					}

					if (cfg.getInt(p.getUniqueId() + ".warzoneint") == 1) {
						cfg1.set(p.getUniqueId() + ".Warzone-Kit", true);
						try {
							cfg1.save(f1);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					} else {
						cfg.set(p.getUniqueId() + ".warzoneint", (cfg.getInt(p.getUniqueId() + ".warzoneint") - 1));
						try {
							cfg.save(f);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}

					Kit_Items.addMagierItems(p);
					p.closeInventory();
					p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1L, 1L);
					this.magierdelay.put(p.getUniqueId(), time);

					break;
				}
				case "§6Warzone": {
					e.setCancelled(true);

					if (!cfg1.getBoolean(p.getUniqueId() + ".Warzone-Kit")) {
						p.sendMessage(Main.pre + "§cDu hast dieses Kit noch nicht freigeschaltet");
						p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1L, 1L);
						return;
					}

					Long time = System.currentTimeMillis();
					if (this.warzonedelay.containsKey(p.getUniqueId())) {
						Long lastUsage = this.warzonedelay.get(p.getUniqueId());
						if (lastUsage + 1000 * 60 * 60 > time) {
							p.sendMessage(Main.pre + "§cDu musst noch etwas warten");
							p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1L, 1L);
							return;

						}
					}

					if (cfg.getInt(p.getUniqueId() + ".mobint") == 1) {
						cfg1.set(p.getUniqueId() + ".Mob-Kit", true);
						try {
							cfg1.save(f1);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					} else {
						cfg.set(p.getUniqueId() + ".mobint", (cfg.getInt(p.getUniqueId() + ".mobint") - 1));
						try {
							cfg.save(f);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}

					Kit_Items.addWarzoneItems(p);
					p.closeInventory();
					p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1L, 1L);
					this.warzonedelay.put(p.getUniqueId(), time);

					break;
				}
				case "§6Mob": {
					e.setCancelled(true);

					if (!cfg1.getBoolean(p.getUniqueId() + ".Mob-Kit")) {
						p.sendMessage(Main.pre + "§cDu hast dieses Kit noch nicht freigeschaltet");
						p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1L, 1L);
						return;
					}

					Long time = System.currentTimeMillis();
					if (this.mobdelay.containsKey(p.getUniqueId())) {
						Long lastUsage = this.mobdelay.get(p.getUniqueId());
						if (lastUsage + 1000 * 60 * 90 > time) {
							p.sendMessage(Main.pre + "§cDu musst noch etwas warten");
							p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1L, 1L);
							return;

						}
					}

					if (cfg.getInt(p.getUniqueId() + ".expertint") == 1) {
						cfg1.set(p.getUniqueId() + ".Expert-Kit", true);
						try {
							cfg1.save(f1);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					} else {
						cfg.set(p.getUniqueId() + ".expertint", (cfg.getInt(p.getUniqueId() + ".expertint") - 1));
						try {
							cfg.save(f);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}

					Kit_Items.addMobItems(p);
					p.closeInventory();
					p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1L, 1L);
					this.mobdelay.put(p.getUniqueId(), time);

					break;
				}
				case "§6Expert": {
					e.setCancelled(true);

					if (!cfg1.getBoolean(p.getUniqueId() + ".Expert-Kit")) {
						p.sendMessage(Main.pre + "§cDu hast dieses Kit noch nicht freigeschaltet");
						p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1L, 1L);
						return;
					}

					Long time = System.currentTimeMillis();
					if (this.expertdelay.containsKey(p.getUniqueId())) {
						Long lastUsage = this.expertdelay.get(p.getUniqueId());
						if (lastUsage + 1000 * 60 * 60 * 2 > time) {
							p.sendMessage(Main.pre + "§cDu musst noch etwas warten");
							p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1L, 1L);
							return;

						}
					}

					if (cfg.getInt(p.getUniqueId() + ".koenigint") == 1) {
						cfg1.set(p.getUniqueId() + ".Koenig-Kit", true);
						try {
							cfg1.save(f1);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					} else {
						cfg.set(p.getUniqueId() + ".koenigint", (cfg.getInt(p.getUniqueId() + ".koenigint") - 1));
						try {
							cfg.save(f);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}

					Kit_Items.addExpertItems(p);
					p.closeInventory();
					p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1L, 1L);
					this.expertdelay.put(p.getUniqueId(), time);

					break;
				}
				case "§6König": {
					e.setCancelled(true);

					if (!cfg1.getBoolean(p.getUniqueId() + ".Koenig-Kit")) {
						p.sendMessage(Main.pre + "§cDu hast dieses Kit noch nicht freigeschaltet");
						p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1L, 1L);
						return;
					}

					Long time = System.currentTimeMillis();
					if (this.königdelay.containsKey(p.getUniqueId())) {
						Long lastUsage = this.königdelay.get(p.getUniqueId());
						if (lastUsage + 1000 * 60 * 150 > time) {
							p.sendMessage(Main.pre + "§cDu musst noch etwas warten");
							p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1L, 1L);
							return;

						}
					}


					Kit_Items.addKönigItems(p);
					p.closeInventory();
					p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1L, 1L);
					this.königdelay.put(p.getUniqueId(), time);

					break;
				}
				case "§6Master": {
					e.setCancelled(true);

					if (!PermissionsEx.getUser(p).inGroup("Master") || !PermissionsEx.getUser(p).inGroup("Hero") || !PermissionsEx.getUser(p).inGroup("YouTuber") || !PermissionsEx.getUser(p).inGroup("Builder") || !PermissionsEx.getUser(p).inGroup("Supporter") || !PermissionsEx.getUser(p).inGroup("Moderator") || !PermissionsEx.getUser(p).inGroup("Developer") || !PermissionsEx.getUser(p).inGroup("Admin") || !PermissionsEx.getUser(p).inGroup("Owner")) {
						p.sendMessage(Main.pre + "§cFür dieses Kit brauchst du mindestens den §dMaster-Rang");
						p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1L, 1L);
						return;
					} else {

						Long time = System.currentTimeMillis();
						if (this.masterdelay.containsKey(p.getUniqueId())) {
							Long lastUsage = this.masterdelay.get(p.getUniqueId());
							if (lastUsage + 1000 * 60 * 90 > time) {
								p.sendMessage(Main.pre + "§cDu musst noch etwas warten");
								p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1L, 1L);
								return;

							}
						}


						Kit_Items.addMasterItems(p);
						p.closeInventory();
						p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1L, 1L);
						this.masterdelay.put(p.getUniqueId(), time);

						break;
					}
				}
				case "§6Hero": {
					e.setCancelled(true);

					if (PermissionsEx.getUser(p).inGroup("Hero") || PermissionsEx.getUser(p).inGroup("YouTuber") || PermissionsEx.getUser(p).inGroup("Builder") || PermissionsEx.getUser(p).inGroup("Supporter") || PermissionsEx.getUser(p).inGroup("Moderator") || PermissionsEx.getUser(p).inGroup("Developer") || PermissionsEx.getUser(p).inGroup("Admin") || PermissionsEx.getUser(p).inGroup("Owner")) {

						Long time = System.currentTimeMillis();
						if (this.herodelay.containsKey(p.getUniqueId())) {
							Long lastUsage = this.herodelay.get(p.getUniqueId());
							if (lastUsage + 1000 * 60 * 90 > time) {
								p.sendMessage(Main.pre + "§cDu musst noch etwas warten");
								p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1L, 1L);
								return;

							}
						}


						Kit_Items.addHeroItems(p);
						p.closeInventory();
						p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1L, 1L);
						this.herodelay.put(p.getUniqueId(), time);

						break;
					}else {
						p.sendMessage(Main.pre + "§cFür dieses Kit brauchst du mindestens den §9Hero-Rang");
						p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1L, 1L);
						return;
					}
				}
			}
		}
	}
}

