import java.util.*;
public class task5_3{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter integers: ");
        int integers = s.nextInt();

        int zerocount = 0;
        for(int i = 1; i < integers; i++){
            zerocount += 1;
        }
        System.out.println("Zeros: " + zerocount);
    }
}