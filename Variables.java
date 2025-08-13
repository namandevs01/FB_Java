public class Variables{
    static int a = 2; //static variable
    public static void main(String[] args){
        int b = 10; //local variable 
        System.out.println("Value of a: "+ Variables.a);
        Variables.a = 5; //modifies the static variable
        System.out.println("Modified value of a: "+ Variables.a); 
        System.out.println("Value of b: "+b);
    }
}