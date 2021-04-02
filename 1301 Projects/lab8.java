import java.util.Scanner;
public class lab8{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		System.out.println("Enter your age: ");
		int age = input.nextInt();
		printName(name);
		printAge(age);
		
	}
	
	public static void printName(String name) {
		int i = 1;
		while (i<=20) {
			System.out.println(name);
			i++;
		}
	}
	
	public static void printAge(int age) {
		int i = 1;
		while (i<=age) {
			System.out.println(i);
			i++;
		}
	}
}