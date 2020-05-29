package me.bluenitrox.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;

import org.bukkit.scoreboard.Team;

import ru.tehkode.permissions.bukkit.PermissionsEx;

public class Scoreboard {

    public org.bukkit.scoreboard.Scoreboard sb;

    public Scoreboard(Player p) {
        this.sb = Bukkit.getScoreboardManager().getNewScoreboard();
        PunkteSys ps = new PunkteSys();
        Objective o = this.sb.registerNewObjective("dummy", "display");
        o.setDisplaySlot(DisplaySlot.SIDEBAR);
        o.setDisplayName("§e§lTommunity.de");
        o.getScore("").setScore(12);
        o.getScore("§cTeaming:").setScore(11);
        o.getScore("§7  » §everboten!").setScore(10);
        o.getScore(" ").setScore(9);
        o.getScore("§cDein Punktestand: ").setScore(8);
        if(ps.getpunkte(p.getUniqueId()) == 0) {
            o.getScore("§7  » §e0$").setScore(7);
        }else {
            o.getScore("§7  » §e" + ps.getpunkte(p.getUniqueId()) + " Punkte").setScore(7);
        }
        o.getScore("  ").setScore(6);
        o.getScore("§cServer:").setScore(5);
        o.getScore("§7  » §eBuildFFA_01").setScore(4);
        o.getScore("    ").setScore(3);
        o.getScore("§cDeine Stats:").setScore(2);
        o.getScore("§7  » §e/stats").setScore(1);


        Team owner = sb.registerNewTeam("001Owner");
        Team admin = sb.registerNewTeam("002Admin");
        Team dev = sb.registerNewTeam("003Dev");
        Team mod = sb.registerNewTeam("004Mod");
        Team sup = sb.registerNewTeam("005Sup");
        Team builder = sb.registerNewTeam("006Builder");
        Team yt = sb.registerNewTeam("007YT");
        Team hero = sb.registerNewTeam("008Hero");
        Team master = sb.registerNewTeam("009Master");
        Team business = sb.registerNewTeam("010Business");
        Team spieler = sb.registerNewTeam("011Spieler");

        owner.setPrefix("§4§lOwner | ");
        admin.setPrefix("§4§lAdmin | ");
        dev.setPrefix("§b§lDev | ");
        mod.setPrefix("§2Mod | ");
        sup.setPrefix("§aSup | ");
        builder.setPrefix("§eBuilder | ");
        yt.setPrefix("§5YT | ");
        hero.setPrefix("§9Hero | ");
        master.setPrefix("§dMaster | ");
        business.setPrefix("§6Business | ");
        spieler.setPrefix("§7Spieler | ");

    }
    private Bukkit getServer() {
        getServer();
        return null;
    }
    public void sendToPlayer(Player p) {
        for(Player a : Bukkit.getOnlinePlayers()) {
            ScoreboardManager.checkTablistPrefix(a, this.sb);

        }
        p.setScoreboard(sb);
    }
    public static void onUpdate(Player p) {
        PunkteSys ps = new PunkteSys();
        Objective o = p.getScoreboard().getObjective("dummy");
        p.getScoreboard().resetScores("§7  » §e" + ps.getpunkte(p.getUniqueId()) + "$");
        if(ps.getpunkte(p.getUniqueId()) == 0) {
            o.getScore("§7  » §e0$").setScore(7);
        }else
            o.getScore("§7  » §e" + ps.getpunkte(p.getUniqueId()) + "$").setScore(7);
    }
}