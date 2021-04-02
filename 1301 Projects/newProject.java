import java.util.Scanner;
import javax.swing.JOptionPane;

	public class newProject {
		public static void main(String[] args)
		{
			//Scanner scan = new Scanner(System.in);
			String userAge = JOptionPane.showInputDialog(null, "My age is");
			int intAge = Integer.parseInt(userAge);
			JOptionPane.showMessageDialog(null,  "My age is" + intAge + "Twice my age is" + intAge*2 + 
					"Three times my age is" + intAge*3 + "Half my age is" + intAge/2);
		}
	}