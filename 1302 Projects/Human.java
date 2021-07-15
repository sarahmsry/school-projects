//Sarah Masry
//Panther ID: 002519149
//Due: April 9

public class Human implements Mammal{
	public int age;
	public double height;
	public double weight;
	
	public Human(double weight, int age, double height) { //Constructor
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	public int getAge() { //Returns age 
		return this.age;
	}
	
	public double getHeight() { //Returns height 
		return this.height;
	}
	
	public double getWeight() { //Returns weight
		return this.weight;
	}

	public double hairColor() { //Implements method from Mammal
		return 0;
	}
}