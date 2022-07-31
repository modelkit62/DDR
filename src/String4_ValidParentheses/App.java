package String4_ValidParentheses;

import java.util.Stack;

public class App {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        // push() => Lo mete el 1o de la lista
        // peek() => Coge el 1o SIN BORRARLE!
        // pop() => Coge el 1o y LO BORRA!

        // Iterate through string until empty
        for (int i = 0; i < s.length(); i++) {
            // Push any open parentheses onto stack
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            }
            // Check stack for corresponding closing parentheses, false if not valid
            else if (s.charAt(i) == ')' && !stack.empty() && stack.peek() == '(') {
                stack.pop();
            } else if (s.charAt(i) == ']' && !stack.empty() && stack.peek() == '[') {
                stack.pop();
            } else if (s.charAt(i) == '}' && !stack.empty() && stack.peek() == '{') {
                stack.pop();
            }
        }
        // return true if no open parentheses left in stack
        return stack.empty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[])"));
    }
}
