package model;

import processing.core.PApplet;

public abstract class Figure extends PApplet {

	PApplet app;
	
	protected int posX;
	protected int posY;
	
	public Figure(int posx, int posy, PApplet app) {
		
		this.posX = posx;
		this.posY = posy;
		this.app = app;
	}
	
	protected abstract void paintObject();

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	
}
