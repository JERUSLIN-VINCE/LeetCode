PROBLEM: Check If Digits Are Equal in String After Operations I
Statement:
        You are given a string s consisting of digits. Perform the following operation repeatedly until the string has exactly two digits:
For each pair of consecutive digits in s, starting from the first digit, calculate a new digit as the sum of the two digits modulo 10.
Replace s with the sequence of newly calculated digits, maintaining the order in which they are computed.
Return true if the final two digits in s are the same; otherwise, return false.
     
  Solution:
       class digitequal{
    public boolean hasSameDigits(String s) {
        return issame( s);
    }
    boolean issame(String str){
        System.out.print(str.length()+" ");
        if(str.length()<2){
            return false;
        }
        if(str.length()==2){
            if(str.charAt(0)==(str.charAt(1))){
                return true;
            }
            else{
                return false;
            }

        }
         String sum="";
        for(int i=0;i<str.length()-1;i++){
            int ans=(Integer.parseInt(Character.toString(str.charAt(i)))+Integer.parseInt(Character.toString(str.charAt(i+1))))%10;
            sum=sum+ans;
            System.out.print(sum+" ");

        }
        return issame(sum);
    }
}
         public static void main(String[] args){
           String str="3902";
           System.out.print(hasSameDigits(str));
         }
}
