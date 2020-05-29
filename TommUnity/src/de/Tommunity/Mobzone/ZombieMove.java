package de.Tommunity.Mobzone;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerMoveEvent;

import de.Tommunity.Commands.EXpSystem;
import de.Tommunity.Main.Main;
import de.Tommunity.utils.Arena;

public class ZombieMove implements Listener {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	@EventHandler
	public void onMove(PlayerMoveEvent e) {
		Player p = e.getPlayer();
			if(p.getWorld().getName().equals("mob")) {
				if ((p.getLocation().getBlockY() >= 0
						&& p.getLocation().getBlockY() <=50 )) {
		                FileConfiguration config = Main.getPlugin().getConfig();
		                World world = Bukkit.getWorld(config.getString("Mobzone.World"));
		                double x = config.getDouble("Mobzone.X");
		                double y = config.getDouble("Mobzone.Y");
		                double z = config.getDouble("Mobzone.Z");
		                float yaw = (float) config.getDouble("Mobzone.Yaw");
		                float pitch = (float) config.getDouble("Mobzone.Pitch");
		                Location location = new Location(world, x, y, z, yaw, pitch);
		                p.teleport(location);

		                if(Arena.warte.contains(p)) {
		                	Arena.warte.clear();
		                }
		                if(Arena.warteno.contains(p)) {
		                	Arena.warteno.clear();
		                }
						
				}
					}
	}


	@EventHandler
	public void onKill(EntityDeathEvent e){
		Zombie z = (Zombie) e.getEntity();
		Player p = (Player) e.getEntity().getKiller();
		if(z instanceof Zombie){
			Zombies z1 = new Zombies();
			EXpSystem ex = new EXpSystem();
			ex.addEXP(p.getUniqueId(), 1);
			z1.addzombie(p.getUniqueId(), 1);
			return;
		} else if (z instanceof Spider) {
			EXpSystem ex = new EXpSystem();
			ex.addEXP(p.getUniqueId(), 1);
			return;
		}
	}
	
}
