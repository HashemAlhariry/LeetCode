//Problem Description
/*
You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".



Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0


Constraints:

1 <= jewels.length, stones.length <= 50
jewels and stones consist of only English letters.
All the characters of jewels are unique.
*/

import java.util.HashMap;

public class JewelsandStones {

    public static int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> charJewels= new HashMap<>();


        for (int i = 0; i <jewels.length() ; i++) {
            if(!charJewels.containsKey(jewels.charAt(i))){
                charJewels.put(jewels.charAt(i),1);
            }
        }

        int counter=0;
        for (int i = 0; i <stones.length() ; i++) {
            if(charJewels.containsKey(stones.charAt(i)))
                counter++;
        }
        return counter;
    }
}

