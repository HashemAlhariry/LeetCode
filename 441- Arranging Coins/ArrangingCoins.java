//Problem
/*

*/
class ArrangingCoins {

    public static void main(String[] args) {


        System.out.println(arrangeCoins(5));;
    }

    public static int arrangeCoins(int n) {
        int currentStairs=0;
        int counter=1;

        while (n>0&& n>=counter){
            currentStairs++;
            n-=counter;
            counter++;

        }

        return currentStairs;
    }

}







