PROBLEM: Maximum Difference Between Adjacent Elements in a Circular Array
Statement:
      Given a circular array nums, find the maximum absolute difference between adjacent elements.
      Note: In a circular array, the first and last elements are adjacent.
Example:
     Input: nums = [1,2,4]
     Output: 3
     Explanation:
      Because nums is circular, nums[0] and nums[2] are adjacent. They have the maximum absolute difference of |4 - 1| = 3.

Solution:
    class MaxDiffCircularArray{
        public int maxAdjacentDistance(int[] nums) {
            int n=nums.length;
           int Max=Integer.MIN_VALUE;
           for(int i=0;i<nums.length;i++){
            int diff=Math.abs(nums[i%n]-nums[(i+1)%n]);
            Max=Math.max(Max,diff);
           } 
           return Max;
        }
    }
