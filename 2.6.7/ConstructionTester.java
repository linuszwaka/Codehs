import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       
      System.out.println("Enter the tax rate:");
      double taxes = input.nextDouble();
      
      Construction big = new Construction(8, 11, taxes);
      
      System.out.println("How many boards do you need?");
      int boards = input.nextInt();
      
      System.out.println("How many windows do you need?");
      int windows = input.nextInt();
      
      double total = big.lumberCost(boards) + big.windowCost(windows);
      
      System.out.print("Total: ");
      System.out.println(total);
      
      System.out.print("Grand Total: ");
      System.out.println(big.grandTotal(total));
       
    }
}
