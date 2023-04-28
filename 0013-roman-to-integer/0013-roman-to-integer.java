class Solution {
  public   int getNumber(Character s){

        switch (s) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }

        return 0;
    }
    public   int romanToInt(String s) {

        int totalNumber=0;

        for (int i = 0; i <s.length() ; i++) {
           if(s.charAt(i)=='I') {
               if(++i <= s.length()-1 && s.charAt(i)=='V'  ){
                    totalNumber+=4;
                    continue;
               }
               --i;
                if(++i <= s.length()-1 && s.charAt(i)=='X' ){
                   totalNumber+=9;
                   continue;
               }

               --i;
           }
           if(s.charAt(i)=='X') {
               if(++i <= s.length()-1 && s.charAt(i)=='L'  ){
                   totalNumber+=40;
                   continue;
               }
               --i;
                 if(++i <= s.length()-1 && s.charAt(i)=='C' ){
                   totalNumber+=90;
                   continue;
               }

               --i;

            }
           if(s.charAt(i)=='C') {
               if(++i <= s.length()-1 && s.charAt(i)=='D'  ){
                   totalNumber+=400;
                   continue;
               }
               --i;
               if(++i <= s.length()-1 && s.charAt(i)=='M' ){
                   totalNumber+=900;
                   continue;
               }
               --i;

           }

           totalNumber+=getNumber(s.charAt(i));

        }


        return totalNumber;
    }
}