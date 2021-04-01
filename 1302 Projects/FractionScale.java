import java.util.Scanner;

public class FractionScale{
	
	public static void main(String[] args) {
		System.out.println("This program performs scaling operations on a fraction: ");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numerator: "); //Prompts user to enter numerator
		int numerator = input.nextInt();
		System.out.println("Enter denominator:"); //Prompts user to enter denominator
		int denominator = input.nextInt();
		System.out.println("Scale up or down (1:up, 0:down):"); //Asks user to scale up or down
		int scale = input.nextInt();
		System.out.println("Enter a Scale Factor:"); //Prompts user to enter scale factor
		int ScaleFactor = input.nextInt();
		
		Fraction frac1 = new Fraction(numerator, denominator); //Fraction entered
		Fraction frac2 = new Fraction(); //Result after fraction is scaled 
		
		if(scale == 1) { //Decides whether or not to call scaleUp or scaleDown method
			frac2 = frac1.scaleUp(ScaleFactor);
		}
		else if(scale == 0) {
			frac2 = frac1.scaleDown(ScaleFactor);
		}
		
		System.out.println("Scaled fraction is: " + frac2.getNumerator() + "/" + frac2.getDenominator()); //Displays results
	}
}