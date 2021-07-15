//Sarah Masry
//Panther ID: 002519149
//Due: April 9

public class Student extends Human{
	public String major;
	public double GPA;
	public int creditHours;
	
	public Student(double weight, int age, double height, String major, double gpa, int creditHours) { //Constructor
		super(weight, age, height);
        this.major = major;
        this.GPA = gpa;
        this.creditHours = creditHours;
	}
	
	public String getMajor() { //Returns major
		return this.major;
	}
	
	public double getGPA() { //Returns GPA
		return this.GPA;
	}
	
	public String getYear() { //Determines the year of the student based on credit hours 
		if(creditHours < 32)
			return "Freshman";
		else if(creditHours >= 32 && creditHours < 64)
			return "Sophomore";
		else if(creditHours >= 64 && creditHours < 96)
			return "Junior";
		else if(creditHours >= 96)
			return "Senior";
		return "";	
}
}