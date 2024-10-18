import java.util.Scanner;
public class task4_5{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 3 integers: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        if(num1 == num2 && num1 == num3){
        System.out.println("3");
        }
        else if(num1 == num2 || num2 == num3 || num1 == num3){
        System.out.println("2");  
        }
        else{
        System.out.println("0");
        }
    }
}