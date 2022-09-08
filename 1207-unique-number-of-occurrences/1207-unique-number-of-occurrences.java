class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i <arr.length ; i++) {
            if(hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }else
                hashMap.put(arr[i],1);
        }
        for (Map.Entry<Integer,Integer> entry : hashMap.entrySet()) {
            boolean checker = hashSet.add(entry.getValue());
            if(!checker)
                return false;
        }
    
        return true;
    }
}