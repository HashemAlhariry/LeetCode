package com.gov;


import java.util.Stack;
//Problem Description
/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false


Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */

public class ValidParentheses {


    public static  boolean isValid(String s) {
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

    public static void main(String args[]){

        String s = "(])";
        System.out.println(isValid(s));
    }

}

