import java.util.Scanner;

public class RemoveLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        String input = scanner.nextLine();

        int firstIndex = input.indexOf('h');
        int lastIndex = input.lastIndexOf('h');

        String result = input.substring(0, firstIndex) + input.substring(lastIndex + 1);
        System.out.println("Correct Answer: " + result);

        scanner.close();
    }
}
