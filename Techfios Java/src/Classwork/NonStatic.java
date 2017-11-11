package Classwork;

public class NonStatic {
	
		/*To call a non static function, we have to make an object. An object is an instance of
		a class. If static is not mentioned in a function, it becomes non static.*/

		public static void main (String []args)
		{
		NonStatic x = new NonStatic(); //instance of a class
		x.car();
		x.flower();
		x.color();
		}

		public void car()
		{
		System.out.println("Toyota");
		}

		public void flower()
		{
		System.out.println("Rose");
		}

		public void color()
		{
		System.out.println("Green");
		}

}
