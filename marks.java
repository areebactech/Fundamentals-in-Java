import java.util.Scanner;

public class marks {
    public static void main(String[]args){
        
        int s1, s2, s3, s4, s5, total, avg;

        Scanner s = new Scanner(System.in);

        System.out.print("s1:");
        s1 = s.nextInt();
        System.out.print("s2:");
        s2 = s.nextInt();
        System.out.print("s3:");
        s3 = s.nextInt();
        System.out.print("s4:");
        s4 = s.nextInt();
        System.out.print("s5:");
        s5 = s.nextInt();

        total = s1 + s2 + s3 + s4 + s5;
        avg = total / 5;
        System.out.println("Total marks:"+ total);
        System.out.println("Average marks:"+ avg);
    }
}