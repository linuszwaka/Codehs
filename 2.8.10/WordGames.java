public class WordGames
{
    private String word;
    
    public WordGames(String text)
    {
        word = text;
    }
    
    public String scramble()
    {
        int length = word.length();
        int half = length / 2;
        String firstHalf = word.substring(0, half);
        String secondHalf = word.substring(half, length);
        return secondHalf + firstHalf;
    }
    
    
    public String bananaSplit(int insertIdx, String insertText)
    {
        // Insert insertText at the position
        // insertIdx
        int length = word.length();
        String insert = word.substring(0, insertIdx);
        String half = word.substring(insertIdx, length);
        return insert + insertText + half;
       
    }
    
    
    public String bananaSplit(String insertChar, String insertText)
    {
        // Insert insertText after the first
        // occurence of the insertChar
        int length = word.length();
        int index = word.indexOf(insertChar);
        String first = word.substring(0, index);
        String second = word.substring(index, length);
        return first + insertText + second;
        
    }
    
    
    public String toString()
    {
        return "[" + word + "]";
    }
    
    
}
