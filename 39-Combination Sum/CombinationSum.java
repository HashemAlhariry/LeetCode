//Problem
/*
Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the
frequency
 of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.



Example 1:

Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
Example 2:

Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]
Example 3:

Input: candidates = [2], target = 1
Output: []


Constraints:

1 <= candidates.length <= 30
2 <= candidates[i] <= 40
All elements of candidates are distinct.
1 <= target <= 40
*/

import java.util.ArrayList;
import java.util.List;

class CombinationSum {


    public static void main(String[] args) {

        combinationSum(new int[]{2,3,6,7},7);

    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> resultList = new ArrayList<>();
        dfs(resultList,candidates,new ArrayList<Integer>(),target,0,0);
        return resultList;

    }

    private static void dfs(List<List<Integer>> resultList,
                            int[] candidates,
                            List<Integer> list,
                            int target,
                            int totalSum,
                            int index) {

        if(target==totalSum){
            resultList.add(list);
            return;
        }

        if(totalSum>target)
            return;

        List<Integer> temp = new ArrayList<>();
        temp.addAll(list);
        for (int i = index; i < candidates.length; i++) {
            temp.add(candidates[i]);

            List<Integer> anotherTemp = new ArrayList<>();
            anotherTemp.addAll(temp);
            dfs(resultList, candidates,anotherTemp,target,totalSum+candidates[i],i);
            temp.remove(temp.size()-1);
        }

    }


}
