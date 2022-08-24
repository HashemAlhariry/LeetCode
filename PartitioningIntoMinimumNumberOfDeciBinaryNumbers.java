//Problem Description
/*
A decimal number is called deci-binary if each of its digits is either 0 or 1 without any leading zeros. For example, 101 and 1100 are deci-binary, while 112 and 3001 are not.

Given a string n that represents a positive decimal integer, return the minimum number of positive deci-binary numbers needed so that they sum up to n.



Example 1:

Input: n = "32"
Output: 3
Explanation: 10 + 11 + 11 = 32
Example 2:

Input: n = "82734"
Output: 8
Example 3:

Input: n = "27346209830709182346"
Output: 9


Constraints:

1 <= n.length <= 105
n consists of only digits.
n does not contain any leading zeros and represents a positive integer.
*/

class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {

    public static void main(String[] args) {
        minPartitions("82734");
        System.out.println("00000".equals("00000"));
    }

    public static int minPartitions(String n) {
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









