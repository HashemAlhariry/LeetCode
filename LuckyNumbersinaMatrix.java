//Problem Description
/*
Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.



Example 1:

Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.
Example 2:

Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
Output: [12]
Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
Example 3:

Input: matrix = [[7,8],[1,2]]
Output: [7]
Explanation: 7 is the only lucky number since it is the minimum in its row and the maximum in its column.


Constraints:

m == mat.length
n == mat[i].length
1 <= n, m <= 50
1 <= matrix[i][j] <= 105.
All elements in the matrix are distinct.

*/

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersinaMatrix {

    public static void main(String[] args) {


    }

    public List<Integer> luckyNumbers (int[][] matrix) {

        List<Integer> luckyNumbers = new ArrayList<>();
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {

                int currentNumber = matrix[i][j];
                boolean minCurrRow=true;
                boolean minCurrCol=true;

                for (int k = 0; k <matrix[0].length ; k++) {
                    if(j==k)
                        continue;

                    if(currentNumber>matrix[i][k])
                        minCurrRow=false;
                }

                for (int l = 0; l <matrix.length ; l++) {
                    if(i==l)
                        continue;

                    if(currentNumber<matrix[l][j])
                        minCurrCol=false;
                }

                if(minCurrCol&&minCurrRow)
                    luckyNumbers.add(currentNumber);

            }
        }

        return luckyNumbers;
    }
}











