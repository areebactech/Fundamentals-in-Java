import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        String input = scanner.nextLine();

        // 1. Third character
        System.out.println(input.charAt(2));

        // 2. Second to last character
        System.out.println(input.charAt(input.length() - 2));

        // 3. First five characters
        System.out.println(input.substring(0, 5));

        // 4. All but the last two characters
        System.out.println(input.substring(0, input.length() - 2));

        // 5. Characters with even indices
        StringBuilder evenIndices = new StringBuilder();
        for (int i = 0; i < input.length(); i += 2) {
            evenIndices.append(input.charAt(i));
        }
        System.out.println(evenIndices);

        // 6. Characters with odd indices
        StringBuilder oddIndices = new StringBuilder();
        for (int i = 1; i < input.length(); i += 2) {
            oddIndices.append(input.charAt(i));
        }
        System.out.println(oddIndices);

        // 7. All characters in reverse order
        System.out.println(new StringBuilder(input).reverse());

        // 8. Every second character in reverse order
        StringBuilder reverseEverySecond = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i -= 2) {
            reverseEverySecond.append(input.charAt(i));
        }
        System.out.println(reverseEverySecond);

        // 9. Length of the string
        System.out.println(input.length());

        scanner.close();
    }
}
