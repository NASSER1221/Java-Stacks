import java.util.Stack;

public class BracketChecker {


    /**
     * TO-DO: Refactor this method to remove its dependency on the three helper methods
     * (isOpening, isClosing, isMatchingPair) by inlining their logic.
     */
    public static boolean isBalancedRefactored(String expr) {
        Stack<Character> stack = new Stack<>();
        for (char c : expr.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty())return false;

                char pop=stack.pop();
                if (c ==')' && pop!='(' || c ==']' && pop!='[' || c =='}' && pop!='{')
                    return false;


            }
        }
        if (stack.isEmpty())return true;
        else return false;
    }


    public static void main(String[] args) {
        System.out.println(isBalancedRefactored("()()(())((")); // false
        System.out.println(isBalancedRefactored("{[()]}"));     // true
        System.out.println(isBalancedRefactored("(([]))"));     // true
        System.out.println(isBalancedRefactored("{[}]"));       // false
    }

}
