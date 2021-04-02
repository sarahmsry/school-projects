import java.util.Scanner;
	public class userInput {
		public static void main(String[] args) {
			Scanner inputDevice = new Scanner(System.in);
			double number1;
			double number2;
			
			System.out.println("Enter number:");
			number1 = inputDevice.nextInt();
			
			System.out.println("Enter second number:");
			number2 = inputDevice.nextInt();
			double average = numberAverage(number1, number2);
			
			System.out.println("The result is: " + average);
		}
		public static double numberAverage(double number1, double number2) {
			double average = (number1 + number2)/2;
			return average;
		}
	}