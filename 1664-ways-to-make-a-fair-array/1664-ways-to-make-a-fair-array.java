class Solution {
    public int waysToMakeFair(int[] nums) {
                int totalOddR=0;
        int totalEvenR=0;
        int totalNumber=0;

        for (int i = 0; i <nums.length ; i++) {
            if(i%2==0)
                totalEvenR+=nums[i];
            else
                totalOddR+=nums[i];
        }

        int totalEvenL=0;
        int totalOddL=0;

        for (int i = 0; i <nums.length ; i++) {

            if(i%2==0)
                totalEvenR-=nums[i];
            else
                totalOddR-=nums[i];


            if((totalEvenR+totalOddL)== (totalOddR+totalEvenL))
                totalNumber++;

            if(i%2==0)
                totalEvenL+=nums[i];
            else
                totalOddL+=nums[i];
        }
        return totalNumber;
    }
}