import java.util.Scanner;
public class task3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        if (input.hasNextDouble()) {
            double num = input.nextDouble();
            if (num >= 1.0) {
                System.out.println("This amount corresponds to $" + num + ". Change calculation here would be large.");
            } else {
                int cents = (int) Math.round(num * 100);
                int quarters = cents / 25;
                cents %= 25;
                int dimes = cents / 10;
                cents %= 10;
                int nickels = cents / 5;
                cents %= 5;
                int pennies = cents;
                
                System.out.println("Quarters: " + quarters);
                System.out.println("Dimes: " + dimes);
                System.out.println("Nickels: " + nickels);
                System.out.println("Pennies: " + pennies);
            }
        } else {
            System.out.println("Invalid input. Please enter a decimal number.");
        }
        
        input.close();
    }
}
