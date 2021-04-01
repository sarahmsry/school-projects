//Name: Sarah Masry
//PandtherID: 002519149
//Due: Feb 6

import java.util.*;
public class hw2_task2{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //Scanner initialized
		while(true) { //Executes while the following is true
			System.out.print("Enter a number: "); //Prompts user to enter a number
			int number = input.nextInt();
			
			while(number > 0) { /*While the number entered is greater than 0, the user can continue to enter a 
									new number each time */
				int digitOccurrences[] = new int [10]; //Initializes array variable and stores up to 10 digits (0-9)
				countTimes(number, digitOccurrences); //Calls countTimes method
				System.out.println(); //Spacer 
				System.out.print("Enter a number:"); //Prompts user to enter a new number
				number = input.nextInt();
			}
		}
	}
	
	public static int [] countTimes(int number, int digitOccurrences[]) { //Method that calculates the occurrence of each digit
		int digit = 1; //Starts counting digit at 1
		while(number > 0) { //Executes while the number is greater than 0
			digit = number%10; //Isolate last number in the sequence
			digitOccurrences[digit]++; //Increments digit
			number = number / 10; //Finds remainder
		}
		System.out.print("Digit:      "); //Aligns digits with occurrences
		for(int i = 0; i < 10; i++) { //Prints digits 0-9 with spaces between each number
			System.out.print(i + "   "); 
		}
		System.out.println(); //Spacer
		System.out.print("Occurrences: "); 
		for(int i = 0; i < 10; i++) { //Prints the number of occurrences for each digit with spaces between each number
			System.out.print(digitOccurrences[i] + "   "); 
		}
			System.out.println(); //Spacer
			return digitOccurrences; 
	}
}