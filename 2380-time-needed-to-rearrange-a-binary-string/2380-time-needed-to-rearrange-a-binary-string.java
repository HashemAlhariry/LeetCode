class Solution {
    public int secondsToRemoveOccurrences(String s) {
              
            if(s.length()==1)
                return 0;

            int seconds=0;

            StringBuilder str= new StringBuilder(s);

            for (int i = 0; i <str.length() ; i++) {
                boolean checker=false;

                for (int j = 0; j <str.length()-1 ; j++) {
                    if(str.charAt(j)=='0' && str.charAt(j+1)=='1'){
                        str.setCharAt(j,'1');
                        str.setCharAt(j+1,'0');
                        j=j+1;
                        checker=true;
                    }


                }

                if(checker)
                    seconds++;

            }


            return seconds;
    }
}