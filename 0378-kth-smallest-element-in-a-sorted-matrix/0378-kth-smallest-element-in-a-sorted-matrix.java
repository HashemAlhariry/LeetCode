class Solution {
    public static int kthSmallest(int[][] matrix, int k) {
        int rowCount = matrix.length;
        PriorityQueue<int []> heap = new PriorityQueue<>((a,b)->a[0]-b[0]);
        int[] emptyMatrix = new int[0];
        for (int i = 0; i < rowCount; i++) {
            if (Arrays.equals(matrix[i], emptyMatrix)) {
                return -1;
            } else {
                heap.add(new int[]{matrix[i][0], 0, i});
            }
        }
        int numbersChecked = 0, smallestElement = 0;
        while (numbersChecked<k && !heap.isEmpty()){
            int temparr[] = heap.poll();
            smallestElement=temparr[0];
            int index = temparr[1];
            int row = temparr[2];
            numbersChecked++;
            if(numbersChecked==k)
                break;
            if(matrix.length>index+1){
                heap.add(new int[]{matrix[row][index+1],index+1,row});
            }
        }
        return smallestElement;

    }
}