import java.util.Scanner;

public class ReplaceLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        String input = scanner.nextLine();

        int firstIndex = input.indexOf('h');
        int lastIndex = input.lastIndexOf('h');

        String before = input.substring(0, firstIndex + 1);
        String middle = input.substring(firstIndex + 1, lastIndex).replace('h', 'H');
        String after = input.substring(lastIndex);

        String result = before + middle + after;
        System.out.println("Correct Answer: " + result);

        scanner.close();
    }
}
