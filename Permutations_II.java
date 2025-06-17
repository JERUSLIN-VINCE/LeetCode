PROBLEM: Permutations II
Statement:
      Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.
      
Example:
    Example 1:
        Input: nums = [1,1,2]
        Output:[[1,1,2],
               [1,2,1],
               [2,1,1]]
    Example 2:
        Input: nums = [1,2,3]
        Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
      
Solution:
     class Permutations_II{
    static List<List<Integer>> ans1=new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans2=new ArrayList<>();
        ans1.clear();
        Permutation(nums,new ArrayList<>());
          for(int i=0;i<ans1.size();i++){
            if(ans2.contains(ans1.get(i))){
                ans2.remove(ans1.get(i));
                System.out.println(ans1.get(i));
            }
            ans2.add(ans1.get(i));
         }
        return ans2;
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
