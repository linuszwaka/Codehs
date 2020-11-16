public class Extremes
{
    Integer min;
    Integer max;
    
    // Constructor
    public Extremes()
    {
        Integer min = Integer.MIN_VALUE;
        Integer max = Integer.MAX_VALUE;
    }
    
    // Returns the difference
    // max - number
    public Integer maxDiff(Integer number)
    {
        Integer max = Integer.MAX_VALUE;
        return max - number;
    }

    // Returns the difference
    // min - number
    public Integer minDiff(Integer number)
    {
        Integer min = Integer.MIN_VALUE;
        return min - number;
    }
    
    // Returns a String representation
    // in the form
    // [min, max]
    public String toString()
    {
        Integer min = Integer.MIN_VALUE;
        Integer max = Integer.MAX_VALUE;
        return "[" + min + ", " + max + "]";   
    }
}
