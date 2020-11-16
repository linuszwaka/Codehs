import java.util.Scanner;

public class WordGameTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for a word
        System.out.println("Enter a word:");
        String hello = input.nextLine();
        
        WordGames hi = new WordGames(hello);
        
        // Scramble it
        // Print out scrambled word
        
        System.out.println(hi.scramble());
        
        // Ask for an index
        // Ask for random word
        System.out.println("Enter an integer: ");
        int idx = input.nextInt();
        input.nextLine();  // skip over the newline
        System.out.println("Enter another word: ");
        String word = input.nextLine();
        
        System.out.println(hi.bananaSplit(idx, word));
        
        // Add random word at index
        // Print out the word
        
        
        // Ask for a character (store as a String)
        System.out.println("Enter the word:");
        String random = input.nextLine();
        
        System.out.println("Enter a character in the word");
        String ryan = input.nextLine();
        
        System.out.println(hi.bananaSplit(hello, random));
        
        
        System.out.println(hi.toString());
        
    }
}
