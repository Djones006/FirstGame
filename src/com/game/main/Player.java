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
	}

	
	public void render(Graphics g) {
		
		if(id == ID.Player)
			g.setColor(Color.white);
		else if(id == ID.Player2)
			g.setColor(Color.blue);
		g.fillRect(x, y, 32, 32);
		
	}

}