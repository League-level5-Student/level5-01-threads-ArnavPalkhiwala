package _02_Advanced_Robot_Race;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0.
	// This time, use threads to make all of the robots go at the same time.

	public static void main(String[] args) {


		Robot[] robot = new Robot[5];


		for (int i = 0; i < robot.length; i++) {

			Robot r = new Robot();
			robot[i] = r;
			r.setSpeed(10);

			
			r.setX(i*200 + 25);
			r.setY(540);

			
		}		
		
		
		Random s = new Random(51);
		
		boolean finished = false;

		while (!finished) {
			
		
		for (int i = 0; i < robot.length; i++) {
			
			robot[i].move(s.nextInt(51));
			Robot r = robot[i];
			
			Thread t1 = new Thread(()-> r.move(s.nextInt(51)));
			t1.start();
			
			if (robot[i].getY() <= 0) {
				
				JOptionPane.showMessageDialog(null, "You are the winner!");
				finished = true;
				
			}

		}
		}
			

	
	}

}
