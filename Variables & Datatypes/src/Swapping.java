
/*
 *  Description
	Two variables, a and b have been initialized here for you. You have to write code to exchange the values of a and b.
	The code for printing the values of a and b has already been written here for you.
 */
public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		a = 1;
		b = 2;
		
		// Writing code to exchange values of a & b
		
		int temp;
		temp = a;
		a = b;
		b = temp;
		
		// Printing swapped values 
		System.out.println("New value of a = " + a);
		System.out.println("New value of b = " + b);

	}

}
