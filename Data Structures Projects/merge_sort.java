//Using merge sort with space complexity O(n) and time complexity of O(nlog(n))
import java.util.Scanner;
public class merge_sort{
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
		mergeSort(arr, n - 1);
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
		
	public static void merge(
			  int[] a, int[] l, int[] r, int left, int right) {
			 
			    int i = 0, j = 0, k = 0;
			    while (i < left && j < right) {
			        if (l[i] <= r[j]) {
			            a[k++] = l[i++];
			        }
			        else {
			            a[k++] = r[j++];
			        }
			    }
			    while (i < left) {
			        a[k++] = l[i++];
			    }
			    while (j < right) {
			        a[k++] = r[j++];
			    }
			}
	public static void mergeSort(int[] a, int n) {
	    if (n < 2) {
	        return;
	    }
	    int mid = n / 2;
	    int[] l = new int[mid];
	    int[] r = new int[n - mid];

	    for (int i = 0; i < mid; i++) {
	        l[i] = a[i];
	    }
	    for (int i = mid; i < n; i++) {
	        r[i - mid] = a[i];
	    }
	    mergeSort(l, mid);
	    mergeSort(r, n - mid);

	    merge(a, l, r, mid, n - mid);
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