package com.game.main;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {
	
	LinkedList<GameObject> object = new LinkedList<GameObject>();
	
	public void tick() {
		
		for(int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			tempObject.tick();
		}
	}
	
	public void render(Graphics g) {
		
		for(int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			tempObject.render(g);
		}
	}
	
	public void addGameObject(GameObject object) {
		
		this.object.add(object);
	}
	
	public void removeGameObject(GameObject object) {
		
		this.object.remove(object);
	}
	
	

}
