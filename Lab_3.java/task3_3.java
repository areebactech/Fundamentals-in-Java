import java.util.Scanner;
public class task3_3{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("No. of Students in class1: ");
        int class1 = input.nextInt();
        System.out.print("No. of students in class2: ");
        int class2 = input.nextInt();
        System.out.print("No. of students in class3: ");
        int class3 = input.nextInt();

        class1 = (class1 + 1) / 2;
        class2 = (class2 + 1) / 2;
        class3 = (class3 + 1) / 2;

        int sum = class1 + class2 + class3;
        int desks = sum + 1/ 2;
        System.out.println("Desks needed: " + desks);
    }
}