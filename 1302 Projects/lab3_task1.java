//Name: Sarah Masry
//PandtherID: 002519149
//Due: Jan 29

public class lab3_task1{ 
	public static void main(String[] args) {
		
		int rows = 5;
		for (int i = rows; i >= 1; i--) { /*Starts at desired amount of rows, in this case 5, and increments down by  
											one for each iteration */
			for (int k = i; k <= 5; k++) { //Repeats for each row as k increases 
			    System.out.print(k + "");
			    }
			
			System.out.println();
			
			if(i <= 5 && i >= 3) { //Prints spaces at rows between 3 and 5, inclusive
				System.out.println();
			}
		}
	}
}