package controller;

import model.Logic;
import processing.core.PApplet;

public class Controller {

	PApplet app;
	public Logic logic;
	
	public Controller(PApplet app) {
		this.app = app;
		logic = new Logic (app);
	}
	
	public void paintSquare() {
		
		logic.paintSquare();
		
	}
	
	public void paintCircle() {
		
		logic.paintCircle();
		
	}
	
}
