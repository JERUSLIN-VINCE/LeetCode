(* problem statement:
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

solution
Language used:JAVA
*)
      public class Movezero{
    public void moveZeroes(int[] nums) {
        int n=nums.length;
         int id=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[id++]=nums[i];
            }
        } while(id<nums.length){
            nums[id]=0;
              id++;}
    }
  public static void main(String[] args){
    int[] nums={0,1,0,3,12};
    moveZeroes(nums);
    System.out.print(Arrays.toString(nums))
  }


