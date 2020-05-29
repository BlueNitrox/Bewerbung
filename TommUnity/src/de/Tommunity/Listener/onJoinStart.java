package de.Tommunity.Listener;

import java.util.Random;

import com.connorlinfoot.actionbarapi.ActionBarAPI;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scheduler.BukkitRunnable;

import de.Tommunity.Enchant.Perk;
import de.Tommunity.Main.Main;



public class onJoinStart implements Listener {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	public static int count;
	public boolean start;

	@EventHandler
	public void onJoin1(PlayerJoinEvent e){
		Player p = e.getPlayer();
		ActionBarAPI.sendActionBar(p, "§b» §7Inventar Laden §a§labgeschlossen!", 20*5);
	}

	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();


		if(p.hasPermission("Perk.Stärke")) {
			if(!(Perk.Perkst.contains(p))) {
				Perk.Perkst.add(p);
			}
		}
		if(p.hasPermission("Perk.Nohunger")) {
			if(!(Perk.Perkno.contains(p))) {
				Perk.Perkno.add(p);
			}
		}

		if(start == false) {
			start = true;
			if (count <= 10) {
				count = 11;
				new BukkitRunnable() {
					@Override
					public void run() {
						Random r = new Random();
						int z = r.nextInt(16);

						count = 0;
						switch (z) {
							case 1:
								Location loc11 = new Location(Bukkit.getWorld("world"), 115, 120, 13);
								int x4 = loc11.getBlockX();
								int y4 = loc11.getBlockY();
								int z4 = loc11.getBlockZ();
								World w1 = loc11.getWorld();
								Block block = w1.getBlockAt(x4, y4, z4);
								block.setType(Material.ENDER_PORTAL_FRAME);

								Location loc111 = new Location(Bukkit.getWorld("world"), 138, 119, 2);
								int x41 = loc111.getBlockX();
								int y41 = loc111.getBlockY();
								int z41 = loc111.getBlockZ();
								World w11 = loc111.getWorld();
								Block block1 = w11.getBlockAt(x41, y41, z41);
								block1.setType(Material.ENDER_PORTAL_FRAME);

								Location loc1111 = new Location(Bukkit.getWorld("world"), 139, 97, -23);
								int x411 = loc1111.getBlockX();
								int y411 = loc1111.getBlockY();
								int z411 = loc1111.getBlockZ();
								World w111 = loc1111.getWorld();
								Block block11 = w111.getBlockAt(x411, y411, z411);
								block11.setType(Material.ENDER_PORTAL_FRAME);
								break;

							case 2:
								Location loc22 = new Location(Bukkit.getWorld("world"), 135, 119, -7);
								int x3 = loc22.getBlockX();
								int y3 = loc22.getBlockY();
								int z3 = loc22.getBlockZ();
								World w2 = loc22.getWorld();
								Block block2 = w2.getBlockAt(x3, y3, z3);
								block2.setType(Material.ENDER_PORTAL_FRAME);

								Location loc222 = new Location(Bukkit.getWorld("world"), 150, 129, -12);
								int x32 = loc222.getBlockX();
								int y32 = loc222.getBlockY();
								int z32 = loc222.getBlockZ();
								World w22 = loc222.getWorld();
								Block block3 = w22.getBlockAt(x32, y32, z32);
								block3.setType(Material.ENDER_PORTAL_FRAME);

								Location loc2222 = new Location(Bukkit.getWorld("world"), 122, 102, -22);
								int x322 = loc2222.getBlockX();
								int y322 = loc2222.getBlockY();
								int z322 = loc2222.getBlockZ();
								World w222 = loc2222.getWorld();
								Block block22 = w222.getBlockAt(x322, y322, z322);
								block22.setType(Material.ENDER_PORTAL_FRAME);
								break;

							case 3:
								Location loc55 = new Location(Bukkit.getWorld("world"), 139, 99, -31);
								int x5 = loc55.getBlockX();
								int y5 = loc55.getBlockY();
								int z5 = loc55.getBlockZ();
								World w5 = loc55.getWorld();
								Block block5 = w5.getBlockAt(x5, y5, z5);
								block5.setType(Material.ENDER_PORTAL_FRAME);

								Location loc555 = new Location(Bukkit.getWorld("world"), 127, 98, -42);
								int x55 = loc555.getBlockX();
								int y55 = loc555.getBlockY();
								int z55 = loc555.getBlockZ();
								World w55 = loc555.getWorld();
								Block block55 = w55.getBlockAt(x55, y55, z55);
								block55.setType(Material.ENDER_PORTAL_FRAME);

								Location loc5555 = new Location(Bukkit.getWorld("world"), 178, 90, -77);
								int x555 = loc5555.getBlockX();
								int y555 = loc5555.getBlockY();
								int z555 = loc5555.getBlockZ();
								World w555 = loc5555.getWorld();
								Block block555 = w555.getBlockAt(x555, y555, z555);
								block555.setType(Material.ENDER_PORTAL_FRAME);
								break;
							case 4:
								Location loc77 = new Location(Bukkit.getWorld("world"), 178, 90, -77);
								int x7 = loc77.getBlockX();
								int y7 = loc77.getBlockY();
								int z7 = loc77.getBlockZ();
								World w7 = loc77.getWorld();
								Block block7 = w7.getBlockAt(x7, y7, z7);
								block7.setType(Material.ENDER_PORTAL_FRAME);

								Location loc777 = new Location(Bukkit.getWorld("world"), 177, 90, -29);
								int x77 = loc777.getBlockX();
								int y77 = loc777.getBlockY();
								int z77 = loc777.getBlockZ();
								World w77 = loc777.getWorld();
								Block block77 = w77.getBlockAt(x77, y77, z77);
								block77.setType(Material.ENDER_PORTAL_FRAME);

								Location loc7777 = new Location(Bukkit.getWorld("world"), 153, 127, 10);
								int x777 = loc7777.getBlockX();
								int y777 = loc7777.getBlockY();
								int z777 = loc7777.getBlockZ();
								World w777 = loc7777.getWorld();
								Block block777 = w777.getBlockAt(x777, y777, z777);
								block777.setType(Material.ENDER_PORTAL_FRAME);
								break;
							case 5:
								Location loc88 = new Location(Bukkit.getWorld("world"), 124, 122, 10);
								int x8 = loc88.getBlockX();
								int y8 = loc88.getBlockY();
								int z8 = loc88.getBlockZ();
								World w8 = loc88.getWorld();
								Block block8 = w8.getBlockAt(x8, y8, z8);
								block8.setType(Material.ENDER_PORTAL_FRAME);

								Location loc888 = new Location(Bukkit.getWorld("world"), 117, 120, 11);
								int x88 = loc888.getBlockX();
								int y88 = loc888.getBlockY();
								int z88 = loc888.getBlockZ();
								World w88 = loc888.getWorld();
								Block block88 = w88.getBlockAt(x88, y88, z88);
								block88.setType(Material.ENDER_PORTAL_FRAME);

								Location loc8888 = new Location(Bukkit.getWorld("world"), 150, 109, 2);
								int x888 = loc8888.getBlockX();
								int y888 = loc8888.getBlockY();
								int z888 = loc8888.getBlockZ();
								World w888 = loc8888.getWorld();
								Block block888 = w888.getBlockAt(x888, y888, z888);
								block888.setType(Material.ENDER_PORTAL_FRAME);
								break;
							case 6:
								Location loc66 = new Location(Bukkit.getWorld("world"), 165, 124, 25);
								int x6 = loc66.getBlockX();
								int y6 = loc66.getBlockY();
								int z6 = loc66.getBlockZ();
								World w6 = loc66.getWorld();
								Block block6 = w6.getBlockAt(x6, y6, z6);
								block6.setType(Material.ENDER_PORTAL_FRAME);

								Location loc666 = new Location(Bukkit.getWorld("world"), 147, 120, 31);
								int x66 = loc666.getBlockX();
								int y66 = loc666.getBlockY();
								int z66 = loc666.getBlockZ();
								World w66 = loc666.getWorld();
								Block block66 = w66.getBlockAt(x66, y66, z66);
								block66.setType(Material.ENDER_PORTAL_FRAME);

								Location loc6666 = new Location(Bukkit.getWorld("world"), 139, 100, -24);
								int x666 = loc6666.getBlockX();
								int y666 = loc6666.getBlockY();
								int z666 = loc6666.getBlockZ();
								World w666 = loc6666.getWorld();
								Block block666 = w666.getBlockAt(x666, y666, z666);
								block666.setType(Material.ENDER_PORTAL_FRAME);
								break;
							case 7:
								Location loc99 = new Location(Bukkit.getWorld("world"), 139, 100, -24);
								int x9 = loc99.getBlockX();
								int y9 = loc99.getBlockY();
								int z9 = loc99.getBlockZ();
								World w9 = loc99.getWorld();
								Block block9 = w9.getBlockAt(x9, y9, z9);
								block9.setType(Material.ENDER_PORTAL_FRAME);

								Location loc999 = new Location(Bukkit.getWorld("world"), 173, 90, -45);
								int x99 = loc999.getBlockX();
								int y99 = loc999.getBlockY();
								int z99 = loc999.getBlockZ();
								World w99 = loc999.getWorld();
								Block block99 = w99.getBlockAt(x99, y99, z99);
								block99.setType(Material.ENDER_PORTAL_FRAME);

								Location loc9999 = new Location(Bukkit.getWorld("world"), 158, 86, -43);
								int x999 = loc9999.getBlockX();
								int y999 = loc9999.getBlockY();
								int z999 = loc9999.getBlockZ();
								World w999 = loc9999.getWorld();
								Block block999 = w999.getBlockAt(x999, y999, z999);
								block999.setType(Material.ENDER_PORTAL_FRAME);
								break;
							case 8:
								Location loc00 = new Location(Bukkit.getWorld("world"), 149, 85, -46);
								int x0 = loc00.getBlockX();
								int y0 = loc00.getBlockY();
								int z0 = loc00.getBlockZ();
								World w0 = loc00.getWorld();
								Block block0 = w0.getBlockAt(x0, y0, z0);
								block0.setType(Material.ENDER_PORTAL_FRAME);

								Location loc000 = new Location(Bukkit.getWorld("world"), 141, 93, -39);
								int x00 = loc000.getBlockX();
								int y00 = loc000.getBlockY();
								int z00 = loc000.getBlockZ();
								World w00 = loc000.getWorld();
								Block block00 = w00.getBlockAt(x00, y00, z00);
								block00.setType(Material.ENDER_PORTAL_FRAME);

								Location loc0000 = new Location(Bukkit.getWorld("world"), 135, 108, 11);
								int x000 = loc0000.getBlockX();
								int y000 = loc0000.getBlockY();
								int z000 = loc0000.getBlockZ();
								World w000 = loc0000.getWorld();
								Block block000 = w000.getBlockAt(x000, y000, z000);
								block000.setType(Material.ENDER_PORTAL_FRAME);
								break;
							case 9:
								Location locaa = new Location(Bukkit.getWorld("world"), 135, 108, 11);
								int xa = locaa.getBlockX();
								int ya = locaa.getBlockY();
								int za = locaa.getBlockZ();
								World wa = locaa.getWorld();
								Block blocka = wa.getBlockAt(xa, ya, za);
								blocka.setType(Material.ENDER_PORTAL_FRAME);

								Location locaaa = new Location(Bukkit.getWorld("world"), 144, 108, 25);
								int xaa = locaaa.getBlockX();
								int yaa = locaaa.getBlockY();
								int zaa = locaaa.getBlockZ();
								World waa = locaaa.getWorld();
								Block blockaa = waa.getBlockAt(xaa, yaa, zaa);
								blockaa.setType(Material.ENDER_PORTAL_FRAME);

								Location locaaaa = new Location(Bukkit.getWorld("world"), 124, 122, 14);
								int xaaa = locaaaa.getBlockX();
								int yaaa = locaaaa.getBlockY();
								int zaaa = locaaaa.getBlockZ();
								World waaa = locaaaa.getWorld();
								Block blockaaa = waaa.getBlockAt(xaaa, yaaa, zaaa);
								blockaaa.setType(Material.ENDER_PORTAL_FRAME);
								break;
							case 10:
								Location locbb = new Location(Bukkit.getWorld("world"), 117, 120, 11);
								int xb = locbb.getBlockX();
								int yb = locbb.getBlockY();
								int zb = locbb.getBlockZ();
								World wb = locbb.getWorld();
								Block blockb = wb.getBlockAt(xb, yb, zb);
								blockb.setType(Material.ENDER_PORTAL_FRAME);

								Location locbbb = new Location(Bukkit.getWorld("world"), 147, 120, 31);
								int xbb = locbbb.getBlockX();
								int ybb = locbbb.getBlockY();
								int zbb = locbbb.getBlockZ();
								World wbb = locbbb.getWorld();
								Block blockbb = wbb.getBlockAt(xbb, ybb, zbb);
								blockbb.setType(Material.ENDER_PORTAL_FRAME);

								Location locbbbb = new Location(Bukkit.getWorld("world"), 184, 114, 7);
								int xbbb = locbbbb.getBlockX();
								int ybbb = locbbbb.getBlockY();
								int zbbb = locbbbb.getBlockZ();
								World wbbb = locbbbb.getWorld();
								Block blockbbb = wbbb.getBlockAt(xbbb, ybbb, zbbb);
								blockbbb.setType(Material.ENDER_PORTAL_FRAME);
								break;
							case 11:
								Location loc12 = new Location(Bukkit.getWorld("world"), 184, 114, 7);
								int x12 = loc12.getBlockX();
								int y12 = loc12.getBlockY();
								int z12 = loc12.getBlockZ();
								World w12 = loc12.getWorld();
								Block Block12 = w12.getBlockAt(x12, y12, z12);
								Block12.setType(Material.ENDER_PORTAL_FRAME);

								Location loc1212 = new Location(Bukkit.getWorld("world"), 188, 110, -18);
								int x1212 = loc1212.getBlockX();
								int y1212 = loc1212.getBlockY();
								int z1212 = loc1212.getBlockZ();
								World w1212 = loc1212.getWorld();
								Block Block1212 = w1212.getBlockAt(x1212, y1212, z1212);
								Block1212.setType(Material.ENDER_PORTAL_FRAME);

								Location loc121212 = new Location(Bukkit.getWorld("world"), 199, 120, -12);
								int x121212 = loc121212.getBlockX();
								int y121212 = loc121212.getBlockY();
								int z121212 = loc121212.getBlockZ();
								World w121212 = loc121212.getWorld();
								Block Block121212 = w121212.getBlockAt(x121212, y121212, z121212);
								Block121212.setType(Material.ENDER_PORTAL_FRAME);
								break;
							case 12:
								Location loc13 = new Location(Bukkit.getWorld("world"), 199, 120, -12);
								int x13 = loc13.getBlockX();
								int y13 = loc13.getBlockY();
								int z13 = loc13.getBlockZ();
								World w13 = loc13.getWorld();
								Block Block13 = w13.getBlockAt(x13, y13, z13);
								Block13.setType(Material.ENDER_PORTAL_FRAME);

								Location loc1313 = new Location(Bukkit.getWorld("world"), 197, 123, -8);
								int x1313 = loc1313.getBlockX();
								int y1313 = loc1313.getBlockY();
								int z1313 = loc1313.getBlockZ();
								World w1313 = loc1313.getWorld();
								Block Block1313 = w1313.getBlockAt(x1313, y1313, z1313);
								Block1313.setType(Material.ENDER_PORTAL_FRAME);

								Location loc131313 = new Location(Bukkit.getWorld("world"), 164, 96, -18);
								int x131313 = loc131313.getBlockX();
								int y131313 = loc131313.getBlockY();
								int z131313 = loc131313.getBlockZ();
								World w131313 = loc131313.getWorld();
								Block Block131313 = w131313.getBlockAt(x131313, y131313, z131313);
								Block131313.setType(Material.ENDER_PORTAL_FRAME);
								break;
							case 13:
								Location loc14 = new Location(Bukkit.getWorld("world"), 162, 94, -25);
								int x14 = loc14.getBlockX();
								int y14 = loc14.getBlockY();
								int z14 = loc14.getBlockZ();
								World w14 = loc14.getWorld();
								Block Block14 = w14.getBlockAt(x14, y14, z14);
								Block14.setType(Material.ENDER_PORTAL_FRAME);

								Location loc1414 = new Location(Bukkit.getWorld("world"), 125, 101, -32);
								int x1414 = loc1414.getBlockX();
								int y1414 = loc1414.getBlockY();
								int z1414 = loc1414.getBlockZ();
								World w1414 = loc1414.getWorld();
								Block Block1414 = w1414.getBlockAt(x1414, y1414, z1414);
								Block1414.setType(Material.ENDER_PORTAL_FRAME);

								Location loc141414 = new Location(Bukkit.getWorld("world"), 164, 96, -18);
								int x141414 = loc141414.getBlockX();
								int y141414 = loc141414.getBlockY();
								int z141414 = loc141414.getBlockZ();
								World w141414 = loc141414.getWorld();
								Block Block141414 = w141414.getBlockAt(x141414, y141414, z141414);
								Block141414.setType(Material.ENDER_PORTAL_FRAME);
								break;
							case 14:
								Location loc15 = new Location(Bukkit.getWorld("world"), 162, 95, -25);
								int x15 = loc15.getBlockX();
								int y15 = loc15.getBlockY();
								int z15 = loc15.getBlockZ();
								World w15 = loc15.getWorld();
								Block Block15 = w15.getBlockAt(x15, y15, z15);
								Block15.setType(Material.ENDER_PORTAL_FRAME);

								Location loc1515 = new Location(Bukkit.getWorld("world"), 149, 109, 24);
								int x1515 = loc1515.getBlockX();
								int y1515 = loc1515.getBlockY();
								int z1515 = loc1515.getBlockZ();
								World w1515 = loc1515.getWorld();
								Block Block1515 = w1515.getBlockAt(x1515, y1515, z1515);
								Block1515.setType(Material.ENDER_PORTAL_FRAME);

								Location loc151515 = new Location(Bukkit.getWorld("world"), 147, 120, 6);
								int x151515 = loc151515.getBlockX();
								int y151515 = loc151515.getBlockY();
								int z151515 = loc151515.getBlockZ();
								World w151515 = loc151515.getWorld();
								Block Block151515 = w151515.getBlockAt(x151515, y151515, z151515);
								Block151515.setType(Material.ENDER_PORTAL_FRAME);
								break;
							case 16:
								Location loc16 = new Location(Bukkit.getWorld("world"), 124, 122, 14);
								int x16 = loc16.getBlockX();
								int y16 = loc16.getBlockY();
								int z16 = loc16.getBlockZ();
								World w16 = loc16.getWorld();
								Block Block16 = w16.getBlockAt(x16, y16, z16);
								Block16.setType(Material.ENDER_PORTAL_FRAME);

								Location loc1616 = new Location(Bukkit.getWorld("world"), 149, 109, 24);
								int x1616 = loc1616.getBlockX();
								int y1616 = loc1616.getBlockY();
								int z1616 = loc1616.getBlockZ();
								World w1616 = loc1616.getWorld();
								Block Block1616 = w1616.getBlockAt(x1616, y1616, z1616);
								Block1616.setType(Material.ENDER_PORTAL_FRAME);

								Location loc161616 = new Location(Bukkit.getWorld("world"), 147, 120, 6);
								int x161616 = loc161616.getBlockX();
								int y161616 = loc161616.getBlockY();
								int z161616 = loc161616.getBlockZ();
								World w161616 = loc161616.getWorld();
								Block Block161616 = w161616.getBlockAt(x161616, y161616, z161616);
								Block161616.setType(Material.ENDER_PORTAL_FRAME);
								break;


						}

					}
				}.runTaskTimer(Main.getPlugin(), 20 * 60 * 60, 20 * 60 * 60);
			}
		}
	}
}