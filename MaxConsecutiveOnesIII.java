PROBLEM: Max Consecutive Ones III
Statement:
      Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
Example:
    Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
    Output: 6
    Explanation: [1,1,1,0,0,1,1,1,1,1,1]
        Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
      
Solution:
        class MaxConsecutiveOnesIII{
            public int longestOnes(int[] nums, int k) {
                int max=0;
                int l=0,r=0,count=0;
                int zerocount=0;
                while(r<nums.length){
                    if(nums[r]==0 ){
                        zerocount+=1;
                     }
                     while(zerocount>k){
                        if(nums[l]==0){
                            zerocount-=1;
                        }
                        l++;
                     }
                    max=Math.max(max,r-l+1);
                    r++;
                }
                return max;
            }
        }
