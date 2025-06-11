PROBLEM: Letter Combinations of a Phone Number
Statement:
      Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
      A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters
Example:
      Example 1:
        Input: digits = "23"
        Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
     Example 2:
        Input: digits = ""
        Output: []
     Example 3:
        Input: digits = "2"
        Output: ["a","b","c"]

Solution:
class LetterCombinationsOfPhoneNumber{
    static ArrayList<String> list=new ArrayList<>();
    static HashMap<Character,String> ans=new HashMap<>();
    public List<String> letterCombinations(String digits) {
        list.clear();
        if(digits.equals("")){
            return list;
        }
      ans.put('2',"abc");
      ans.put('3',"def");
      ans.put('4',"ghi");
      ans.put('5',"jkl");
      ans.put('6',"mno");
      ans.put('7',"pqrs");
      ans.put('8',"tuv");
      ans.put('9',"wxyz");
      Combination("",digits);
      return list;
        
    }
    public static void Combination(String p,String up){
        if(up.isEmpty()){
            list.add(p);
            return;
        }
        char ch=up.charAt(0);
        String str=ans.get(ch);
        if(ch=='7'||ch=='9'){
            for(int i=0;i<4;i++){
                Combination(p+str.charAt(i),up.substring(1));
            }
        }
        else{
            for(int i=0;i<3;i++){
                Combination(p+str.charAt(i),up.substring(1));
            }

        }

    }
}
