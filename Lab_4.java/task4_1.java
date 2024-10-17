public class task4_1{
    public static void main(String[]args){
    int x = 10;
    int y = 15;
    int z = 20;
    // Expression1: !(x > 10)
    boolean ex1 = !(x > 10);
    System.out.println("Expression1: " + ex1);

    //Expression2: x <= 5 || y < 15
    boolean ex2 = x <= 5 || y < 15;
    System.out.println("Expression2: " + ex2);

    //Expression3: (x != 5) && (y != z)
    boolean ex3 = (x != 5) && (y != z);
    System.out.println("Expression3: " + ex3);

    //Expression4: x >= z || (x + y >= z)
    boolean ex4 = x >= z || (x + y >= z);
    System.out.println("Expression4: " + ex4);

    //Expression5: (x <= y - 2) && (y >= z) || (z - 2 != 20)
    boolean ex5 = (x <= y - 2) && (y >= z) || (z - 2 != 20);
    System.out.println("Expression5: " + ex5);
}
}