//Name: Sarah Masry
//PantherID: 002519149
//Due Date: Jan 22
import java.util.Scanner;

	public class lab2_task2{
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in); 
			System.out.println("Enter your name: "); //Prompts user to input name
			String name = input.nextLine(); //Assigns whatever the user entered to variable name
			System.out.println("Enter your PantherID: "); //Prompts user to enter PantherID
			int id = input.nextInt(); //Assigns entered ID to variable id
			
			System.out.println("Enter your weight: "); //Prompts user to input weight 
			float weight = input.nextFloat(); //Assigns entered weight to variable weight
			System.out.println("Enter your height: "); //Prompts user to input weight
			float height = input.nextFloat(); //Assigns entered weight to variable weight 
			BMI(weight, height); //Executes BMI method with parameters of height and weight 
		}
		
		public static void BMI(float weight, float height) { //Method to calculate BMI based on user's height and weight 
			float BMI = weight/(height*height)*703;
			if(BMI < 18.5) {
				System.out.println("You are underweight"); /*First part of the if statement 
															executes if calculated BMI is less than 18.5*/
			}
			else if (BMI < 25) {
				System.out.println("You are normal"); /*First else if statement 
				executes if calculated BMI is less than 25*/
			}
			else if (BMI < 30) {
				System.out.println("You are overweight"); /*Second else if statement 
				executes if calculated BMI is less than 30*/
			}
			else {
				System.out.println("You are obese"); /*Final else statement 
				executes if calculated BMI is greater than 30*/
			}
		}
	}