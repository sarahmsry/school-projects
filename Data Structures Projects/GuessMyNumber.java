import java.util.*;

public class GuessMyNumber{
	public static void main(String[] args) {
		System.out.println("Enter n: ");
		System.out.println("Welcome to Guess My Number! ");
		Scanner inputDevice = new Scanner(System.in);
		int n = inputDevice.nextInt();
		if(n <= 0) { //Checks if n is zero or a negative number 
			System.out.println("Enter a positive integer for n: "); //Prompts user to enter positive integer 
			System.out.println("Welcome to Guess My Number! ");
			n = inputDevice.nextInt();
		}
		System.out.println("Please think of a number between 0 and " + (n-1) + ". "); 
		//Finds mid point 
		int upperBound = n-1; 
		int lowerBound = 0;
		int guess1; 
		String r;
		
		do
		{
			guess1 = (int)Math.ceil(((upperBound+lowerBound)/2) + 0.5); //Rounds to highest number
			System.out.println("Is your number " + guess1 + " ? ");
			System.out.println("Please enter C for correct, H for too high, and L for too low. ");
			System.out.println("Enter your response (H/L/C): ");
			r = inputDevice.next();
			
		while(!(r.equals("h") || r.equals("H") || r.equals("c") || r.equals("C") || r.equals("l") || r.equals("L"))) {
			inputDevice.next();
			System.out.println("Enter your response (H/L/C): "); //User must enter H/L/C
			r = inputDevice.next();
		}
		
		if(r.equals("H") || r.equals("h")) {
			upperBound = (upperBound+lowerBound)/2; //Finds middle element if guess is too high
		}else if(r.equals("L") || r.equals("l")) {
			lowerBound = (upperBound+lowerBound)/2; //Finds middle element if guess is too low 
		}
		}
		//Ends the game as long as guess is not zero or n 
		while(!(r.equals("C") || r.equals("c") && guess1 == 0 && guess1 == n-1)); 
			System.out.println("Thank you for playing Guess My Number! ");
		}
	}