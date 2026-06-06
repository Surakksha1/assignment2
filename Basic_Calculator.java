import java.util.Scanner;

public class Basic_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Basic Calculator ===");
        System.out.print("Enter first number  : ");
        double a = sc.nextDouble();

        System.out.print("Enter second number : ");
        double b = sc.nextDouble();

        System.out.println("\nSelect Operation:");
        System.out.println("1. Addition       (+)");
        System.out.println("2. Subtraction    (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division       (/)");
        System.out.print("\nEnter your choice (1/2/3/4): ");
        int choice = sc.nextInt();

        double result = 0;

        switch (choice) {
            case 1:
                result = a + b;
                System.out.println("\nResult: " + a + " + " + b + " = " + result);
                break;

            case 2:
                result = a - b;
                System.out.println("\nResult: " + a + " - " + b + " = " + result);
                break;

            case 3:
                result = a * b;
                System.out.println("\nResult: " + a + " * " + b + " = " + result);
                break;

            case 4:
                if (b == 0) {
                    System.out.println("\nError: Division by zero is not allowed!");
                } else {
                    result = a / b;
                    System.out.println("\nResult: " + a + " / " + b + " = " + result);
                }
                break;

            default:
                System.out.println("\nError: Invalid choice!");
        }
    }
}
