public class lab10{
    public static void main(String[]args) {
        multi();
        triangle();
        System.out.println(reverse("string"));
    }

    public static void multi() {
         for (int i = 1; i <= 10; i++) {
             for (int n = 1; n <= 10; n++) {
                 System.out.print(i + " * " + n + " = ");
                System.out.println(i*n + " ");
             }
             System.out.println("------------------");}
    }
    public static void triangle() {
        for(int i = 1; i <= 5; i++) {
            for(int n = 5; n >= i; n--) {
                System.out.print(" ");
            }
            for (int n = 1; n <= i; n++){
                System.out.print(Integer.toString(n));
            }
            System.out.println();
        }

    }
    public static String reverse(String s) {
        System.out.println();
        String st = new String();
        for(int i = s.length()-1; i>-1;i--) {
            st+=s.charAt(i);
        }
        return st;

    }
}