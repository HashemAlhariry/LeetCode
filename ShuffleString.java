//Problem Description
/*
You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.



Example 1:


Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
Example 2:

Input: s = "abc", indices = [0,1,2]
Output: "abc"
Explanation: After shuffling, each character remains in its position.


Constraints:

s.length == indices.length == n
1 <= n <= 100
s consists of only lowercase English letters.
0 <= indices[i] < n
All values of indices are unique.
*/

public class ShuffleString {
    public static void main(String[] args) {
        restoreString( "codeleet",new int[]{4,5,6,7,0,2,1,3});


    }
    public static String restoreString(String s, int[] indices) {
        Character [] characters= new Character[indices.length];
        for (int i = 0; i <indices.length ; i++) {
            characters[indices[i]]=s.charAt(i);
        }
        String string="";
        for (int i = 0; i <characters.length ; i++) {
            string+=characters[i];
        }
        return string;
    }

}

