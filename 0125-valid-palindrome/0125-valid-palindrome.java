class Solution {
    public  boolean isPalindrome(String s) {
        
          if(s.equals(" "))
            return true;

        s=s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9]","");
        int p1= 0;
        int p2= s.length()-1;
        for(int i=0;i<s.length()/2;i++) {
            if(s.charAt(p1)==s.charAt(p2)){
               p1++;
               p2--;
               continue;
            }
            return false;
        }
        return true;
    }
}