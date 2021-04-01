//Name: Sarah Masry
//PandtherID: 002519149
//Due: Mar 5

import java.lang.Math;

public class Point{
	private static double x; //Stores x coordinate 
	private static double y; //Stores y coordinate
	
	public Point(int _x, int _y) {
		x = _x;
		y = _y;
	}
	public String toString() { //Returns string representation of circle
		return "(" + x + "," + y + ")";
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public static double distance(Point p, Point q) { //Calculates distance between 2 points
		double dx = x-Point.x;
		double dy = y-Point.y;
		double qx = x-Point.x;
		double qy = y-Point.y;
		return Math.sqrt((dy - qy) * (dy - qy) + (dx - qx) * (dx - qx));
	}
}