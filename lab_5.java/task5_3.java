import java.util.Scanner;
public class task5_3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of digits: ");
        int digit = input.nextInt();
        int counter = 0;
        System.out.print("Integers: ");
        for(int i = 0; i< digit;i++){
            int number = input.nextInt();
            if(number == 0){
                counter++;
            }
        }
        System.out.println("Number of zeros: " + counter);
    }
    
}