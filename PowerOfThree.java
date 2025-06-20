PROBLEM: Power of Three
Statement:
      Given an integer n, return true if it is a power of three. Otherwise, return false.
      An integer n is a power of three, if there exists an integer x such that n == 3x.
Example:
      Example 1:
        Input: n = 27
        Output: true
        Explanation: 27 = 33
     Example 2:
       Input: n = 0
       Output: false
       Explanation: There is no x where 3x = 0.

Solution:
     class PowerOfThree{
    public boolean isPowerOfThree(int n) {
       if(n==0){
        return false;
       }
       while(n%3==0){
        n/=3;
       }
       if(n==1) return true;
       return false;
    }
}
