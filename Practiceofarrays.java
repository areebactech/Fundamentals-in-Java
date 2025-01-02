import java.util.Scanner;

public class Practiceofarrays {
    public static void main(String[] args) {

        /*int []marks = new int[5];             MARKS DECLARE
        for (int i = 0; i <5; i++){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the marks of subjects: ");
            marks[i] = input.nextInt();
        }
        System.out.println("English " + marks[0]);
        System.out.println("chemistry " + marks[1]);
        System.out.println("physics " + marks[2]);
        System.out.println("urdu " + marks[3]);
        System.out.println("maths " + marks[4]);
    
        int [] arr = {20,10,30,50,15};          MINIMUM VALUE
        int  min = arr[0];
        for(int i = 0; i < 5; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Minimum Value = " + min);

        int [] arr = {20,10,30,50,15};   //Maximum AND Location
        int  max = arr[0];
        int loc = 0;
        for(int i = 1; i < 5; i++){
            if (arr[i]>max){
                max = arr[i];
                loc = i;
            }
        }
        System.out.println("Maximum Value = " + max);
        System.out.println("Location: " + loc);*/

        int [][] a= {{23,54,23},{45,12,78},{14,67,1}};
        for(int i = 0; i<3;i++)
        {
            int sum = 0;
            for(int j = 0; j< 3; j++){
                 sum = sum + a[j][i];
                }
            System.out.println("sum of column "+(i+1)+"="+sum);
        }
    
        
    }
}