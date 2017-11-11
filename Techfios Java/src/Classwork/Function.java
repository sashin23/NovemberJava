package Classwork;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My name is X");
		country();
		growth(); 
		sum();
		argument_sum(8,7);
		}


		public static void country()
		{
		System.out.println("I am from Japan.");
		}

		public static void growth()
		{
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


		public static void sum()
		{
		int add = 9+8;
		System.out.println(add);
		}


		public static void argument_sum(int a, int b)
		{
		int adding = a+b;
		System.out.println(adding);
		}

		/*public static void subtract()
		{
		 int a*/

	}


