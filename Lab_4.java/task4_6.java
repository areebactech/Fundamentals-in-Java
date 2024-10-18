import java.util.Scanner;
public class task4_6{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        String[] romanNumerals = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        System.out.print("Enter number(1-10): ");
        int num = s.nextInt();
        if(num >= 1 && num <= 10){
            System.out.println("Roman Numeral of the number: " + romanNumerals[num - 1]);
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}