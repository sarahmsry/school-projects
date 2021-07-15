//Sarah Masry 
//Panther ID: 002519149
//Due: April 2

public class animal{
	private boolean vegetarian;
	private String eats;
	private int numLegs;
	
	public animal(boolean vegetarian, String eats, int numLegs) { //Constructor
		this.vegetarian = vegetarian;
		this.eats = eats;
		this.numLegs = numLegs;
	}
	
	public boolean isVegetarian() { //Getter for vegetarian
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) { //Setter for vegetarian
        this.vegetarian = vegetarian;
    }

    public String getEats() { //Getter for eats
        return eats;
    }

    public void setEats(String eats) { //Setter for eats
       this.eats = eats;
    }

    public int getNumLegs() { //Getter for numLegs
        return numLegs;
    }

    public void setNumLegs(int numLegs) { //Setter for numLegs
        this.numLegs = numLegs;
    }
}