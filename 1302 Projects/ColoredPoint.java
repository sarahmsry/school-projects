//Sarah Masry
//Panther ID: 002519149
//Due: April 19

public class ColoredPoint extends Point implements Colored{ //Extends point and implements colored
	public String color;
	 public ColoredPoint(int x, int y, String color) { //Constructor
		 super(x, y);
		 this.color = color;
	 }
	 
	 public String getColor() { //Returns color
		 return color;
	 }
		 
	 @Override 
	 public String toString() { //Returns information as string 
		 return super.toString()+", Color: "+getColor();
     }
	 
	 @Override
	 public boolean equals(Object o) { //Determines if points are equal or not; returns T/F
			 ColoredPoint other = (ColoredPoint)o;
			 return super.equals(o) && (other.getColor().equals(color));
	 }
}