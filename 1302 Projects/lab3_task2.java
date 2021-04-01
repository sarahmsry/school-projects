//Name: Sarah Masry
//PandtherID: 002519149
//Due: Jan 29

import java.util.Scanner;

public class lab3_task2{ 
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int sum = 0; 
	    int inc = 0; 
	    int num;
	    double avg; 
	    
	    System.out.print("Enter positive numbers (when finished enter -1): "); //Prompts the user to enter a set of numbers
	    while ((num = input.nextInt()) >= 0) { //allows the user to enter as many positive integers as they want 
	    	System.out.println();
	    	sum += num; //Add whatever number the user entered to the sum
	        inc++; //Counts input by adding one for each iteration
	    }
	    
	      if (num <= 0) { //if statement to calculate and print the average once a negative number is entered
	    	  avg = sum / inc;
		      System.out.println("The average is " + avg);  
		      }
	}
}
