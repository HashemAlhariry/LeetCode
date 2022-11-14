//Problem
/*

*/


class FindtheMiddleIndexinArray {
    public static void main(String[] args) {

        System.out.println(findMiddleIndex(new int[]{3,2,-1,-4,8    }));
    }
    public static int findMiddleIndex(int[] nums) {
        if(nums.length==1)
            return 0;

        int arrLeft[]=new int[nums.length];
        int totalLeft=0;

        for (int i = 0; i < nums.length; i++) {
            totalLeft+=nums[i];
            arrLeft[i]=totalLeft;
        }

        int arrRight[]=new int[nums.length];
        int totalRight=0;

        for (int i = nums.length-1; i >= 0; i--) {
            totalRight+=nums[i];
            arrRight[i]=totalRight;
        }
        if(arrRight[1]==0)
            return 0;

        for (int i = 0; i <nums.length; i++) {
            if(i!=0 && i!= nums.length-1 && arrRight[i]==arrLeft[i])
                     return i;
        }

        if(arrLeft[nums.length-2]==0)
            return nums.length-1;




        return -1;
    }


}







