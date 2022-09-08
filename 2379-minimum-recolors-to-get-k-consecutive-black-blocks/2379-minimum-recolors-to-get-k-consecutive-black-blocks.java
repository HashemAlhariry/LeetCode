class Solution {
    public int minimumRecolors(String blocks, int k) {
        //check if there is already block available
        int counter=0;
        for (int i = 0; i <blocks.length() ; i++) {
            if(blocks.charAt(i)=='B'){
                counter++;
            }else {
                counter=0;
            }
        }
        if(counter>=k)
            return 0;

        int numberOfOperation=Integer.MAX_VALUE;
        //loop over to check how many will change
        for (int i = 0; i < blocks.length()-k+1; i++) {
            counter=0;

            for (int j = i; j <i+k ; j++) {
                if(blocks.charAt(j)=='W'){
                    counter++;
                }
            }

            numberOfOperation=Math.min(numberOfOperation,counter);
        }

        return numberOfOperation;
    }
}