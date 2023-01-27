class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int result=0;
        List<PriorityQueue<Integer>> list = new ArrayList<>();

        for (int i = 0; i < grid.length; i++) {
            PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
            for (int j = 0; j <grid[i].length ; j++) {
                pQueue.add(grid[i][j]);
            }
            list.add(pQueue);
        }
        
        for (int i = 0; i <grid[0].length ; i++) {
            int localCounter=0;
            for (int j = 0; j < list.size(); j++) {
                int number =list.get(j).poll();
                if(number>localCounter)
                    localCounter=number;
            }
            result+=localCounter;
        }
        return result;

    }
}