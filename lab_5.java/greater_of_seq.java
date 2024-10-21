import java.util.Scanner;
public class greater_of_seq{
static Scanner input = new Scanner(System.in);
static final int SENTINEL = 0;
public static void main(String[]args){

    System.out.print("Sequence: ");
    int integers = input.nextInt();

    int counter = 0;
    int current_num = 0;

    while(true){
        current_num = input.nextInt();
        if(current_num == SENTINEL){
          break;
        }
        if(current_num > integers){
            counter++;
        }
        integers = current_num;
    }
    System.out.println(counter);
}
}