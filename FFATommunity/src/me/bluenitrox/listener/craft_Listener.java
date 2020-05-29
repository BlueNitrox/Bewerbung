package me.bluenitrox.listener;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class craft_Listener implements Listener {

    @EventHandler
    public void onCraft(final PlayerInteractEvent e){
        if(e.getAction() == Action.RIGHT_CLICK_BLOCK){
            if(e.getClickedBlock().getType() == Material.WORKBENCH){
                e.setCancelled(true);
                return;
            }
            if(e.getPlayer().getItemInHand().getType() == Material.CHEST){
                e.setCancelled(true);
            }

        }
    }

}
