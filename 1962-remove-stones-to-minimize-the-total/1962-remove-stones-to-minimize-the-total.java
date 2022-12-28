class Solution {
    public int minStoneSum(int[] piles, int k) {
        

        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (int i = 0; i <piles.length ; i++) {
            pQueue.add(piles[i]);
        }

        while (k>0){
           int current =  pQueue.poll();
           k--;

           current = current - (int)Math.floor(current/2);
           pQueue.add(current);
        }
        int totalSum=0;
        for (Integer curr : pQueue) {
             totalSum+=curr;
        }
        
        
        return totalSum;

    }
}