//Name: Sarah Masry
//PantherID:002519149
//Due Date: Jan 15
//Draws a square with side lengths n, then calculates area.

public class Lab_02{
//The method to draw the first and last side
		public static void LFside(int n){
//For loop to write number of x's equal to n
			for(int a = 0; a < n; a++) {
				System.out.print("x");
			}
			System.out.print("\n");
}
//The method to draw the intermediate side
		public static void Mside(int n){
			System.out.print("x");
//For loop to create line of a's
			for(int b = 0; b < n-1; b++){
				System.out.print("a");
			}
			System.out.print("x");
			System.out.print("\n");
}
//The method to calculate the area of the square
		public static void Area(int n){
//Variable "area" initialized
			int squareArea = n*n;
			System.out.println("The area of the square is: " + squareArea);
}
		public static void main(String[] args){
//Initialize the value of n
			int n = 49 + 5;
//Draw first side
			LFside(n);
//Draw intermediate sides
			for(int i = 1; i < n-1; i++) {
				Mside(n);
			}
//Draw last side
			LFside(n);
//Calculate and print the area of the square
			Area(n);
	}
}