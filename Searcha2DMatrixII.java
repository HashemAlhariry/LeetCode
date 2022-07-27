//Problem Description
/*
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.


Example 1:


Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
Output: true
Example 2:


Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
Output: false


Constraints:

m == matrix.length
n == matrix[i].length
1 <= n, m <= 300
-109 <= matrix[i][j] <= 109
All the integers in each row are sorted in ascending order.
All the integers in each column are sorted in ascending order.
-109 <= target <= 109

*/


public class Searcha2DMatrixII {

    public static void main(String[] args) {

        int arr[][]={{1,4,7,11,15},
                    {2,5,8,12,19},
                    {3,6,9,16,22},
                    {10,13,14,17,24},
                    {18,21,23,26,30}};

        int arr2[][]={{-1,3}};

        System.out.println( searchMatrix(arr,13));
    }
    public static boolean  searchMatrix(int[][] matrix, int target) {

        boolean checker=false;
        for (int i = 0; i < matrix.length; i++) {

            if(target>matrix[i][matrix[0].length-1])
                continue;

            if(target==matrix[i][matrix[0].length-1]){
                checker=true;
                return checker;
            }

            int right = matrix[0].length-1;
            int left=0;

            while(left <= right){
                int mid   = left + (right - left) / 2;
                if(target>matrix[i][mid]){
                    left=mid+1;
                } else if (target<matrix[i][mid]) {
                    right=mid-1;
                }
                else{
                    checker=true;
                    break;
                }

            }
            if(checker)
                break;
        }

        return checker;
    }

}

