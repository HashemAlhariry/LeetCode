class Solution {
    private List<List<Integer>> result= new ArrayList<>();
    public  List<List<Integer>> permute(int[] nums) {

       helperMethod(nums,new ArrayList<>());
       return result;

    }

    private void helperMethod(int[] nums, List<Integer> tempList) {
        
        if(tempList.size()==nums.length){
            result.add(new ArrayList<>(tempList));
        }
        
        for (int num: nums) {
            if(tempList.contains(num))
                continue;
            tempList.add(num);
            helperMethod(nums,tempList);
            tempList.remove(tempList.size()-1);
        }
        
    }
}