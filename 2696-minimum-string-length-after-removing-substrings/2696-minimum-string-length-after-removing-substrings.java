class Solution {
   public  int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if(!stack.isEmpty() && ((stack.peek()=='A' && s.charAt(i)=='B') || (stack.peek()=='C' &&s.charAt(i)=='D')))
                stack.pop();
            else
                stack.push(s.charAt(i));
        }
        return stack.size();
    }
}