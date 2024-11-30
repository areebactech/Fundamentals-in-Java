import java.util.Scanner;

public class ascii_to_char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Convert ASCII code to character");
        System.out.println("2. Convert character to Unicode");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter an ASCII code (0-127): ");
                int asciiCode = scanner.nextInt();
                if (asciiCode >= 0 && asciiCode <= 127) {
                    char character = (char) asciiCode;
                    System.out.println("The character for ASCII code " + asciiCode + " is: " + character);
                } else {
                    System.out.println("Invalid ASCII code. Please enter a number between 0 and 127.");
                }
                break;

            case 2:
                System.out.print("Enter a character: ");
                char character = scanner.next().charAt(0);
                int unicode = (int) character;
                System.out.println("The Unicode for the character '" + character + "' is: " + unicode);
                break;

            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }
}
