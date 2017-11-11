package Classwork;

/*Constructor is an instance method that usually has the same name as class
and is used for assigning a new default value. Constructor should always be 
non static.*/

public class Constructor
{
int age; //variable without values
int salary; //default values are 0,0,0,null
int house;
String name;

Constructor()
{
int age = 20; //in this constructor method we are giving new default values
int salary = 1000;
int house = 2;
String name = "john";

System.out.println(age);
System.out.println(salary);
System.out.println(house);
System.out.println(name);
}

public static void main (String []args)
{
Constructor x = new Constructor(); //we are executing the new constructor method
}
}

