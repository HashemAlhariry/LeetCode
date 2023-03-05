class Solution {
 
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<int[]> minCapital = new PriorityQueue<>((a,b)->a[0]-b[0]);
        for (int i = 0; i <capital.length ; i++) {
            minCapital.add(new int[]{capital[i],i});
        }
        int totalProfit = w;
        PriorityQueue<int[]>maximumProfit = new PriorityQueue<>((a,b)->b[0]-a[0]);
        int i=0;
        while (i<k){
            while(minCapital.size()!=0 && minCapital.peek()[0]<=totalProfit){
                int tempCapital[] = minCapital.poll();
                maximumProfit.add(new int[]{profits[tempCapital[1]],tempCapital[1]});
            }
            if(maximumProfit.size()==0)
                break;
            int tempArr[]=maximumProfit.poll();
            totalProfit+=tempArr[0];

            i++;
        }

        return totalProfit;
    }
}