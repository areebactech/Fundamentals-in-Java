import java.util.Scanner;
public class task5_1 {
    public static void printNumbersInclusive(int A, int B) {
        for (int i = A; i <= B; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printNumbersOrdered(int A, int B) {
        if (A <= B) {
            for (int i = A; i <= B; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = A; i >= B; i--) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void sumOfNumbers(int N, Scanner scanner) {
        int sum = 0;
        System.out.println("Enter " + N + " integers:");
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }
    public static int sumOfCubes(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += Math.pow(i, 3);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1. Print all numbers from A to B inclusively");
        System.out.println("2. Print numbers from A to B in ascending or descending order");
        System.out.println("3. Sum of N numbers");
        System.out.println("4. Sum of cubes from 1 to N");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter A: ");
                int A1 = scanner.nextInt();
                System.out.print("Enter B: ");
                int B1 = scanner.nextInt();
                printNumbersInclusive(A1, B1);
                break;

            case 2:
                System.out.print("Enter A: ");
                int A2 = scanner.nextInt();
                System.out.print("Enter B: ");
                int B2 = scanner.nextInt();
                printNumbersOrdered(A2, B2);
                break;

            case 3:
                System.out.print("Enter the number of integers N: ");
                int N = scanner.nextInt();
                sumOfNumbers(N, scanner);
                break;

            case 4:
                System.out.print("Enter N: ");
                int N4 = scanner.nextInt();
                int result = sumOfCubes(N4);
                System.out.println("Sum of cubes from 1 to " + N4 + ": " + result);
                break;

            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }
        scanner.close();
    }
}
