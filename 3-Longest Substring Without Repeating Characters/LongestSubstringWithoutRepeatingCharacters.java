//Problem
/*
Given a string s, find the length of the longest
substring
 without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
*/


import java.util.HashMap;
import java.util.LinkedHashMap;

class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));

    }

    public static int lengthOfLongestSubstring(String s) {

        HashMap<Character ,Integer> map=new LinkedHashMap<>();
        int maxLength=0;
        for (int i = 0; i < s.length(); i++) {
            int temp = i;
            while (temp<s.length()){
                if(map.containsKey(s.charAt(temp)))
                    break;

                map.put(s.charAt(temp),1);
                temp++;
            }
            maxLength=Math.max(maxLength,map.size());
            map=new HashMap<>();
        }

        return maxLength;


    }


}







