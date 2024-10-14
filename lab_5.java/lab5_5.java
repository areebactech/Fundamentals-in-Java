import java.util.Scanner;

public class lab5_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputNumber, sum = 0;

        System.out.println("Please enter 5 integers:");

        for (int count = 0; count < 5; count++) {
            inputNumber = input.nextInt();
            sum += inputNumber;
        }

        System.out.println("The sum is " + sum);
    }
}
