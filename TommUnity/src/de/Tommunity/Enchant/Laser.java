package de.Tommunity.Enchant;

import de.Tommunity.Main.Main;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.*;
import org.bukkit.entity.Fireball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.*;
import org.bukkit.event.entity.*;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.projectiles.ProjectileSource;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;

public class Laser implements Listener {

    public static ArrayList<Player> shoot = new ArrayList<>();
    private Player p;
    public boolean Cancelled;

    @EventHandler
    public void ShootLaser(final PlayerInteractEvent e) {
        p = (Player) e.getPlayer();
        if (e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR) {
            if (p.getItemInHand().getItemMeta().getLore().contains("§6§lDrachenatem I")) {
                if (!(shoot.contains(p))) {
                    Projectile projectile = p.launchProjectile(Fireball.class);
                    shoot.add(p);
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            shoot.remove(p);
                        }
                    }.runTaskLater(Main.getPlugin(), 20 * 0);
                }
            } else if (p.getItemInHand().getItemMeta().getLore().contains("§6§lDrachenatem II")) {
                if (!(shoot.contains(p))) {
                    Projectile projectile = p.launchProjectile(Fireball.class);
                    shoot.add(p);
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            shoot.remove(p);
                        }
                    }.runTaskLater(Main.getPlugin(), 20 * 12);
                }
            } else if (p.getItemInHand().getItemMeta().getLore().contains("§6§lDrachenatem III")) {
                if (!(shoot.contains(p))) {
                    Projectile projectile = p.launchProjectile(Fireball.class);
                    shoot.add(p);
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            shoot.remove(p);
                        }
                    }.runTaskLater(Main.getPlugin(), 20 * 9);
                }
            } else if (p.getItemInHand().getItemMeta().getLore().contains("§6§lDrachenatem IV")) {
                if (!(shoot.contains(p))) {
                    Projectile projectile = p.launchProjectile(Fireball.class);
                    shoot.add(p);
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            shoot.remove(p);
                        }
                    }.runTaskLater(Main.getPlugin(), 20 * 6);
                }
            }
        }
    }

    @EventHandler
    public void ballDamage(final EntityDamageEvent e){
        Player p = (Player)e.getEntity();
        if(p instanceof Player){
            if(e.getCause().equals(EntityDamageEvent.DamageCause.ENTITY_EXPLOSION)){
                e.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void block(final EntityExplodeEvent e){
        if (e.getLocation().getBlockX() >= -2 && e.getLocation().getBlockX() <= 16) {
            if (e.getLocation().getBlockY() >= 65 && e.getLocation().getBlockY() <= 80) {
                if (e.getLocation().getBlockZ() >= -67 && e.getLocation().getBlockZ() <= -47) {
                    Cancelled = false;
                }else {
                    Cancelled = true;
                    e.setCancelled(true);
                }
            }else {
                Cancelled = true;
                e.setCancelled(true);
            }
        }else {
            Cancelled = true;
            e.setCancelled(true);
        }
    }

    //TODO ALLE MINEN EINTRAGEN!



    @EventHandler
    public void onProjectile(final ProjectileHitEvent e){
        Projectile pro = e.getEntity();
        Player p = (Player) e.getEntity().getShooter();
        if(Cancelled == false) {
            if (p instanceof Player) {
                if (pro instanceof Fireball) {
                    p.sendMessage(Main.pre);
                    Location l1 = pro.getLocation();
                    l1.getBlock().setType(Material.AIR);

                    ItemStack item = new ItemStack(Material.STONE);
                    p.getInventory().addItem(item);
                }
            }
        }
    }


   /* @EventHandler
    public void test(final Block e) {
        Block b = (Block) e.getBlock();
        Projectile p1 = (Projectile) e.get
        if (b instanceof Block && p1 instanceof Fireball) {
            if (b.getLocation().getBlockX() >= -2 && b.getLocation().getBlockX() <= 16) {
                if (b.getLocation().getBlockY() >= 65 && b.getLocation().getBlockY() <= 80) {
                    if (b.getLocation().getBlockZ() >= -67 && b.getLocation().getBlockZ() <= -47) {
                        b.setType(Material.AIR);
                        ItemStack item = new ItemStack(Material.STONE);

                        p.getInventory().addItem(item);
                        p.sendMessage(Main.pre + "§cJa Lol Ey!");
                    }
                }
            }
        }
    }*/



}
