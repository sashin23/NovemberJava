package Classwork;

/*Overloading functions happen when both functions have the same name but different
arguments*/

public class Overloading 
{
public static void main (String []args)
{
numbers(6);
numbers(6.7);
}

public static void numbers(int c)
{
System.out.println(c);
}

public static void numbers(double c)
{
System.out.println(c);
}
}


