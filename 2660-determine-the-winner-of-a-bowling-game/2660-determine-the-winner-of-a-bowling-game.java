class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int p1=0,p2=0;
        int sumP1=0,sumP2=0;
        for (int i = 0; i <player1.length ; i++) {
            if(p1==0)
               sumP1+=player1[i];
            else {
                sumP1+=(player1[i]*2);
                p1--;
            }
            if(p2==0)
                sumP2+=player2[i];
            else {
                sumP2+=(player2[i]*2);
                p2--;
            }
            
            if(player1[i]==10)
                p1=2;
            if(player2[i]==10)
                p2=2;
        }
        return sumP1>sumP2?1:sumP2>sumP1?2:0;
    }
}