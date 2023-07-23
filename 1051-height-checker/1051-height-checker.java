class Solution {
   public   int heightChecker(int[] heights) {
        int[] temp = new int[heights.length];
        int index=0;
        for (int num: heights) {
            temp[index++]=num;
        }
        Arrays.sort(temp);
        int result=0;
        for (int i = 0; i < heights.length; i++) {
            if(temp[i]!=heights[i])
                result++;
        }

        return result;
    }
  
}