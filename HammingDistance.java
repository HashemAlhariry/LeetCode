//Problem Description
/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, return the Hamming distance between them.



Example 1:

Input: x = 1, y = 4
Output: 2
Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
The above arrows point to positions where the corresponding bits are different.
Example 2:

Input: x = 3, y = 1
Output: 1


Constraints:

0 <= x, y <= 231 - 1


*/


public class HammingDistance {

    public static void main(String[] args) {
        System.out.println( hammingDistance(3,1));
    }
    public static int hammingDistance(int x, int y) {

        int totalDiff=0;
        String result1 = Integer.toBinaryString(x);
        String result2 = Integer.toBinaryString(y);

        result1= String.format("%32s",result1).replaceAll(" ","0");
        result2= String.format("%32s",result2).replaceAll(" ","0");



        for (int i = 0; i < result1.length(); i++) {
            if(result1.charAt(i)!=result2.charAt(i))
                totalDiff++;
        }

        return totalDiff;

    }
}










