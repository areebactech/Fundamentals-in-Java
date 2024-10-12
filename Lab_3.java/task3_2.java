import java.util.Scanner;

public class task3_2{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        //Taking input from the user
        System.out.print("No. of Students: ");
        int students = input.nextInt();
        System.out.print("No. of apples: ");
        int apples = input.nextInt();

        //Dividing apples evenly
        int apples_per_student = apples / students;
        
        //Remaining apples
        int remain_apples = apples % students;

        //output
        System.out.println("Apples per student: " + apples_per_student);
        System.out.println("Remaining apples: " + remain_apples);


    }
}