package Homework;

public class DoubleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Food [][] = new String[3][4];

		Food[0][0] = "Pasta";
		Food[0][1] = "Noodles";
		Food[0][2] = "Macaroni";
		Food[0][3] = "Pizza";
		Food[1][0] = "Fettuccine";
		Food[1][1] = "Chow Mein";
		Food[1][2] = "Chop Suey";
		Food[1][3] = "Ramen";
		Food[2][0] = "Steak";
		Food[2][1] = "Burrito";
		Food[2][2] = "Taco";
		Food[2][3] = "Quesadilla";

		/*System.out.print("1st row, column 2 is ");
		System.out.println(Food[0][1]);
		System.out.print("3rd row, column 4 is ");
		System.out.println(Food[2][3]);

		int rows=Food.length;
		int cols=Food[0].length;
		*/
		for (int a=0; a<Food.length; a++)
		{
		//for loop within a for loop

		    for (int b=0; b<Food[1].length; b++)
		    {System.out.println(Food[a][b]);}
		}


	}

}
