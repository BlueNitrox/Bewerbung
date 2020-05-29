package de.Tommunity.Utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Team;

public class Scoreboard {
 
    public org.bukkit.scoreboard.Scoreboard sb;
   
    public Scoreboard(Player p) {
        Coins c = new Coins();
    	this.sb = Bukkit.getScoreboardManager().getNewScoreboard();
        Objective ob = sb.registerNewObjective("lobby", "system");
        ob.setDisplaySlot(DisplaySlot.SIDEBAR);
        ob.setDisplayName("§e§l» Tommunity.de");
        ob.getScore("    ").setScore(12);
        ob.getScore("§c§lLobbyCoins").setScore(11);
        ob.getScore("§7" + c.getCoins(p.getUniqueId())).setScore(10);
        ob.getScore("  ").setScore(9);
        ob.getScore("§c§lRang").setScore(8);
        ob.getScore("      ").setScore(6);

        if(p.hasPermission("Tom.Owner")){
            ob.getScore("§4§lOwner").setScore(7);
        } else if(p.hasPermission("Tom.Business")){
            ob.getScore("§6Business").setScore(7);
        } else if(p.hasPermission("Tom.Master")){
            ob.getScore("§dMaster").setScore(7);
        } else if(p.hasPermission("Tom.Hero")){
            ob.getScore("§9Hero").setScore(7);
        } else if(p.hasPermission("Tom.YT")){
            ob.getScore("§5YouTuber").setScore(7);
        } else if(p.hasPermission("Tom.Builder")){
            ob.getScore("§eBuilder").setScore(7);
        } else if(p.hasPermission("Tom.Sup")){
            ob.getScore("§aSupporter").setScore(7);
        } else if(p.hasPermission("Tom.Mod")){
            ob.getScore("§2Moderator").setScore(7);
        } else if(p.hasPermission("Tom.Dev")){
            ob.getScore("§b§lDeveloper").setScore(7);
        } else if(p.hasPermission("Tom.Admin")){
            ob.getScore("§4§lAdmin").setScore(7);
        } else {
            ob.getScore("§7Spieler").setScore(7);
        }
        ob.getScore("§c§lTS").setScore(5);
        ob.getScore("§7Tommunity.de ").setScore(4);
       
       
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
	public void sendToPlayer(Player p) {
        for(Player a : Bukkit.getOnlinePlayers()) {
            Scoremanager.checkTablistPrefix(a, this.sb);
            
        }
        p.setScoreboard(sb);
    }
}