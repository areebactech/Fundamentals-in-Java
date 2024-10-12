import java.util.Scanner;

public class task3_4{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Minutes passed since midnight: ");
        int minutes_passed = input.nextInt();

        int hours = minutes_passed / 60 % 24;
        int minutes = minutes_passed % 60;

        System.out.println("Time in 24 hour clock: " + hours + ":" + minutes);  
    }
}