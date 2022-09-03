class Solution {
public static int hammingDistance(int x, int y) {

        int totalDiff=0;
        String result1 = Integer.toBinaryString(x);
        String result2 = Integer.toBinaryString(y);

        result1= String.format("%32s",result1).replaceAll(" ","0");
        result2= String.format("%32s",result2).replaceAll(" ","0");



        for (int i = 0; i < result1.length(); i++) {
            if(result1.charAt(i)!=result2.charAt(i))
                totalDiff++;
        }

        return totalDiff;

    }
}