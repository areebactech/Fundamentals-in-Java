public class functions{
    static int factorial(int a){
    if(a > 1)
    return a * factorial(a - 1);
    else
    return 1;
    }
    public static void main(String[]args){
        int x = 5;
        int b = factorial(x);
        System.out.println(b);
    }
}