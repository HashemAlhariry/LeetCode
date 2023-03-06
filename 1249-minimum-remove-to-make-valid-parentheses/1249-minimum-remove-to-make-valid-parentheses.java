class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(checkParentheses(s.charAt(i))) {
                if (!stack.isEmpty()) {
                      if(s.charAt(i)==')' && s.charAt(stack.peek())=='('){
                            stack.pop();
                      }
                      else stack.push(i);
                }
                else stack.push(i);
            }
        }
        StringBuilder st = new StringBuilder(s);
        while (!stack.isEmpty()){
            int index=stack.pop();
            st.deleteCharAt(index);
        }
        return st.toString();
    }
    private static boolean checkParentheses(char ch){
        if(ch=='(' || ch == ')')
            return true;
        return false;
    }
}