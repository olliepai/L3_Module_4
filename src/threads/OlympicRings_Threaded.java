package threads;

import java.awt.Color;

import javax.swing.JFrame;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String args[]) {
		Robot one = new Robot();
		Robot two = new Robot("vic");
		Robot three = new Robot("batman");
		Robot four = new Robot();
		Robot five = new Robot();

		one.setSpeed(10);
		two.setSpeed(10);
		three.setSpeed(10);
		four.setSpeed(10);
		five.setSpeed(10);

		one.moveTo(550, 450);
		two.moveTo(800, 450);
		three.moveTo(1050, 450);
		four.moveTo(675, 600);
		five.moveTo(925, 600);

		one.setPenColor(Color.BLUE);
		one.setPenWidth(5);
		one.penDown();
		two.setPenColor(Color.BLACK);
		two.setPenWidth(5);
		two.penDown();
		three.setPenColor(Color.RED);
		three.setPenWidth(5);
		three.penDown();
		four.setPenColor(Color.YELLOW);
		four.setPenWidth(5);
		four.penDown();
		five.setPenColor(Color.GREEN);
		five.setPenWidth(5);
		five.penDown();

		new Thread(() -> {
			for (int i = 0; i < 60; i++) {
				one.move(16);
				one.turn(6);
			}
		}).start();

		new Thread(() -> {
			for (int i = 0; i < 60; i++) {
				two.move(16);
				two.turn(6);
			}
		}).start();

		new Thread(() -> {
			for (int i = 0; i < 60; i++) {
				three.move(16);
				three.turn(6);
			}
		}).start();

		new Thread(() -> {
			for (int i = 0; i < 60; i++) {
				four.move(16);
				four.turn(6);
			}
		}).start();

		new Thread(() -> {
			for (int i = 0; i < 60; i++) {
				five.move(16);
				five.turn(6);
			}
		}).start();
	}
}
