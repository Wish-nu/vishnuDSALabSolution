import java.util.Stack;

public class balanceBrackets {

    public static void main(String[] args) {
        String inputString = "((){]([]))";
        Stack<Character> stack = new Stack<>();
        boolean unbalanced = false;


        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
        switch (ch) {
            case '(':
            case '{':
            case '[':
                stack.push(ch);
                continue;
            case ')':
                if (stack.empty() || (stack.pop() != '(')) {
                    unbalanced = true;
                    break;
                }
                continue;

            case '}':
                if (stack.empty() || (stack.pop() != '{')) {
                    unbalanced = true;
                    break;
                }
                continue;

            case ']':
                if (stack.empty() || (stack.pop() != '[')) {
                    unbalanced = true;
                    break;
                }
        }
    }
    if(unbalanced ||!stack.empty()) {
        System.out.println("String is unbalanced");
    }
    else {
        System.out.println("String is balanced");
    }
}
}
