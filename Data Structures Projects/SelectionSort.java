import java.util.Scanner;
public class SelectionSort{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements: "); //Prompts user to enter number of array elements
		int limit = input.nextInt();
		int arr[] = new int[limit];
		System.out.println("Enter array values: "); //Prompts user to enter the elements 
		for(int i = 0; i < arr.length; i++) { //Stores elements of array based on entered number of elements 
			arr[i] = input.nextInt();
		}
		int n = arr.length;
		if(n == 0 || n == 1) { //Test case to determine whether or not array is empty or only has one element 
			System.out.print("Invalid");
        }else { 
        	selection_sort(arr, n);
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
	static void selection_sort(int arr[], int n) { //Time complexity O(n^2), space complexity O(n)
		n = arr.length;
        for (int i = 0; i < n-1; i++){ 
            int smallestVal = i; //Locates smallest element in the array 
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[smallestVal])
                    smallestVal = j;
            int temp = arr[smallestVal]; //Swaps smallest element with first element 
            arr[smallestVal] = arr[i];
            arr[i] = temp;
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