class Solution {
    public static boolean isHappy(int n) {

        if(n==1)
            return true;
        int slowPoiner=n;
        int fastPointer=getNumber(n);
        while(slowPoiner!= fastPointer && fastPointer!=1){
            slowPoiner=getNumber(slowPoiner);
            fastPointer=getNumber(fastPointer);
            fastPointer=getNumber(fastPointer);
        }
        if(slowPoiner== fastPointer)
            return false;

        return true;
    }
    public static int getNumber(int number){
        int temp=0;
        int localTemp=0;
        while (number!=0){
            localTemp=number%10;
            temp+=Math.pow(localTemp,2);
            number/=10;

        }
        return temp;
    }
}