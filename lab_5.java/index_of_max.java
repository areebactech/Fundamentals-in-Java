import java.util.Scanner;
public class index_of_max{
static Scanner input = new Scanner(System.in);
static final int SENTINEL = 0;
public static void main(String[] args) {
    System.out.print("Sequence: ");
     int integers = input.nextInt();

     int max = 0;
     int max_index = 0;
     int current_index = 0;

     while(integers != SENTINEL){
       if(max < integers){
        max = integers;
        max_index = current_index;
       }
        integers = input.nextInt();
            current_index++;
     }
       if (max_index != -1) {
            System.out.println("Index of Maximum: " + max_index);
       }
}
}