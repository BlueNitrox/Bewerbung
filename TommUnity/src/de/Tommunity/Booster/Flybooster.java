package de.Tommunity.Booster;

import org.bukkit.Bukkit;

import de.Tommunity.Main.Main;

public class Flybooster extends Boost{

	public Flybooster() {
		setName("§d§lFly-Booster");
		setLenth(60);
	}

	@Override
	public void onStart() {
		Bukkit.getOnlinePlayers().forEach(players ->{
			players.sendMessage(Main.pre + getName() + "§a für " + getLenth() + " §aMinuten gezündet");
			players.setAllowFlight(true);
			players.setFlying(true);

		});
		startTicking();
	}

	@Override
	public void onEnd() {
		Bukkit.getOnlinePlayers().forEach(players ->{
			players.sendMessage(Main.pre + "§cDer" + getName() + " §cist nun vorbei");
			players.setAllowFlight(false);
			players.setFlying(false);
		});
		Main.getPlugin().getBoostermanager().getAktivboost().remove(this);
	}

}