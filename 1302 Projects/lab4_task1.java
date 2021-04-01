//Name: Sarah Masry
//PandtherID: 002519149
//Due: Feb 5

import java.util.*;
public class lab4_task1{ 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: "); //Prompts the user to enter a number
		int num = input.nextInt();
		countDigits(num); //Calls countDigits method
	
}
	public static int countDigits(int num) { 
		int count = 0; //Initializes count variable
		while(num != 0) { /*While loop that counts how many digits are in the entered integer, so long as the integer is less 
							than or equal to 10 digits long*/
			num = num / 10;
			count++; 
		}
		System.out.println("The number of digits is: " + count);
		return (num);
	}
}