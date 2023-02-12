class Solution {
 public static String reverseWords(String s) {
        s=s.trim();
        String [] words = s.split(" +");
        StringBuilder sb = new StringBuilder();
        int end = words.length - 1;
        for(int i = 0; i<= end; i++){
                sb.insert(0, words[i]);
                if(i < end) sb.insert(0, " ");
        }
        return sb.toString();
    }
}