class Solution {
    public static int[] plusOne(int[] digits) {
        if(digits[digits.length-1]<9){
            digits[digits.length-1]=digits[digits.length-1]+1;
            return digits;
        }
        for (int i = digits.length-1; i >=0 ; i--) {
         if(digits[i]<9) {
             digits[i] = ++digits[i];
             break;
         }
         if(digits[i]==9)
             digits[i]=0;
        }

        if(digits[0]!=0)
            return digits;

        int temp[]= new int[digits.length+1];
        temp[0]=1;
        for (int i = 1; i < temp.length; i++) {
            temp[i]=digits[i-1];
        }
            return temp;
        }
}