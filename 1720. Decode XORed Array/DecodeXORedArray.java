import java.util.Arrays;
//Problem
/*
There is a hidden integer array arr that consists of n non-negative integers.

It was encoded into another integer array encoded of length n - 1, such that encoded[i] = arr[i] XOR arr[i + 1]. For example, if arr = [1,0,2,1], then encoded = [1,2,3].

You are given the encoded array. You are also given an integer first, that is the first element of arr, i.e. arr[0].

Return the original array arr. It can be proved that the answer exists and is unique.

*/
class DecodeXORedArray {

    public static void main(String[] args) {
        int arr[]= {6,2,7,3};
        int first = 4;
        Arrays.stream(decode(arr, first)).forEach(e-> System.out.println(e));
    }
    public static int[] decode(int[] encoded, int first) {

         int arr[] = new int[encoded.length+1];
         arr[0]=first;
         for (int i = 1; i <arr.length ; i++) {
             arr[i]=encoded[i-1] ^ arr[i-1];
         }
        return arr;
     }
}







