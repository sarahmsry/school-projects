//Name: Sarah Masry
//PantherID: 002519149
//Due Date: Jan 23

import java.util.Scanner;

public class hw1_task2{
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Input string to swap: "); //Prompts user to enter a string to be swapped
		String str = input.nextLine(); //Assigns string entered by the user to variable str
		System.out.println(swapLetterPairs(str)); 
		
		System.out.println("Input number to swap: "); //Prompts user to enter a number to be swapped
		int number = input.nextInt(); //Assigns number entered by the user to variable number
		System.out.println(swapDigitPairs(number)); 
	}
	
	public static int swapDigitPairs(int number) { //Method accepts int parameter
		int res = 0; 
		int a = 1; 
		while(number > 9) { //While loop for if the number variable is greater than 9
			res += a * 10 * (number % 10); 
			number /= 10;
			res += a * (number % 10);
			number /= 10;
			a *= 100;
		}
		return res + a * number; //returns int result plus outcome of a times number 
	}
	
	public static String swapLetterPairs(String str) { //Method accepts a string parameter
		 char[] array = str.toCharArray(); 
		 
		    for(int a = 0; a <= array.length - 2; a += 2) { //For loop swaps each opposite letter
		        char q = array[a];
		        array[a] = array[a+1];
		        array[a+1] = q;
		    } //If the string has an odd number of letters the last one stays the same
		    
		    return new String(array); 
		}
	}