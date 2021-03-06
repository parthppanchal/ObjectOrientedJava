package week2.creatingGUIsUsingPApplet;

import processing.core.PApplet;

public class MyDisplay extends PApplet {
	
	public void setup() {
		size(400, 400);
		background(200, 200, 200);
	}
	
	public void draw() {
		strokeWeight(10);
		fill(255, 255, 0);
		ellipse(200, 200, 390, 390);
		fill(0, 0, 0);
		ellipse(120, 130, 50, 70);
		ellipse(280, 130, 50, 70);
		noFill();
		strokeWeight(15);
		arc(200, 200, 250, 250, PI/9, PI*8/9);
	}
}
