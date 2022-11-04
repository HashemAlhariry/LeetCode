import java.util.*;

//Problem
/*
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.



Example 1:

Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
Example 2:

Input: n = 2
Output: false


Constraints:

1 <= n <= 231 - 1


*/
class HappyNumber {

    public static void main(String[] args) {
        isHappy(19);
    }
    public static boolean isHappy(int n) {

        if(n==1)
            return true;

        Set<Integer> set = new HashSet<>();
        int currentNumber=n;

        while(true){

            int totalNumber=currentNumber;
            currentNumber=0;
            while(totalNumber!=0){
                int number=totalNumber%10;
                totalNumber/=10;
                currentNumber+=Math.pow(number,2);
            }


            if(currentNumber==1)
                return true;
            else{
                if(set.contains(currentNumber))
                    return false;
                else {
                    set.add(currentNumber);
                }
            }

        }


    }

}







