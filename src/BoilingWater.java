import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number greater than 212: ");

        int number = scanner.nextInt();

        // Use ternary operator to determine the output message
        System.out.println(number >= 212 ? "Water is boiling!" : "Water is not boiling. Increase the temperature.");

        scanner.close();
    }
}


