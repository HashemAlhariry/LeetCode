class Solution {
    public int subtractProductAndSum(int n) {
           int totalSum=0;
        int totalProduct=1;
        int currentValue;
        while(n>0){
            currentValue=n%10;
            n/=10;
            totalSum+=currentValue;
            totalProduct*=currentValue;
        }

        return totalProduct-totalSum; 
    }
}