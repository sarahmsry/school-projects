//Sarah Masry 
//Panther ID: 002519149
//Due: April 2

class cat extends animal{
	private String color;
	public cat(boolean vegetarian, String eats, int numLegs, String color) { //Constructor
        super(vegetarian, eats, numLegs);
        this.color = color;
    }
    public String getColor() { //Getter for color
        return color;
    }

    public void setColor(String color) { //Setter for color
        this.color = color;
    }
}
