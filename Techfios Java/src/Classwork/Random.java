package Classwork;

public class Random
{
public static void main (String []args)
{
Random rand = new Random();
int  n = rand.nextInt(20) + 1;
int guess=1;
while (guess!=n)
{
System.out.println("Guess No. " + guess);
guess++;
}
}
}
