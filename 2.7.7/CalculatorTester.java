import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter two doubles");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        
        Calculator calc = new Calculator();
        
        System.out.println(num1  + " + " + num2 + " = " + calc.sum(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + calc.subtract(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + calc.multiply(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + calc.divide(num1, num2));
    }
}
