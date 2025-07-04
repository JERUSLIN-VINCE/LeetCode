PROBLEM: Find the K-th Character in String Game I
Statement:
      Alice and Bob are playing a game. Initially, Alice has a string word = "a".You are given a positive integer k.
      Now Bob will ask Alice to perform the following operation forever:Generate a new string by changing each character 
      in word to its next character in the English alphabet, and append it to the original word.
      For example, performing the operation on "c" generates "cd" and performing the operation on "zb" generates "zbac".
       Return the value of the kth character in word, after enough operations have been done for word to have at least k characters.
       Note that the character 'z' can be changed to 'a' in the operation.
Example:
    Input: k = 5
    Output: "b"
    Explanation:
       Initially, word = "a". We need to do the operation three times:
            Generated string is "b", word becomes "ab".
            Generated string is "bc", word becomes "abbc".
            Generated string is "bccd", word becomes "abbcbccd".

Solution:
      class StringGameI{
        public char kthCharacter(int k) {
            String str="a";
            while(str.length()<=k){
                String s="";
                for(int i=0;i<str.length();i++){
                    if(str.charAt(i)=='z'){
                         s=s+Character.toString('a');
                    }
                    else{
                    s=s+Character.toString((char)(str.charAt(i)+1));
                    }
                }
                str=str+s;
                }
             System.out.print(str);
            return str.charAt(k-1);
        }
    }
