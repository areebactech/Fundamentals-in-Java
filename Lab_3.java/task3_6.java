import java.util.Scanner;
public class task3_6{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Hours worked: ");
        double hours_worked = input.nextDouble();
        System.out.print("Pay rate per hour: ");
        double pay_rate = input.nextDouble();
        double gross_income = hours_worked * pay_rate * 5;
        double tax = gross_income * 0.14;
        double net_income = gross_income - tax;
        double clothesspending = net_income * 0.11;
        double remaining_income  = net_income - clothesspending;
        double savingsBonds = remaining_income * 0.25;
        double parentsContribution = savingsBonds * 0.50;
        System.out.printf("Income before taxes: $%.2f\n", gross_income);
        System.out.printf("Income after taxes: $%.2f\n", net_income);
        System.out.printf("Spending on clothes and accessories: $%.2f\n", clothesspending);
        System.out.printf("Spending on savings bonds: $%.2f\n", savingsBonds);
        System.out.printf("Parents' contribution to savings bonds: $%.2f\n", parentsContribution);
    }
}