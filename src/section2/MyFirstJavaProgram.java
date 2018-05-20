package section2;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE
		System.out.println("Ni Hao");
		// JOptionPane.showMessageDialog(null, "Roblox is better");
		Robot arnold = new Robot();
		arnold.setSpeed(90);
		arnold.setPenWidth(40);
		arnold.sparkle();
		//arnold.setRandomPenColor();
		arnold.penDown();
		arnold.move(100);
		arnold.turn(90);
		arnold.move(100);
		arnold.turn(90);
		arnold.move(100);
		arnold.turn(90);
		arnold.move(100);
		arnold.turn(90);
		arnold.unSparkle();
	}
}
