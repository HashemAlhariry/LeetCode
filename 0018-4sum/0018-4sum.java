class Solution {
    public static List<List<Integer>> fourSum(int[] nums, int target) {

        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i <nums.length ; i++) {
            if(i==nums.length-3)
                break;
            for (int j = i+1; j <nums.length; j++) {
                int lP=j+1,rP=nums.length-1;
                while (lP<rP){
                    long temp1=nums[i]+nums[j]; //neglect overflow problem
                    long temp2= nums[lP]+nums[rP];
                    if(target-temp1==temp2){
                        List<Integer> list = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[lP],nums[rP]));
                        result.add(list);
                        lP++;
                    }else if(nums[i]+nums[j]+nums[lP]+nums[rP]<target){
                        lP++;
                    }else
                        rP--;
                }
            }
        }
        Iterator<List<Integer>> itr = result.iterator();
        List<List<Integer>> res =new ArrayList<>();
        while(itr.hasNext()){
           res.add(itr.next());
        }

        return res;
    }
}