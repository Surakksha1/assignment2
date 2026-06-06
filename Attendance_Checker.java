import java.util.Scanner;

public class Attendance_Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total classes conducted: ");
        int conducted = sc.nextInt();

        System.out.print("Enter classes attended by student: ");
        int attended = sc.nextInt();

        double percentage = ((double) attended / conducted) * 100;

        System.out.printf("\nAttendance: %.2f%%%n", percentage);

        if (percentage >= 75)
            System.out.println("Result: Eligible for Exam");
        else
            System.out.println("Result: Not Eligible");
    }
}
