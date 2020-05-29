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

import de.Tommunity.Main.Main;

public class Chest_ManagerHero extends Thread {

	private final Main plugin;
	private BukkitTask task;

	public Chest_ManagerHero(Main plugin) {
		this.plugin = plugin;
	}
	
	public List<ItemStack> getItem(){
		Chest_Listener cl = new Chest_Listener(plugin);
		return cl.getHeroChestContent();
	}
	public void startAnimation(Player p) {
		List<ItemStack> temp = getItem();
		
		Collections.shuffle(temp);
		
		Inventory inv = Bukkit.getServer().createInventory(null, 27, "§9Hero-Chest");
		ItemStack glas = new ItemStack(Material.STAINED_GLASS_PANE,1, (short) 15);
		ItemMeta glass = glas.getItemMeta();
		glass.setDisplayName("§7Glasscheibe");
		glas.setItemMeta(glass);
		
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
					p.sendMessage(Main.pre + "§aDu hast §e" + inv.getItem(12).getAmount() + "x "+ inv.getItem(12).getItemMeta().getDisplayName() + " §agewonnen" );
					p.closeInventory();
					p.playSound(p.getLocation(), Sound.NOTE_PLING, 1L, 1L);

					p.getInventory().addItem(inv.getItem(12));
				}
			}
			
		}.runTaskTimer(plugin, 0, 5);
	
			
			
	
	}
	
	
}