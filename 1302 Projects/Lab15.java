import java.util.ArrayList;
import java.util.Arrays;

public class Lab15{
	public static void main(String[] args) {
		ArrayList<Character> name = new ArrayList <Character>(); //Initializes name
		//Add characters for first name
		name.add('s');
		name.add('a');
		name.add('r');
		name.add('a');
		name.add('h');
		RCM(name);
		
		ArrayList <Character> name1 = new ArrayList<Character>(); //Initializes name1
		//Adds characters for first name two times 
		name1.add('s');
		name1.add('a');
		name1.add('r');
		name1.add('a');
		name1.add('h');
		name1.add('s');
		name1.add('a');
		name1.add('r');
		name1.add('a');
		name1.add('h');
		RCM(name1);
	}
	public static void RCM(ArrayList<Character> name) { //Checks for duplicate letters in name 
		ArrayList<String[]> Temp = new ArrayList<String[]>(); //Initialize array list of arrays with String 
		for(int i = 0; i < name.size(); i++) { //Retrieves everything in name 
			int judge = CheckNumber(Temp, name.get(i)); //Finds out if Temp contains the character  
			if(judge == -1) { //Executes if Temp does not contain the character
				String[] newString = new String[2]; //Creates new array that stores 2 characters
				newString[0] = name.get(i) + ""; //The first character of newString becomes the current one 
				newString[1] = i + " "; //Current character index becomes second char of newString and turns it into a String
				Temp.add(newString); //Adds it to Temp
			}
			else {
				String[] tempString = Temp.get(judge); //Gets character from Temp
				tempString[1] = tempString[1] + i; //Adds previous index to next recurring character index
				Temp.set(judge, tempString); //Resets tempString with new indexes 
			}
		}
		for(String[] x: Temp) { //Displays results 
			System.out.println(Arrays.toString(x).substring(1, Arrays.toString(x).length()-2));
		}
	}
		public static int CheckNumber(ArrayList<String[]> Temp, char a) { //Determines if Temp is a character or number
			for(String[]x: Temp) {
				if(x[0].matches(a + "")) { //x[0] = character from ArrayList, x[1] = index in name
					return Temp.indexOf(x); //Returns the position of x in Temp
				}
			}
			return -1; //Returns if the character is not in Temp
		}
}