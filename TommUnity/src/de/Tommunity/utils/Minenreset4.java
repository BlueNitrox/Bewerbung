package de.Tommunity.utils;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Tommunity.Main.Main;

public class Minenreset4 implements CommandExecutor {


	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		Player p = (Player)cs;
		if(p.hasPermission("minenreset.4")) {
			
			Location loc11 = new Location(Bukkit.getWorld("world"), -40, 63, -11);
			int x4 = loc11.getBlockX();
			int y4 = loc11.getBlockY();
			int z4 = loc11.getBlockZ();
			World w1 = loc11.getWorld();
			Location loc1 = new Location(w1, x4, y4, z4);
			
			Location l = new Location(Bukkit.getWorld("world"), -32, 62, 9);
			int x = l.getBlockX();
			int y = l.getBlockY();
			int z = l.getBlockZ();
			World w = l.getWorld();
			Location loc = new Location(w, x, y, z);
			
			Location l2 = new Location(Bukkit.getWorld("world"), -50, 47, -9);
			int x2 = l2.getBlockX();
			int y2 = l2.getBlockY();
			int z2 = l2.getBlockZ();
			World w2 = l2.getWorld();
			Location loc2 = new Location(w2, x2, y2, z2);
			
			
				int minX = Math.min(l.getBlockX(), l2.getBlockX());
				int minY = Math.min(l.getBlockY(), l2.getBlockY());
				int minZ = Math.min(l.getBlockZ(), l2.getBlockZ());
				int maxX = Math.max(l.getBlockX(), l2.getBlockX());
				int maxY = Math.max(l.getBlockY(), l2.getBlockY());
				int maxZ = Math.max(l.getBlockZ(), l2.getBlockZ());
				
				for(int x3 = minX; x3 <= maxX; x3++){
				  for(int y3 = minY; y3 <= maxY; y3++){
				    for(int z3 = minZ; z3 <= maxZ; z3++){
				      Block block = w.getBlockAt(x3, y3, z3);
				      for (Player all: Bukkit.getOnlinePlayers()) {
			    		  if(all.getLocation().getBlockX() >= -50 && all.getLocation().getBlockX() <= -32 ) {
			    			  if(all.getLocation().getBlockY() >=47 && all.getLocation().getBlockY() <= 62 ) {
			    				  if(all.getLocation().getBlockZ() >=-9 && all.getLocation().getBlockZ() <= 9 ) {
			    					  all.teleport(loc11);
			    				  }
			    				  
			    			  }
			    		  }
			      }
				        block.setType(Material.NETHER_BRICK);
				    }
				  }
				}
				p.sendMessage(Main.pre + "§3Du hast die Mine Erfolgreich zurückgesetzt!");
				p.playSound(p.getLocation(), Sound.EXPLODE, 2, 2);
				    }else p.sendMessage(Main.pre + "§cDazu hast du keine Rechte!");
		return false;
	}


}
