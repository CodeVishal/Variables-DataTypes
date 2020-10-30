import java.util.Scanner;

/*
 * The following variables have been initialized for you:
int a;
float f;
double d;
You have to cast the variable into different data types as follows:
Cast a as float to a variable x.
Cast f as an integer to a variable y.
Cast d as float to a variable z.
The following variables have been initialized for you:
int a;
float f;
double d;
You have to cast the variable into different data types as follows:
Cast a as float to a variable x.
Cast f as an integer to a variable y.
Cast d as float to a variable z.
Hint: You have to initialize the variables x,y and z of proper data types.

Note: The required code to take user input is already written for you. Similar to nextInt(), nextFloat() is used to take
 floating point data as input and nextDouble() takes a double value as input.
 */
public class CastingJavaAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		// Take input a ,f,d from user
		
		int a = input.nextInt();
		float f = input.nextFloat();
		double d = input.nextDouble();
		
		//Initialize x,y,z
		float x;
		int y;
		float z;
		
		// Do casting
		x = (float)a;
		y = (int)f;
		z = (float)d;
		
		System.out.println("x= "+x+ " y="+y+" z="+z);
		

	}

	
}
