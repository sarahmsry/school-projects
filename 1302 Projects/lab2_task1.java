//Name: Sarah Masry
//PantherID: 002519149
//Due Date: Jan 22

public class lab2_task1{
	
	public static void main(String[] args) {
		double m = 49+5;
		if(m%2 == 0) { //decides whether m is even or not, if even the first part of the if statement is executed
			double sum1 = 0; //starting count at 0
			for(double a = 1; a < m; a += 2) { //this loop runs until it reaches m
				double equal = 1/a;
				sum1 += equal; //finds sum based on whatever the above equal variable is 
			}
		System.out.println("The result of the first equation is: " + sum1); //prints value from calculated sum
			double sum2 = 0; //starts off at zero to count for equation 2
			for(double b = 1; b < m; b += 4) {
				double equal2 = 1/(2*b+1);
				sum2 += equal2; //once again updates sum variable based on the previous equal2 variable
				}
		System.out.println("The result of the second equation is: " + sum2); //prints the value from the calculated sum
			}
		
		else { //executed if m is odd
			double sum1 = 0; //starts count at zero
			for(double c = 2; c <= m; c += 2) { //loop runs until it reaches m
				double equal = 1/c;
				sum1 += equal;
			}
			System.out.println("The result of the first equation is: " + sum1);
			double sum2 = 0;
			for (double d = 1; d <= m; d += 4) {
				double equal2 = 1/(3*d-1);
				sum2 += equal2;
			}
			System.out.println("The result of the second equation is: " + sum2);
		}
	}
}


	
