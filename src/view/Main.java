package view;

import controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet{

	PApplet app;
	public Controller controller;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}

	public void settings() {
		size(800,800);
	}
	
	public void setup() {
		controller = new Controller(this);
		
	}
	
	public void draw() {
		background (0);
		rectMode(CENTER);
	}
	
	public void mouseClicked() {
		
	}
	
	
	
}
