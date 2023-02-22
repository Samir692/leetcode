import java.util.*;

# https://leetcode.com/problems/valid-parentheses/

class ValidParentheses {
    public boolean isValid(String s) {
        if(s.length() == 0 || s.length() == 1) {
            return false;
        }
        char[] s_char = s.toCharArray();
        Map<Character, Character> machingChar = new HashMap<>();

        machingChar.put(')', '(');
        machingChar.put(']', '[');
        machingChar.put('}', '{');

        Stack<Character> stack = new Stack<>();

        for(char pth: s_char){
            if(machingChar.containsKey(pth)) {
                if(!stack.empty() && machingChar.get(pth) == stack.peek()){
                    stack.pop();
                }
                else {
                    return false;
                }
            }
            else {
                stack.push(pth);
            } 
        }
        return stack.empty();
    }
}
