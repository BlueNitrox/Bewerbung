package de.Tommunity.Listener;
 
import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import de.Tommunity.Commands.EXpSystem;
import de.Tommunity.Main.Main;
import de.Tommunity.Stats.Deaths;
import de.Tommunity.Stats.KilledPlayer;
import ru.tehkode.permissions.bukkit.PermissionsEx;
 
public class DeathEvent implements Listener{
 
    @SuppressWarnings("unused")
	@EventHandler
    public void onDeath(PlayerDeathEvent e) {
        Player p = e.getEntity();
        Player k = p.getKiller();
       
        e.setDeathMessage("");
        
        Deaths d1 = new Deaths();
        d1.addDeath(p.getUniqueId(), 1);
        KilledPlayer kp = new KilledPlayer();
        kp.addKill(k.getUniqueId(), 1);
       
        if(k == null) {
            p.sendMessage(Main.pre + "§cDu bist gestorben");
        }else if(k != null) {
            if(PermissionsEx.getUser(k.getName()).inGroup("Owner")) {
                p.sendMessage(Main.pre + "§cDu wurdest von §4§lOwner | " + k.getName() + " §cgetötet");
            }else if(PermissionsEx.getUser(k.getName()).inGroup("Admin")) {
                p.sendMessage(Main.pre + "§cDu wurdest von §4§lAdmin | " + k.getName() + " §cgetötet");
            }else if(PermissionsEx.getUser(k.getName()).inGroup("Developer")) {
                p.sendMessage(Main.pre + "§cDu wurdest von §b§lDev | " + k.getName() + " §cgetötet");
            }else if(PermissionsEx.getUser(k.getName()).inGroup("Moderator")) {
                p.sendMessage(Main.pre + "§cDu wurdest von §2Mod | " + k.getName() + " §cgetötet");
            }else if(PermissionsEx.getUser(k.getName()).inGroup("Suporter")) {
                p.sendMessage(Main.pre + "§cDu wurdest von §aSup | " + k.getName() + " §cgetötet");
            }else if(PermissionsEx.getUser(k.getName()).inGroup("Builder")) {
                p.sendMessage(Main.pre + "§cDu wurdest von §eBuilder | " + k.getName() + " §cgetötet");
            }else if(PermissionsEx.getUser(k.getName()).inGroup("Youtuber")) {
                p.sendMessage(Main.pre + "§cDu wurdest von §5YT | " + k.getName() + " §cgetötet");
            }else if(PermissionsEx.getUser(k.getName()).inGroup("Hero")) {
                p.sendMessage(Main.pre + "§cDu wurdest von §9Hero | " + k.getName() + " §cgetötet");
            }else if(PermissionsEx.getUser(k.getName()).inGroup("Master")) {
                p.sendMessage(Main.pre + "§cDu wurdest von §dMaster | " + k.getName() + " §cgetötet");
            }else if(PermissionsEx.getUser(k.getName()).inGroup("Business")) {
                p.sendMessage(Main.pre + "§cDu wurdest von §6Business | " + k.getName() + " §cgetötet");
            }else if(PermissionsEx.getUser(k.getName()).inGroup("Spieler")) {
                p.sendMessage(Main.pre + "§cDu wurdest von §7Spieler | " + k.getName() + " §cgetötet");
            }
           
            if(PermissionsEx.getUser(p.getName()).inGroup("Owner")) {
                k.sendMessage(Main.pre + "§aDu hast §4§lOwner | " + p.getName() + " §agetötet");
               
            }else if(PermissionsEx.getUser(p.getName()).inGroup("Admin")) {
                k.sendMessage(Main.pre + "§aDu hast §4§lAdmin | " + p.getName() + " §agetötet");
            }else if(PermissionsEx.getUser(p.getName()).inGroup("Developer")) {
                k.sendMessage(Main.pre + "§aDu hast §b§lDev | " + p.getName() + " §agetötet");
            }else if(PermissionsEx.getUser(p.getName()).inGroup("Moderator")) {
                k.sendMessage(Main.pre + "§aDu hast §2Mod | " + p.getName() + " §agetötet");
            }else if(PermissionsEx.getUser(p.getName()).inGroup("Suporter")) {
                k.sendMessage(Main.pre + "§aDu hast §aSup | " + p.getName() + " §agetötet");
            }else if(PermissionsEx.getUser(p.getName()).inGroup("Builder")) {
                k.sendMessage(Main.pre + "§aDu hast §eBuilder | " + p.getName() + " §agetötet");
            }else if(PermissionsEx.getUser(p.getName()).inGroup("Youtuber")) {
                k.sendMessage(Main.pre + "§aDu hast §5YT | " + p.getName() + " §agetötet");
            }else if(PermissionsEx.getUser(p.getName()).inGroup("Hero")) {
                k.sendMessage(Main.pre + "§aDu hast §9Hero | " + p.getName() + " §agetötet");
            }else if(PermissionsEx.getUser(p.getName()).inGroup("Master")) {
                k.sendMessage(Main.pre + "§aDu hast §dMaster | " + p.getName() + " §agetötet");
            }else if(PermissionsEx.getUser(p.getName()).inGroup("Business")) {
                k.sendMessage(Main.pre + "§aDu hast §6Business | " + p.getName() + " §agetötet");
            }else if(PermissionsEx.getUser(p.getName()).inGroup("Spieler")) {
                k.sendMessage(Main.pre + "§aDu hast §7Spieler | " + p.getName() + " §agetötet");
            }
        }
            EXpSystem ex = new EXpSystem();
            ex.addEXP(k.getUniqueId(), 10);
        
        File file = new File("plugins//Tommunity//Stats.yml");
        YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
       
        e.setDeathMessage("");
        e.setKeepInventory(false);
        p.sendMessage(Main.pre + "§cDu bist gestorben");
       
        FileConfiguration config = Main.getPlugin().getConfig();
        World world = Bukkit.getWorld(config.getString("Spawn.World"));
        double x = config.getDouble("Spawn.X");
        double y = config.getDouble("Spawn.Y");
        double z = config.getDouble("Spawn.Z");
        float yaw = (float) config.getDouble("Spawn.Yaw");
        float pitch = (float) config.getDouble("Spawn.Pitch");
        Location loc = new Location(world, x, y, z, yaw, pitch);
        p.teleport(loc);
       
        int d = cfg.getInt(p.getName().toLowerCase() + ".Deaths");
        cfg.set(p.getName().toLowerCase() + ".Deaths", ++d);
       
        if(k != null) {
            int ki = cfg.getInt(p.getName().toLowerCase() + ".Kills");
            cfg.set(p.getName().toLowerCase() + ".Kills", ++ki);
        }
        try {
            cfg.save(file);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}