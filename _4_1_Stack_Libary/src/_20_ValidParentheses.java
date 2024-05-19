import java.util.Stack;

public class _20_ValidParentheses {
    public static void main(String[] args) {
        String s = "]";
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{') {
                myStack.push(c);
            }
            else {
                if(myStack.empty()) {
                    return false;
                }
                char top = myStack.pop();
                if((c == '}' && top != '{') || (c == ')' && top != '(' ) || (c == ']' && top != '[') ) {
                    return false;
                }

            }
        }
        return myStack.empty();
    }
}
