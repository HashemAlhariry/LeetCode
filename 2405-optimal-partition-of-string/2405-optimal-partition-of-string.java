class Solution {
    public int partitionString(String s) {
        Map<Character,Integer> checkChar = new HashMap<>();
        int result =0;
        if(s.length()==0)
            return result;
        for (int i = 0; i <s.length() ; i++) {
            if(checkChar.containsKey(s.charAt(i))) {
                result++;
                checkChar=new HashMap<>();
                checkChar.put(s.charAt(i),1);
            }else{
                checkChar.put(s.charAt(i),1);
            }
        }

        return ++result;
    }
}