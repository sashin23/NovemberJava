package Homework;

public class Weather2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = 189;

		if (t<45)
		{System.out.println("The weather is chilly today.");}
		else if (t<75)
		{System.out.println("The weather is nice today.");}
		else if (t<105)
		{System.out.println("The weather is hot today.");}
		else
		{System.out.println("Cannot fetch weather information at the moment."); }

	}

}
