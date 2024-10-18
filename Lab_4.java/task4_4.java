import java.util.Scanner;
public class task4_4{
    public static void main(String[]args){
     Scanner s = new Scanner(System.in);  
     System.out.print("Integer1: ");
     int Int1 = s.nextInt();
     System.out.print("Integer2: ");
     int Int2 = s.nextInt();
     if(Int1 > Int2){
        System.out.println("Minimum number: " + Int2);
     }
     else{
        System.out.println("Minimum number: " + Int1);
     }
     System.out.print("Integer for task b: ");
     int X = s.nextInt();
     int sign;
     if(X > 0){
      sign = 1;
     }
     else if(X < 0){
        sign = -1;
     }
     else{
        sign = 0;
     }
     System.out.println("Sign: " + sign);
     
     System.out.print("3 Integers for task c: ");
     int num1 = s.nextInt();
     int num2 = s.nextInt();
     int num3 = s.nextInt();
     int min_of_3 = Math.min(num1, Math.min(num2, num3));
     System.out.println("Minimum of three numbers: " + min_of_3);
    }
}