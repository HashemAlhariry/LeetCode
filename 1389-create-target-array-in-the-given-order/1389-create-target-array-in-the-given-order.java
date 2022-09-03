class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
            List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < index.length; i++) {
            numList.add(index[i],nums[i]);
        }

        int arr[]=new int[nums.length];
        for (int i = 0; i < numList.size(); i++) {
           arr[i]=numList.get(i);
        }


        return arr;
    }
}