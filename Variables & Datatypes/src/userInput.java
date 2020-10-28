import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberA;
		int numberB;
		
		// Create object of Scanner class 
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter value of a");
		// nextInt() ---> Function of scanner class
		numberA = input.nextInt();
		
		System.out.println("Enter value of b");
		numberB = input.nextInt();
		
		System.out.println(numberA + numberB);

	}

}
