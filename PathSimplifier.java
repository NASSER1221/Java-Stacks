
import java.util.Stack;

public class PathSimplifier {

    /**
            * TO-DO: Simplify a Unix-style file path.
      * For example, "/a/./b/../../c/" should become "/c".
            * And "/../" should become "/".
            \*
            * @param path The absolute path string.
      * @return The simplified canonical path.
            */
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] components = path.split("/");

        // Your code here:
        // Iterate through the 'components'.
        // Use if/else if to handle "..", ".", and regular directory names.

        for (String s: components){



                if(s.equals("..")){
                    if (!stack.empty()) {
                        stack.pop();
                    }
                }
                else if(s.equals(".") || s.isEmpty()){
                    continue;
                }

                else{
                    stack.push(s);
                }
            }




        if (stack.isEmpty()) {
            return "/";
        }

        // Your code here:
        // Use a StringBuilder to join the elements in the stack
        // to form the final path string (e.g., "/dir1/dir2").
        StringBuilder dirct=new StringBuilder();
        for (String s:stack){
            dirct.append("/").append(s);
        }
        return dirct.toString(); // Placeholder
    }

    public static void main(String[] args) {
        PathSimplifier test = new PathSimplifier();

        // Test cases
        System.out.println(test.simplifyPath("/home/"));              // "/home"
        System.out.println(test.simplifyPath("/../"));                // "/"
        System.out.println(test.simplifyPath("/home//foo/"));         // "/home/foo"
        System.out.println(test.simplifyPath("/a/./b/../../c/"));     // "/c"
        System.out.println(test.simplifyPath("/a//b////c/d//././/.."));// "/a/b/c"

    }


}
