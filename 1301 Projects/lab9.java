import java.util.Scanner;
public class lab9 
{
	public static void main(String[] args) {
        int num1, num2, num3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to print stars: ");
        num1 = input.nextInt();
        printStars(num1);
        System.out.print("\nEnter a number to print first 10 multiples: ");
        num2 = input.nextInt();
        Multiples(num2);
        System.out.print("\nEnter a number to check for even digit: ");
        num3 = input.nextInt();
        if(hasAnEvenDigit(num3))
        System.out.println(num3+" has even digit.");
        else
        System.out.println(num3+" has no even digit.");     
    }
    public static void printStars(int n)
    {
        for(int i=1;i<=n;i++)
        System.out.print("*");
    }
    public static void Multiples(int n)  
    {
        System.out.print("First 10 multiples of "+n+" is : ");
        for(int i=1;i<=10;i++)
           System.out.print(n*i+" ");   
    }
    public static boolean hasAnEvenDigit(int n) 
    {
        int rem;
        while(n>0) {
            rem=n%10;  
            n=n/10;      
            if(rem%2==0){   
                return true;    
            }
        }
        return false;  
    }
}