package Classwork;

import javax.swing.JOptionPane;

public class TextboxOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reader;
		String name;
		reader = JOptionPane.showInputDialog("What is your name?");
		name = String.valueOf(reader);
		JOptionPane.showMessageDialog(null, "Your name is " + name);
	}

}
