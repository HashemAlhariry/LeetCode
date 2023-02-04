class Solution {
    public static int minOperations(int n) {

        int totalResult=0;
        for (int i = 0; i <n/2 ; i++) {
            totalResult+= (n-(i*2+1));
        }
        return totalResult;
    }
}