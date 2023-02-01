class Solution {
   public static int numberOfBeams(String[] bank) {
        int [] light = new int[bank.length];
        for (int i = 0; i <bank.length ; i++) {
            for (int j = 0; j < bank[i].length(); j++) {
                if( bank[i].charAt(j)=='1')
                    light[i]+=1;
            }
        }
        int result=0;
        int counter=light[0];
        for (int i = 1; i <light.length; i++) {
            if(counter==0){
                counter=light[i];
            }else if(light[i]!=0){
                result+=counter*light[i];
                counter=light[i];
            }
        }

        return result;

    }
}