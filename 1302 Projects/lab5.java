//Name: Sarah Masry
//PantherID: 002519149
//Due Date: Feb 12

import java.util.*;
public class lab5{
	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an array of integers: \nNumber of elements: "); /*Prompts user to enter number of 
																					elements in their array*/
		int elements = input.nextInt();
		int[] array = new int[100]; //Creates array that can store 100 values (memory-length of 100)
		System.out.println("Enter the elements of the array: "); //Prompts user to enter each number in the array
			for(int i = 0; i < elements; i++){ /*For loop asks the user to enter a value for each number of elements
												they entered*/
				array[i]=input.nextInt();  
		}
		System.out.println("Smallest gap is: " + minGap(array, elements)); /*Calls the method and displays smallest gap
																				in the array*/
	}
	public static int minGap(int[] array, int elements) { //Calculates the smallest gap 
		int min = Math.abs(array[1] - array[0]); //Calculates gap 
		if(array.length < 2) { //Returns 0 for array length less than 2
	    	return(0);
	    }
		else {
		for (int i = 0; i < elements-1; i++) { //Calculates the difference between each set of numbers in the array
			int temp = Math.abs(array[i] - array[i+1]);	
			if(temp < min) { //Finds smallest gap
				min = temp;
			}
			
	}
		return min; 
}
}
}
