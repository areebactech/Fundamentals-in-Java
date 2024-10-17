import java.util.Scanner;

public class task4_4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int min;
        if (num1 < num2) {
            min = num1;
        } else {
            min = num2;
        }

        System.out.println("The smaller number is: " + min);
    }
}