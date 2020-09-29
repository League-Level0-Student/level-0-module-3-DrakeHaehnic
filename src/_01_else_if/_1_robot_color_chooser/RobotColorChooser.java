
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
	
		Robot a = new Robot();
		a.changeRobot("https://i.etsystatic.com/20770271/c/2123/1688/127/372/il/a0d8ae/2238302975/il_340x270.2238302975_eacy.jpg");
		a.setSpeed(3000);
		a.setPenWidth(10);
		a.penDown();
		for (int i = 0; i < 99999999; i++) {
				for (int c = 0; c <2000000000; c++) {
			a.move(c);
			a.turn(200);
			a.move(c);
			a.turn(200);
		//	String b = JOptionPane.showInputDialog("name your favorite color");
			//if (b .equals ("yellow")) {
				a.setPenColor(Color.MAGENTA);
		//	}
		//	else if (b .equals ("magenta")) {
				a.setPenColor(Color.yellow);
		//	}
			
		//	else if (b .equals ("black")) {
				a.setPenColor(Color.PINK);
			//}
		//	else if (b .equals ("pink")) {
				a.setPenColor(Color.black);
		//	}
		//	else{
				a.setRandomPenColor();
			//}
			a.move(c);
			a.turn(200);
			a.move(c);
			a.turn(200);
		}
		
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
}