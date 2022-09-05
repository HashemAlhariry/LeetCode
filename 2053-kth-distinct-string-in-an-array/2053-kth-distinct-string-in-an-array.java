class Solution {
    public String kthDistinct(String[] arr, int k) {
         LinkedHashMap<String,Integer> map = new LinkedHashMap<>();

        for (int i = 0; i <arr.length ; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else
                map.put(arr[i],1);
        }
        int counter = 1;
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            if(counter==k && entry.getValue()==1){
                return entry.getKey();
            }
            if(entry.getValue()==1)
                counter++;

        }

        return "";
    }
}