import java.util.Scanner;

public class DecHexConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Convert decimal to hex");
        System.out.println("2. Convert hex to binary");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a decimal value (0 to 15): ");
                int decimal = scanner.nextInt();
                if (decimal >= 0 && decimal <= 15) {
                    String hex = Integer.toHexString(decimal).toUpperCase(); // Convert to hex
                    System.out.println("The hex value is " + hex);
                } else {
                    System.out.println(decimal + " is an invalid input");
                }
                break;

            case 2:
                System.out.print("Enter a hex digit: ");
                String hexInput = scanner.next().toUpperCase(); // Read and convert to uppercase
                if (hexInput.length() == 1 && "0123456789ABCDEF".contains(hexInput)) {
                    int decimalValue = Integer.parseInt(hexInput, 16); // Convert hex to decimal
                    String binary = Integer.toBinaryString(decimalValue); // Convert decimal to binary
                    System.out.println("The binary value is " + binary);
                } else {
                    System.out.println(hexInput + " is an invalid input");
                }
                break;

            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }
}
