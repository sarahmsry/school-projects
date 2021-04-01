//Name: Sarah Masry
//PandtherID: 002519149
//Due: Feb 6

import java.util.*;
public class hw2_task1{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //Scanner initialized
		Random random = new Random(); //Random initialized 
		
		double max = 0; 
		double tax = 0;
		int upperBound = 15; //Sets the limit for Random to select from
		int randomNum = random.nextInt(upperBound); 
		System.out.println("Random number of people: " + randomNum); //Prints out a random number 
		
		for(int i = 1; i <= randomNum; i++) { //Asks for incomes based on the random number assigned
			System.out.println("Enter income amount: "); //Prompts user to enter an income amount
			double income = input.nextDouble();
			//The following if and if else statements calculate tax based on the given incomes
			if(income < 750) { 
				tax = income * 0.01;
				System.out.println("Required tax is $" + tax);
				if(max < tax)
					max = tax;
			} else if(income >= 750 && income <= 2500) {
				tax = (income * 0.02) + 7.5;
				System.out.println("Required tax is $" + tax);
				if(max < tax)
					max = tax;
			} else if(income >= 2500 && income <= 5000) {
				tax = (income * 0.04) + 82.5;
				System.out.println("Required tax is $" + tax);
				if(max < tax)
					max = tax;
			} else if(income >= 5000 && income <= 8000) {
				tax = (income * 0.05) + 142.5;
				System.out.println("Required tax is $" + tax);
				if(max < tax)
					max = tax;
			} else if(income > 8000) {
				tax = (income * 0.06) + 230.0;
				System.out.println("Required tax is $" + tax);
				if(max < tax)
					max = tax;
			}
			max = Math.max(max, income); //Stores max value
	}
		System.out.println("The person with the maximum amount of taxes has $" + max + " due. "); /*Prints max value
																									out of all*/
}
}