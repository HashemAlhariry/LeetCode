class Solution {
    public int[][] generateMatrix(int n) {

        int arr[][]= new int[n][n];
        int maximum=n*n;
        int counter=1;
        int row=0,column=0;
        boolean r=true,d=false,l=false,u=false;

        while (counter<=maximum){
            if(r){
                if(arr[row][column]==0){
                    arr[row][column]=counter;
                    counter++;
                    column++;
                    if(column==n) {
                        column--;
                        row++;
                        r=false;
                        d=true;
                    } else if (arr[row][column]!=0) {
                        row++;
                        column--;
                        r=false;
                        d=true;
                    }
                }
            } else if (d) {
                if(arr[row][column]==0){
                    arr[row][column]=counter;
                    counter++;
                    row++;
                    if(row==n) {
                        column--;
                        row--;
                        d=false;
                        l=true;
                    } else if (arr[row][column]!=0) {
                        row--;
                        column--;
                        d=false;
                        l=true;
                    }
                }
            } else if (l) {
                if(arr[row][column]==0){
                    arr[row][column]=counter;
                    counter++;
                    column--;
                    if(column==-1) {
                        column++;
                        row--;
                        l=false;
                        u=true;
                    } else if (arr[row][column]!=0) {
                        row--;
                        column++;
                        l=false;
                        u=true;
                    }
                }
            } else if (u) {
                if(arr[row][column]==0){
                    arr[row][column]=counter;
                    counter++;
                    row--;
                    if (arr[row][column]!=0) {
                        row++;
                        column++;
                        u=false;
                        r=true;
                    }
                }
            }

        }

        return arr;
    }
}