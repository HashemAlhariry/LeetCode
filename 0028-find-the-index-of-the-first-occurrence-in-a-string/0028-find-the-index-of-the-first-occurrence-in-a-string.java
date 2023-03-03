class Solution {
    public int strStr(String haystack, String needle) {
        int result=-1;
        if(needle.length()>haystack.length())
            return result;

        for (int i = 0; i < haystack.length()-needle.length()+1; i++) {
            if(haystack.substring(i,i+needle.length()).equals(needle)&&result==-1)
                result=i;
        }


        return result;
    }
}