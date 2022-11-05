import java.util.ArrayList;
import java.util.List;

//Problem
/*
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:




Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]


Constraints:

1 <= numRows <= 30

*/
class PascalsTriangle {

    public static void main(String[] args) {

        generate(5).stream().forEach(integers -> {
            integers.stream().forEach( integer -> {System.out.print(integer+" ");});
            System.out.println(" ");
        });

    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer>l1 = new ArrayList<>();
        l1.add(1);
        list.add(l1);

        if(numRows==1)
            return list;

        int currentNumber=1;
        for (int i = 1; i <numRows ; i++) {
            currentNumber++;
            l1 = new ArrayList<>();
            for (int j = 0; j <currentNumber ; j++) {
                if(j==0 || j==currentNumber-1)
                    l1.add(1);
                else{
                    l1.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
                }
            }
            list.add(l1);
        }

        return list;
    }

}







