class Solution {
  
     public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        dfsHelper(n*2,result,new StringBuilder(""));
        return result;
    }
    private static boolean validParenthesis(StringBuilder str){
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
    private static void dfsHelper(int n, List<String> result,StringBuilder currentString) {
        if(currentString.length()==n){
            if(validParenthesis(currentString)) {
                result.add(currentString.toString());
            }
            return;
        }
        dfsHelper(n,result,new StringBuilder(currentString).append("("));
        dfsHelper(n,result,new StringBuilder(currentString).append(")"));
    }
}