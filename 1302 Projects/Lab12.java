//Sarah Masry 
//Panther ID: 002519149
//Due: April 2

public class Lab12{
	public static void main(String[] args) {
		
        cat Cat = new cat(false, "meat", 4, "white"); //Creates new cat object; not vegetarian, eats mean, has 4 legs, and is white
        
        System.out.println("Cat is vegetarian?: " + Cat.isVegetarian());
        System.out.println("Cat eats: " + Cat.getEats());
        System.out.println("Cat has: " + Cat.getNumLegs() + " legs");
        System.out.println("Cat color is: " + Cat.getColor());
}
}