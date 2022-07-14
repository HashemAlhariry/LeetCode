//Problem Description
/*
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.



Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true


Constraints:

1 <= s.length <= 5 * 104
t.length == s.length
s and t consist of any valid ascii character.
*/


import java.util.HashMap;

public class IsomorphicStrings {

    public static void main(String args[]){
        System.out.println(isIsomorphic("egg","add"));
    }
    public static boolean isIsomorphic(String s, String t) {

            HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
            HashMap<Character, Integer> tMap = new HashMap<Character, Integer>();

            for (int i = 0; i <s.length() ; i++) {
                if(sMap.containsKey(s.charAt(i))){
                    sMap.put(s.charAt(i),sMap.get(s.charAt(i))+i);
                }else {
                    sMap.put(s.charAt(i),i);
                }

                if(tMap.containsKey(t.charAt(i))){
                    tMap.put(t.charAt(i),tMap.get(t.charAt(i))+i);
                }else {
                    tMap.put(t.charAt(i),i);
                }
            }
            boolean checker= true;
            for (int i = 0; i <s.length() ; i++) {
                if(sMap.get(s.charAt(i))==tMap.get(t.charAt(i))) {
                    continue;
                } else{
                    checker=false;
                    break;
                }
            }

            return checker;
    }
}

