import java.util.Scanner;

public class Pyramid_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.println("\n--- Pyramid Pattern ---");

        for (int i = 1; i <= rows; i++) {

            // Print spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}