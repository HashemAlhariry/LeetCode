class Solution {
    public boolean isAnagram(String s, String t) {
                     if(s.length()!=t.length())
                return false;
            HashMap<Character,Integer> firstString =new HashMap<>();
            HashMap<Character,Integer> secondString =new HashMap<>();

            for (int i = 0; i <s.length() ; i++) {
                if(firstString.containsKey(s.charAt(i))){
                    firstString.put(s.charAt(i),firstString.get(s.charAt(i))+1);
                }else{
                    firstString.put(s.charAt(i),1);
                }
            }

            for (int i = 0; i <t.length() ; i++) {
                if(secondString.containsKey(t.charAt(i))){
                    secondString.put(t.charAt(i),secondString.get(t.charAt(i))+1);
                }else{
                    secondString.put(t.charAt(i),1);
                }
            }
            for (Map.Entry<Character,Integer> entry : firstString.entrySet()){
                if(!entry.getValue().equals(secondString.get(entry.getKey())) ){
                    return false;
                }

            }

    return true;
    }
}