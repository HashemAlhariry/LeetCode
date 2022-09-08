class Solution {
    public int minPartitions(String n) {
           int totalNumbers=0;
        StringBuilder str = new StringBuilder(n);
        StringBuilder strTemp = new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
            strTemp.append("0");
        }
        while(!(str.toString().equals(strTemp.toString()) )){
            for (int i = 0; i <str.length() ; i++) {
                if(Character.getNumericValue(str.charAt(i))>0){
                   int currentNumber =   Character.getNumericValue(str.charAt(i));
                   currentNumber--;
                   str.setCharAt(i,Character.forDigit(currentNumber,10));
                }

            }
        totalNumbers++;
        }
        return totalNumbers;
    }
}