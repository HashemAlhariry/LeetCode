class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    
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