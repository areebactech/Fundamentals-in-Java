import java.util.Scanner;
public class lab4_1{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        boolean isLeapyear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + " is a leap year? " + isLeapyear);
    }
}