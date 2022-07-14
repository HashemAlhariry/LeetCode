//Problem Description
/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false


Constraints:

0 <= s.length <= 100
0 <= t.length <= 104
s and t consist only of lowercase English letters.
*/

public class IsSubsequence {

    public static void main(String args[]){
        System.out.println(isSubsequence("axc","ahbgdc"));
    }
    public static boolean isSubsequence(String s, String t) {

        int sIndex=0;
        String newString="";
        if(s.length()>0){

            for (int i = 0; i <t.length() ; i++) {
                if(sIndex<s.length()){
                    Character charToCheck=s.charAt(sIndex);
                    if(charToCheck==t.charAt(i)){
                        sIndex++;
                        newString+=charToCheck;
                    }
                }
            }
        }

        return newString.equals(s);

    }
}

