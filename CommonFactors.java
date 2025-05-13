PROBLEM: Number of Common Factors
Statement:
      Given two positive integers a and b, return the number of common factors of a and b.
     An integer x is a common factor of a and b if x divides both a and b.
Example:
      Input: a = 12, b = 6
      Output: 4
      Explanation: The common factors of 12 and 6 are 1, 2, 3, 6

Solution:
 class CommonFactors{
    public int commonFactors(int a, int b) {
        int count=1;
        for(int i=2;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                count+=1;
            }
        }
        return count;
    }
}
