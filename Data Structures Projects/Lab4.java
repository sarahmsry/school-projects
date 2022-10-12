import java.util.*;

public class Lab4{
	 public static void main(String[] args) {
	        int arr[] = {11, 21, 21, 33, 40, 40, 40, 50, 50};
	        int n = arr.length;
	        n = removeDupes(arr,n);
	        n = removeDupes2(arr,n);
	        
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter 1 to run method one and 2 to run method two: "); //Prompts user to enter which method they want to use 
	        int choice = input.nextInt();
	        if(choice == 1) { //First method is used 
	        	removeDupes(arr,n);
	        	System.out.print("[ ");
		        for (int i = 0; i < n; i++) //Prints new array 
		           System.out.print(arr[i] + ", ");
		        System.out.print("]");
	        }else if(choice == 2) { //Second method is used 
	        	removeDupes2(arr,n);
	        	System.out.print("[ ");
		        for (int i = 0; i < n; i++) //Prints new array 
		           System.out.print(arr[i] + ", ");
		        System.out.print("]");
	        }else {
	        	System.out.println("Invalid input. "); //Invalid input when anything other than 1 or 2 is entered 
	        }
	    }
	 
	    static int removeDupes(int arr[], int n) { //Space complexity O(n)
	        if (n == 0 || n == 1) //Test case: determines if array is empty or not and will have no output if empty 
	            return n;
	      
	        int[] temp = new int[n]; //Unlike method 2, this creates a temporary array to store values 
	         
	        int j = 0;
	        for (int i = 0; i < n-1; i++) //Sorts through array and finds duplicate numbers 
	            if (arr[i] != arr[i+1]) 
	                temp[j++] = arr[i];
	        temp[j++] = arr[n-1];  
	        
	         
	        for (int i = 0; i < j; i++) { //Original array is changed
	            arr[i] = temp[i];
	        }
	      
	        return j;
	    }
	    
	    static int removeDupes2(int arr[], int n) { //Space complexity O(1)
	        if (n == 0 || n == 1) //Test case again: determines if array is empty and will have no output if so 
	            return n;
	     
	        int j = 0;
	        
	        for (int i = 0; i < n-1; i++) //Once again sorts through array to find duplicate numbers 
	            if (arr[i] != arr[i+1])
	                arr[j++] = arr[i];
	        arr[j++] = arr[n-1];
	      
	        return j;
	    }
	}
