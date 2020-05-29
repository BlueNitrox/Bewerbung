package de.Tommunity.utils;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

import de.Tommunity.Booster.BoosterAPI;
import de.Tommunity.Commands.EXpSystem;
import de.Tommunity.Commands.EconomySystem;
import de.Tommunity.Main.Main;

public class RareCase {

	private final Main plugin;
	private BukkitTask task;
	
	public RareCase(Main plugin) {
		this.plugin = plugin;
		
	}

	public List<ItemStack> getItem(){
		RareCaseItem rare = new RareCaseItem(plugin);
		return rare.getRareCaseContent();
	}
	public void startAnimation(Player p) {
		List<ItemStack> temp = getItem();
		
		Collections.shuffle(temp);
		
		Inventory inv = Bukkit.getServer().createInventory(null, 27, "§6§lRare-Case");
		ItemStack glas = new ItemStack(Material.STAINED_GLASS_PANE,1, (short) 15);
		
		ItemStack hopper = new ItemStack(Material.HOPPER);
		ItemMeta im = hopper.getItemMeta();
		im.setDisplayName("§7Dieses Item wirst du bekommen");
		hopper.setItemMeta(im);
		
		for(int i = 0; i != 9; i++) {
			inv.setItem(i, glas);
		}
		for(int i = 18; i != 27; i++) {
			inv.setItem(i, glas);
		}
		inv.setItem(4, hopper);
		p.openInventory(inv);
		p.playSound(p.getLocation(), Sound.CHEST_OPEN, 10L, 10L);
		
		new BukkitRunnable() {

			private final Player curr = p;
			private long sleep = 0;
			private int turns = 40;
			@Override
			public void run() {
				if(curr == null) this.cancel();
				
				int id = 0;
				
				for(int i = 9; i <= 17; i++) {
					if(temp.get(id) != null) {
					inv.setItem(i, temp.get(id));
					}
					id++;
				}
				temp.add(temp.get(0));
				temp.remove(0);
				
				if(p.getOpenInventory() == null) {
					this.cancel();
					task.cancel();
					final ItemStack i = temp.get(new Random().nextInt(temp.size() - 1));
					p.getInventory().addItem(i);
					p.sendMessage(Main.pre + "§aDu hast §e" + i.getAmount() + "x "+ i.getItemMeta().getDisplayName() + " §agewonnen" );
					p.playSound(p.getLocation(), Sound.NOTE_PLING, 1L, 1L);

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
				}
				turns --;
				
				
				if(turns <=10) {
					sleep = sleep +100;

					task = Main.getPlugin().getServer().getScheduler().runTaskTimerAsynchronously(plugin, this , sleep , sleep);
				}
				if(sleep == 1000) {
					this.cancel();
					task.cancel();
					if(inv.getItem(13).getItemMeta().getDisplayName().equals("§d§l1x Money-Booster")) {
						BoosterAPI ba = new BoosterAPI();
						ba.addMoneyBooster(p.getUniqueId(), 1);
						p.sendMessage(Main.pre + "§aDu hast §e" + inv.getItem(13).getItemMeta().getDisplayName() + " §agewonnen" );
						return;
					}
					if(inv.getItem(13).getItemMeta().getDisplayName().equals("§6100 exp")) {
						EXpSystem ex = new EXpSystem();
						ex.addEXP(p.getUniqueId(), 100);
						p.sendMessage(Main.pre + "§aDu hast §6100 exp §agewonnen" );
						return;
					}
					if(inv.getItem(13).getItemMeta().getDisplayName().equals("§61.000$ für alle")) {
						for(Player all : Bukkit.getOnlinePlayers()) {
							EconomySystem es = new EconomySystem();
							es.addMoney(all.getUniqueId(), 1000);
							Bukkit.broadcastMessage(Main.pre + "§6" + p.getName() + " §ahat aus der §dMaster-Chest §e1.000$ §afür alle gewonnen");
							return;
						}
					}
					p.getInventory().addItem(inv.getItem(12));
					p.sendMessage(Main.pre + "§aDu hast §e" + inv.getItem(12).getAmount() + "x "+ inv.getItem(12).getItemMeta().getDisplayName() + " §agewonnen" );
					p.closeInventory();
					p.playSound(p.getLocation(), Sound.NOTE_PLING, 1L, 1L);
					GottCaseItem.CaseOpen = false;
					
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
				}
			}
			
		}.runTaskTimer(plugin, 0, 5);
	
			
	
	}
	
	
}