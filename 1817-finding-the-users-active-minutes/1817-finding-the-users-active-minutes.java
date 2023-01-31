class Solution {
   public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer,List<Integer>> map = new HashMap<>();

        for (int i = 0; i <logs.length ; i++) {
            if(map.containsKey(logs[i][0])){
                map.get(logs[i][0]).add(logs[i][1]);
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(logs[i][1]);
                map.put(logs[i][0],list);
            }

        }
        int arr[]= new int[k];
        for (Map.Entry<Integer,List<Integer>> currMap:map.entrySet()) {
            Set<Integer>set = new HashSet<>();
            for (int i = 0; i <currMap.getValue().size() ; i++) {
                set.add(currMap.getValue().get(i));
            }
            arr[set.size()-1]+=1;
        }

        return arr;
   }
}