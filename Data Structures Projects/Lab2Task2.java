import java.util.*;

public class Lab2Task2{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number of elements: "); //Prompts user to enter number of elements 
		int n = input.nextInt();
		int[] arr = new int[n]; //Creates array based on user input
		System.out.println("Enter elements: "); //Prompts user to enter specific elements 
		for(int i = 0; i < n; i++){     
			arr[i] = input.nextInt(); //Retrieves users values 
		}
		Add1(arr); //Calls method to add 1
	    System.out.println(Arrays.toString(arr)); //Converts to string 
	}
		public static int[] Add1(int[] arr) { //Method to add 1 to existing array 
	        int i = arr.length - 1;
	        while(i >= 0) {
	            if(arr[i] != 9) { //If > 9, next value will increase, if < 9, current value will increase 
	                arr[i] = arr[i] + 1;
	                return arr;
	            }
	            arr[i] = 0;
	            i--;
	        } 
	        int[] result = new int[arr.length + 1]; //Creates new array 
	        result[0] = 1;
	        return result;
	    }
}
