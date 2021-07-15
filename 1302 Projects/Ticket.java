//Sarah Masry
//Panther ID: 002519149
//Due: April 19

public class Ticket{
	public int number;
	public double price = 50.0;
	
	public Ticket(int number) { //Constructor
		this.number = number;
	}
	
	 public double getPrice() { //Returns Price
		 return this.price;
	}
	 
	  public String toString() { //Returns information as a string
		  return "Number " + this.number + ", price: " + getPrice();
	}
}