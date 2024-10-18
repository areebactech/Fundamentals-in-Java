import java.util.Scanner;

public class Payroll{
    public static void main(String[]args){
        Scanner Lab = new Scanner(System.in);
        double hours;
        double payroll;
        double result;

        System.out.println("How many hours did you worked? ");
        hours = Lab.nextDouble();

        System.out.println("How much do get paid per hour? ");
        payroll = Lab.nextDouble();

        if (hours <= 40 )
            result = hours * payroll;
        else
            result = (hours - 40) * (1.5 * payroll) + 40 * payroll;

        System.out.println("You earned "+result+"$ pay");

    }
}