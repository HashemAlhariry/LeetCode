//Problem Description
/*
You are given a 0-indexed string blocks of length n, where blocks[i] is either 'W' or 'B', representing the color of the ith block. The characters 'W' and 'B' denote the colors white and black, respectively.

You are also given an integer k, which is the desired number of consecutive black blocks.

In one operation, you can recolor a white block such that it becomes a black block.

Return the minimum number of operations needed such that there is at least one occurrence of k consecutive black blocks.



Example 1:

Input: blocks = "WBBWWBBWBW", k = 7
Output: 3
Explanation:
One way to achieve 7 consecutive black blocks is to recolor the 0th, 3rd, and 4th blocks
so that blocks = "BBBBBBBWBW".
It can be shown that there is no way to achieve 7 consecutive black blocks in less than 3 operations.
Therefore, we return 3.
Example 2:

Input: blocks = "WBWBBBW", k = 2
Output: 0
Explanation:
No changes need to be made, since 2 consecutive black blocks already exist.
Therefore, we return 0.


Constraints:

n == blocks.length
1 <= n <= 100
blocks[i] is either 'W' or 'B'.
1 <= k <= n
*/

public class MinimumRecolorstoGetKConsecutiveBlackBlocks {
    public static void main(String[] args) {
        
    }
    public static int minimumRecolors(String blocks,int k){
        //check if there is already block available
        int counter=0;
        for (int i = 0; i <blocks.length() ; i++) {
            if(blocks.charAt(i)=='B'){
                counter++;
            }else {
                counter=0;
            }
        }
        if(counter>=k)
            return 0;

        int numberOfOperation=Integer.MAX_VALUE;
        //loop over to check how many will change
        for (int i = 0; i < blocks.length()-k+1; i++) {
            counter=0;

            for (int j = i; j <i+k ; j++) {
                if(blocks.charAt(j)=='W'){
                    counter++;
                }
            }

            numberOfOperation=Math.min(numberOfOperation,counter);
        }

        return numberOfOperation;
    }

}











