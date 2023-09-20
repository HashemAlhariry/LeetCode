class Solution {
    public static int maxCoins(int[] piles) {
        int third=0;
        int first=0;
        int second=0;
        Arrays.sort(piles);
        for (int i = 0; i < piles.length/3; i++) {
            third+=piles[i];
        }
        boolean checker=true;
        for (int i = piles.length-1; piles.length/3<=i ; i--) {
            if(checker) {
                first += piles[i];
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