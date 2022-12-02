//Problem
/*
In an alien language, surprisingly, they also use English lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.

Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only if the given words are sorted lexicographically in this alien language.



Example 1:

Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
Output: true
Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
Example 2:

Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
Output: false
Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.
Example 3:

Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
Output: false
Explanation: The first three characters "app" match, and the second string is shorter (in size.) According to lexicographical rules "apple" > "app", because 'l' > '∅', where '∅' is defined as the blank character which is less than any other character (More info).


Constraints:

1 <= words.length <= 100
1 <= words[i].length <= 20
order.length == 26
All characters in words[i] and order are English lowercase letters.
Accepted
377.5K
Submissions
716.1K
Acceptance Rate
52.7%
*/

class VerifyinganAlienDictionary {

    public static void main(String[] args) {

        String s1 = "abaa";
        String s2 = "abc";
        System.out.println(" Comparing strings with compareTo:");
        System.out.println(s1.compareTo(s2));

         System.out.println(isAlienSorted(new String []{"apap","app"},"abcdefghijklmnopqrstuvwxyz"));


    }
    public static boolean isAlienSorted(String[] words, String order) {

        for (int i = 0; i <words.length-1 ; i++) {

            if(order.indexOf(words[i].charAt(0)) > order.indexOf(words[i+1].charAt(0)))
                return false;
            else if(order.indexOf(words[i].charAt(0)) < order.indexOf(words[i+1].charAt(0)))
                continue;

            else {

                if(words[i].length()<=words[i+1].length()){
                    int index=0;
                    while (index <words[i].length() ){
                        if(order.indexOf(words[i].charAt(index)) <=  order.indexOf(words[i+1].charAt(index))){
                            index++;
                        }else {
                            return false;
                        }
                    }
                }else{
                    int index=0;
                    boolean checker = false;
                    while (index <words[i+1].length()){
                        if(order.indexOf(words[i].charAt(index)) == order.indexOf(words[i+1].charAt(index))){
                            index++;
                        }
                       else if(order.indexOf(words[i].charAt(index)) < order.indexOf(words[i+1].charAt(index))){
                           checker=true;
                            break;
                        }else {
                            return false;
                        }
                    }
                    if(!checker)
                        return false;
                }


            }


        }
        return true;
    }

}







