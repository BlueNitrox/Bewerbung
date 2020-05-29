package de.Tommunity.Listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import de.Tommunity.Commands.BuildMap;
import de.Tommunity.Main.Main;

public class GamemodeEnder implements Listener {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	@SuppressWarnings("unlikely-arg-type")
	@EventHandler
	public void gamemodeEnderEvent(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if(BuildMap.BuildMap1 >= 10) {
		if(e.getCurrentItem().equals(Material.ENDER_CHEST)) {
			p.sendMessage(Main.pre + "§cDu kannst dir keine Enderkisten holen");
			e.setCancelled(true);
		}
		}
	}

}
