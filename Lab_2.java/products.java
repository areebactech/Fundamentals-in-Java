import java.util.Scanner;

public class products{
    public static void main(String[]args){
       
        int p1 , p2 , p3 , total;
        float tax,net_total;

        Scanner s = new Scanner(System.in);

        System.out.print("p1:");
        p1 = s.nextInt();
        System.out.print("p2:");
        p2 = s.nextInt();
        System.out.print("p3:");
        p3 = s.nextInt();

        total = p1 + p2 + p3;
        tax = total * 0.15f;
        net_total = total + tax;
        System.out.println("net_total: "+ net_total);
    }
 }