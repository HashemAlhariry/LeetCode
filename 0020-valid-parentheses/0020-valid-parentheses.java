class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            if(!stack.isEmpty()){
                if(stack.peek()=='(' && s.charAt(i)==')')
                    stack.pop();
                else if(stack.peek()=='{' && s.charAt(i)=='}')
                    stack.pop();
                else if(stack.peek()=='[' && s.charAt(i)==']')
                    stack.pop();
                else stack.push(s.charAt(i));
            }else{
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}