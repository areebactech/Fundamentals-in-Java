import java.util.Scanner;
public class length_of_sequence{
static Scanner input = new Scanner(System.in);
static final int SENTINEL = 0;
public static void main(String[] args) {
    System.out.print("Sequence: ");
     int digits = input.nextInt();

     int counter = 0;
     while(digits != SENTINEL){
        counter++;
       digits = input.nextInt();
     }
        System.out.println("Length of Sequence: " + counter);
}
}