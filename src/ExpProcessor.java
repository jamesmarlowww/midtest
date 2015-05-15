import java.util.EmptyStackException;
import java.util.Stack;
import java.util.regex.Pattern;

/* Question 1: Deteching if all brackets in the given string are matching
james marlow 1249807
*/

public class ExpProcessor {
    /**
     * You need to complete this method using the Stack data structure
     */
    public static void bracket(String str) {
        /////write your code below
        String good = "The parentheses are matching";
        String bad = "The parentheses are not matching";

        String[] sSplit = str.split("");

        if (str.matches(".*[a-z].*")) {
            System.out.println("Invalid string");
            return;
        }


        // odd number makes it false
        if ((str.length() % 2) != 0) {
            System.out.println("The parentheses are not matching");
            return;
        }
        //instantiate a stack of strings
        Stack<String> stack = new Stack<>();
        //keep looping, while balanced and not at end of string
        for (int i = 0; i < str.length(); i++) {
            //isolate each character
            String character = str.substring(i, i + 1);
            //if left brace, push on stack
            if (character.equals("{") || character.equals("(") || character.equals("<") || character.equals("[")) {
                stack.push(character);
            }
            //if right brace, pop stack.
            // also check that brackets are not closed illegally
            else if (character.equals("}") || character.equals(")") || character.equals(">") || character.equals("]")) {
                if((stack.peek().equals("<") && !character.equals(">")) || (stack.peek().equals("(") && !character.equals(")"))
                        || (stack.peek().equals("{") && !character.equals("}")) || stack.peek().equals("[") && !character.equals("]")) {
                    System.out.println(bad);
                    return;
                }
                String brace = stack.pop();
            }
        }

        if(stack.isEmpty()) {
            System.out.println(good);
            return;
        } else {
            System.out.println(bad);
        }



        /////Write your code above
    }


    //You should not modify the main method in anyway    
    public static void main(String[] args) {
        bracket("((((()()()");
        bracket("{((<>))[][](())}");
        bracket("<(())()()(( )))");
        bracket("([<>][[{ }] ])");
        bracket("((<<))>>");
        bracket("(a)");

        /**Expected Output:
         *The parentheses are not matching
         *The parentheses are matching
         *The parentheses are not matching
         *The parentheses are matching
         *The parentheses are not matching
         *Invalid String
         */
    }
}
