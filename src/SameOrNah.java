import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first word
        System.out.print("Enter a word: ");
        String word1 = scanner.nextLine();

        // Prompt the user for the second word
        System.out.print("Enter another word: ");
        String word2 = scanner.nextLine();

        // Compare the two words and print the appropriate message
        if (word1.equals(word2)) {
            System.out.println("The words are the same.");
        } else {
            System.out.println("The words are different.");
        }

        scanner.close();
    }
}

