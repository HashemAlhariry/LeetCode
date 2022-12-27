class Solution {
     public static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {

        TreeMap<Integer,Integer> map = new TreeMap<>();

        for (int i = 0; i <capacity.length ; i++) {
            map.put(capacity[i]-rocks[i],map.getOrDefault(capacity[i]-rocks[i],0)+1);
        }

        int maxNumberOfBags = 0;
        int tempAdditionalRocks=additionalRocks;

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){

            if(entry.getKey()==0){
               maxNumberOfBags+=entry.getValue();
               continue;
            }

            if(tempAdditionalRocks<=0)
                break;

            if(tempAdditionalRocks > (entry.getValue()*entry.getKey())){
                maxNumberOfBags += entry.getValue();
                tempAdditionalRocks -= (entry.getKey()*entry.getValue());
            }
            else {
                maxNumberOfBags += (tempAdditionalRocks/entry.getKey());
                tempAdditionalRocks /= entry.getKey();
                break;
            }

        }

        return maxNumberOfBags;
    }

    
}