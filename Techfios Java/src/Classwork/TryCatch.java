package Classwork;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner reader = new Scanner(System.in);
			System.out.println("Your 1st int?");
			int n = reader.nextInt();
			System.out.println("Your 2nd int?");
			int m = reader.nextInt();
			int sum = n+m;

			System.out.println("Sum is " + sum);
			} catch (Exception e) {System.out.println("Error: Please provide a number.");}

	}

}
