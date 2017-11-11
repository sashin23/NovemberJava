package Homework;

public class Countries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String country [][]= new String [2][3];
		country [0][0]= "Greece";
		country [0][1]= "France"; 
		country [0][2]= "Ireland";
		country [1][0]= "England";
		country [1][1]= "Spain";
		country [1][2]= "Turkey";

		for (int rownum=0; rownum<country.length; rownum++)
		{
		for (int colnum=0; colnum<country[0].length; colnum++)
		{System.out.println(country[rownum][colnum]);}
		}

	}

}
