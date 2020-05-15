package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded extends Thread {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.

	public static void main(String[] args) {

		Robot r1 = new Robot(200, 300);
		Robot r2 = new Robot(300, 400);
		Robot r3 = new Robot(400, 300);
		Robot r4 = new Robot(500, 400);
		Robot r5 = new Robot(600, 300);

		r1.setPenColor(Color.BLUE);
		r1.setSpeed(10);
		r1.penDown();

		r2.setPenColor(Color.YELLOW);
		r2.setSpeed(10);
		r2.penDown();

		r3.setPenColor(Color.BLACK);
		r3.setSpeed(10);
		r3.penDown();

		r4.setPenColor(Color.GREEN);
		r4.setSpeed(10);
		r4.penDown();

		r5.setPenColor(Color.RED);
		r5.setSpeed(10);
		r5.penDown();

		Thread t1 = new Thread(() -> run(r1));
		Thread t2 = new Thread(()-> run(r2));
		Thread t3 = new Thread(()-> run(r3));
		Thread t4 = new Thread(()-> run(r4));
		Thread t5 = new Thread(()-> run(r5));

		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

	static void run(Robot r) {

		for (int i = 0; i < 24; i++) {

			r.move(30);
			r.turn(15);

		}

	}

}
