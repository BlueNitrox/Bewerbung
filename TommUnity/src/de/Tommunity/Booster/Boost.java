package de.Tommunity.Booster;

import org.bukkit.Bukkit;

import de.Tommunity.Main.Main;

public class Boost implements BoosterEvent{

    private String name;
    private int lenth;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getLenth() {
        return lenth;
    }
    public void setLenth(int lenth) {
        this.lenth = lenth;
    }

    public void onStart() { }

    public void onEnd() { }

    public void startTicking() {
        Main.getPlugin().getBoostermanager().getAktivboost().add(this);
        Bukkit.getScheduler().runTaskLater(Main.getPlugin(), this::onEnd, 20*60*60);
    }

}