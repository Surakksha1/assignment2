import java.util.Scanner;

public class Palindrome_Number {

    // Method to check palindrome
    static boolean isPalindrome(int x) {

        // Negative numbers are never palindrome
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;       // Get last digit
            reversed = reversed * 10 + digit;  // Build reversed number
            x = x / 10;               // Remove last digit
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPalindrome(num)) {
            System.out.println("\n" + num + " is a Palindrome");
        } else {
            System.out.println("\n" + num + " is NOT a Palindrome");
        }
    }
}