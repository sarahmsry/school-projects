//Sarah Masry
//Panther ID: 002519149
//Due: April 9

public class Doctor extends Human{
	public int years;
	public String specialty;
	
	 public Doctor(double weight, int age, double height, int years, String speciality) { //Constructor
		 super(weight, age, height);
		 this.specialty = speciality;
	     this.years = years;
	 }
	
	public int getYears() { //Returns years
		return this.years;
	}
	
	public String getSpecialty() { //Returns specialty
		return this.specialty;
	}
	
	public double getSalary() { //Calculates and returns salary
		return 40000 + this.years * 5000;
}
}