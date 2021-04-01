//Name: Sarah Masry
//PandtherID: 002519149
//Due: Mar 5
public class Circle{
	private static int radius;
	public static Point center;
	
	public Circle(Point center, int radius) { //Creates circle
		Circle.radius = radius;
		Circle.center = center;
	}
	public static Point getCenter() { //Returns point object for circle center
		return center;
	}
	public static int getRadius() { //Returns radius
		return radius;
	}
	public double area() { //Calculates area
		return (3.1415 * radius * radius);
	}
	public double getCircumference() { //Calculates circumference
		return (2 * 3.1415 * radius);
	}
	public String toString() { //Returns string representation of circle
		 return "[center = " + center + ", radius = " + radius + "]";
	}
	public boolean contains(Point p) { //Determines whether point lies within the circle
		if(radius >= Point.distance(center, p)) {
            return true; }
        else {
            return false;
        
	}
}
}
