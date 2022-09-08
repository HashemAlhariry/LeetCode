class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
          List<Integer> luckyNumbers = new ArrayList<>();
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {

                int currentNumber = matrix[i][j];
                boolean minCurrRow=true;
                boolean minCurrCol=true;

                for (int k = 0; k <matrix[0].length ; k++) {
                    if(j==k)
                        continue;

                    if(currentNumber>matrix[i][k])
                        minCurrRow=false;
                }

                for (int l = 0; l <matrix.length ; l++) {
                    if(i==l)
                        continue;

                    if(currentNumber<matrix[l][j])
                        minCurrCol=false;
                }

                if(minCurrCol&&minCurrRow)
                    luckyNumbers.add(currentNumber);

            }
        }

        return luckyNumbers;
    }
}