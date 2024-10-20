import java.util.Scanner;
public class max_of_sequence{
static Scanner input = new Scanner(System.in);
static final int SENTINEL = 0;
public static void main(String[] args) {
    System.out.print("Sequence: ");
     int integers = input.nextInt();

     int max = 0;
     while(integers != SENTINEL){
        max = Math.max(max,integers);  
         integers = input.nextInt();
     }
     System.out.println("Maximum of Sequence: " + max);
}
}