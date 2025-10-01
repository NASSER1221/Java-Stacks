import java.util.Objects;
import java.util.Stack;

public class StackManipulator {
    /**
     * TO-DO: Remove and return the element at the bottom of the stack.
     * The rest of the elements must be put back in their original order.
     * \*
     *
     * @param stack The stack to modify.
     * @return The integer element from the bottom of the stack.
     */
    public static Integer removeBottomElement(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return null;
        }
        Integer bottomElement = null;
        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()){

            tempStack.add(stack.pop());
        }

        bottomElement=tempStack.pop();

        while (!tempStack.isEmpty()){

            stack.add(tempStack.pop());
        }
        return bottomElement;

    }

}

