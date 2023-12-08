class Solution {
public  int divisorSubstrings(int num, int k) {
        String numStr= Integer.toString(num);
        int result=0;
        StringBuilder temp= new StringBuilder();
        for (int i = 0; i <k ; i++) {
            temp.append(numStr.charAt(i));
        }
        if(num% Integer.valueOf(temp.toString()) == 0)
            result++;
        for (int i = 1; i <numStr.length()-k+1 ; i++) {
            temp.deleteCharAt(0);
            temp.append(numStr.charAt(i+k-1));
            if(Integer.valueOf(temp.toString()) >0 && num%Integer.valueOf(temp.toString()) ==0)
                result++;
        }

        return result;
    }
}