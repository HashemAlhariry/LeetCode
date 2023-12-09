class Solution {
    public static void rotate(int[] input, int step) {
        step %= input.length;
        reverse(input, 0, input.length - 1);
        reverse(input, 0, step - 1);
        reverse(input, step, input.length - 1);
    }
    private static void reverse(int[] input, int start, int end) {
        while (start < end) {
            int temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++;
            end--;
        }
    }
}