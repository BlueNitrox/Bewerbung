package de.Tommunity.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.scheduler.BukkitRunnable;

import de.Tommunity.Listener.BreakListener;
import de.Tommunity.Main.Main;

public class Serverneustart implements CommandExecutor, Listener {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		Player p = (Player) cs;
		if (p.hasPermission("Tom.neustart")) {
			for (Player all : Bukkit.getOnlinePlayers()) {

				all.sendMessage("§8[]==================================[]");
				all.sendMessage("§8• §c§lMITTEILUNG §8•");
				all.sendMessage("§8» §7Server startet in 2 Minuten Neu!");
				all.sendMessage("§8[]==================================[]");
				new BukkitRunnable() {
					@Override
					public void run() {
						all.sendMessage("§8[]==================================[]");
						all.sendMessage("§8• §c§lMITTEILUNG §8•");
						all.sendMessage("§8» §7Server startet in 1 Minuten Neu!");
						all.sendMessage("§8[]==================================[]");
						new BukkitRunnable() {
							@Override
							public void run() {
								all.sendMessage("§8[]==================================[]");
								all.sendMessage("§8• §c§lMITTEILUNG §8•");
								all.sendMessage("§8» §7Server startet in 30 Sekunden Neu!");
								all.sendMessage("§8[]==================================[]");
								new BukkitRunnable() {
									@Override
									public void run() {
										all.sendMessage("§8[]==================================[]");
										all.sendMessage("§8• §c§lMITTEILUNG §8•");
										all.sendMessage("§8» §7Server startet in 20 Sekunden Neu!");
										all.sendMessage("§8[]==================================[]");
										new BukkitRunnable() {
											@Override
											public void run() {
												all.sendMessage("§8[]==================================[]");
												all.sendMessage("§8• §c§lMITTEILUNG §8•");
												all.sendMessage("§8» §7Server startet in 10 Sekunden Neu!");
												all.sendMessage("§8[]==================================[]");
												new BukkitRunnable() {
													@Override
													public void run() {
														all.sendMessage("§8[]==================================[]");
														all.sendMessage("§8• §c§lMITTEILUNG §8•");
														all.sendMessage("§8» §7Server startet in 5 Sekunden Neu!");
														all.sendMessage("§8[]==================================[]");
														new BukkitRunnable() {
															@Override
															public void run() {
																all.sendMessage("§8[]==================================[]");
																all.sendMessage("§8• §c§lMITTEILUNG §8•");
																all.sendMessage("§8» §7Server startet in 4 Sekunden Neu!");
																all.sendMessage("§8[]==================================[]");
																new BukkitRunnable() {
																	@Override
																	public void run() {
																		all.sendMessage("§8[]==================================[]");
																		all.sendMessage("§8• §c§lMITTEILUNG §8•");
																		all.sendMessage("§8» §7Server startet in 3 Sekunden Neu!");
																		all.sendMessage("§8[]==================================[]");
																		new BukkitRunnable() {
																			@Override
																			public void run() {
																				all.sendMessage("§8[]==================================[]");
																				all.sendMessage("§8• §c§lMITTEILUNG §8•");
																				all.sendMessage("§8» §7Server startet in 2 Sekunden Neu!");
																				all.sendMessage("§8[]==================================[]");
																				new BukkitRunnable() {
																					@Override
																					public void run() {
																						all.sendMessage("§8[]==================================[]");
																						all.sendMessage("§8• §c§lMITTEILUNG §8•");
																						all.sendMessage("§8» §7Server startet in 1 Sekunden Neu!");
																						all.sendMessage("§8[]==================================[]");
																						new BukkitRunnable() {
																							@Override
																							public void run() {
																								all.sendMessage("§8[]==================================[]");
																								all.sendMessage("§8• §c§lMITTEILUNG §8•");
																								all.sendMessage("§8» §7Server wird heruntergefahren!");
																								all.sendMessage("§8[]==================================[]");

																								Bukkit.shutdown();
																								BreakListener.getDay.clear();
																								BreakListener.inDay.clear();
																							}
																						}.runTaskLater(Main.getPlugin(),
																								10 * 1);
																					}
																				}.runTaskLater(Main.getPlugin(),
																						10 * 2);
																			}
																		}.runTaskLater(Main.getPlugin(), 10 * 3);
																	}
																}.runTaskLater(Main.getPlugin(), 10 * 4);
															}
														}.runTaskLater(Main.getPlugin(), 10 * 5);
													}
												}.runTaskLater(Main.getPlugin(), 10 * 10);
											}
										}.runTaskLater(Main.getPlugin(), 10 * 20);
									}
								}.runTaskLater(Main.getPlugin(), 10 * 30);
							}
						}.runTaskLater(Main.getPlugin(), 10 * 60 * 1);
					}
				}.runTaskLater(Main.getPlugin(), 10 * 60 * 2);
			}
		} else
			p.sendMessage(Main.err);
		return false;
	}
}
