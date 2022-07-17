//Problem Description
/*
Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.



Example 1:

Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
Example 2:

Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.


Constraints:

1 <= s.length <= 2000
s consists of lowercase and/or uppercase English letters only.
*/

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

    public static void main(String[] args) {
         String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicate" +
                 "dcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpa" +
                 "teaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirli" +
                 "vesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButin" +
                 "alargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivingandd" +
                 "eadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittle" +
                 "notlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededic" +
                 "atedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicate" +
                 "dtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethe" +
                 "lastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthi" +
                 "snationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepe" +
                 "opleforthepeopleshallnotperishfromtheearth";

         System.out.println(longestPalindrome(s));

    }
    public static int longestPalindrome(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }

        int totalLength=0;
        boolean foundOddNumber=false;

        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
            if(entry.getValue()%2==0){
                totalLength+=entry.getValue();
            }else {
                totalLength+=entry.getValue()-1;
                foundOddNumber=true;
            }
        }
        if(foundOddNumber)
          totalLength+=1;

        return totalLength;
    }

}


