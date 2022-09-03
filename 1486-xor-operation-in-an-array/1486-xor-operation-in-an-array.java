class Solution {
     public static int xorOperation(int n, int start) {
        int arr[]=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=start+2*i;
        }
        int number=0;

        for (int i = 0; i <arr.length ; i++) {
            number^=arr[i];
        }
        return number;
    }
}