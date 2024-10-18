import java.util.Scanner;
public class task4_8{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.print("Date: ");
        int month = s.nextInt();
        int day = s.nextInt();
        int year = s.nextInt();

        int month_times_day = month * day;
        if(month_times_day == year){
            System.out.println("The Date is magic!");
        }
        else{
        System.out.println("The Date is not magic!");
        }
    }
}