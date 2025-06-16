PROBLEM: Maximum Difference Between Increasing Elements
Statement:
       Given a 0-indexed integer array nums of size n, find the maximum difference between nums[i] and 
       nums[j] (i.e., nums[j] - nums[i]), such that 0 <= i < j < n and nums[i] < nums[j].
       Return the maximum difference. If no such i and j exists, return -1.
      
Example:
      Input: nums = [7,1,5,4]
      Output: 4
      Explanation:
          The maximum difference occurs with i = 1 and j = 2, nums[j] - nums[i] = 5 - 1 = 4.
          Note that with i = 1 and j = 0, the difference nums[j] - nums[i] = 7 - 1 = 6, but i > j, so it is not valid.
      
Solution:
    class  Maxdiff_Increasing_Elements{
        public int maximumDifference(int[] nums) {
            int ans=-1;
            int temp=nums[0];
      for(int i=1;i<nums.length;i++){
            int a=nums[i];
            temp=Math.min(a,temp);
            if(a>temp){
              ans=Math.max(ans,a-temp);
            }
         }
         return ans;
    
        }
    }
