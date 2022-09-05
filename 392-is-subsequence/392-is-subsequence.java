class Solution {
    public boolean isSubsequence(String s, String t) {
              int sIndex=0;
        String newString="";
        if(s.length()>0){

            for (int i = 0; i <t.length() ; i++) {
                if(sIndex<s.length()){
                    Character charToCheck=s.charAt(sIndex);
                    if(charToCheck==t.charAt(i)){
                        sIndex++;
                        newString+=charToCheck;
                    }
                }
            }
        }

        return newString.equals(s);  
    }
}