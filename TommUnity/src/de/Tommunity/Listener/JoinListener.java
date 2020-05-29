package de.Tommunity.Listener;

import java.io.IOException;

import de.Tommunity.API.TitleAPI.TitleAPI;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.Tommunity.Booster.Flybooster;
import de.Tommunity.Booster.Moneybooster;
import de.Tommunity.Booster.Xpbooster;
import de.Tommunity.Commands.EXpSystem;
import de.Tommunity.Commands.EconomySystem;
import de.Tommunity.Main.Main;
import de.Tommunity.utils.ScoreboardManager;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class JoinListener implements Listener {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	@EventHandler
	public void onJoinEvent(final PlayerJoinEvent e){
		Player p = (Player)e.getPlayer();
		p.setFlying(false);
	}

	@EventHandler
	public void LevelOnJoin(PlayerJoinEvent e) {
		final Player p = e.getPlayer();
		EconomySystem es = new EconomySystem();
		EXpSystem ex = new EXpSystem();

		TitleAPI.sendTitle(e.getPlayer(), 20, 20, 20, "§c§lWillkommen auf");
		TitleAPI.sendSubtitle(e.getPlayer(), 20, 20, 20,"§6§lMinecraft Science");


		if(p.hasPermission("Tom.erstattung.21.03")){
			PermissionsEx.getUser(p).removePermission("Tom.erstattung.21.03");
		}

		if(Kit.cfg.get(p.getUniqueId() + ".holzfaellerint") == null) {
			Kit.cfg.set(p.getUniqueId() + ".holzfaellerint", 40);
			Kit.cfg.set(p.getUniqueId() + ".magierint", 45);
			Kit.cfg.set(p.getUniqueId() + ".warzoneint", 50);
			Kit.cfg.set(p.getUniqueId() + ".mobint", 55);
			Kit.cfg.set(p.getUniqueId() + ".expertint", 60);
			Kit.cfg.set(p.getUniqueId() + ".koenigint", 65);
			try {
				Kit.cfg.save(Kit.f);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		}
		
		if(Kit.cfg1.get(p.getUniqueId() + ".Starter-Kit") == null) {
			Kit.cfg1.set(p.getUniqueId() + ".Starter-Kit", true);
			Kit.cfg1.set(p.getUniqueId() + ".Holzfaeller-Kit", false);
			Kit.cfg1.set(p.getUniqueId() + ".Magier-Kit", false);
			Kit.cfg1.set(p.getUniqueId() + ".Warzone-Kit", false);
			Kit.cfg1.set(p.getUniqueId() + ".Mob-Kit", false);
			Kit.cfg1.set(p.getUniqueId() + ".Expert-Kit", false);
			Kit.cfg1.set(p.getUniqueId() + ".Koenig-Kit", false);
			try {
				Kit.cfg1.save(Kit.f1);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	@EventHandler
	public void handlePlayerJoin(PlayerJoinEvent e) {
		final Player p = e.getPlayer();

		p.setGameMode(GameMode.SURVIVAL);

		Flybooster fb = new Flybooster();
        if(Main.getPlugin().getBoostermanager().getAktivboost().stream().anyMatch((b -> b.getName().equals(fb.getName())))) {
            p.setAllowFlight(true);
            p.setFlying(true);
            p.sendMessage(Main.pre + "§aDu kannst nun fliegen, da ein §d§lFly-Booster §aaktiv ist");

        }
        Xpbooster xp = new Xpbooster();
        if(Main.getPlugin().getBoostermanager().getAktivboost().stream().anyMatch((b -> b.getName().equals(xp.getName())))) {
                p.sendMessage(Main.pre + "§aDerzeit ist ein §d§lXp-Booster §aaktiv");

        }
        Moneybooster money = new Moneybooster();
        if(Main.getPlugin().getBoostermanager().getAktivboost().stream().anyMatch((b -> b.getName().equals(money.getName())))) {
                p.sendMessage(Main.pre + "§aDerzeit ist ein §d§lMoney-Booster §aaktiv");
        }

		if (!p.hasPlayedBefore()) {
			PermissionsEx.getUser(p.getName()).addGroup("Spieler");
			PermissionsEx.getUser(p.getName()).addPermission("Spieler");
			PermissionsEx.getUser(p.getName()).addPermission("minenreset.1");
			EconomySystem es = new EconomySystem();
			es.addMoney(p.getUniqueId(), 1000);
		}

		e.setJoinMessage("");

        FileConfiguration config = Main.getPlugin().getConfig();
        World world = Bukkit.getWorld(config.getString("Spawn.World"));
        double x = config.getDouble("Spawn.X");
        double y = config.getDouble("Spawn.Y");
        double z = config.getDouble("Spawn.Z");
        float yaw = (float) config.getDouble("Spawn.Yaw");
        float pitch = (float) config.getDouble("Spawn.Pitch");
        Location location = new Location(world, x, y, z, yaw, pitch);
        p.teleport(location);

		ScoreboardManager.sendTabAndScoreboard(p);
        for(Player all : Bukkit.getOnlinePlayers()) {
			ScoreboardManager.sendTabAndScoreboard(all);
		}
	}

	@EventHandler
	public void onJoin1(PlayerJoinEvent e) {
		EXpSystem Ex = new EXpSystem();
		Player p = (Player)e.getPlayer();
		
		ItemStack item1 = new ItemStack(Material.STICK);
		ItemMeta im = item1.getItemMeta();
		im.setDisplayName("§cLevelupcase §fLvl. 1-5");
		im.addEnchant(Enchantment.KNOCKBACK, 2, false);
		item1.setItemMeta(im);

		ItemStack item12 = new ItemStack(Material.EMERALD);
		ItemMeta im2 = item12.getItemMeta();
		im2.setDisplayName("§cLevelupcase §fLvl. 5-10");
		im2.addEnchant(Enchantment.KNOCKBACK, 2, false);
		item12.setItemMeta(im2);

		ItemStack item2 = new ItemStack(Material.GOLD_INGOT);
		ItemMeta im21 = item12.getItemMeta();
		im21.setDisplayName("§cLevelupcase §fLvl. 10-30");
		im21.addEnchant(Enchantment.KNOCKBACK, 2, false);
		item2.setItemMeta(im21);

		
		String prefix = "";

		if (PermissionsEx.getUser(p).inGroup("Admin")) {
			prefix = "Admin.";
		} else if (PermissionsEx.getUser(p).inGroup("Developer")) {
			prefix = "Dev.";
		} else if (PermissionsEx.getUser(p).inGroup("Moderator")) {
			prefix = "Mod.";
		} else if (PermissionsEx.getUser(p).inGroup("Supporter")) {
			prefix = "Sup.";
		} else if (PermissionsEx.getUser(p).inGroup("Builder")) {
			prefix = "Builder.";
		} else if (PermissionsEx.getUser(p).inGroup("YouTuber")) {
			prefix = "YT.";
		} else if (PermissionsEx.getUser(p).inGroup("Hero")) {
			prefix = "Hero.";
		} else if (PermissionsEx.getUser(p).inGroup("Master")) {
			prefix = "Master.";
		} else if (PermissionsEx.getUser(p).inGroup("Business")) {
			prefix = "Business.";
		}
		
		checkLevelUp(p, "Spieler", prefix + "rank.2", 10000, Ex, item1);
		checkLevelUp(p, prefix + "rank.2", prefix + "rank.3", 15000, Ex, item1);
		checkLevelUp(p, prefix + "rank.3", prefix + "rank.4", 20000, Ex, item1);
		checkLevelUp(p, prefix + "rank.4", prefix + "rank.5", 25000, Ex, item1);
		checkLevelUp(p, prefix + "rank.5", prefix + "rank.6", 30000, Ex, item12);
		checkLevelUp(p, prefix + "rank.6", prefix + "rank.7", 50000, Ex, item12);
		checkLevelUp(p, prefix + "rank.7", prefix + "rank.8", 80000, Ex, item12);
		checkLevelUp(p, prefix + "rank.8", prefix + "rank.9", 100000, Ex, item12);
		checkLevelUp(p, prefix + "rank.9", prefix + "rank.10", 200000, Ex, item12);
		checkLevelUp(p, prefix + "rank.10", prefix + "rank.11", 215000, Ex, item2);
		checkLevelUp(p, prefix + "rank.11", prefix + "rank.12", 230000, Ex, item2);
		checkLevelUp(p, prefix + "rank.12", prefix + "rank.13", 250000, Ex, item2);
		checkLevelUp(p, prefix + "rank.13", prefix + "rank.14", 300000, Ex, item2);
		checkLevelUp(p, prefix + "rank.14", prefix + "rank.15", 350000, Ex, item2);
		checkLevelUp(p, prefix + "rank.15", prefix + "rank.16", 380000, Ex, item2);
		checkLevelUp(p, prefix + "rank.16", prefix + "rank.17", 410000, Ex, item2);
		checkLevelUp(p, prefix + "rank.17", prefix + "rank.18", 470000, Ex, item2);
		checkLevelUp(p, prefix + "rank.18", prefix + "rank.19", 515000, Ex, item2);
		checkLevelUp(p, prefix + "rank.19", prefix + "rank.20", 540000, Ex, item2);
		checkLevelUp(p, prefix + "rank.20", prefix + "rank.21", 580000, Ex, item2);
		checkLevelUp(p, prefix + "rank.21", prefix + "rank.22", 630000, Ex, item2);
		checkLevelUp(p, prefix + "rank.22", prefix + "rank.23", 650000, Ex, item2);
		checkLevelUp(p, prefix + "rank.23", prefix + "rank.24", 680000, Ex, item2);
		checkLevelUp(p, prefix + "rank.24", prefix + "rank.25", 710000, Ex, item2);
		checkLevelUp(p, prefix + "rank.25", prefix + "rank.26", 760000, Ex, item2);
		checkLevelUp(p, prefix + "rank.26", prefix + "rank.27", 800000, Ex, item2);
		checkLevelUp(p, prefix + "rank.27", prefix + "rank.28", 850000, Ex, item2);
		checkLevelUp(p, prefix + "rank.28", prefix + "rank.29", 900000, Ex, item2);
		checkLevelUp(p, prefix + "rank.29", prefix + "rank.30", 1000000, Ex, item2);


		
		if (p.hasPermission("Tom.levelupcaseget1")) {
			return;
		}
		PermissionsEx.getUser(p).addPermission("Tom.levelupcaseget1");

		for (String permission : PermissionsEx.getUser(p).getPermissions("world")) {
			if (permission.indexOf("rank.2") >= 0) {
				addItemXTimes(p, item1, 1);
			}
			if (permission.indexOf("rank.3") >= 0) {
				addItemXTimes(p, item1, 2);
			}
			if (permission.indexOf("rank.4") >= 0) {
				addItemXTimes(p, item1, 3);
			}
			if (permission.indexOf("rank.5") >= 0) {
				addItemXTimes(p, item1, 4);
			}
			if (permission.indexOf("rank.6") >= 0) {
				addItemXTimes(p, item12, 5);
			}
			if (permission.indexOf("rank.7") >= 0) {
				addItemXTimes(p, item12, 6);
			}
			if (permission.indexOf("rank.8") >= 0) {
				addItemXTimes(p, item12, 7);
			}
			if (permission.indexOf("rank.9") >= 0) {
				addItemXTimes(p, item12, 8);
			}
			if (permission.indexOf("rank.10") >= 0) {
				addItemXTimes(p, item12, 9);
			}
		}
		
	}
	
	
	private void addItemXTimes(Player p, ItemStack is, int count) {
		for (int i = 0; i <= count; ++i) {
			p.getInventory().addItem(is);
		}
	}

	private void checkLevelUp(Player p, String oldRank, String newRank, int threshold, EXpSystem ex, ItemStack i) {
		if (p.hasPermission(oldRank)) {
			if (ex.hasEnoughEXP(p.getUniqueId(), threshold)) {
				PermissionsEx.getUser(p).removePermission(oldRank);
				PermissionsEx.getUser(p).addPermission(newRank);
				p.sendMessage(Main.pre + "§3Du bist im Level aufgestiegen");
				p.playSound(p.getLocation(), Sound.FIREWORK_LAUNCH, 1, 1);
				ex.removeEXP(p.getUniqueId(), threshold);
				p.getInventory().addItem(i);
			}
		}
	}

}