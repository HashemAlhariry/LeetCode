class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
                Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i <allowed.length() ; i++) {
            map.put(allowed.charAt(i),1);
        }

        int total=0;

        for (int i = 0; i <words.length ; i++) {
            boolean checker=true;
            for (int j = 0; j <words[i].length() ; j++) {
                if(!map.containsKey(words[i].charAt(j)))
                    checker=false;
            }
            if(checker)
                total++;
        }
        return total;
    }
}