PROBLEM: Valid Parentheses
Statement:
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
 .Open brackets must be closed by the same type of brackets.
 .Open brackets must be closed in the correct order.
 .Every close bracket has a corresponding open bracket of the same type.

Solution:
    class validpar {
    public boolean isValid(String s) {
        Stack<Character> ans=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' ||s.charAt(i)=='[' ){
                ans.push(s.charAt(i));
            }
            if(s.charAt(i)==')'){
                if(!ans.isEmpty() && ans.peek()=='('){
                    ans.pop();
                }
                else{
                    ans.push(s.charAt(i));
                }
            }
             if(s.charAt(i)=='}'){
                if(!ans.isEmpty() && ans.peek()=='{'){
                    ans.pop();
                }
                else{
                    ans.push(s.charAt(i));
                }
            }
             if(s.charAt(i)==']'){
                if(!ans.isEmpty() && ans.peek()=='['){
                    ans.pop();
                }
                else{
                    ans.push(s.charAt(i));
                }
            }
               
            }
            return ans.isEmpty();
        
    }
}
        
