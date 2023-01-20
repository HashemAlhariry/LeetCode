class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int digSum=0;
        for (int i = 0; i < nums.length; i++) {
            String currNumber = Integer.toString(nums[i]);
            for (int j = 0; j <currNumber.length(); j++) {
                digSum+=Integer.parseInt(String.valueOf(currNumber.charAt(j)));
            }
        }

        return Math.abs(sum-digSum);
    }
}