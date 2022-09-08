class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
              Map<Integer,Integer> mapTarget = new HashMap<>();
        Map<Integer,Integer> mapArr = new HashMap<>();

        for (int i = 0; i <target.length ; i++) {
            if(mapTarget.containsKey(target[i])){
                mapTarget.put(target[i],mapTarget.get(target[i])+1);
            }else{
                mapTarget.put(target[i],1);
            }
            if(mapArr.containsKey(arr[i])){
                mapArr.put(arr[i],mapArr.get(arr[i])+1);
            }else{
                mapArr.put(arr[i],1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : mapTarget.entrySet()){
            if(mapArr.containsKey(entry.getKey())){
                    if(mapArr.get(entry.getKey())==entry.getValue())
                        continue;
                    else 
                        return false;
            }else 
                return false;
            
        }
        
        return true;
    }
}