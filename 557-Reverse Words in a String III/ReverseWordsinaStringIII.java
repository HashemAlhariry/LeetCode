import java.util.ArrayList;
import java.util.List;

//Problem
/*
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.



Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "God Ding"
Output: "doG gniD"


Constraints:

1 <= s.length <= 5 * 104
s contains printable ASCII characters.
s does not contain any leading or trailing spaces.
There is at least one word in s.
All the words in s are separated by a single space.
*/
class ReverseWordsinaStringIII {

    public static void main(String[] args) {
        reverseWords("Let's take LeetCode contest");
    }
    public static String reverseWords(String s) {
        List<String> list = new ArrayList<>();
        String word= "";
        for (int i = s.length()-1; i >=0 ; i--) {
            if(s.charAt(i)==' '){
                list.add(word);
                word="";
            }else {
                word+=s.charAt(i);
            }
        }
        list.add(word);
        word="";
        for (int i = list.size()-1; i>=0 ; i--) {
            if(i==0)
                word+=list.get(i);
            else
                word+=list.get(i)+" ";

        }

        return word;
    }
}







