import java.util.Scanner;
public class task3_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("A tickets sold: ");
        int ticketsA = input.nextInt();
        System.out.print("B tickets sold: ");
        int ticketsB = input.nextInt();
        System.out.print("C tickets sold: ");
        int ticketsC = input.nextInt();
        System.out.print("D tickets sold: ");
        int ticketsD = input.nextInt();

        double priceA = 20.0;
        double priceB = 15.0;
        double priceC = 10.0;
        double priceD = 5.0;

        double incomeA = ticketsA * priceA;
        double incomeB = ticketsB * priceB;
        double incomeC = ticketsC * priceC;
        double incomeD = ticketsD * priceD;
        
        double totalIncome = incomeA + incomeB + incomeC + incomeD;

        System.out.printf("Income from Class A tickets: $%.2f\n", incomeA);
        System.out.printf("Income from Class B tickets: $%.2f\n", incomeB);
        System.out.printf("Income from Class C tickets: $%.2f\n", incomeC);
        System.out.printf("Income from Class D tickets: $%.2f\n", incomeD);
        System.out.printf("Total income from all ticket sales: $%.2f\n", totalIncome);
    }
    }