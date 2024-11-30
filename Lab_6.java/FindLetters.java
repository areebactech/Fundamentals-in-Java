import java.util.Scanner;

public class FindLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        String input = scanner.nextLine();

        int firstIndex = input.indexOf('f');
        int lastIndex = input.lastIndexOf('f');

        if (firstIndex != -1) {
            if (firstIndex == lastIndex) {
                System.out.println(firstIndex);
            } else {
                System.out.println(firstIndex + " " + lastIndex);
            }
        }

        scanner.close();
    }
}
