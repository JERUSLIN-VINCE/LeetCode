PROBLEM: Sort an Array
Statement:
      Given an array of integers nums, sort the array in ascending order and return it.
      You must solve the problem without using any built-in functions in O(nlog(n)) 
      time complexity and with the smallest space complexity possible.
      
Example:
     Input: nums = [5,2,3,1]
     Output: [1,2,3,5]
     Explanation: After sorting the array, the positions of some numbers are not changed  
     (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).
      
Solution:
class Sort_An_Array{
    public int[] sortArray(int[] nums) {
        QuickSort(nums,0,nums.length-1);
        return nums;
    }
    static void QuickSort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int s=low;
        int e=high;
        int mid=(s+e)/2;
        int pivot=arr[mid];
        while(s<=e){
        while(arr[s]<pivot){
            s++;
        }
        while(arr[e]>pivot){
            e--;
        }
        if(s<=e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        }
        QuickSort(arr,low,e);
        QuickSort(arr,s,high);

    }
}
