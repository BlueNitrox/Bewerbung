package de.Tommunity.Mobzone;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import de.Tommunity.Listener.WorldListener;
import de.Tommunity.Main.Main;
import de.Tommunity.utils.Arena;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class Mobzone implements CommandExecutor {

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
        Player p = (Player)cs;

        if(WorldListener.fight.contains(p)){
            p.sendMessage(Main.pre + "§cDas kannst du im Kampf leider nicht machen!");
            return true;
        }

        if(Arena.warte.contains(p)) {
            Arena.warte.clear();
        }
        if(Arena.warteno.contains(p)) {
            Arena.warteno.clear();
        }

        if(args.length == 0){
            FileConfiguration config = Main.getPlugin().getConfig();
            World world = Bukkit.getWorld(config.getString("Mobzone.World"));
            double x = config.getDouble("Mobzone.X");
            double y = config.getDouble("Mobzone.Y");
            double z = config.getDouble("Mobzone.Z");
            float yaw = (float) config.getDouble("Mobzone.Yaw");
            float pitch = (float) config.getDouble("Mobzone.Pitch");
            Location location = new Location(world, x, y, z, yaw, pitch);
            p.teleport(location);
            return true;
        }else if(args.length == 1) {
            if (PermissionsEx.getUser(p).has("Tom.rank2")) {
                if(args[0].equalsIgnoreCase("1")){
                    mobzone_tp.tpZone("Zone1", p);
                    p.sendMessage(Main.pre + "§3Du wurdest zu Mobzone 1 Teleportiert!");
                }else if(args[0].equalsIgnoreCase("2")){
                    mobzone_tp.tpZone("Zone2", p);
                    p.sendMessage(Main.pre + "§3Du wurdest zu Mobzone 2 Teleportiert!");
                }else {
                    p.sendMessage(Main.pre + "§cDiese Mobzone exestiert nicht");
                }
            }else {
                p.sendMessage(Main.err);
            }
        }else {
            p.sendMessage(Main.pre + "§cBenutzung : §6§l/mobzone [Zone]§c!");
        }


        return false;
    }


}
