package com.kingston.mmorpg.game.player.event;

import com.kingston.mmorpg.framework.eventbus.BaseEvent;
import com.kingston.mmorpg.game.scene.actor.Player;

public class PlayerLoginEvent implements BaseEvent {
	
	private Player player;
	
	public PlayerLoginEvent(Player player) {
		this.player = player;
	}
	
	@Override
	public Player getOwner() {
		return player;
	}

}
