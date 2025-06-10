PROBLEM: Maximum Difference Between Even and Odd Frequency I
Statement:
       You are given a string s consisting of lowercase English letters.
Your task is to find the maximum difference diff = freq(a1) - freq(a2) between the frequency of characters a1 and a2 in the string such that:
a1 has an odd frequency in the string.
a2 has an even frequency in the string.
Return this maximum difference.
      
Example:
    Input: s = "aaaaabbc"
    Output: 3
    Explanation:
      The character 'a' has an odd frequency of 5, and 'b' has an even frequency of 2.
      The maximum difference is 5 - 2 = 3.
      
Solution:
   class DiffEvenandOddFrequency{
    public int maxDifference(String s) {
        int[]arr = new int[26];
        int max = 0, min= s.length();
        for (int i=0;i<s.length();i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                max = Math.max(max, arr[i]);
            }
            if (arr[i] % 2 == 0 && arr[i] > 0) {
                min = Math.min(min, arr[i]);
            }
        }
        return max - min;
    }
}
