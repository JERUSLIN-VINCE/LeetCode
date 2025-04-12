PROBLEM: Count Symmetric Integers
Statement:
       You are given two positive integers low and high.An integer x consisting of 2 * n digits is 
symmetric if the sum of the first n digits of x is equal to the sum of the last n digits of x. 
Numbers with an odd number of digits are never symmetric.
Return the number of symmetric integers in the range [low, high].
      
Solution:
       class symmetric{
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            String s=Integer.toString(i);
            if(s.length()%2==0){
                int sum1=0;
                int sum2=0;
                int n=s.length()/2;
                for(int j=0;j<n;j++){
                    sum1+=s.charAt(j)-'0';
                }
                for(int k=n;k<s.length();k++){
                    sum2+=s.charAt(k)-'0';
                }
                if(sum1==sum2){
                    count++;
                }
            }
        }
        return count;
    }

         public static void main(String[] args){
           int low=1;
           int high=100;
           System.out.print(countSymmetricIntegers(low, high));
         }
}
