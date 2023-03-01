class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int num:nums) {
            heap.offer(num);
        }
        int counter=0;
        while (heap.size()!=0){
            nums[counter++]=heap.poll();
        }
        return nums;
    }
}