package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {

		//Flag
		StdDraw.setPenColor(34,150,34);
		StdDraw.filledRectangle(0.5, 0.5, 0.48, 0.28);


		//Head
		StdDraw.setPenColor(51, 255, 51);
		StdDraw.filledEllipse(0.5, 0.5, 0.2, 0.1);

		//Left Eye
		StdDraw.setPenColor(0, 200, 0);
		StdDraw.filledCircle(0.375, 0.575, 0.05);
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledCircle(0.375, 0.575, 0.035);
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledCircle(0.375, 0.575, 0.0125);

		//Right Eye
		StdDraw.setPenColor(0, 200, 0);
		StdDraw.filledCircle(0.625, 0.575, 0.05);
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledCircle(0.625, 0.575, 0.035);
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledCircle(0.625, 0.575, 0.0125);

		//Smile
		double[] x = {0.475, 0.525, 0.525, 0.475};
		double[] y = {0.48, 0.48, 0.405, 0.405};

		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledPolygon(x, y);
		StdDraw.filledEllipse(0.5, 0.405, 0.025, 0.015);
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.setPenRadius(0.01);
		StdDraw.arc(0.5, 1.98, 1.5, 265, 275);

		

	}
}