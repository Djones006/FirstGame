package com.game.main;

import java.awt.Graphics;

public abstract class GameObject {
	
	protected int x, y;
	protected ID id;
	protected int velx, vely; //velocity in x and y directions
	
	
	public GameObject(int x, int y, ID id) {
		
		this.x = x;
		this.y = y;
		this.id = id;
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
	
	public void setx(int x) {
		
		this.x = x;
	}
	public void sety(int y) {
		
		this.y = y;
	}
	public void setID(ID id) {
		
		this.id = id;
	}
	public void setvelx(int velx) {
		
		this.velx = velx;
	}
	public void setvely(int vely) {
		
		this.vely = vely;
	}
	
	public int getx() {
		
		return x;
	}
	public int gety() {
		
		return y;
	}
	public ID getID() {
		
		return id;
	}
	public int getvelx() {
		
		return velx;
	}
	public int getvely() {
		
		return vely;
	}

}
