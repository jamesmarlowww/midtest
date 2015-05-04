import java.util.Stack;

/* Question 1: Deteching if all brackets in the given string are matching
*/

public class ExpProcessor{

    /**
     * You need to complete this method using the Stack data structure
     */
	public static void bracket(String str){
    /////write your code below
    
    /////Write your code above
	}


    //You should not modify the main method in anyway    
	public static void main(String[] args){
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
