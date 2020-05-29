package me.bluenitrox.manager;

import java.io.File;

import me.bluenitrox.main.Main;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.config.Configuration;

public class messagesmanager {
    public static File file;
    public static Configuration cfg;

    static {
        file = Main.mfile;
        cfg = Main.msg;
    }

    public messagesmanager() {
    }

    public static String getMessage(String pfad) {
        return ChatColor.translateAlternateColorCodes('&', cfg.getString(pfad).replace("%prefix%", Main.Prefix));
    }

    public static void setMessages() {
        cfg.set("NO_PERMS", "%prefix% &cDazu hast du keine Rechte!");
        cfg.set("MOTD.default.edit.1", "%prefix% &aThe &efirst line &Aof the Default MOTD has been updated");
        cfg.set("MOTD.maintenance.edit.1", "%prefix% &aThe &efirst line &Aof the Maintenance MOTD has been updated");
        cfg.set("MOTD.default.edit.2", "%prefix% &aThe &esecond line &Aof the Default MOTD has been updated");
        cfg.set("MOTD.maintenance.edit.2", "%prefix% &aThe &esecond line &Aof the Maintenance MOTD has been updated");
        cfg.set("Maintenance.isEnable", "%prefix% &cThe maintenance work is already in progress!");
        cfg.set("Maintenance.isDisable", "%prefix% &cThe maintenance is not active!");
        cfg.set("Maintenance.Enable", "%prefix% &7The &cmaintenance &ework &7has been &aactivated");
        cfg.set("Maintenance.Disable", "%prefix% &7The &cmaintenance &ework &7has been &cdeaktivated");
        cfg.set("Maintenance.Whitelist.add", "%prefix% &aThe Player &e%player% &ahas been successfully added to the whitelist!");
        cfg.set("Maintenance.Whitelist.remove", "%prefix% &cThe Player &e%player% &cwas successfully remove from the whitelist!");
        cfg.set("Maintenance.Whitelist.IS_ON_WHITELIST", "%prefix% &cThe player is already on the whitelist!");
        cfg.set("Maintenance.Whitelist.IS_NOT_ON_WHITELIST", "%prefix% &cThe Player is not on the whitelist!");
        Main.saveMessage();
    }

    public static String getMessage(String name, String p) {
        return ChatColor.translateAlternateColorCodes('&', cfg.getString(name)).replace("%prefix%", Main.Prefix).replace("%player%", p).replace("%defaultmotd%", Main.DEFAULTMODT).replace("%maintenancemotd%", Main.MAINTENANCEMODT);
    }
}
