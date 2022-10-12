import java.util.*;

public class Lab2Task1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number of elements: "); //Prompts user to enter number of elements for the array
		int n = input.nextInt(); 
		int[] arr = new int[n]; //Array is created based on user input 
		System.out.println("Enter elements: "); //Prompts user to enter specific elements  
		for(int i = 0; i < n; i++){  //Retrieves users values  
			arr[i] = input.nextInt();  
		}  
		
		int hold = 0; //Makes sure there will be no higher value before a lower value in the array 
		for (int i = 0; i < arr.length; i++) {     
            for (int j = i + 1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {  //Makes sure values are in the correct location 
                   hold = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = hold;    
               }     
            }     
        }
		System.out.println("Array after sorting: ");
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) { //Prints array in ascending order   
			if(i > 0) {
				System.out.print(","); //This for loop makes sure there is no extra comma at the end of the array 
			}
            System.out.print(arr[i]); //Final array 
	}
		System.out.println("]");
	}
}
