class Solution {
    public int findKthPositive(int[] arr, int k) {

        int indexForArr=0;
        int counterForMissing=0;

        for (int i = 1; i <arr[arr.length-1] ; i++) {
            if(arr[indexForArr]==i){
                indexForArr++;
            }else{
             counterForMissing++;
             if(counterForMissing==k)
                 return i;
            }
        }



        
        return arr[arr.length-1]+k-counterForMissing;
    }
}