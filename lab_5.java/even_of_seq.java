import java.util.Scanner;
public class even_of_seq{
static Scanner input = new Scanner(System.in);
static final int SENTINEL = 0;
public static void main(String[] args) {
    System.out.print("Sequence: ");
     int integers = input.nextInt();

     int counter = 0;

     while(integers != 0){
        if(integers % 2 == 0){
            counter++;
        }
        integers = input.nextInt();
     }
      System.out.println("Even numbers in sequence: " + counter);
     }
}
