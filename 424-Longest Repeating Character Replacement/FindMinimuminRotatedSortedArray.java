//Problem
/*
You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you can get after performing the above operations.



Example 1:

Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.
Example 2:

Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.


Constraints:

1 <= s.length <= 105
s consists of only uppercase English letters.
0 <= k <= s.length
*/


import java.util.*;

class LongestRepeatingCharacterReplacement {

    public static void main(String[] args) {
        characterReplacement("AABABBB",2);

    }


    public static int characterReplacement(String s, int k) {

        char [] a = s.toCharArray();
        int left=0,right = 0 ,n =a.length;

        Map<Character,Integer> map = new HashMap<>();

        int maxLen=0, mostFrequent=0;
        while (right<n){
            map.put(a[right],map.getOrDefault(a[right],0)+1);
            mostFrequent = Math.max(map.get(a[right]),mostFrequent);

            if((right-left+1) -mostFrequent >k){
                map.put(a[left],map.get(a[left])-1);
                left++;
            }

            maxLen= Math.max(maxLen,right-left+1);
            right++;

        }
        return maxLen;

    }
}
