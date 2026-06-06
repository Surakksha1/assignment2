import java.util.Scanner;

public class Logical_Operator_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number  : ");
        int a = sc.nextInt();

        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        System.out.print("Enter third number  : ");
        int c = sc.nextInt();

        // Check if third number is sum of first two
        if (c == a + b) {
            System.out.println("\nResult: YES! " + c + " is the sum of " + a + " and " + b);
        } else {
            System.out.println("\nResult: NO! " + c + " is NOT the sum of " + a + " and " + b);
            System.out.println("Actual sum of " + a + " and " + b + " is: " + (a + b));
        }
    }
}
