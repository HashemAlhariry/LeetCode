class Solution {
    public int mySqrt(int x) {
                double currentNumber=1;

        while((currentNumber*currentNumber)<=x){
            currentNumber++;

        }
        currentNumber--;
        return (int) currentNumber;
    }
}