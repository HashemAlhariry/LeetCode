class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
           if(s.length()<10)
            return new ArrayList<>();
        List<String> result = new ArrayList<>();

        Map<String,Integer> valuesStoredInMap= new LinkedHashMap<>();

        for (int i=0;i<s.length()-10+1;i++){
            String currentString = s.substring(i,i+10);
            valuesStoredInMap.put(currentString,valuesStoredInMap.getOrDefault(currentString,0)+1);
        }
        Set<String> keys = valuesStoredInMap.keySet();

      
        for (String key : keys) {
            if(valuesStoredInMap.get(key)>1)
                result.add(key);
        }


        return result;
    }
}