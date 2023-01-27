class Solution {
    public int uniqueMorseRepresentations(String[] words) {
              String [] coded = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<String,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i <words.length ; i++) {
            StringBuilder currentWord=new StringBuilder();
            for (int j = 0; j <words[i].length() ; j++) {
                currentWord.append(coded[words[i].charAt(j) - 'a']);
            }
            map.put(currentWord.toString(),1);
        }
        
        return map.size();  
    }
}