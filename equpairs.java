problem:Divide Array Into Equal Pairs
Statement:
You are given an integer array nums consisting of 2 * n integers.
You need to divide nums into n pairs such that:
    *Each element belongs to exactly one pair.
    *The elements present in a pair are equal.
Return true if nums can be divided into n pairs, otherwise return false.
solution:
class equpair {
    public boolean divideArray(int[] nums) {
        HashSet<Integer> map=new HashSet<>();
        int n=nums.length;
        
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(map.contains(nums[i])){
            map.remove(nums[i]);
                }
            else{
                map.add(nums[i]);
            }
        }
         return map.isEmpty();
    }
  public static void main(String[] args){
    int[] nums={3,2,3,2,2,2};
    System.out.print(nums);
}
}
output:
true
