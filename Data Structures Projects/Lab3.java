//Name: Sarah Masry
//Rotating matrix
/*Observations: I believe the second method is more efficient specifically in terms of space. Method one creates an 
 additional array so it takes up more space. Their efficiency time-wise, however, is similar. */

import java.util.*;
import java.io.*;

public class Lab3{
	static int n = 4;
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("Enter elements: "); //Prompts user to enter elements of the matrix 
		int arr[][] = new int[n][n]; //Creates 2d array 
		for(int i = 0; i < n; i++){
			for(int j = 0 ; j < n; j++) {
				arr[i][j] = Integer.parseInt(in.readLine()); //Retrieves users values for array 
		}
	}
		
		System.out.println("\nOriginal matrix: "); //shows the original matrix.
        originalMatrix(n, arr);
        
        System.out.println("Matrix Rotated(task 1): "); //Prints out matrix from task 1
        task1(n, arr);
        
        System.out.println("Matrix Rotated(task 2): "); //Prints out matrix from task 2
        task2(n, arr); //Method called
        
}
	public static void task1(int n, int arr[][]) { //Creates new array to rotate matrix values  
		int arr1[][] = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr1[i][(n-1)-j] = arr1[i][j];
			}
		}
		for(int i = 0; i < n; i++){
			for(int j = 0 ; j < n; j++) {
				arr[i][j] = arr1[i][j];
			}
		}
	}
	public static void task2(int n, int arr[][]) { //Swaps values row by row but does not create an additional array 
		 for (int i = 0; i < n; i++){
	            for (int j = i; j < n; j++) {
	            	int temp = arr[i][j];  
	            	arr[i][j] = arr[j][i];
	            	arr[j][i] = temp; 
	            }   	
	        }
	        for(int i = 0; i < n; i++) {
	        	int top = i;
	        	int bottom = n-1;
	        	while(top < bottom) {
	        		int temp = arr[i][top];
	        		arr[i][top] = arr[i][bottom];
	        		arr[i][bottom] = temp;
	        		top++;
	        		bottom--;
	        	}
	        }
	        
	}
	public static void originalMatrix(int n, int arr[][]) { //Prints out original matrix entered 
		for(int i = 0; i < n; i++) {
        	for(int j = 0; j < n; j++) {
        		System.out.print(arr[i][j] + " ");
        	}
        	System.out.println();
        }
	}
}