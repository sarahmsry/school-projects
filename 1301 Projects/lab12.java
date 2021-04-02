import java.util.Scanner;
public class lab12{
    public static void main (String[]args){

        Scanner input = new Scanner (System.in);
        System.out.println ("Enter two integers:");
        int a = input.nextInt ();
        int b = input.nextInt();
        int[] array = abInclusive(a,b);

        System.out.print("Array is [");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        if(i<array.length-1)
            System.out.print(",");
        }

        System.out.print("]");
        System.out.println();

        System.out.print("\nThe average is: " + average(array));
    }
    
    public static int[] abInclusive(int a,int b){
    	if(a>b){
    		int[]array = new int[(a-b)+1];
        for (int i = 0; i < array.length; i++, a--){
            array[i] = a;
        }
        return array;
    }
    	else{
    		int[] array = new int[(b-a)+1];
        for (int i = 0; i < array.length; i++, a++){
            array[i] = a;
        }
        return array;
        }
    }
    
    public static double average(int[] array){
    	int x = array.length;
    	int sum = 0, y=0;
    		for (int i = 0; i < x; i++){
    			if(array[i]!=0) {
    				y=y+1;
    				sum = sum + array[i];
        }
    }
    double avg = (sum +1.0)/y;
    return avg;
}
}
