import java.util.Scanner;
public class whileloop{
public static void main(String[]args){
char ch = 'y';
int num;
int sum = 0;
Scanner s = new Scanner(System.in);
while(ch == 'y')
{
    System.out.println("Enter a number: ");
    num = s.nextInt();
    sum = sum + num;

    System.out.println("Do you want more addition.Enter y/n");
    ch = s.next().charAt(0);
}
System.out.println(sum);
}
}