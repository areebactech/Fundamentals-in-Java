import java.util.Scanner;
public class conditionals{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int max = Math.max(c, Math.max(a,b));
        System.out.println(max);
    }

}