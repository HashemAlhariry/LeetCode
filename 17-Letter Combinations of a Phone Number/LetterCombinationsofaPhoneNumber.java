//Problem
/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.




Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:

Input: digits = ""
Output: []
Example 3:

Input: digits = "2"
Output: ["a","b","c"]


Constraints:

0 <= digits.length <= 4
digits[i] is a digit in the range ['2', '9'].
*/


import java.util.ArrayList;
import java.util.List;

class LetterCombinationsofaPhoneNumber {


    public static void main(String[] args) {
        letterCombinations("23").stream().forEach(e-> System.out.print(e+" "));
    }
    static List<String> result = null;
    static String[] mapping = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static public List<String> letterCombinations(String digits) {
            result = new ArrayList<>();
            if(digits.length()==0)
                return result;

            dfs(0,digits,new StringBuilder());
            return result;

    }

   static private void dfs(int length, String digits, StringBuilder stringBuilder) {

        if(length==digits.length()){
            result.add(stringBuilder.toString());
            return;
        }

        char  ch = digits.charAt(length);
        String str =mapping[ch-'0'];

        for (char c:str.toCharArray()) {
               stringBuilder.append(c);
               dfs(length+1,digits,stringBuilder);
               stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }

    }

}







