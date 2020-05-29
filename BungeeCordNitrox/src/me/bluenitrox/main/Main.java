package me.bluenitrox.main;

import me.bluenitrox.commands.*;
import me.bluenitrox.listener.PingEvent;
import me.bluenitrox.listener.PlayerLoginEvent;
import me.bluenitrox.manager.messagesmanager;
import net.md_5.bungee.BungeeCord;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.ServerPing;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.api.plugin.PluginManager;
import net.md_5.bungee.config.Configuration;
import net.md_5.bungee.config.ConfigurationProvider;
import net.md_5.bungee.config.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

public class Main extends Plugin {

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

    public static File file;
    public static Configuration cfg;
    public static File mfile;
    public static Configuration msg;
    public static List<String> whitelist = new ArrayList();
    public static Boolean MAINTENANCE;
    public static String Prefix;
    public static String DEFAULTMODT;
    public static ServerPing.PlayerInfo DEFAULTINFO;
    public static String MAINTENANCEMODT;
    public static ServerPing.PlayerInfo MAINTENANCEINFO;
    public static String MAINTENANCEMESSAGE;
    public static String VERSIONTEXT;
    private static PluginManager pm = BungeeCord.getInstance().getPluginManager();

    public static String pre = "§8[§e§lTommunity.de§8] ";
    public static String err = "§8[§e§lTommunity.de§8] §cDazu hast du keine Rechte!";
    public static String keinP = "§8[§e§lTommunity.de§8] §cDazu musst du ein Spieler sein!";

    @Override
    public void onEnable() {
        System.out.println("BungeeCord Plugin by Nitrox Aktiviert");
        this.loadFile();
        this.loadMessageFile();
        load();

        register();
        whitelist = cfg.getStringList("Whitelist");
    }

    @Override
    public void onDisable() {
        System.out.println("BungeeCord Plugin by Nitrox Deaktiviert");

    }

    public void register(){
        pm.registerListener(this, new PingEvent());
        pm.registerListener(this, new PlayerLoginEvent());

        ProxyServer.getInstance().getPluginManager().registerCommand(this, new Shop_Command("shop"));
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new Hero_Command("hero"));
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new Master_Command("master"));
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new DC_Command("dc"));
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new Ping_Command("ping"));
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new YT_Command("yt"));
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new CMD_maintenance("wartung"));
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new CMD_motd("motd"));
    }

    private static final String getDate() {
        SimpleDateFormat date = new SimpleDateFormat("[HH:mm:ss]");
        return date.format(Calendar.getInstance().getTime());
    }

    private final void loadFile() {
        try {
            if (!this.getDataFolder().exists()) {
                this.getDataFolder().mkdir();
            }

            file = new File(this.getDataFolder().getPath(), "config.yml");
            if (!file.exists()) {
                file.createNewFile();
                cfg = ConfigurationProvider.getProvider(YamlConfiguration.class).load(file);
                this.getLines();
            }

            cfg = ConfigurationProvider.getProvider(YamlConfiguration.class).load(file);
        } catch (IOException var2) {
            var2.printStackTrace();
        }

    }

    public static final void saveCfg() {
        try {
            ConfigurationProvider.getProvider(YamlConfiguration.class).save(cfg, file);
        } catch (IOException var1) {
            var1.printStackTrace();
        }

    }

    private final void loadMessageFile() {
        try {
            if (!this.getDataFolder().exists()) {
                this.getDataFolder().mkdir();
            }

            mfile = new File(this.getDataFolder().getPath(), "message.yml");
            if (!mfile.exists()) {
                mfile.createNewFile();
                msg = ConfigurationProvider.getProvider(YamlConfiguration.class).load(mfile);
                messagesmanager.setMessages();
            }

            msg = ConfigurationProvider.getProvider(YamlConfiguration.class).load(mfile);
        } catch (IOException var2) {
            var2.printStackTrace();
        }

    }


    public static final void saveMessage() {
        try {
            ConfigurationProvider.getProvider(YamlConfiguration.class).save(msg, mfile);
        } catch (IOException var1) {
            var1.printStackTrace();
        }

    }

    public static final void load() {
        DEFAULTMODT = getCfgString("MOTD.Layout.FirstLine") + "\n" + getCfgString("MOTD.Layout.SecondLine");
        DEFAULTINFO = new ServerPing.PlayerInfo(getCfgString("MOTD.PlayerInfo"), UUID.randomUUID());
        MAINTENANCEMODT = getCfgString("Maintenance.Layout.FirstLine") + "\n" + getCfgString("Maintenance.Layout.SecondLine");
        MAINTENANCEINFO = new ServerPing.PlayerInfo(getCfgString("Maintenance.PlayerInfo"), UUID.randomUUID());
        MAINTENANCE = cfg.getBoolean("Maintenance.enable");
        MAINTENANCEMESSAGE = getCfgString("Maintenance.Message");
        VERSIONTEXT = getCfgString("Maintenance.Protocol");
        Prefix = getCfgString("Prefix");
    }

    private final void getLines() {
        cfg.set("Prefix", "&8&l[&e&lTommunity.de&8&l] &7");
        cfg.set("Maintenance.enable", false);
        cfg.set("Whitelist", whitelist);
        cfg.set("MOTD.Layout.FirstLine", " &aTommunity.de &7- &2Dein Servernetzwerk &7- &a&l1.8.X");
        cfg.set("MOTD.Layout.SecondLine", "    &8» &eLobby: &6Neues System ist nun Online!");
        cfg.set("MOTD.PlayerInfo", "&bTommunity.&ade &7● &cWartungen \n&7TeamSpeak &8» &eTommunity.de \n&7YouTube &8» &ezByTom \n&7");
        cfg.set("Maintenance.Layout.FirstLine", " &aTommunity.de &7- &2Dein Servernetzwerk &7- &a&l1.8.X");
        cfg.set("Maintenance.Layout.SecondLine", "   &c&lDerzeit in Wartung &7- &eWir sind Bald zurück");
        cfg.set("Maintenance.Protocol", "&8-> &cWartungen");
        cfg.set("Maintenance.Message", "&8-------------------- \n &cDer Server ist in Wartung \n &e \n &cVersuche es bitte später wieder \n &8--------------------");
        cfg.set("Maintenance.PlayerInfo", "&bTommunity.&ade &7● &cWartungen \n&7TeamSpeak &8» &eTommunity.de \n&7YouTube &8» &ezByTom \n&7Release &8» &cKein Datum");
        saveCfg();
    }

    public static final String getCfgString(String pfad) {
        return ChatColor.translateAlternateColorCodes('&', cfg.getString(pfad));
    }

}
