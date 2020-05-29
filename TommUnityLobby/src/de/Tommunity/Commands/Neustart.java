package de.Tommunity.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.scheduler.BukkitRunnable;

import de.Tommunity.Main.Main;

public class Neustart implements CommandExecutor, Listener {

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		Player p = (Player)cs;
		if(p.hasPermission("Tom.neustart"))
		for(Player all : Bukkit.getOnlinePlayers()) {
			
			    	
			all.sendMessage("§c§lSERVER §8§l» §7Server Neustart in 2 Minuten!");
			new BukkitRunnable() {
			    @Override
			    public void run() {
			    	all.sendMessage("§c§lSERVER §8§l» §7Server Neustart in 1 Minute!");
					new BukkitRunnable() {
					    @Override
					    public void run() {
							all.sendMessage("§c§lSERVER §8§l» §7Server Neustart in 30 Sekunden!");
							new BukkitRunnable() {
							    @Override
							    public void run() {
							    	all.sendMessage("§c§lSERVER §8§l» §7Server Neustart in 20 Sekunden!");
									new BukkitRunnable() {
									    @Override
									    public void run() {
									    	all.sendMessage("§c§lSERVER §8§l» §7Server Neustart in 10 Sekunden!");
											new BukkitRunnable() {
											    @Override
											    public void run() {
											    	all.sendMessage("§c§lSERVER §8§l» §7Server Neustart in 5 Sekunden!");
											    	new BukkitRunnable() {
													    @Override
													    public void run() {
													    	all.sendMessage("§c§lSERVER §8§l» §7Server Neustart in 4 Sekunden!");
													        new BukkitRunnable() {
															    @Override
															    public void run() {
															    	all.sendMessage("§c§lSERVER §8§l» §7Server Neustart in 3 Sekunden!");
															        new BukkitRunnable() {
																	    @Override
																	    public void run() {
																	    	all.sendMessage("§c§lSERVER §8§l» §7Server Neustart in 2 Sekunden!");
																	        new BukkitRunnable() {
																			    @Override
																			    public void run() {
																			    	all.sendMessage("§c§lSERVER §8§l» §7Server Neustart in 1 Sekunden!");
																					new BukkitRunnable() {
																					    @Override
																					    public void run() {
																					    	all.sendMessage("§c§lSERVER §8§l» §7Server wird heruntergefahren!");
																							Bukkit.shutdown();
																					    }
																					}.runTaskLater(Main.getPlugin(), 10*1);
																			    }
																			}.runTaskLater(Main.getPlugin(), 10*2);
																	    }
																	}.runTaskLater(Main.getPlugin(), 10*3);
															    }
															}.runTaskLater(Main.getPlugin(), 10*4);
													    }
													}.runTaskLater(Main.getPlugin(), 10*5);
											    }
											}.runTaskLater(Main.getPlugin(), 10*10);
									    }
									}.runTaskLater(Main.getPlugin(), 10*20);
							    }
							}.runTaskLater(Main.getPlugin(), 10*30);
					    }
					}.runTaskLater(Main.getPlugin(), 10*60*1);
			    }
			}.runTaskLater(Main.getPlugin(), 10*60*2);

	}
		return false;
	}
}
