//Problem
/*
Given two positive integers a and b, return the number of common factors of a and b.

An integer x is a common factor of a and b if x divides both a and b.



Example 1:

Input: a = 12, b = 6
Output: 4
Explanation: The common factors of 12 and 6 are 1, 2, 3, 6.
Example 2:

Input: a = 25, b = 30
Output: 2
Explanation: The common factors of 25 and 30 are 1, 5.


Constraints:

1 <= a, b <= 1000
Accepted
31.7K
Submissions
39.5K
Acceptance Rate
80.2%

*/
class FindTheOriginalArrayofPrefixXor {

    public static void main(String[] args) {

         findArray(new int[]{5,2,0,3,1});

    }

    public static int[] findArray(int[] pref) {
        for (int i = pref.length; i >0 ; i--) {
             pref[i]^=pref[i-1];
        }
        return pref;
    }
}







