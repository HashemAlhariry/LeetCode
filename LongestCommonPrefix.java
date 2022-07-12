

import java.util.Arrays;

// Problem Description
/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
*/
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        String shortestWord = Arrays.asList(strs).stream().sorted((e1, e2)-> e1.length()>e2.length()?1:-1).findFirst().get();
        for (String current: strs) {
            String newString="";
            for (int i = 0; i <shortestWord.length() ; i++) {
                if(shortestWord.charAt(i)==current.charAt(i)){
                    newString+=shortestWord.charAt(i);
                }
            }
            shortestWord=newString;
        }


        return shortestWord;
    }


    public static void main(String args[]){

        String [] arr = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(arr));

    }

}

