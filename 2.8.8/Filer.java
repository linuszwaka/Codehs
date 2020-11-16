public class Filer
{
    private String word;
    
    public Filer(String theWord)
    {
        word = theWord;
    }
    
    // Returns the word
    public String getWord()
    {
        return word;
    }
    
    // Returns true if word comes
    // before otherWord.
    // Returns false otherwise.
    public boolean comesBefore(String otherWord)
    {
        boolean death = word.compareTo(otherWord) < 0;
        return death;
           
    }
    
    
    // Returns true if word comes
    // after otherWord.
    // Returns false otherwise.
    public boolean comesAfter(String otherWord)
    {
        boolean kill = word.compareTo(otherWord) > 0;
        return kill;
    }
    
    
    // Returns true if word is equal to otherWord.
    // Returns false otherwise.
    public boolean isEqual(String otherWord)
    {
        return word.equals(otherWord);
    }
    
    
}
