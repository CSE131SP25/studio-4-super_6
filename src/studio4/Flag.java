package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenRadius(0.05);
		StdDraw.setPenColor(70, 96, 156);
		StdDraw.filledRectangle(0.5, 0.5, 0.45, 0.3);
		StdDraw.setPenColor(255, 150, 3);
		StdDraw.filledCircle(0.2, 0.65, 0.1);
		StdDraw.setPenColor(250, 250, 250);
		StdDraw.filledRectangle(0.75,0.5,0.05,0.3);
		StdDraw.filledRectangle(0.5, 0.35, 0.45, 0.05);

		
	}
}