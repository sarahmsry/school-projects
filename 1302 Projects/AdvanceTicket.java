//Sarah Masry
//Panther ID: 002519149
//Due: April 19

public class AdvanceTicket extends Ticket{ //Extends Ticket superclass
	int daysInAdvance;
	public AdvanceTicket(int number, int daysInAdvance) { //Constructor
		super(number);
		this.daysInAdvance = daysInAdvance;
		 if (daysInAdvance < 10) { //Determines price based on how many days in advance the tickets were purchased
	            price = 40;
	     }else {
	            price = 30;
	    }
	}
	
	public String toString() { //Returns information as string 
		  return "Number " + this.number + ", price: " + this.price;
	}
}