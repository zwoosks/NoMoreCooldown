package me.zwoosks.noCooldown;

import org.bukkit.attribute.Attribute;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventManager implements Listener {
	
	@EventHandler
	public void onPlayerJoinEvent(PlayerJoinEvent e) {
		e.getPlayer().getAttribute(Attribute.GENERIC_ATTACK_SPEED).setBaseValue(16.0D);
	}
	
}