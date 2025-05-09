PROBLEM: Find All Duplicates in an Array
Statement:
     Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at
     most twice, return an array of all the integers that appears twice.You must write an algorithm that runs in O(n) time 
    and uses only constant auxiliary space, excluding the space needed to store the output
Example:
      Input: nums = [4,3,2,7,8,2,3,1]
      Output: [2,3]

Solution 1:
 class FindDuplicates{
       public List<Integer> findDuplicates(int[] nums) {
          ArrayList<Integer> list=new ArrayList<>();
          int[] freq=new int[nums.length+1];
          for(int value:nums){
             if(freq[value]!=-1){
                freq[value]++;
             }
            if(freq[value]==2){
                list.add(value);
                freq[value]=-1;
            }
        }
        return list;
        }
    
?//Solution 2:
   public List<Integer> findDuplicatesIn(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int num:map.keySet()){
            if(map.get(num)==2){
                list.add(num);
            }
        }
        return list;
    }
}
        
