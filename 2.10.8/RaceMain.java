public class RaceMain
{
    public static void main(String[] args)
    {
        // Length of the course in meters
        double distance = 2414; // ~ 1.5 miles
        
        // Generate a random acceleration for each car
        double randomOne = Math.random();
        double randomTwo = Math.random();
        
        // Create two Racecar objects
        Racecar hi = new Racecar(randomOne, "First car");
        Racecar hello =new Racecar(randomTwo, "Second car");
        
        System.out.println(hi.toString() + "  " + hi.computeTime(distance) + " seconds");
        System.out.println(hello.toString() + " " + hello.computeTime(distance) + " seconds");
    }
}
