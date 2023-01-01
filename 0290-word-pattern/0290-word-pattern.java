class Solution {
  public static boolean wordPattern(String pattern, String s) {
        boolean result = true;
        String[] splited = s.split("\\s+");
        Map<Character,String> mapChar= new HashMap<>();
        if(pattern.length()!=splited.length) 
            return false;
        for (int i = 0; i < pattern.length(); i++) {
          if(mapChar.containsKey(pattern.charAt(i))){
            if(mapChar.get(pattern.charAt(i)).equals(splited[i])) continue;
            return false;
          }else{
              if(mapChar.containsValue(splited[i]))return false;
              mapChar.put(pattern.charAt(i),splited[i]);
          }
        }
        return result;
    }

}