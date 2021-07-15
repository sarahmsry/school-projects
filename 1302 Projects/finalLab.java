import java.util.Scanner;
public class finalLab{
	public static void main(String[] args) {
		printPattern();
		arrayMultiples();
}
	public static void printPattern() {
		int n = 1;
		for(int i = n; i <= 5; i++) {
			 for(int b = 1; b <= i; b++) {
				 System.out.print(b + " ");
			 }
			 System.out.println();
		 }
	 }
	public static void arrayMultiples() {
			int[] intArray = new int[12]; 
			Scanner scanner = new Scanner(System.in);
				for (int i = 0; i < 12; i++) {
					System.out.print("Input a number (" + (i + 1 )+ "/12):");
					intArray[i] = scanner.nextInt();
				}
				System.out.print("The multiples of 3 are: ");
				for(int i = 0; i < 12; i++) {
					if(intArray[i] % 3 == 0) {
						System.out.print(intArray[i] + ", ");
					}
				}
				System.out.print("\nThe multiples of 4 are: ");
				for(int i = 0; i < 12; i++) {
					if(intArray[i] % 4 == 0) {
						System.out.print(intArray[i] + ", ");
					}
				}
				
	}
}