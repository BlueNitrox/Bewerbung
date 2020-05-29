package de.Tommunity.API.ScoreboardAPI;

import com.google.common.collect.Maps;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

import java.util.Map;

public class ScoreboardAPI {
    public void removeScore(){
        scoreMap.clear();
    }

    private Map<Integer, String> scoreMap = Maps.newConcurrentMap();
    private String displayName;
    private String[] animationContext;
    private final Player player;
    private Map<String, Integer> schedulerMap = Maps.newConcurrentMap();
    private int animationTick;

    public ScoreboardAPI(final Player player, final String displayName){
        this.player = player;
        this.displayName = displayName;
    }

    public String getLine(int line) {
        return (String)this.scoreMap.get(line);
    }

    public void setLine(int score, String prefix, String suffix) {
        this.scoreMap.put(score, prefix + ";" + suffix);
    }

    public void setBoard(Player player) {
        player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
        Scoreboard scoreboard = Bukkit.getScoreboardManager().getNewScoreboard();
        Objective objective = scoreboard.registerNewObjective("aaa", "bbb");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        objective.setDisplayName(displayName);

        for(int i = 0; i < 20; ++i) {
            if (this.scoreMap.get(i) != null) {
                Team team;
                String[] raw;
                if (i < 10) {
                    team = scoreboard.registerNewTeam("x" + i);
                    raw = ((String)this.scoreMap.get(i)).split(";");
                    team.setPrefix(raw[0]);
                    team.setSuffix(raw[1]);
                    team.addEntry("§" + i);
                    objective.getScore("§" + i).setScore(i);
                } else {
                    team = scoreboard.registerNewTeam("x" + i);
                    raw = ((String)this.scoreMap.get(i)).split(";");
                    team.setPrefix(raw[0]);
                    team.setSuffix(raw[1]);
                    team.addEntry("§" + this.getColorCodeByNumber(i));
                    objective.getScore("§" + this.getColorCodeByNumber(i)).setScore(i);
                }

                player.setScoreboard(scoreboard);
            }
        }

    }

    public void updateBoard(Player player, int score, String prefix, String suffix) {
        if (player.getScoreboard() != null && player.getScoreboard().getObjective(DisplaySlot.SIDEBAR) != null) {
            player.getScoreboard().getTeam("x" + score).setSuffix(suffix);
            player.getScoreboard().getTeam("x" + score).setPrefix(prefix);
        }
    }

    public void addAnimation(String[] animationCont, Plugin plugin) {
        animationContext = animationCont;
        Bukkit.getScheduler().scheduleAsyncRepeatingTask(plugin, new Runnable() {
            int animationTick = 0;
            @Override
            public void run() {
                if (this.animationTick == animationContext.length) this.animationTick = 0;
                if (player.getScoreboard() != null) {
                    try {
                        player.getScoreboard().getObjective(DisplaySlot.SIDEBAR).setDisplayName(animationContext[this.animationTick]);
                    } catch (Exception ex) {}
                }
                ++this.animationTick;
            }
        }, 3L, 3L);

    }

    public void stopAnimation() {
        Bukkit.getScheduler().cancelTask((Integer)this.schedulerMap.get("scheduler"));
    }

    private String getColorCodeByNumber(int number) {
        switch(number) {
            case 10:
                return "a";
            case 11:
                return "b";
            case 12:
                return "c";
            case 13:
                return "d";
            case 14:
                return "e";
            case 15:
                return "f";
            default:
                return "z";
        }
    }

    public Player getPlayer() {
        return player;
    }


}