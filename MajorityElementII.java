PROBLEM: Majority Element II
Statement:
      Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
Example:
     Input: nums = [3,2,3]
     Output: [3]
    
    Input: nums = [1]
    Output: [1]
   
    Input: nums = [1,2]
    Output: [1,2]
Solution:
    class MajorityElementII{
      public List<Integer> majorityElement(int[] nums) {
        int cond=nums.length/3;
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for(int Key:freq.keySet()){
            if(freq.get(Key)>cond){
                list.add(Key);
            }
        }
        return list;

    }
}
