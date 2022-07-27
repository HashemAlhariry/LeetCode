//Problem Description
/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.



Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1


Constraints:

1 <= s.length <= 105
s consists of only lowercase English letters.
*/


import java.util.*;

public class FirstUniqueCharacterinaString {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));;

    }
    public static int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for (int i = 0; i <s.length() ; i++) {
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),-1);
            }else{
                map.put(s.charAt(i),i);
            }
        }
        Iterator<Map.Entry<Character,Integer>> userCityMappingIterator = map.entrySet().iterator();
        while (userCityMappingIterator.hasNext()) {
            Map.Entry<Character,Integer> entry = userCityMappingIterator.next();
            if(entry.getValue()!=-1)
                return entry.getValue();
        }

        return -1;
    }

}

