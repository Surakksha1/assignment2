
    import java.util.Scanner;
    public class project3 {



        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            // Taking input from user
            System.out.print("Enter first number: ");
            int num1 = input.nextInt();

            System.out.print("Enter second number: ");
            int num2 = input.nextInt();

            // Calculating sum
            int sum = num1 + num2;

            // Printing result
            System.out.println("Sum = " + sum);

            input.close();
        }
    }

