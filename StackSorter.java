import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

public class StackSorter {

    /**
     * TO-DO: Sort the given stack so that the smallest element is at the top.
     * You may use a temporary stack, but no other data structures.
     \*
     * @param stack The stack of integers to be sorted.
     */
    public static Stack<Integer> sortStack(Stack<Integer> stack) {

        Stack<Integer> tempStack = new Stack<>();
        int pop;
        while (!stack.isEmpty()) {

            int temp=stack.pop();
            while(!tempStack.empty()&&tempStack.peek()>temp){

                    stack.push(tempStack.pop());


            }
            tempStack.push(temp);

        }

        while (!tempStack.isEmpty()){

            stack.push(tempStack.pop());
        }

    return stack;

    }

        public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();

            // push some numbers (unsorted)
            stack.push(34);
            stack.push(3);
            stack.push(31);
            stack.push(98);
            stack.push(92);
            stack.push(23);

            System.out.println("Original stack: " + stack);

            sortStack(stack);

            System.out.println("Sorted stack: " + stack);

        }

        }












