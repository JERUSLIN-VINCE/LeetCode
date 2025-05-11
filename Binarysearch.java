PROBLEM: Binary Search
Statement:
       Given a sorted array arr and an integer k, find the position(0-based indexing) at which k is present in the array using binary search.
       Note: If multiple occurrences are there, please return the smallest index.
      
Example:
  Example1:
   Input: arr[] = [1, 2, 3, 4, 5], k = 4
   Output: 3
   Explanation: 4 appears at index 3.
 Example 2:
   Input: arr[] = [1, 1, 1, 1, 2], k = 1
   Output: 0
   Explanation: 1 appears at index 0.
      
Solution:
class Binarysearch{
    public int binarysearch(int[] arr, int k) {
        int ans=Search(arr,k);
        return ans;
    }
    public int Search(int[] arr,int k){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]<k){
                start=mid+1;
            }
            else if(arr[mid]>k){
                end=mid-1;
            }
            else{
                ans=mid;
                end=mid-1;
            }
         }
     return ans;
    }
}
