class Solution {
    public static int minimumRounds(int[] tasks) {

        Map<Integer,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < tasks.length; i++) {
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }
        int result = 0;
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            if(map.get(key)==1)
                return -1;
            else{
                result+=map.get(key)/3;
                if(map.get(key)%3!=0)result++;
            }
        }

        return result;

    }
}