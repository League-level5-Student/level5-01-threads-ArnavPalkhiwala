package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded extends Thread {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.

	public OlympicRings_Threaded(String numberInWords) {

	}

	public static void main(String[] args) {

		Robot r1 = new Robot(200, 300);
		Robot r2 = new Robot(300, 400);
		Robot r3 = new Robot(400, 300);
		Robot r4 = new Robot(500, 400);
		Robot r5 = new Robot(600, 300);

		r1.setPenColor(Color.BLUE);
		r1.penDown();

		r2.setPenColor(Color.YELLOW);
		r2.penDown();

		r3.setPenColor(Color.BLACK);
		r3.penDown();

		r4.setPenColor(Color.GREEN);
		r4.penDown();

		r5.setPenColor(Color.RED);
		r5.penDown();

		for (int i = 0; i < 24; i++) {

			r1.move(30);
			r1.turn(15);

		}

		for (int i = 0; i < 24; i++) {

			r2.move(30);
			r2.turn(15);

		}
		for (int i = 0; i < 24; i++) {

			r3.move(30);
			r3.turn(15);

		}
		for (int i = 0; i < 24; i++) {

			r4.move(30);
			r4.turn(15);

		}
		for (int i = 0; i < 24; i++) {

			r5.move(30);
			r5.turn(15);

		}

	}

}
