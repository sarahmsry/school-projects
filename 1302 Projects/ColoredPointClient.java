//Sarah Masry
//Panther ID: 002519149
//Due: April 19

public class ColoredPointClient{
	public static void main(String[] args) { //Creates objects of ColoredPoint class and compares them
		ColoredPoint point1 = new ColoredPoint(1, 2, "red");
		ColoredPoint point2 = new ColoredPoint(3, 4, "blue");
		System.out.println(point1);
		System.out.println(point2);
		System.out.println("Point 1 and point 2 equal?  " + point1.equals(point2));
		
		ColoredPoint point3 = new ColoredPoint(1, 2, "red");
		ColoredPoint point4 = new ColoredPoint(1, 2, "red");
		System.out.println(point3);
		System.out.println(point4);
		System.out.println("Point 3 and point 4 equal?  " + point3.equals(point4));
}
}