package Homework;

public class Weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temperature = 25;
		switch(temperature)
		{
		case 45:
		System.out.println("The weather is chilly today.");
		break;

		case 75:
		System.out.println("The weather is nice today.");
		break;

		case 105:
		System.out.println("The weather is hot today.");
		break;

		default:
		System.out.println("Cannot fetch weather information at the moment."); 
		}

	}

}
