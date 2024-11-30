import java.util.Scanner;

public class lab6_task1 {
    public static void main(String[] args) {
        final double EARTH_RADIUS = 6371.01; 
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        String[] point1 = input.nextLine().split(", ");
        double lat1 = Double.parseDouble(point1[0]);
        double lon1 = Double.parseDouble(point1[1]);
        
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        String[] point2 = input.nextLine().split(", ");
        double lat2 = Double.parseDouble(point2[0]);
        double lon2 = Double.parseDouble(point2[1]);
        
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);
        
        double distance = EARTH_RADIUS * Math.acos(Math.sin(lat1) * Math.sin(lat2)
                + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
        
        System.out.println("The distance between the two points is " + distance + " km");
    }
}
