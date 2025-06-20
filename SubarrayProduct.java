Problem: Subarray Product Less Than K
Statement:
      Given an array of integers nums and an integer k, return the number of contiguous subarrays 
      where the product of all the elements in the subarray is strictly less than k.
Example:
    Input: nums = [10,5,2,6], k = 100
    Output: 8
    Explanation: The 8 subarrays that have product less than 100 are:
                [10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
                Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
      
Solution:
      class SubarrayProduct{
          public int numSubarrayProductLessThanK(int[] nums, int k) {
              int count=0;
              int l=0;
              int r=0;
              int pro=1;
              while(l<nums.length){
                   pro*=nums[r];
                 if(pro<k){
                      count++;
                  }
                  if(pro>=k){
                      pro=1;
                      l++;
                      r=l-1;
                  }
                    r++;
                  
                  if(r==nums.length){
                      pro=1;
                      l++;
                      r=l;
      
                  }
              
               }
               return count;
          }
      }
