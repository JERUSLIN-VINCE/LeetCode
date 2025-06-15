PROBLEM: Permutations
Statement:
      Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
Example:
      Example 1:
          Input: nums = [1,2,3]
          Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
      Example 2:
          Input: nums = [0,1]
          Output: [[0,1],[1,0]]

Solution:
     class Permutations{
    static List<List<Integer>> ans1=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        ans1.clear();
        Permutation(nums,new ArrayList<>());
        return ans1;
    }
    public static void Permutation(int[] nums,ArrayList<Integer> ans) {
        if(nums.length==0){
            ans1.add(ans);
             return;
        }
        for(int i=0;i<=ans.size();i++){
            ArrayList<Integer> list=new ArrayList<>();
            List<Integer> first=ans.subList(0, i);
            List<Integer> second=ans.subList(i, ans.size());
            list.addAll(first);
            list.add(nums[0]);
            list.addAll(second);
            Permutation(Arrays.copyOfRange(nums, 1,nums.length), list);
        }

        
    }
}
