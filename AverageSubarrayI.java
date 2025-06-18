PROBLEM: Maximum Average Subarray I 
Statement:
     You are given an integer array nums consisting of n elements, and an integer k.
     Find a contiguous subarray whose length is equal to k that has the maximum average value and 
     return this value. Any answer with a calculation error less than 10-5 will be accepted.
Example:
      Input: nums = [1,12,-5,-6,50,3], k = 4
      Output: 12.75000
      Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
      
Solution:
    class AverageSubarrayI{
        public double findMaxAverage(int[] nums, int k) {
            int l=0;
            int r=k,sum=0;
            for(int i=0;i<k;i++){
                sum+=nums[i];
            }
            int max=sum;
            while(r<nums.length){
                sum+=nums[r];
                sum-=nums[l];
                max=Math.max(sum,max);
                l++;
                r++;
            }
            return (double)max/k;
                }
            }
