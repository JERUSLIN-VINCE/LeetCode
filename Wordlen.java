// Question:
// Given a string s consisting of words and spaces, return the length of the last word in the string.
// A word is a maximal substring consisting of non-space characters only.

Solution:
public class Wordlen {
    public int lengthOfLastWord(String s) {
        String[] str=s.split("\\s+");
        return str[str.length-1].length();
        
    }
  public static void main(String[] args){
    String s="luffy is still joyboy";
    lengthOfLastWord(s);
}
