PROBLEM: Find Greatest Common Divisor of Array
Statement:
      Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
      The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
Example:
      Input: nums = [2,5,6,9,10]
      Output: 2
      Explanation:
        The smallest number in nums is 2.
        The largest number in nums is 10.
        The greatest common divisor of 2 and 10 is 2.

Solution:
   class GcdOfArray{
        public int findGCD(int[] nums) {
           int max=nums[0];
           int min=nums[0];
          for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
               max=nums[i];
           }
          if(nums[i]<min){
              min=nums[i];
          }
        }
         int divisor=Math.min(max,min);
         int ans=1;
         for(int i=2;i<=divisor;i++){
           if(max%i==0 && min%i==0){
              ans=i;
           }
        } 
        return ans;
     }
}
