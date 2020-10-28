import java.util.Scanner;

/*
  Write a Java program to take the temperature from the user in Celsius, 
  convert it into Fahrenheit and display it to the user. You can use the following formula for this purpose:
  F=9C/5+32
  Where, C is the temperature in Celsius and F is the temperature in Fahrenheit.
  Note: You can assume that C and F are integer values.
  Sample Input: 1
  Sample Output: 33
 */
public class UserInput_Assigment2 {

	public static void main(String[] args) {
		
		int C;
		int F;
		
		// Creating object of Scanner class
		
		Scanner input = new Scanner(System.in);
		
		// Take input Temp in celcius
		
		C = input.nextInt();
		F = 9*C/5+32;
		
		System.out.println(F);
		
	}
}
