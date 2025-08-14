import java.util.Scanner;
public class Scan {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.print("Enter another number: ");
        int number2 = sc.nextInt();
        System.out.print("The sum of " + number + " and " + number2 + " is: " + (number + number2));
    }
}