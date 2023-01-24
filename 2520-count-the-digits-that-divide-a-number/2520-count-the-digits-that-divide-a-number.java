class Solution {
    public int countDigits(int num) {
               int temp = num;
        int cnt =0;
        while(temp>0){
          int mod=  temp%10;
            if(num%mod==0){
                cnt++;
            }
            temp/=10;
        }
        return cnt; 
    }
}