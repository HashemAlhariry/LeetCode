class Solution {
    public String interpret(String command) {
             String interpreted="";

        for (int i = 0; i <command.length() ; i++) {
            if(command.charAt(i)=='G')
                interpreted+="G";
            else if (command.charAt(i)=='(' &&command.charAt(i+1)==')' ) {
                interpreted+="o";
                      i+=1;
            }else {
                interpreted+="al";
                i+=3;
            }

        }       
        return interpreted;   
    }
}