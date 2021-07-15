//Sarah Masry
//Panther ID: 002519149
//Due: April 19

public class StudentAdvanceTicket extends AdvanceTicket{ //Extends AdvanceTicket class
	public StudentAdvanceTicket(int number, int daysInAdvance) { //Constructor
		super(number, daysInAdvance);
		price = super.getPrice() / 2; // Calculates price 
	}
	
	public String toString() { //Returns information as string 
		  return "Number " + this.number + ", price: " + this.price + "(ID Required)";
	}
}