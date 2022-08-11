//Problem Description
/*
You are given two integer arrays of equal length target and arr. In one step, you can select any non-empty sub-array of arr and reverse it. You are allowed to make any number of steps.

Return true if you can make arr equal to target or false otherwise.



Example 1:

Input: target = [1,2,3,4], arr = [2,4,1,3]
Output: true
Explanation: You can follow the next steps to convert arr to target:
1- Reverse sub-array [2,4,1], arr becomes [1,4,2,3]
2- Reverse sub-array [4,2], arr becomes [1,2,4,3]
3- Reverse sub-array [4,3], arr becomes [1,2,3,4]
There are multiple ways to convert arr to target, this is not the only way to do so.
Example 2:

Input: target = [7], arr = [7]
Output: true
Explanation: arr is equal to target without any reverses.
Example 3:

Input: target = [3,7,9], arr = [3,7,11]
Output: false
Explanation: arr does not have value 9 and it can never be converted to target.


Constraints:

target.length == arr.length
1 <= target.length <= 1000
1 <= target[i] <= 1000
1 <= arr[i] <= 1000

*/


import java.util.HashMap;
import java.util.Map;

public class MakeTwoArraysEqualbyReversingSubArrays {

    public static void main(String[] args) {

    }
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










