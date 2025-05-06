PROBLEM: Kadane's Algorithm
Statement:
      Given an integer array arr[]. You need to find the maximum sum of a subarray.
Example:
      Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
      Output: 11
      Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.

Solution:
       class Kadanes{
    int maxSubarraySum(int[] arr) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int num:arr){
            sum+=num;
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        }
        return max;
        
    }
}
