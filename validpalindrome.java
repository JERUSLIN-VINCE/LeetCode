Problem: 125-Valid Palindrome
Link:https://leetcode.com/problems/valid-palindrome/description/
Statement:
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing
all non-alphanumeric characters,it reads the same forward and backward. Alphanumeric characters 
include letters and numbers.Given a string s, return true if it is a palindrome, or false otherwise.

Solution:
      class validpalindrome {
    public boolean isPalindrome(String s) {
      StringBuilder build=new StringBuilder();
      for(int i:s.toCharArray()){
        if(Character.isLetterOrDigit(i)){
            build.append(Character.toString(i).toLowerCase());
        }
      }
      String str=build.toString();
      int i=0;
      int j=str.length()-1;
      int n=str.length();
      System.out.print(str);
      while(i<n/2){
        if(str.charAt(i)!=str.charAt(j)){
            return false;
        }
        i++;
        j--;

      }
      return true;
    }
  public static void main (String[] args){
    String s="A man, a plan, a canal: Panama";
      System.out.print(isPalindrome(s);
  }
}
