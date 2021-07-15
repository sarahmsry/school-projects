//Sarah Masry
//Panther ID: 002519149
//Due: April 19

public class WalkupTicket extends Ticket{ //Extends Ticket superclass
	public WalkupTicket(int number) { //Constructor
		super(number);
	}
	public String toString() { //Returns information as string 
		  return "Number " + this.number + ", price: " + this.price;
	}
	
}