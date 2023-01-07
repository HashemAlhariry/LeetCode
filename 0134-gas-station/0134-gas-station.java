class Solution {
       public static int canCompleteCircuit(int[] gas, int[] cost) {

        int totalGas=0;
        int totalCost=0;
        for(int i = 0 ; i<gas.length; i++){

            totalGas += gas[i];
            totalCost += cost[i];
        }

        if(totalGas < totalCost) return -1;


        int remainingValue=0,start=0;
        for (int i = 0; i <gas.length ; i++) {
            remainingValue = remainingValue + (gas[i]-cost[i]);
            if(remainingValue<0) {
                start =i+ 1;
                remainingValue=0;
            }
        }


        return start;
    }
}