
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		String g = "";
		int re = new Random().nextInt(100);
		System.out.println(re);
		// 2. Print out the random variable above
		
		// 11. Repeat steps 1 to 10 ten times
		
		// 1. Ask the user for a guess using a pop-up window, and save their response 
		for (int i = 1; i < 100000; i++) {
			
		
String f = JOptionPane.showInputDialog("gues the number (it is between 1 and 100, "+ g);
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))

int m = Integer.parseInt(f);	
g += f + ", ";
		//JOptionPane.showMessageDialog(null, g);
			// 5. if the guess is correct
				if (m == (re)) {
					JOptionPane.showMessageDialog(null, "You Won");
					System.exit(0);
				}
				else {
					JOptionPane.showMessageDialog(null, "You didnt gues the numnber try again");
				}
				}
		// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low

		// 13. Tell them they lose
		
	}

}


