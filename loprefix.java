PROBLEM: Longest Common Prefix
Statement:
      Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Solution:
     class loprefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1=strs[0];
        String s2=strs[strs.length-1];
        int id=0;
        while(id<s1.length() && id<s2.length()){
            if(s1.charAt(id)==s2.charAt(id)){
                id++;
            }
            else{
                break;
            }
        }
        return s1.substring(0,id);
    }
  public static void main(String[] args){
    String[] strs={"flower","flow","flight"};
    System.out.print(longestCommonPrefix(strs));
  }
}
      
