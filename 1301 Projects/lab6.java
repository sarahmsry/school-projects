import java.util.Scanner;

public class lab6{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num1 = input.nextInt();	
		System.out.println("Enter a second number: ");
		int num2 = input.nextInt();
		System.out.println("Enter a third number: ");
		int num3 = input.nextInt();
		System.out.println("The largest is: " + largest(num1, num2, num3));
		System.out.println("The smallest is: " + smallest(num1, num2, num3));
		System.out.println("The median is: " + median(num1, num2, num3));
	}
	
	public static int largest(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			return num1;
		}
		else if (num2 > num1 && num2 > num3) {
			return num2;
		}
		return num3;
	}
	
	public static int smallest(int num1, int num2, int num3) {
		if (num1 < num2 && num1 < num3) {
			return num1;
		}
		else if (num2 < num1 && num2 < num3) {
			return num2;
		}
		return num3;
	}
	
	public static int median(int num1, int num2, int num3) {
		int median = num1;
		if (num2 > median) {
			median = num2;
		}
		if (num3 < median) {
			median = num3;
		}
		return median;
	}
}