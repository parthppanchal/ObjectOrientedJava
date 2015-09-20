package week2.creatingGUIsUsingPApplet;

import processing.core.PApplet;
import processing.core.PImage;

public class MyPApplet extends PApplet {
	private String URL = "../data/palmTrees.jpg";
	private PImage backgroundImg;
	
	public void setup() {
		size(200, 200);
		backgroundImg = loadImage(URL, "jpg");
		stroke(0);
	}
	
	public void draw() {
		// Add drawing code for PApplet
		image(backgroundImg, 0, 0);
		backgroundImg.resize(0, height);
		fill(180 + (int) 75 * (1 - (float) hour()/24), 209, 0);
		int[] colour = sunColour(hour());
		fill(colour[0], colour[1], colour[2]);
		if (width > height)
			ellipse(width/4, height/5, height/5, height/5);
		else
			ellipse(width/4, height/5, width/5, width/5);
	}
	
	public int[] sunColour(float hours) {
		int[] rgb = new int[3];
		float diffFrom12 = Math.abs(12 - hours);
		float ratio = diffFrom12/12;
		rgb[0] = (int) (255 * ratio);
		rgb[1] = (int) (255 * ratio);
		rgb[2] = 0;
		
		return rgb;
	}
}
