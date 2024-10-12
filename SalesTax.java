import java.util.Scanner;

public class SalesTax {
    public static void main(String[]args){

    double price;
    double tax;
    double total;
    String item;
    final double Tax_Rate = 0.055;

    Scanner input = new Scanner(System.in);

    System.out.println("Item Discription: ");
    item = input.nextLine();
    System.out.println("Item Price: ");
    price = input.nextDouble();

    tax = price * Tax_Rate;
    total = price + tax;

    System.out.println("Item: " + item);
    System.out.println("Price: " +price);
    System.out.println("Tax: " +tax);
    System.out.println("Total Price: " + total );
    }
}