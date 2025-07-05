PROBLEM: Find Lucky Integer in an Array
Statement:
     Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.
     Return the largest lucky integer in the array. If there is no lucky integer return -1.
Example:
    Input: arr = [1,2,2,3,3,3]
    Output: 3
    Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
      
Solution:
      class LuckyInteger{
          public int findLucky(int[] arr) {
              int max=-1;
              HashMap<Integer,Integer> map=new HashMap<>();
              for(int num:arr){
                  map.put(num,map.getOrDefault(num,0)+1);
              }
              for(Integer key:map.keySet()){
                  if(map.get(key)==key){
                      max=Math.max(max,key);
                  }
              }
              return max;
          }
      }
