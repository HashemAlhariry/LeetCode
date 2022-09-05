class Solution {
    public int lengthOfLastWord(String s) {
         String[] strs = s.trim().split("\\s+");
        int lastIndex=strs.length;
        return strs[lastIndex-1].length();
    }
}