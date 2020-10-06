package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class happy {
public static void main(String[] args) {
	String a = JOptionPane.showInputDialog("Are ye hapy kid!");
	if (a .equals ("yes")) {
		JOptionPane.showMessageDialog(null, "Then keep doing whatever you are doing.");
	}
	else {
	String b =	JOptionPane.showInputDialog("Do you want to be happy?");
		if (b .equals("no")) {
			JOptionPane.showMessageDialog(null, "Then keep doing whatever you are doing.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Then change something.");
		}
	}
	
	
}
}
