class Solution {
    public int numberOfSteps(int num) {
            int totalSteps=0;
        while(num>0){
            if(num%2==0){
                num/=2;
            }else{
                num-=1;
            }
            totalSteps++;
        }
        return totalSteps;
    }
}