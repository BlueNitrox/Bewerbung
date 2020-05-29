package de.Tommunity.Booster;

import org.bukkit.Bukkit;

import de.Tommunity.Main.Main;

public class Xpbooster extends Boost{

	public Xpbooster() {
		setName("§d§lXp-Booster");
		setLenth(60);
	}

	@Override
	public void onStart() {
		Bukkit.getOnlinePlayers().forEach(players ->{
			players.sendMessage(Main.pre +  getName() + "§a für " + getLenth() + " §aMinuten gezündet");

		});
		startTicking();
	}
	@Override
	public void onEnd() {
		Bukkit.getOnlinePlayers().forEach(players ->{
			players.sendMessage(Main.pre + "§cDer" + getName() + " §cist nun vorbei");
		});
		Main.getPlugin().getBoostermanager().getAktivboost().remove(this);
	}
}