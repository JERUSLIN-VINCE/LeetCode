PROBLEM: Count Subarrays of Length Three With a Condition
Statement:
      Given an integer array nums, return the number of subarrays of length 3 such that 
      the sum of the first and third numbers equals exactly half of the second number.

Solution:
     class sublenthree {
    public int countSubarrays(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]+nums[i+2]==nums[i+1]/2.0){
                System.out.print((nums[i]+nums[i+2])+" ");
                System.out.print(nums[i+1]/2+" ");
                count++;
            }
         }
         return count;
    }
}
     
