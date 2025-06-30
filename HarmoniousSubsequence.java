PROBLEM: Longest Harmonious Subsequence 
Statement:
     We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.
    Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences.
Example:
    Input: nums = [1,2,3,4]
    Output: 2
    Explanation:
      The longest harmonious subsequences are [1,2], [2,3], and [3,4], all of which have a length of 2.
    
Solution:
    class HarmoniousSubsequence{
    public int findLHS(int[] nums) {
       Arrays.sort(nums);
       int maxlen=0;
       int j=0;
       for(int i=0;i<nums.length;i++){
        while(nums[i]-nums[j]>1){
            j++;
        }
        if(nums[i]-nums[j]==1){
            maxlen=Math.max(maxlen,i-j+1);
        }
       }
       return maxlen;
    }
}
