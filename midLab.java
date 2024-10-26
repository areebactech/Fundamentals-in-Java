import java.util.Scanner;
public class midLab{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double num1 = input.nextDouble();
         
        System.out.print("Enter a decimal number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter a decimal number: ");
        double num3 = input.nextDouble();

        double largest_number;
        if(num1 >= num2 && num1 >= num3){
            largest_number = num1;
        }
        else if(num2 >= num1 && num2 >= num3){
            largest_number = num2;
        }
        else{
            largest_number = num3;
        }
        System.out.printf("The largest number is: %.2f%n" , largest_number);
    }
}