//Name: Sarah Masry
//PandtherID: 002519149
//Due: Jan 23

import java.util.Scanner;
public class hw1_task1 {
	
    public static void ChristTree(int n1, int n2){ //Method ChristTree accepts two parameters
    	int x = n1;
    	int y = n2;
        int a = 1;
        for(int segment = 0; segment <= n1; segment++){ /*For loop for segment, increments segment 
        												until it is less than or equal to n1*/
            for(int i = a; i <= n2; i++){ //Nested for loop increments i until it is less than or equal to n2
                int seg = segment; 
                while(x < n1){ 
                    System.out.print(" ");
                    seg++; //Increments seg while x < n1
                }
                for (int q = n2 - 0; q >= i; q--) /*This for loop adds the spaces going down the sides of the tree depending
                									on the number the user has entered*/
                	System.out.print(" ");
                for (int q = 1; q <= i; q++) /*These next 2 for loops fill the tree with stars for each line depending on the 
                								given height/segments*/
                	System.out.print("*");
                for (int q = 0;q < i; q++)
                	System.out.print("*");
                	System.out.println();
            }
            a = a + 1;
            n2 = n2 + 1;
        }
        	for(int e = 2; e <= (x*y-1)/2; e++) /*Creates the base of the tree, starting with the spaces on the bottom line*/
        		System.out.print(" ");
        		System.out.println("*");
        	for(int e = 2; e <= (x*y-1)/2; e++) /*e starts at 2, incrementing until it equals (x*y-1)/2 and prints out a 
        											space and star at the bottom*/
        		System.out.print(" ");
        		System.out.println("*");
        	for(int e = 2; e <= ((x*y-1)/2)-3; e++)/*e starts at 2, incrementing until it equals ((x*y-1)/2)-3 and prints out 
														a space and star at the bottom line*/
        		System.out.print(" ");
        	for(int e = 2; e <= 10; e++)
        		System.out.print("*");
    }
    public static void main(String[] args){
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter number of segments: "); //Prompts user to enter a number of segments
        int n1 = inputDevice.nextInt(); //Assigns previous value to variable n1
        System.out.println("Enter the height (number of rows in each segment)"); //Prompts user to enter a number for height
        int n2 = inputDevice.nextInt(); //Assigns previous value to variable n2 
        ChristTree(n1, n2); //Calls method ChristTree 
    }
}