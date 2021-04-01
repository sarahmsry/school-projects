//Name: Sarah Masry
//PantherID:002519149
//Due Date: Jan 15
//Sums 30 even numbers after n using method and for-loop

public class Lab1{
	//Method for calculating sum of arithmetic sequence
	public static int Arithmetic_sequence(int n, int number){
		int sum = (number / 2) * ((2 * n) + (number - 1) * 2);
		return sum;
	}

public static void main(String[] args){
//Last-two digits of Panther ID
	int n = 49;
//Initialize temporary value to save sum
	int sum = 0;
//For loop calculates sum
	for(int a = 49; a <= n + 58; a += 2){
		sum += a;
}

//Print result of for loop
	System.out.println("The result of for-loop is: " + sum);
//Print result of the method
	System.out.println("The result of the method is: " + Arithmetic_sequence(n, 30));
}
}