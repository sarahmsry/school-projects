import java.util.Random;
import java.util.Scanner;

public class MasryTest1C{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Sarah Masry 9149");
		System.out.println("Enter a column size: ");
		int column = input.nextInt();
		int N = 9;
		
		double[][] m = new double[N+3][column];
		double[][] m3 = {{1,1,1},{3,0,2},{4,3,2}};
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				m[i][j] = (13 * rand.nextDouble()) + 3;
			}
		}
		MinCol(m);
		MinCol(m3);
		System.out.println("The average of array m is: " + returnLast3RowAvg(m));
		System.out.println("The average of array m3 is: " + returnLast3RowAvg(m3));
		}
	
	public static void MinCol(double[][] m) {
		double inc = 0;
		double sum = Double.MAX_VALUE;
		for(int i = 0; i < m[0].length; i++) {
			for(int j = 0; j < m.length; j++) {
				inc += m[j][i];
			}
			if(sum > inc) {
				sum = inc;
			}
		}
		System.out.println("Smallest column sum = " + sum);
			}
	public static double returnLast3RowAvg(double[][] m) {
		double sum = 0;
		double inc = 0;
		for(int i = m.length-3; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				sum += m[i][j];
				inc++;
			}
		}
		double result = sum/inc;
		return (result);
	}
	
}