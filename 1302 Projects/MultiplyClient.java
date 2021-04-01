//Sarah Masry 
//Panther ID: 002519149
//Due: March 26

import java.util.*;

public class MultiplyClient{
	public static void main(String[] args) {
		Random rand = new Random();
		Fraction[] fractionArray = new Fraction[12]; //Initialize array
		
		for(int i = 0; i < 10; i++)
        {
            fractionArray[i] = new Fraction(1+rand.nextInt(12), 1+rand.nextInt(12)); //Creates random fraction 
            Fraction result = FractionMultiply(fractionArray[i], fractionArray[i]); //Uses FractionMultiply method
            System.out.println(result);
        }
	}
	
	public static Fraction FractionMultiply(Fraction a, Fraction b) { //Calculates product of adjacent pair of elements in the array
		return new Fraction(a.getNumerator()*b.getNumerator(), a.getDenominator()*b.getDenominator());
	}
}