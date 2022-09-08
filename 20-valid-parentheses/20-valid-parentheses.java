class Solution {
    public boolean isValid(String s) {
               Stack<Character> checker=new Stack<>();
        for (int i = 0; i <s.length() ; i++) {

            if(s.charAt(i)=='(' ||s.charAt(i)=='{' ||s.charAt(i)=='['){
                checker.add(s.charAt(i));
                continue;
            }

            else if(s.charAt(i)==')'){
              if(checker.size()!=0){
                  Character lastChar =  checker.peek();
                  if(lastChar!= null && lastChar=='('){
                      checker.pop();
                  }else {
                      checker.add(s.charAt(i));
                  }
              }
             else {
                  checker.add(s.charAt(i));
              }
            }
            else if(s.charAt(i)=='}'){
                if(checker.size()!=0){
                    Character lastChar =  checker.peek();
                    if(lastChar!= null && lastChar=='{'){
                        checker.pop();
                    }else {
                        checker.add(s.charAt(i));
                    }
                }else {
                    checker.add(s.charAt(i));
                }
            }
            else if(s.charAt(i)==']'){
                if(checker.size()!=0){
                    Character lastChar =  checker.peek();
                    if(lastChar!= null && lastChar=='['){
                        checker.pop();
                    }else {
                        checker.add(s.charAt(i));
                    }

                }else {
                    checker.add(s.charAt(i));
                }
            }
        }

       boolean validated =  checker.size() == 0 ? true :false;
       return validated;
    }
}