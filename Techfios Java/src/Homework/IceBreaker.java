package Homework;

import java.util.Random;

import javax.swing.JOptionPane;

public class IceBreaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int  n = rand.nextInt(5) + 1;
		JOptionPane.showMessageDialog(null, "Your number is: " + n + " \n\nPress OK to continue.");
		if (n==1)
		JOptionPane.showInputDialog("What is your number 1 holiday destination?");
		else if (n==2)
		JOptionPane.showInputDialog("What are 2 things you never leave your home without?");
		else if (n==3)
		JOptionPane.showInputDialog("Where did your class go for field trip in 3rd grade?");
		else if (n==4)
		JOptionPane.showInputDialog("Name a movie you have watched more than 4 times!");
		else
		JOptionPane.showInputDialog("Tell us about your top 5 favorite bands!");

	}

}
