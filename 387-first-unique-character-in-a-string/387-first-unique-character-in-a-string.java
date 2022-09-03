class Solution {
  public static int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for (int i = 0; i <s.length() ; i++) {
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),-1);
            }else{
                map.put(s.charAt(i),i);
            }
        }
        Iterator<Map.Entry<Character,Integer>> userCityMappingIterator = map.entrySet().iterator();
        while (userCityMappingIterator.hasNext()) {
            Map.Entry<Character,Integer> entry = userCityMappingIterator.next();
            if(entry.getValue()!=-1)
                return entry.getValue();
        }

        return -1;
    }
}