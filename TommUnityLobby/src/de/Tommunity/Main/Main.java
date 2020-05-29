package de.Tommunity.Main;

import de.Tommunity.Commands.*;
import de.Tommunity.Listener.*;
import de.Tommunity.Listener.Process;
import de.Tommunity.Utils.Coins;
import me.vagdedes.mysql.database.MySQL;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public static String pre = "§8[§e§lTommunity.de§8] ";
	public static String err_noperms = "§8[§e§lTommunity.de§8] §cDazu hast du keine Rechte";
	private static Main plugin;
	
	public void onEnable() {
		plugin = this;
		Bukkit.getConsoleSender().sendMessage("§aPlugin Aktiviert!");

		register();

	}

	public void register(){
        getCommand("report").setExecutor(new Report());
        getCommand("gm0").setExecutor(new Gm0());
        getCommand("gm1").setExecutor(new Gm1());
        getCommand("neustart").setExecutor(new Neustart());
        getCommand("build").setExecutor(new Build());
        getCommand("setloc").setExecutor(new Location());
        getCommand("hub").setExecutor(new Spawn());
        getCommand("setcb").setExecutor(new setCitybuild());
        getCommand("setFFA").setExecutor(new setFFA());
        getCommand("setspawn").setExecutor(new setSpawn());
        getCommand("settnt").setExecutor(new setTNT());
        getCommand("coins").setExecutor(new Coins());
        getCommand("setjnr").setExecutor(new setJNR());
        getCommand("ziel").setExecutor(new Ziel());
        getCommand("setshop").setExecutor(new setShop());
        getCommand("trade").setExecutor(new trade());

        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new trade(), this);
        pm.registerEvents(new Interact_Listener2(),this);
        pm.registerEvents(new JoinTab(), this);
        pm.registerEvents(new itemDrag(), this);
        pm.registerEvents(new Join(), this);
        pm.registerEvents(new JoinEvent(), this);
        pm.registerEvents(new ItemListener(),this);
        pm.registerEvents(new ItemUse(),this);
        pm.registerEvents(new ChatListener(), this);
        pm.registerEvents(new LobbyListener(), this);
        pm.registerEvents(new InventoryListener(), this);
        pm.registerEvents(new BootsListener(), this);
        pm.registerEvents(new DoppelsprungListener(),this);
        pm.registerEvents(new Navigator(), this);
        pm.registerEvents(new RespawnListener(), this);
        pm.registerEvents(new Process(),this);
        pm.registerEvents(new tab_complete(), this);
        pm.registerEvents(new Interact_Listener(), this);
    }

	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage("§cPlugin wurde deaktiviert!");
        MySQL.disconnect();
		
}
	public static Main getPlugin() {
        return plugin;
    }

}
