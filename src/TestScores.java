import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a test score between 0 and 100
        System.out.print("Name a number between 0 and 100: ");
        int score = scanner.nextInt();

        // Validate the input
        if (score < 0 || score > 100) {
            System.out.println("Invalid input. Please enter a number between 0 and 100.");
        } else {
            // Determine the grade based on the score
            String grade;
            switch (score / 10) {
                case 10:
                case 9:
                    grade = "A";
                    break;
                case 8:
                    grade = "B";
                    break;
                case 7:
                    grade = "C";
                    break;
                case 6:
                    grade = "D";
                    break;
                default:
                    grade = "F";
                    break;
            }

            System.out.println("Your grade is an " + grade + ".");
        }

        scanner.close();
    }
}

