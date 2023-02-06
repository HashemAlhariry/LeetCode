class Solution {
    public int[] sumZero(int n) {
        if (n==0)
            return new int[]{0};
        int res[]=new int[n];
        for (int i = 0; i <n/2 ; i++) {
             res[i]=-(i+1);
             res[n-i-1]=(i+1);
        }
        if(n%2!=0){
            res[n/2]=0;
        }
        return res;   
    }
}