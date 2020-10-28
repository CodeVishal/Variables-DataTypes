import java.util.Scanner;

/*
 * 	Write Java code below which  —

  	Asks the user to input three integer variables: a, b, and c

	Does the following calculation: a*b+c

	Prints out the value obtained in step 2
 */

public class UserInput_Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int b;
		int c;
		
		// Creating object of Scanner
		Scanner input = new Scanner(System.in);
	   
		// Taking value from user
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		// Print output 
		System.out.println("output =" + (a*b+c));

	}

}
