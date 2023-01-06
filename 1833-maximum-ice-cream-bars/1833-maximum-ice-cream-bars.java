class Solution {
     public int maxIceCream(int[] costs, int coins) {
        int result =0;
        Arrays.sort(costs);

        for (int i = 0; i <costs.length ; i++) {
            if(coins>=costs[i]){
                result++;
                coins-=costs[i];
            }else
                break;
        }
        return result;
    }
}