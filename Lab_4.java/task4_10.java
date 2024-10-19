import java.util.*;
public class task4_10{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.print("Number of books purchased: ");
        int Books = s.nextInt();

         if(Books == 0){
           System.out.println("You got 0 Points!");
         }
         else if(Books == 1){
           System.out.println("You got 5 Points!");
          }
         else if(Books == 2){
           System.out.println("You got 15 Points!"); 
          }
         else if(Books == 3){
           System.out.println("You got 30 Points!");
          }
         else{
           System.out.println("You got 60 Points!");
          }
         }
        }