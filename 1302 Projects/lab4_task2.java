//Name: Sarah Masry
//PandtherID: 002519149
//Due: Feb 5

import java.util.*;
public class lab4_task2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name: "); //Prompts user to enter their name 
		String name = input.nextLine();
		
		if (name.charAt(0) >= '0' && name.charAt(0) <= '9'){ /*Checks if the first character of the entered input is a number
																or a letter, if it is a number an error message is displayed*/
			  System.out.println("Invalid input");
			}
		else { //If the first character is a letter, the users name is printed along with the length of their name
			System.out.println("My name is: " + name);
			System.out.println("The string length of '" + name + "' is " + name.length());
		}
		
	}
}