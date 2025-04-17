PROBLEM: Count Equal and Divisible Pairs in an Array
Statement:
      Given a 0-indexed integer array nums of length n and an integer k, return the number of pairs (i, j)
      where 0 <= i < j < n, such that nums[i] == nums[j] and (i * j) is divisible by k.
Solution:
 class Divisible Pairs {
    public int countPairs(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j] && (i*j)%k==0){
                    count++;
                }
            }
        }
        return count;
    }
  public static void main(String[] args){
   int[] num={3,1,2,2,2,1,3};
   int k=2;
   System.out.print(countPairs(nums, k));
}
}
 
      
