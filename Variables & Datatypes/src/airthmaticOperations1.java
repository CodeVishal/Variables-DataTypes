
public class airthmaticOperations1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Operations of two integers always results into integers
		// Example 1
		int x = 3;
		int y = 2;
		int z = x/y;
		System.out.println(z);
		
		// Operation of two integers & result stored into double
		int a = 3;
		int b = 2;
		double c = a/b;
		System.out.println(c);
		
		// Operations of two doubles & stored into doubles
		double p = 3.0;
		double q = 2.0;
		double r =p/q;
		System.out.println(r);
		
		// Operations of two doubles & stored into integers results into error
		// Type mismatch: cannot convert from double to int
		double j = 3.0;
		double k = 2.0;
		//int l = j/k;
		
		
		// Example 5
		int marks1 = 20;
		int marks2 = 40;
		int marks3 = 50;
		
		double average = (marks1 + marks2 + marks3)/3;
		
		System.out.println(average);

	}

}
