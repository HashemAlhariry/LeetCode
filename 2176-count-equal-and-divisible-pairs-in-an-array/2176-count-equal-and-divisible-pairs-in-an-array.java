class Solution {
     public  static int countPairs(int[] nums, int k) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.get(nums[i]).add(i);
            }else{
                List<Integer> arrList=new ArrayList<>();
                arrList.add(i);
                map.put(nums[i],arrList);
            }
        }

        int totalCount  =0;
        for (Map.Entry<Integer,List<Integer>> entry : map.entrySet()) {
            if(entry.getValue().size()>1){
                List<Integer> list = entry.getValue();
                for (int i = 0; i <list.size()-1 ; i++) {
                    for (int j = i+1; j <list.size() ; j++) {
                        if( (list.get(i) * list.get(j) )% k == 0)
                            totalCount++;
                    }
                }
            }

        }
        return totalCount;
    }
}