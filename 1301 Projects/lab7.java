import java.util.Scanner;
	public class lab7 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a character: ");
			char ch = input.next().charAt(0);
			System.out.println("The character is " + ch );
			if (isVowel(ch))
				System.out.println("The character " + ch + " is a vowel.");
			else 
				System.out.println("The character " + ch + " is not a vowel.");
			
			if (isConsonant(ch))
				System.out.println("The character " + ch + " is a consonant.");
			else 
				System.out.println("The character " + ch + " is not a consonant.");
			System.out.println(ch + " is equivilent to " + changeCase(ch));
		}
		
		public static boolean isVowel(char ch) {
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				return true;
			}else 
				return false;
		}
		public static boolean isConsonant(char ch) {
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				return false;
			}else 
				return true;
		}
		public static char changeCase(char ch) {
			if(ch >= 'a')
				return (char) ('A' + (ch - 'a'));
			else if(ch >= 'A')
				return (char) ('a' + (ch - 'A'));
			else 
				return ch;
		}
	}