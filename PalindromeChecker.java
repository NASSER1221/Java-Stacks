import java.util.Stack;


public class PalindromeChecker {

    /* TO-DO: Use a Stack to determine if a string is a palindrome.
     \*
             * @param input The string to check.
      * @return true if the string is a palindrome, false otherwise.
     */
    public boolean isPalindrome(String input) {
        String lowercased = input.toLowerCase();
        Stack<Character> stack = new Stack<>();
        // Your code here: Push all characters of 'lowercased' onto the stack.
        for(char s:lowercased.toCharArray()){
            stack.add(s);
        }
        StringBuilder reversed = new StringBuilder();
        // Your code here: Pop all characters from the stack and append to 'reversed'.
        while (!stack.isEmpty()){
            reversed.append(stack.pop());
        }
        return reversed.toString().equals(lowercased);// Placeholder: Compare 'lowercased' with the reversed string.
    }

}
