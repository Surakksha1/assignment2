import java.util.Scanner;
import java.time.Year;

public class AI_Age_Predictor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask the user for current age
        System.out.print("Enter your current age: ");
        int age = sc.nextInt();

        // Display future ages
        System.out.println("\n--- Age Prediction ---");
        System.out.println("Your age after 10 years: " + (age + 10));
        System.out.println("Your age after 25 years: " + (age + 25));
        System.out.println("Your age after 50 years: " + (age + 50));

        // Bonus: Predict the year they turn 100
        int currentYear = Year.now().getValue();
        int yearTurn100 = currentYear + (100 - age);

        System.out.println("\nBonus:");
        System.out.println("You will turn 100 in the year " + yearTurn100 + ".");

        sc.close();
    }
}