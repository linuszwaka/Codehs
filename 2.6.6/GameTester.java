public class GamesTester
{
    public static void main(String[] args)
    {
        NumberGames game = new NumberGames(3);
        
        // Double the number
        // Print it out
        double numbersGame = game.doubleNumber();
        System.out.println(numbersGame);
        
        // Square the number
        // Print it out
        double num = numbersGame;
        double squareNum = game.squareNumber();
        System.out.println(squareNum);
        
        // Double the number again
        // Print it out
        double doubleNum = game.doubleNumber();
        System.out.println(doubleNum);
        
        // Get the number and store the value
        // Print it out to see that getNumber does
        // not modify the number
        double getNum = game.getNumber();
        System.out.println(getNum);
    }
}
