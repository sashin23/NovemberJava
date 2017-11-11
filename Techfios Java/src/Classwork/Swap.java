package Classwork;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int me = 25;
		int sis = 30;

		System.out.println("My age is " + me + ", and my sister's age is " + sis);
		System.out.println("Our total age is " + (me+sis));

		int me1 = 25;
		int sis1 = 30;
		int temp;

		temp = me1;
		me1 = sis1;
		sis1 = temp;


		System.out.println("My age is " + me1 + ", and my sister's age is " + sis1);
		System.out.println("Our total age is " + (me1+sis1));

		if (me1>=21)
		{System.out.println("I can drink.");}
		if (sis1<=21)
		{System.out.println("I cannot drink.");}

	}

}
