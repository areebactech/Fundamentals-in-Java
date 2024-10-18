public class notes{

    public static void main(String[]args) {

    int cur = 15530;

    int Five_Thousand = cur / 5000;
    System.out.println("Five thousand Notes:" + Five_Thousand);
    cur = cur % 5000;
    System.out.println("The amount left:" + cur);


    int Thousand = cur / 1000;
    System.out.println("Thousand Notes: " + Thousand);

    cur = cur % 1000;
    System.out.println("The amount left:" + cur);

    int Five_Hundered = cur / 500;
    System.out.println("Five Hundred Notes:" + Five_Hundered);

    cur = cur % 500;
    System.out.println("The amount left:" + cur);

    int Hundered = cur / 100;
    System.out.println("Hundred Notes:" + Hundered);

    cur = cur % 100;
    System.out.println("The amount left:" + cur);


    int Fifty = cur / 50;
    System.out.println("Fifty Notes:" + Fifty);

    cur = cur % 50;
    System.out.println("The amount left:" + cur);


    int twenty = cur / 20;
    System.out.println("Twenty Notes:" + twenty);

    cur = cur % 20;
    System.out.println("The aount left:" + cur);
    int Ten = cur / 10;
    System.out.println("Ten Notes:" + Ten);

    cur = cur % 10;
    System.out.println("The amount left:" + cur);
    }
}
