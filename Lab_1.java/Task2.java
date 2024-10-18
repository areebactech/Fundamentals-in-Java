import java.util.Scanner;
public class Task2 {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int length;
        System.out.print("Enter the length: ");
        length = console.nextInt();
        System.out.println();
        int width;
        System.out.print("Enter the width:");
        width = console.nextInt();
        System.out.println();
        int area;
        area = length * width;
        System.out.println("Area=" + area);
        System.out.println();
        int perimeter;
        perimeter = 2 * (length + width);
        System.out.println("Perimeter =" + perimeter);
    }
}