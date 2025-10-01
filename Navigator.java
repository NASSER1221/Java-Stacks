import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Navigator {

    /* TO-DO: Generate the return journey instructions.
           \*
           * @param forwardJourney A List of string instructions for the trip.
           * @return A List of string instructions for the return trip.
    */
    public List<String> traceBack(List<String> forwardJourney) {
        Stack<String> pathStack = new Stack<>();
        for (String step : forwardJourney) {
            pathStack.push(step);
        }

        List<String> returnJourney = new ArrayList<>();
        while (!pathStack.isEmpty()) {
            String currentStep = pathStack.pop();
            String oppositeStep = getOppositeStep(currentStep);
            returnJourney.add(oppositeStep);
        }
        return returnJourney;

    }


    /**
     * TO-DO: Implement the logic to find the opposite of a navigation step.
     */
    private String getOppositeStep(String step) {
        // Your code here. Use if/else if or a switch statement.
        // Check for "LEFT", "RIGHT", and strings that start with "TAKE EXIT".
        // For the roundabout, you'll need to extract the exit number.

        if (Objects.equals(step, "left") || Objects.equals(step, "LEFT")){
            return "Right";
        }
        else if (Objects.equals(step, "right") || Objects.equals(step, "RIGHT")){
            return "LEFT";
        }

        else{
            Pattern pattern= Pattern.compile("\\d+");
            Matcher matcher= pattern.matcher(step);
            String num = "";
            if (matcher.find()){
                 num=matcher.group();
            }
            return "Take the exit number: "+ num;
        }
    }
    public static void main(String[] args) {
        Navigator navigator = new Navigator();

        List<String> forwardJourney = new ArrayList<>();
        forwardJourney.add("LEFT");
        forwardJourney.add("RIGHT");
        forwardJourney.add("TAKE EXIT 2 ON ROUND ABOUT");
        forwardJourney.add("LEFT");
        forwardJourney.add("TAKE EXIT 5 ON ROUND ABOUT");

        System.out.println("Forward Journey: " + forwardJourney);

        List<String> returnJourney = navigator.traceBack(forwardJourney);

        System.out.println("Return Journey: " + returnJourney);
    }
}

