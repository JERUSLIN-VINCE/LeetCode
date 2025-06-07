PROBLEM: Subsets II
Statement:
      Given an integer array nums that may contain duplicates, return all possible subsets (the power set).
     The solution set must not contain duplicate subsets. Return the solution in any order.
      
Example:
     Input: nums = [1,2,2]
    Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
      
Solution:
 class SubsetsII{
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> Outer=new ArrayList<>();
        Outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            start=0;
            if(i>0 && nums[i]==nums[i-1]){
                start=end+1;
            }
            end=Outer.size()-1;
            int n=Outer.size();
            for(int j=start;j<n;j++){
                ArrayList<Integer> Internal=new ArrayList<>(Outer.get(j));
                Internal.add(nums[i]);
                Outer.add(Internal);
            }
        }
        return Outer;
    }
}
