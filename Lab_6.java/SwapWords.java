import java.util.Scanner;

public class SwapWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        String input = scanner.nextLine();

        // Split the string into two words based on the space
        String[] words = input.split(" ", 2);

        // Swap and print the words
        System.out.println("Correct Answer: " + words[1] + " " + words[0]);

        scanner.close();
    }
}