PROBLEM: Majority Element II
Statement:
       You are given an array of integer arr[] where each number represents a vote to a candidate. Return the candidates 
       that have votes greater than one-third of the total votes, If there's not a majority vote, return an empty array. 
       Note: The answer should be returned in an increasing format.
     
Example:
      Input: arr[] = [2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6]
     Output: [5, 6]
    Explanation: 5 and 6 occur more n/3 times.

Solution:
      class MajorityElement{
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        int n=nums.length/3;
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> ans1=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            ans1.put(nums[i],ans1.getOrDefault(nums[i],0)+1);
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(ans1.get(nums[i])>n){
                if(!ans.contains(nums[i])){
                ans.add(nums[i]);
                }
            }
        }
        return ans;
    }
}
