PROBLEM: Second Largest
Statement:
     Given an array of positive integers arr[], return the second largest element from the array.
     If the second largest element doesn't exist then return -1.
    Note: The second largest element should not be equal to the largest element.

Solution:
      class SecLargest {
    public int getSecondLargest(int[] arr) {
        int max=Integer.MIN_VALUE;
        int temp=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                temp=max;
                max=arr[i];
            }
           else if(arr[i]>temp && arr[i]!=max){
                temp= arr[i];
            }
        }
        if(temp==Integer.MIN_VALUE){
            return -1;
        }
        return temp;
        
    }
}
