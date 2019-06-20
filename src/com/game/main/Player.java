package com.game.main;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject{
	
	public Player(int x, int y, ID id) {
		
		super(x,y,id);
		
	}

	
	public void tick() {
		
		x += velx;
		y += vely;
		
		x = Game.clamp(x, 0, Game.WIDTH - 45);
		y = Game.clamp(y, 0, Game.HEIGHT - 66);
	}

	
	public void render(Graphics g) {
		
		g.setColor(Color.white);
		g.fillRect(x, y, 32, 32);
		
	}

}
