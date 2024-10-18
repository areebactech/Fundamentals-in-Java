import java.util.Scanner;
public class task4_7{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.print("Width of Triangle1: ");
        int width1 = s.nextInt();
        System.out.print("Length of Triangle1: ");
        int length1 = s.nextInt();

        int area_of_Triangle1 = length1 * width1;
        System.out.println("AREA1: "+ area_of_Triangle1);

        System.out.print("width of Triangle2: ");
        int width2 = s.nextInt();
        System.out.print("length of Triangle2: ");
        int length2 = s.nextInt();

        int area_of_Triangle2 = length2 * width2;
        System.out.println("AREA2: "+ area_of_Triangle2);

        if(area_of_Triangle1 > area_of_Triangle2){
            System.out.println("Greater area: " + area_of_Triangle1);
        }
        else if(area_of_Triangle1 < area_of_Triangle2){
            System.out.println("Greater area: " + area_of_Triangle2);
        }
        else{
            System.out.println("Both are equal.");
        }
        }
    }
