import java.util.Scanner;

public class pattern{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu to ask which pattern to print
        System.out.println("Enter a number (1-5) to print the corresponding pattern:");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the number of rows:");
                int rows = scanner.nextInt();
                pattern1(rows);  // Pattern 1 now accepts a row count.
                break;
            case 2:
                pattern2();
                break;
            case 3:
                pattern3();
                break;
            case 4:
                pattern4();
                break;
            case 5:
                pattern5();
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                break;
        }

        scanner.close();
    }

    // Function for pattern 1 - Prints given number of rows with 8 *
    public static void pattern1(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= 8; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

// Function for pattern 2 - Left-aligned increasing pyramid
public static void pattern2() {
    int height = 5; // Set the height of the pyramid
    for (int i = 1; i <= height; i++) {
        // Print stars for the current row
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println(); // Move to the next line
    }
}


    // Function for pattern 3 - Right-aligned triangle
    public static void pattern3() {
        for (int i = 1; i <= 5; i++) {
            // Print leading spaces for alignment
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            // Print stars after spaces
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Function for pattern 4 - Pyramid shape
    public static void pattern4() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Function for pattern 5 - Proper Pyramid of numbers
    public static void pattern5() {
        for (int i = 1; i <= 5; i++) {
            // Print leading spaces for pyramid alignment
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            // Print the numbers, 'i' printed 'i' times
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
