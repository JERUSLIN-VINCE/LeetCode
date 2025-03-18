problem:Happy Number
Satement:
Write an algorithm to determine if a number n is happy.
  A happy number is a number defined by the following process:
Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle 
which does not include 1.Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.
solution:
class Solution {
    public boolean isHappy(int n) {
       int sum=n;
       int x=n;
       while(sum>9){
        sum=0;
        while(x>0){
            int rem=x%10;
            sum+=rem*rem;
            x=x/10;
        }
        x=sum;
       }
       if(sum==1 || sum==7){
        return true;
       }
       return false;
    }
}
