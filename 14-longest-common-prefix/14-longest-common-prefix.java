class Solution {
       public static String longestCommonPrefix(String[] strs) {

        String shortestWord = Arrays.asList(strs).stream().sorted((e1, e2)-> e1.length()>e2.length()?1:-1).findFirst().get();
        for (String current: strs) {
            String newString="";
            for (int i = 0; i <shortestWord.length() ; i++) {
                if(shortestWord.charAt(i)==current.charAt(i)){
                    newString+=shortestWord.charAt(i);
                }
            }
            shortestWord=newString;
        }


        return shortestWord;
    }
}