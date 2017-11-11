package Classwork;

public class GlobalLocal
{

static int c=500; 
//Global variable. Can be called by any function. 
//Placed under class, outside of main function.

int b = 300; //non static global variable

public static void main (String []args)
{
age();
salary();
apples();

GlobalLocal y = new GlobalLocal();
System.out.println(y.b); //printing a non static global variable
}

public static void age()
{
int x=3; //local variable
System.out.println(x);
}


public static void salary()
{
int y=30000; //local variable
System.out.println(y);
}

public static void apples()
{
System.out.println(c);
}}
