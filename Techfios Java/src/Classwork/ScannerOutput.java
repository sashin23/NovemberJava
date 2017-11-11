package Classwork;

import java.util.Scanner;

public class ScannerOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = reader.next();

		Scanner reader2 = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = reader2.nextInt();

		Scanner reader3 = new Scanner(System.in);
		System.out.println("What is your city?");
		String city = reader3.next();

		System.out.println("Your name is " + name + ". You are " + age + " years old. And you live in " + city + "." );

	}

}
