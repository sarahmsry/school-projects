//Using quick sort with space complexity O(1) and time complexity of O(nlog(n))
import java.util.Scanner;
public class quickSort{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements: "); //Prompts user for number of elements of array 
		int limit = input.nextInt();
		int arr[] = new int[limit];
		System.out.println("Enter array values: "); //Prompts user for values of array 
		for(int i = 0; i < arr.length; i++) { //Stores elements of array based on the number of elements entered  
			arr[i] = input.nextInt();
		}
		int n = arr.length;
		quick_Sort(arr, 0, n-1);
		System.out.println("This is sorted array: ");
		for (int i = 0; i < n; ++i) { //Prints the sorted array 
            System.out.print(arr[i]+" ");
        System.out.println();
		}
		n = removeDupes(arr, n);
		System.out.println("This is deduplicated array: ");
		for (int i = 0; i < n; ++i) { //Prints the deduplicated array 
            System.out.print(arr[i]+" ");
        System.out.println();
		}
		
/* Test case to determine whether or not array is empty or only has one element 	
   if(n == 0 || n == 1) { 
			System.out.print("Invalid");
        }else { 
        	quick_Sort(arr, 0, n-1);
    		System.out.println("This is sorted array: ");
    		for (int i = 0; i < n; ++i) { //Prints the array 
                System.out.print(arr[i]+" ");
            System.out.println();
    		}
    		n = removeDupes(arr, n);
    		System.out.println("This is deduplicated array: ");
    		for (int i = 0; i < n; ++i) { //Prints the array 
                System.out.print(arr[i]+" ");
            System.out.println();
    		}*/
        }
		
	static int partition(int[] arr, int low, int high){
	    int pivot = arr[high]; 
	      
	    // Position right of pivot 
	    int i = (low - 1); 
	  
	    for(int j = low; j <= high - 1; j++) {
	        if (arr[j] < pivot) {
	            i++; //Increments smaller element index if it is smaller than the pivot 
	            int swap = arr[i]; //Swaps 2 elements 
	            arr[i] = arr[j];
	            arr[j] = swap;
	        }
	    }
	    int swap = arr[i+1];
	    arr[i+1] = arr[high];
	    arr[high] = swap;
	    return (i + 1);
	}
	static void quick_Sort(int[] arr, int low, int high){
	    if (low < high) {

	        int indexOfPartition = partition(arr, low, high);
	        
	        //Sort before and after partition 
	        quick_Sort(arr, low, indexOfPartition - 1);
	        quick_Sort(arr, indexOfPartition + 1, high);
	    }
	}
	static int removeDupes(int arr[], int n) { //Space complexity O(1)
        int j = 0;
        
        for (int i = 0; i < n-1; i++) //Sorts through array to find duplicate numbers 
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];
        arr[j++] = arr[n-1];
        return j;
}
}