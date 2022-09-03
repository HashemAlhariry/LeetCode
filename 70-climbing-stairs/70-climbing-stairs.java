class Solution {
     public static HashMap<Integer,Integer> map=new HashMap<>();
    public static int climbStairs(int n) {
        if(map.containsKey(n)) return map.get(n);
        if(n<=1) return 1;
        map.put(n, climbStairs(n-1)+climbStairs(n-2));
        return map.get(n);
    }
}