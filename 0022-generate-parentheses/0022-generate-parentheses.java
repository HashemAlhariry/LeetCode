class Solution {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        dfsHelper(n*2,result,"");
        return result;
    }
    private static boolean validParenthesis(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='(')
                stack.add('(');
            else if ( !stack.isEmpty() && stack.peek()=='(' && str.charAt(i)==')') {
                stack.pop();
            }else {
                stack.add(')');
                break;
            }
        }
        return stack.isEmpty();
    }
    private static void dfsHelper(int n, List<String> result,String currentString) {
        if(currentString.length()==n){
            if(validParenthesis(currentString)) {
                result.add(currentString);
            }
            return;
        }
        dfsHelper(n,result,currentString+"(");
        dfsHelper(n,result,currentString+")");
    }

}