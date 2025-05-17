PROBLEM: Sort Colors
Statement:
      Given an array nums with n objects colored red, white, or blue, sort them in-place so that 
     objects of  the same color are adjacent, with the colors in the order red, white, and blue.
     We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
    
  You must solve this problem without using the library's sort function.
      
Example:
   Input: nums = [2,0,2,1,1,0]
  Output: [0,0,1,1,2,2]

  Input: nums = [2,0,1]
  Output: [0,1,2]
      
Solution:
    class SortColors{
    public void sortColors(int[] nums) {
       HashMap<Integer,Integer> ans=new HashMap<>();
       for(int num:nums){
         ans.put(num,ans.getOrDefault(num,0)+1);
       }
       int ind=0;
       for(int num:ans.keySet()){
         int freq=ans.get(num);
          for(int i=0;i<freq;i++){
            nums[ind++]=num;
          }
       }
    }
}
