PROBLEM: Valid Word
Statement:
      A word is considered valid if:
        It contains a minimum of 3 characters.
        It contains only digits (0-9), and English letters (uppercase and lowercase).
        It includes at least one vowel.
        It includes at least one consonant.
        You are given a string word.
  Return true if word is valid, otherwise, return false.
Example:
      Input: word = "234Adas"
      Output: true
      Explanation:
        This word satisfies the conditions.

Solution:
     class ValidWord{
        public boolean isValid(String str) {
            if(str.length()<3){
                return false;
            }
            String s="aAeEiIoOuU";
            int vcount=0;
            int ccount=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>=48 &&str.charAt(i)<=122){
                    if(str.charAt(i)>=58 && str.charAt(i)<65){
                        return false;
                    }
                    if(str.charAt(i)>=65 && str.charAt(i)<=122){
                        String sm=Character.toString(str.charAt(i));
                    if(s.contains(sm)){
                        vcount++;
                    }
                    else{
                         ccount++;
                        }
                    }
                }
                else{
                    return false;
                }
                
            }
           if(vcount>=1 && ccount>=1){
                return true;
            }
            return false;
        }
    }
