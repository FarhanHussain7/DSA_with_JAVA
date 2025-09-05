package Interview_String_Based_Question;

import java.util.*;

public class Q14_BalancedBracket {

    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expr.toCharArray()) {
            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Handle closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If stack is empty, brackets are balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "{[()]}";  // Try other cases like "[(])", "({[)]}"
        System.out.println(isBalanced(input));  // Output: true
    }
}