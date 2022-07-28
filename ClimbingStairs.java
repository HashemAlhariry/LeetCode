//Problem Description
/*
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?



Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step


Constraints:

1 <= n <= 45
*/


import java.util.HashMap;

public class ClimbingStairs {
    public static void main(String[] args) {


        System.out.println(climbStairs(42));
    }

    public static HashMap<Integer,Integer> map=new HashMap<>();
    public static int climbStairs(int n) {
        if(map.containsKey(n)) return map.get(n);
        if(n<=1) return 1;
        map.put(n, climbStairs(n-1)+climbStairs(n-2));
        return map.get(n);
    }
}

