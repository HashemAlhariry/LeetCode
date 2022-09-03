class Solution {
    public boolean squareIsWhite(String coordinates) {
               int firstL=coordinates.charAt(0);
        int secondL=coordinates.charAt(1);

        secondL=secondL-48;
        firstL=firstL-96;

        if(secondL%2 ==0 && firstL%2==0){
            return false;
        }
        if(secondL%2 !=0 && firstL%2!=0){
            return false;
        }

        return true;
    }
}