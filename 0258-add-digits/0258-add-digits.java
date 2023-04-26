class Solution {
    public int addDigits(int num) {
        while (num>=10){
            int currentNumber=num;
            num=0;
            while (currentNumber!=0){
                num+=currentNumber%10;
                currentNumber/=10;
            }
        }
        return num;
    }
}