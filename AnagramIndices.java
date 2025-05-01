PROBLEM: Find All Anagrams in a String
Statement:
      Given two strings s and p, return an array of all the start indices of p's anagrams in s. 
      You may return the answer in any order.
Example:
      Input: s = "cbaebabacd", p = "abc"
      Output: [0,6]
      Explanation:
         The substring with start index = 0 is "cba", which is an anagram of "abc".
         The substring with start index = 6 is "bac", which is an anagram of "abc".

Solution:
      class AnagramIndices{
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>list=new ArrayList<>();
        if(p.length()>s.length()){
            
             return list; 
        }
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        int i=0;
        for( i=0;i<p.length();i++){
            arr1[p.charAt(i)-'a']++;
            arr2[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(arr1,arr2)){
            list.add(0);
        }
        int front=0;
        int back=p.length();
        while(back<s.length()){
             arr2[s.charAt(front)-'a']--;
             arr2[s.charAt(back)-'a']++;
               front++;
             back++;
        if(Arrays.equals(arr1,arr2)){
              list.add(front);
        }
        }
        return list;

    }
}
