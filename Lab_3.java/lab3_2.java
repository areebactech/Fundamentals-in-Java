public class lab3_2{
      public static void main(String[]args){
        double regularWages;
        double basepay = 25;
        double regularhours = 40;
        double overtimewages;
        double overtimepay = 37.5;
        double overtimehours = 10;
        double totalwages;
        regularWages = basepay * regularhours;
        overtimewages = overtimepay * overtimehours;
        totalwages = regularWages + overtimewages;
        System.out.println("Wages for this week are $ " + totalwages);
      }    
}