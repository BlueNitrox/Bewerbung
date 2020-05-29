package de.Tommunity.Extra;

import de.Tommunity.Main.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Hub implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("hub")) {
            if (!(sender instanceof Player)) return true;

            Player p = (Player)sender;

            ByteArrayOutputStream b = new ByteArrayOutputStream();
            DataOutputStream out = new DataOutputStream(b);
            try {
                out.writeUTF("Connect");
                out.writeUTF("Server2");
            } catch (IOException e) {
                e.printStackTrace();
            }
            p.sendPluginMessage(Main.getPlugin(), "BungeeCord", b.toByteArray());
        }

        return true;
    }

}
