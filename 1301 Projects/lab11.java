public class lab11{
	public static void main(String[] args) {
		int n = 5;
		method1(n);
		method2(n);
		method3();
	}
	 public static void method1(int n) {
	     int a = 5;   
		 for(int i = n; i >= 0; i--) {
			 int c = a;
			 a--;
			 for(int b = 1; b <= i; b++) {
				 System.out.print(c + " ");
				 c--;
			 }
			 System.out.println();
		 }
 }
	 public static void method2(int n) {
		 for(int i = n; i >= 0; i--) {
			 for(int b = 1; b <= i; b++) {
				 System.out.print(b + " ");
			 }
			 System.out.println();
		 }
	 }
	 public static void method3() {
		 int ar[] = new int[10];
		 for(int i = 0; i < 10; ++i) {
			 ar[i] = 5*(i+1);
		 }
		 System.out.println("First ten multiples of five are: ");
		 for(int b = 0; b < 10; b++) {
			 System.out.println(ar[b]);
		 }
	 }
}