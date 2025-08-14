public class Assignment_Operators{
    public static void main (String[] args){
        int a = 10;
        int b = 20;
        a += b; 
        System.out.println("After += : a = " + a);

        a -= b;
        System.out.println("After -= : a = " + a);

        a *= b;
        System.out.println("After *= : a = " + a);

        a /= b;
        System.out.println("After /= : a = " + a);

        a %= b;
        System.out.println("After %= : a = " + a);
    }
}