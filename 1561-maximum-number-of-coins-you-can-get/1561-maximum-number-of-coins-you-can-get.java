class Solution {
    public  int maxCoins(int[] piles) {
        int second=0;
        Arrays.sort(piles);
        boolean checker=true;
        for (int i = piles.length-1; piles.length/3<=i ; i--) {
            if(checker) {
                checker=false;
            }
            else {
                second += piles[i];
                checker=true;
            }
        }
        return second;
    }


}