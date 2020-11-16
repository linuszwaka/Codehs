import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter the latitude of the starting location:");
       double startLatitude = input.nextDouble();
       
       System.out.println("Enter the longitude of the starting location:");
       double startLongitude = input.nextDouble();
       
       System.out.println("Enter the latitude of the ending location:");
       double endLatitude = input.nextDouble();
       
       System.out.println("Enter the longitude of the ending location:");
       double endLongitude = input.nextDouble();
       
       GeoLocation start = new GeoLocation(startLatitude, startLongitude);
       GeoLocation end = new GeoLocation(endLatitude, endLongitude);
       double distance = start.distanceFrom(end);
       System.out.println("The distance is " + distance + " miles.");
    }
       
}
