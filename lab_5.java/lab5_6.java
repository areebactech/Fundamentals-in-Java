import java.util.Scanner;
public class lab5_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers to find the max. Enter 0 to end:");
        
        int number, max;
        number = input.nextInt();
        max = number;

        do {
            number = input.nextInt();
            if (number > max)
                max = number;
        } while (number != 0);

        System.out.println("Max is " + max + " and the last number entered was " + number);
    }
}
