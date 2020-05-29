package de.Tommunity.Listener;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import de.Tommunity.Main.Main;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;


public class Navigator implements Listener {

    @EventHandler
    public void onNavigator(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();
        if(e.getInventory().getName().equalsIgnoreCase("§cSpielmodi §8| §fAuswahl")){
            e.setCancelled(true);
            if(e.getCurrentItem().getType() == Material.RED_SANDSTONE){
                p.getWorld().playEffect(p.getLocation().add(0.0D, 0.0D, 0.0D), Effect.ENDER_SIGNAL, 1);
                p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1,2);
            }
            if(e.getCurrentItem().getType() == Material.BREWING_STAND_ITEM){
                p.getWorld().playEffect(p.getLocation().add(0.0D, 0.0D, 0.0D), Effect.ENDER_SIGNAL, 1);
                p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1,2);
            }
            if(e.getCurrentItem().getType() == Material.COOKIE){
                p.getWorld().playEffect(p.getLocation().add(0.0D, 0.0D, 0.0D), Effect.ENDER_SIGNAL, 1);
                p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1,2);
            }
            if(e.getCurrentItem().getType() == Material.TNT){
                p.getWorld().playEffect(p.getLocation().add(0.0D, 0.0D, 0.0D), Effect.ENDER_SIGNAL, 1);
                p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1,2);
            }
            if(e.getCurrentItem().getType() == Material.EMERALD){
                p.getWorld().playEffect(p.getLocation().add(0.0D, 0.0D, 0.0D), Effect.ENDER_SIGNAL, 1);
                p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1,2);
            }
            if (!(e.getWhoClicked() instanceof Player)) return;
            if (e.getClickedInventory().getTitle().equals("§cSpielmodi §8| §fAuswahl")) {
                e.setCancelled(true);
                switch (e.getCurrentItem().getType()) {

                    case BREWING_STAND_ITEM:
                        FileConfiguration config = Main.getPlugin().getConfig();
                        World world = Bukkit.getWorld(config.getString("Spawn.World"));
                        double x = config.getDouble("Spawn.X");
                        double y = config.getDouble("Spawn.Y");
                        double z = config.getDouble("Spawn.Z");
                        float yaw = (float) config.getDouble("Spawn.Yaw");
                        float pitch = (float) config.getDouble("Spawn.Pitch");
                        Location location = new Location(world, x, y, z, yaw, pitch);
                        teleporthigh(p, location);
                        break;
                    case RED_SANDSTONE:
                        FileConfiguration config1 = Main.getPlugin().getConfig();
                        World world1 = Bukkit.getWorld(config1.getString("FFA.World"));
                        double x1 = config1.getDouble("FFA.X");
                        double y1 = config1.getDouble("FFA.Y");
                        double z1 = config1.getDouble("FFA.Z");
                        float yaw1 = (float) config1.getDouble("FFA.Yaw");
                        float pitch1 = (float) config1.getDouble("FFA.Pitch");
                        Location location1 = new Location(world1, x1, y1, z1, yaw1, pitch1);
                        teleporthigh(p, location1);
                        break;
                    case COOKIE:
                        FileConfiguration config2 = Main.getPlugin().getConfig();
                        World world2 = Bukkit.getWorld(config2.getString("Spawn1.World"));
                        double x2 = config2.getDouble("Spawn1.X");
                        double y2 = config2.getDouble("Spawn1.Y");
                        double z2 = config2.getDouble("Spawn1.Z");
                        float yaw2 = (float) config2.getDouble("Spawn1.Yaw");
                        float pitch2 = (float) config2.getDouble("Spawn1.Pitch");
                        Location location2 = new Location(world2, x2, y2, z2, yaw2, pitch2);
                        teleporthigh(p, location2);
                        break;
                    case TNT:
                        FileConfiguration config22 = Main.getPlugin().getConfig();
                        World world22 = Bukkit.getWorld(config22.getString("TNT.World"));
                        double x22 = config22.getDouble("TNT.X");
                        double y22 = config22.getDouble("TNT.Y");
                        double z22 = config22.getDouble("TNT.Z");
                        float yaw22 = (float) config22.getDouble("TNT.Yaw");
                        float pitch22 = (float) config22.getDouble("TNT.Pitch");
                        Location location22 = new Location(world22, x22, y22, z22, yaw22, pitch22);
                        teleporthigh(p, location22);
                        break;
                    case EMERALD:
                        FileConfiguration config222 = Main.getPlugin().getConfig();
                        World world222 = Bukkit.getWorld(config222.getString("Shop.World"));
                        double x222 = config222.getDouble("Shop.X");
                        double y222 = config222.getDouble("Shop.Y");
                        double z222 = config222.getDouble("Shop.Z");
                        float yaw222 = (float) config222.getDouble("Shop.Yaw");
                        float pitch222 = (float) config222.getDouble("Shop.Pitch");
                        Location location222 = new Location(world222, x222, y222, z222, yaw222, pitch222);
                        teleporthigh(p, location222);
                        break;
                }
            }
        }
    }


    public static void teleporthigh(Player p, Location location){
        new BukkitRunnable(){
            @Override
            public void run() {
                p.teleport(p.getLocation().add(0, 0.3, 0));
            }
        }.runTaskLater(Main.getPlugin(), 10);
        new BukkitRunnable(){
            @Override
            public void run() {
                p.teleport(p.getLocation().add(0, 0.3, 0));
            }
        }.runTaskLater(Main.getPlugin(), 10);
        new BukkitRunnable(){
            @Override
            public void run() {
                p.teleport(p.getLocation().add(0, 0.3, 0));
            }
        }.runTaskLater(Main.getPlugin(), 10);
        new BukkitRunnable(){
            @Override
            public void run() {
                p.teleport(p.getLocation().add(0, 0.3, 0));
            }
        }.runTaskLater(Main.getPlugin(), 10);

        p.teleport(location);
        p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1, 2);
        p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20*2, 20));
        p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 20*2, 20));
        p.playEffect(p.getLocation(), Effect.BLAZE_SHOOT, 10);
        p.playEffect(p.getLocation(), Effect.BLAZE_SHOOT, 10);
        p.playEffect(p.getLocation(), Effect.BLAZE_SHOOT, 10);
    }

}
    
