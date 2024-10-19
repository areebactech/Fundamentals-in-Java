import java.util.Scanner;
public class task4_9{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.print("Pennies: ");
        int Pennies = s.nextInt();
        System.out.print("Nickels: ");
        int Nickels = s.nextInt();
        System.out.print("Dimes: ");
        int Dimes = s.nextInt();
        System.out.print("Quarters: ");
        int Quarters = s.nextInt();

     Pennies = Pennies * 1;
     Nickels = Nickels * 5;
     Dimes = Dimes * 10;
     Quarters = Quarters * 25;

     int Total = Pennies + Dimes + Nickels + Quarters;
     if(Total == 100){
        System.out.println("You won!");
     }
     else if(Total > 100){
        System.out.println("Total is greater than 1 dollar.");
     }
     else{
        System.out.println("Total is lesser than 1 dollar.");
     }
     }
}



