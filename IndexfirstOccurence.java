Problem Statement:
// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
  Solution:
class IndexfirstOccurence{
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m=needle.length();
        for(int i=0;i<=n-m;i++){
            if(haystack.substring(i,i+m).equals(needle)){
                return i;
            }
        }
        return -1;
    }
  public static void main(String[] args){
    String haystack="sadbutsad";
    String needle="sad";
    System.out.print(strStr(hayback,needle));
  }
}
