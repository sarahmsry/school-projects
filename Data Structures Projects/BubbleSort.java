import java.util.Scanner;
public class BubbleSort{
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
		if(n == 0 || n == 1) { //Test case to determine whether or not array is empty or only has one element 
			System.out.print("Invalid");
        }else { 
        	bubble_sort(arr, n);
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
    		}
        }
		
	}
	static void bubble_sort(int arr[], int n) {
		 n = arr.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (arr[j] > arr[j+1]){
	                    int temp = arr[j]; //Swaps positions of j+1 and j 
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
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