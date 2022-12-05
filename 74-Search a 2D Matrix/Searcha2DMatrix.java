//Problem
/*
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.


Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Example 2:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false


Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-104 <= matrix[i][j], target <= 104


*/




class Searcha2DMatrix {

    public static void main(String[] args) {
        searchMatrix(new int[][]{{1,3,5,7}, {10,11,16,20}, {23,30,34,60}},60);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        boolean checker = false;
        int index = 0;

        int left = 0,right = matrix.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if(matrix[mid][0]<target){
                index=mid;
                left=mid+1;
            } else if (matrix[mid][0]>target) {
                right=mid-1;
            }else {
                return true;
            }
        }

        left=0;
        right=matrix[index].length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if(matrix[index][mid]<target){
                left=mid+1;
            } else if (matrix[index][mid]>target) {
                right=mid-1;
            }else {
                return true;
            }
        }

        return checker;
    }

}
