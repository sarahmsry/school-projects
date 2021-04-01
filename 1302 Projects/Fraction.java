public class Fraction{
	private int numerator; //Numerator
	private int denominator; //Denominator

public Fraction(int num, int denom) {
	numerator = num;
	denominator = denom;
}

public Fraction() { //No argument constructor
	numerator = 0; //Set numerator equal to 0
	denominator = 1; //Set numerator equal to 1
}

public Fraction(int n) { //Single argument constructor
	numerator = n;
	denominator = 1;
}

public int getNumerator() { //Returns numerator
	return numerator;
}

public int getDenominator() { //Returns denominator
	return denominator;
}

public Fraction add(Fraction f) { //Addition method with fraction argument
	int num = numerator * f.denominator + f.numerator * denominator;
	int denom = denominator * f.denominator;
	return new Fraction(num, denom); //Returns result
}

public Fraction divide(Fraction f) { //Divide method with fraction argument; returns n
	Fraction n = new Fraction(this.numerator * f.denominator, this.denominator * f.numerator);
	return n; 
}

public Fraction scaleUp(int n) { //Scale up method which multiplies by the factor
	this.numerator = this.numerator*n;
	return null;
}

public Fraction scaleDown(int n) { //Scale down method which multiplies by the factor
	this.denominator = this.denominator*n;
	return null;
}

public void scale(boolean flag, int factor) {
	if(factor == 0) {
		System.out.println("Factor can't be 0."); //Indicates that factor must be greater than 0
	}
	else { 
		if(flag == true) {
			this.scaleUp(factor); 
		}
		else {
			this.scaleDown(factor);
		}
	}
}
}