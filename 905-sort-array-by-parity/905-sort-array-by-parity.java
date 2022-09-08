class Solution {
    public int[] sortArrayByParity(int[] nums) {
            Queue<Integer> evenIndex =new PriorityQueue<>();
        Queue<Integer> oddIndex=new PriorityQueue<>();
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]%2==0)
                evenIndex.add(i);
            else
                oddIndex.add(i);
        }
        int arr[]=new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            if(evenIndex.size()>0){
                arr[i]= nums[evenIndex.poll()];
            }else
                arr[i]=nums[oddIndex.poll()];
        }
        return arr;
    }
}