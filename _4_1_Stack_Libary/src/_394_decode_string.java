import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class _394_decode_string {
    public static void main(String[] args) {
        System.out.println(decodeString("2[a2[b]e2]"));
    }

    public static String decodeString(String s) {
        Stack<Character> myStack = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == ']') {
                String str = "";
                while (myStack.peek() != '[') {
                    str = myStack.pop() + str;
                }
                myStack.pop();

                String numberString = "";
                while (!myStack.isEmpty() && Character.isDigit(myStack.peek())) {
                    numberString = myStack.pop() + numberString;
                }
                int nLoop = Integer.parseInt(numberString);
                str = str.repeat(nLoop);


                for (int j = 0; j < str.length(); j++) {
                    myStack.push(str.charAt(j));
                }
            } else {
                myStack.push(c);
            }
        }
        String result = "";
        while (!myStack.isEmpty()) {
            result = myStack.pop() + result;
        }
        return result;


    }
}