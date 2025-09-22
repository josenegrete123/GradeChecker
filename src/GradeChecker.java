import java.util.Scanner;

public class GradeChecker {
    public static void main (String[] args) {
        double testScore = 0;

        Scanner scanner = new Scanner(System.in);

        // Ask user for input, if inputting a string or number not in the range of 0 and 100
        // Send out invalid input and ask for a valid test score
        while (true) {

            System.out.print("Input your test score between 0 - 100: ");

            if (scanner.hasNextDouble()) {
                testScore = scanner.nextDouble();
                if (testScore >= 0  && testScore <= 100) {
                    break;
                }
            }
            System.out.println("Invalid input. Input a valid test score, between 0 or 100.");
            scanner.nextLine();
        }

        if(testScore >= 90) {
            System.out.println("Your grade is an A.");
        } else if (testScore >= 80) {
            System.out.println("Your grade is a B.");
        } else if (testScore >= 70) {
            System.out.println("Your grade is a C.");
        } else if (testScore >= 60) {
            System.out.println("Your grade is a D.");
        } else {
            System.out.println("Your grade is an F.");
        }
    }
}