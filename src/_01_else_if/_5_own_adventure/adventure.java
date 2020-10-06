package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class adventure {
public static void main(String[] args) {
	JOptionPane.showInputDialog("Are you ready for an adventure?");
	String a = JOptionPane.showInputDialog("well you get one anyway. ye be strandid on a iland (apples new product) do you want to stay on the iland?");
	if (a .equals ("no")) {
		JOptionPane.showMessageDialog(null, "then get off!");
	}
	else {
		JOptionPane.showInputDialog("");
	}
}
}
