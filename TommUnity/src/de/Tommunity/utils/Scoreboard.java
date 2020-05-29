package de.Tommunity.utils;
 
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Team;

import de.Tommunity.Commands.EconomySystem;
import ru.tehkode.permissions.bukkit.PermissionsEx;
 
public class Scoreboard {
 
    public org.bukkit.scoreboard.Scoreboard sb;
   
    public Scoreboard(Player p) {
        this.sb = Bukkit.getScoreboardManager().getNewScoreboard();
        EconomySystem es = new EconomySystem();
        Objective o = this.sb.registerNewObjective("dummy", "display");
        o.setDisplaySlot(DisplaySlot.SIDEBAR);
        o.setDisplayName("§e§lTommunity.de");
        o.getScore("").setScore(12);
        o.getScore("§cDein Rang:").setScore(11);
        if(PermissionsEx.getUser(p).inGroup("Owner")) {
            o.getScore("§7  » §4§lOwner").setScore(10);
        }else if(PermissionsEx.getUser(p).inGroup("Admin")) {
            o.getScore("§7  » §4§lAdmin").setScore(10);
        }else if(PermissionsEx.getUser(p).inGroup("Developer")) {
            o.getScore("§7  » §b§lDeveloper").setScore(10);
        }else if(PermissionsEx.getUser(p).inGroup("Moderator")) {
            o.getScore("§7  » §2Moderator").setScore(10);
        }else if(PermissionsEx.getUser(p).inGroup("Supporter")) {
            o.getScore("§7  » §aSupporter").setScore(10);
        }else if(PermissionsEx.getUser(p).inGroup("Builder")) {
            o.getScore("§7  » §eBuilder").setScore(10);
        }else if(PermissionsEx.getUser(p).inGroup("Youtuber")) {
            o.getScore("§7  » §5Youtuber").setScore(10);
        }else if(PermissionsEx.getUser(p).inGroup("Hero")) {
            o.getScore("§7  » §9Hero").setScore(10);
        }else if(PermissionsEx.getUser(p).inGroup("Master")) {
            o.getScore("§7  » §dMaster").setScore(10);
        }else if(PermissionsEx.getUser(p).inGroup("Business")) {
            o.getScore("§7  » §6Business").setScore(10);
        }else if(PermissionsEx.getUser(p).inGroup("Spieler")) {
            o.getScore("§7  » §7Spieler").setScore(10);
        }
        o.getScore(" ").setScore(9);
        o.getScore("§cDein Kontostand: ").setScore(8);
        if(es.getMoney(p.getUniqueId()) == 0) {
            o.getScore("§7  » §e0$").setScore(7);
        }else {
        o.getScore("§7  » §e" + es.getMoney(p.getUniqueId()) + "$").setScore(7);
        }
        o.getScore("  ").setScore(6);
        o.getScore("§cTeamspeak:").setScore(5);
        o.getScore("§7  » §eTommunity.de").setScore(4);
        o.getScore("   ").setScore(3);
        o.getScore("§cDiscord:").setScore(2);
        o.getScore("§7  » §e/dc").setScore(1);
       
       
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
        EconomySystem es = new EconomySystem();
        Objective o = p.getScoreboard().getObjective("dummy");
        p.getScoreboard().resetScores("§7  » §e" + es.getMoney(p.getUniqueId()) + "$");
        if(es.getMoney(p.getUniqueId()) == 0) {
            o.getScore("§7  » §e0$").setScore(7);
        }else
        o.getScore("§7  » §e" + es.getMoney(p.getUniqueId()) + "$").setScore(7);
    }
}