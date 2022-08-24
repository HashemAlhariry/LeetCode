//Problem Description
/*
you are given a binary string s. In one second, all occurrences of "01" are simultaneously replaced with "10". This process repeats until no occurrences of "01" exist.

Return the number of seconds needed to complete this process.



Example 1:

Input: s = "0110101"
Output: 4
Explanation:
After one second, s becomes "1011010".
After another second, s becomes "1101100".
After the third second, s becomes "1110100".
After the fourth second, s becomes "1111000".
No occurrence of "01" exists any longer, and the process needed 4 seconds to complete,
so we return 4.
Example 2:

Input: s = "11100"
Output: 0
Explanation:
No occurrence of "01" exists in s, and the processes needed 0 seconds to complete,
so we return 0.


Constraints:

1 <= s.length <= 1000
s[i] is either '0' or '1'.

*/

public class TimeNeededtoRearrangeaBinaryString {
    public static void main(String[] args) {

        System.out.println(secondsToRemoveOccurrences("001011"));

    }

    public static int secondsToRemoveOccurrences(String s) {

            if(s.length()==1)
                return 0;

            int seconds=0;
            StringBuilder str= new StringBuilder(s);
            for (int i = 0; i <str.length() ; i++) {
                boolean checker=false;

                for (int j = 0; j <str.length()-1 ; j++) {
                    if(str.charAt(j)=='0' && str.charAt(j+1)=='1'){
                        str.setCharAt(j,'1');
                        str.setCharAt(j+1,'0');
                        j=j+1;
                        checker=true;
                    }


                }

                if(checker)
                    seconds++;

            }
            return seconds;
    }


}











