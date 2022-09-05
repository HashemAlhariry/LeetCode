class Solution {
    public int numJewelsInStones(String jewels, String stones) {
               HashMap<Character,Integer> charJewels= new HashMap<>();


        for (int i = 0; i <jewels.length() ; i++) {
            if(!charJewels.containsKey(jewels.charAt(i))){
                charJewels.put(jewels.charAt(i),1);
            }
        }

        int counter=0;
        for (int i = 0; i <stones.length() ; i++) {
            if(charJewels.containsKey(stones.charAt(i)))
                counter++;
        }
        return counter;
    }
}