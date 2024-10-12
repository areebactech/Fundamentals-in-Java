import java.util.Scanner;
public class task3_5{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Amount of milk produced: ");
        double milk_produced = input.nextDouble();

        double carton = 3.78;
        double cost_of_1_litre = 0.38;
        double profit = 0.27;

        double total_cartons = Math.ceil(milk_produced / carton);
        double cost_of_milk = milk_produced * cost_of_1_litre;
        double profit_today = milk_produced * profit;

        System.out.println("Total cartons: "+ total_cartons);
        System.out.printf("Total cost_of_milk: $%.2f\n", cost_of_milk);
        System.out.printf("Total profit_today: $%.2f\n", profit_today);
    }
}