import java.util.*;
public class task5_2{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int integer = s.nextInt();
        if(integer == 0 || integer == 1){
          System.out.println("1");
        }
        else{
        int result = 1;
        for(int i = 2; i <= integer; i++){
            result *= i;
        }
        System.out.println(result);
    }
    }
}
