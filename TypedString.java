PROBLEM: Find the Original Typed String I
Statement:
     Alice is attempting to type a specific string on her computer. However, she tends to be clumsy and may press a key for too long, resulting in a character being typed multiple times.
     Although Alice tried to focus on her typing, she is aware that she may still have done this at most once.
     You are given a string word, which represents the final output displayed on Alice's screen.
     Return the total number of possible original strings that Alice might have intended to type.
Example:
    Input: word = "abbcccc"
    Output: 5
    Explanation:
       The possible strings are: "abbcccc", "abbccc", "abbcc", "abbc", and "abcccc".
      
Solution:
     class TypedString{
    public int possibleStringCount(String word) {
        int r=word.length()-1;
        int i=word.length()-1;
        while(i>=0){
           if(i>0 && word.charAt(i)==word.charAt(i-1)){
                 r--;
         }
            i--;
        }
        return (word.length()-r);
    }
    }
