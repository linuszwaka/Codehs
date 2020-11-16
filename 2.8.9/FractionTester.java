import java.util.Scanner;

public class FractionTester
{
    public static void main(String[] args)
    {
        String fraction = "1/2";
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the numerator:");
        int numerator = input.nextInt();
        
        System.out.println("Enter the denominator:");
        int denominator = input.nextInt();
        
        int newNum = (1 * denominator) + 2 * numerator;
        int newDen = 2 * denominator;
        
        Fraction frac = new Fraction(numerator, denominator);
        Fraction out = new Fraction(newNum, newDen);
        
        System.out.println(fraction + " + " + frac.toString() + " = " + out.toString());
        
    }
}
