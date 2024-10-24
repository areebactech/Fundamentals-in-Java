import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number from 1 to 3:");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("You chose option 1.");
                break;
            case 2:
                System.out.println("You chose option 2.");
                break;
            case 3:
                System.out.println("You chose option 3.");
                break;
            default:
                System.out.println("Invalid option. Please choose a number between 1 and 3.");
                break;
        }
        
        scanner.close();
    }
}
