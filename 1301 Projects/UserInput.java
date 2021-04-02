import java.util.Scanner;
import javax.swing.JOptionPane;

	public class UserInput {
		public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("My age is ");
			String userInput = scan.nextLine();
			int userAge = Integer.parseInt(userInput);
			int doubleAge = userAge * 2;
			System.out.println("Twice my age is " + doubleAge);
			int tripleAge = userAge * 3;
			System.out.println("Three times my age is " + tripleAge);
			int halfAge = userAge / 2;
			System.out.println("Half of my age is " + halfAge);
		}
	}