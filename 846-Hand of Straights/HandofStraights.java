//Problem
/*
Alice has some number of cards and she wants to rearrange the cards into groups so that each group is of size groupSize, and consists of groupSize consecutive cards.

Given an integer array hand where hand[i] is the value written on the ith card and an integer groupSize, return true if she can rearrange the cards, or false otherwise.



Example 1:

Input: hand = [1,2,3,6,2,3,4,7,8], groupSize = 3
Output: true
Explanation: Alice's hand can be rearranged as [1,2,3],[2,3,4],[6,7,8]
Example 2:

Input: hand = [1,2,3,4,5], groupSize = 4
Output: false
Explanation: Alice's hand can not be rearranged into groups of 4.



Constraints:

1 <= hand.length <= 104
0 <= hand[i] <= 109
1 <= groupSize <= hand.length

*/

import java.util.TreeMap;

class HandofStraights {

    public static void main(String[] args) {


    }
    public boolean isNStraightHand(int[] hand, int groupSize) {

        if((hand.length%groupSize)!=0 )
            return false;

        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();

        for (int i = 0; i < hand.length; i++) {
            treeMap.put(hand[i],treeMap.getOrDefault(hand[i],0)+1);
        }

        while (treeMap.size()!=0){
            int num = treeMap.firstKey();
            int val = treeMap.get(num);

            if(val!=1) treeMap.put(num,val-1);
            else treeMap.remove(num);

            int k = 1;
            while (k<groupSize){
                num++;
                if(!treeMap.containsKey(num)) return false;
                else {
                    val = treeMap.get(num);
                    if(val!=1) treeMap.put(num,val-1);
                    else treeMap.remove(num);
                }
                k++;
            }

        }

        return true;
    }

    public boolean isPossibleDivide(int[] nums, int k) {

        if((nums.length%k)!=0 )
            return false;

        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            treeMap.put(nums[i],treeMap.getOrDefault(nums[i],0)+1);
        }

        while (treeMap.size()!=0){
            int num = treeMap.firstKey();
            int val = treeMap.get(num);

            if(val!=1) treeMap.put(num,val-1);
            else treeMap.remove(num);

            int kl = 1;
            while (kl<k){
                num++;
                if(!treeMap.containsKey(num)) return false;
                else {
                    val = treeMap.get(num);
                    if(val!=1) treeMap.put(num,val-1);
                    else treeMap.remove(num);
                }
                kl++;
            }

        }

        return true;
    }
}







