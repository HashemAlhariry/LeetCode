class Solution {
 public String freqAlphabets(String s) {
     
        StringBuilder output = new StringBuilder();
        
        for(int i = s.length()-1; i >= 0; i--){ 
            
            if(s.charAt(i) == '#'){
                output.append((char)('a' + (s.charAt(i-1) -'0' ) + 10*(s.charAt(i-2)-'0') -1) ); 
       
                
                i -= 2;
            } else {
                output.append((char)('a' + (s.charAt(i) - '0') -1));
            }
        }
        output.reverse(); 
        
        return output.toString(); 
    }
}