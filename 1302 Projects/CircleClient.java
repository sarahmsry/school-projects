//Name: Sarah Masry
//PandtherID: 002519149
//Due: Mar 5

public class CircleClient{
	public static void main(String[] args) {

        Point pointA = new Point(10,5);
        Point pointB = new Point(5,7);
        Circle circle = new Circle(pointA,7);
        
        System.out.println("Circle: " + circle);
        System.out.println("Area: " + circle.area()); //Prints area
        System.out.println("Circumference: " + circle.getCircumference()); //Prints circumference
        
        if(circle.contains(pointA)) //determines whether point 2 lies within the circle 
            System.out.println("" + pointB + " lies within the circle");
        else
            System.out.println("" + pointB + " does not lie within the circle");
}
}