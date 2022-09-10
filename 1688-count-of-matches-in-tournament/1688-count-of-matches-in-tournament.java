class Solution {
     public static int numberOfMatches(int n) {
        int totalNumberOfTeams=0;

        while(n>1){
            if(n%2==0){
                totalNumberOfTeams+=(n/2);
                n=n/2;
            }else {
                totalNumberOfTeams+=(n-1)/2;
                n= (n-1)/2 +1;
            }
        }

        return totalNumberOfTeams;
    }
}