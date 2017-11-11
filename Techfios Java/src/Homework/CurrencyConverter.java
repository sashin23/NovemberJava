package Homework;

import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the dollar amount you would like to convert");
		int dollar = reader.nextInt();
		double yen = dollar*111.75;
		System.out.println("$" + dollar + " is approximately worth " + yen + " yen.");

	}

}
