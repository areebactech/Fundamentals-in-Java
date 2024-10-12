import java.util.Scanner;
public class task3_8{
    public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter an integer between 0-1000: ");
    int num = s.nextInt();

    int sum = 0;
    while(num > 0){
        sum += num % 10;
        num /= 10;
    }
    System.out.println("Sum of integers: " + sum);
}
}