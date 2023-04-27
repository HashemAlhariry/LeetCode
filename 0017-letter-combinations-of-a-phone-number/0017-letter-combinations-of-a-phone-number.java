class Solution {
    static List<String> result = null;
    static String[] mapping = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static public List<String> letterCombinations(String digits) {
            result = new ArrayList<>();
            if(digits.length()==0)
                return result;

            dfs(0,digits,new StringBuilder());
            return result;

    }

   static private void dfs(int length, String digits, StringBuilder stringBuilder) {

        if(length==digits.length()){
            result.add(stringBuilder.toString());
            return;
        }

        char  ch = digits.charAt(length);
        String str =mapping[ch-'0'];

        for (char c:str.toCharArray()) {
               stringBuilder.append(c);
               dfs(length+1,digits,stringBuilder);
               stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }

    }

}