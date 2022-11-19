//Problem
/*
Given two strings s and t of lengths m and n respectively, return the minimum window
substring
 of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

The testcases will be generated such that the answer is unique.



Example 1:

Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
Example 2:

Input: s = "a", t = "a"
Output: "a"
Explanation: The entire string s is the minimum window.
Example 3:

Input: s = "a", t = "aa"
Output: ""
Explanation: Both 'a's from t must be included in the window.
Since the largest window of s only has one 'a', return empty string.

*/


class MinimumWindowSubstring {

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }

    public static String minWindow(String s, String t) {

        int arr[] = new int[128];
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();
        for (char curr : t_arr) {
            arr[curr]++;
        }
        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        String ans = "";
        int counter = 0;
        while (right < s_arr.length) {
            char currChar = s_arr[right];
            if (--arr[currChar] >= 0) {
                counter++;
            }
            while (counter == t_arr.length) {
                int curWindow = right - left + 1;
                if (curWindow < minLen) {
                    minLen = curWindow;
                    ans = s.substring(left, right + 1);
                }
                char leftChar = s_arr[left];
                if (++arr[leftChar] > 0)
                    counter--;
                left++;
            }
            right++;
        }
        return ans;
    }

}








