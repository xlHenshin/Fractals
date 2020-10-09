package model;

import processing.core.PApplet;

public class Logic extends PApplet {

	PApplet app;
	public Square square;
	public Figure circle;
	
	public Logic (PApplet app) {
		
		this.app = app;
		square = new Square(400, 400, app);
		circle = new Circle(400, 400, app);
		
	}
	
	public void paintSquare() {
		
		square.paintObject();
		
	}
	
	public void paintCircle() {
		
		circle.paintObject();
		
	}
	
}
