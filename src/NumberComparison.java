import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for two numbers
        System.out.print("Enter a number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter another number: ");
        int number2 = scanner.nextInt();

        // Compare the two numbers and print the appropriate message
        if (number1 == number2) {
            System.out.println("Numbers are the same");
        } else if (number1 > number2) {
            System.out.println("The first number was larger than the second");
        } else {
            System.out.println("The second number was larger than the first");
        }

        scanner.close();
    }
}

