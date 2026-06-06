import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers to print: ");
        int n = sc.nextInt();

        int first = 0, second = 1;

        System.out.println("\n--- Fibonacci Series ---");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }
}
