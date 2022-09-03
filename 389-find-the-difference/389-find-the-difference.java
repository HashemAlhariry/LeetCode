class Solution {
    public char findTheDifference(String s, String t) {
          HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if(map2.containsKey(t.charAt(i))){
                map2.put(t.charAt(i),map2.get(t.charAt(i))+1);
            }else{
                map2.put(t.charAt(i),1);
            }
        }
        for (Map.Entry<Character,Integer> entry : map2.entrySet()){
            if(map.containsKey(entry.getKey()) && entry.getValue()==map.get(entry.getKey()))
                continue;
            return entry.getKey();

        }
    return '0';
    }
}