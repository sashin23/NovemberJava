package Homework;

import java.util.Scanner;

public class Census {
	public static void main (String []args)
	{
	Scanner reader = new Scanner(System.in);
	Scanner reader1 = new Scanner(System.in);
	System.out.println("What is your name?");
	String name = reader.next();
	System.out.println("What is your age?");
	int age = reader1.nextInt();
	System.out.println("What is your occupation?");
	String occupation = reader.next();
	System.out.println("Name: " + name);
	System.out.println("Age: " + age);
	System.out.println("Occupation: " + occupation);
	}
}
