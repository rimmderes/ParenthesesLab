import java.util.Stack;

public class ParenthesesChecker {

    private ParenthesesChecker checker;

        // make a method called checkParentheses()
        // takes in a String
        // returns a boolean

        // return if the string contains "correct" pairs of parentheses
        // return false if not!

        // situations for return:
        // more opening or closing brackets of particular type (), <>, {}, []
        // closing bracket at start, opening one at end
        // opening bracket followed by two closing bracket

        // stack

    boolean checkParentheses(String testString) {
        Stack<Character> characterStack = new Stack<>();
        for (int i = 0; i < testString.length(); i++) {
            char x = testString.charAt(i);
            if (x == '(') {
                //        if (x == '(' || x == '[' || x == '{') {
                characterStack.push(x);
                if (characterStack.isEmpty()) {

                } else if ( !characterStack.empty() && (
                    testString.charAt(i) == ')'))

                characterStack.pop();

             else {
                    characterStack.push(testString.charAt(i));

                    if (characterStack.isEmpty()) {
                        return true;
                    }

                } } } return false; }}


//           for (char x :
//                   testString.toCharArray()) {
//               if (!Character.isLetter(x) && (x != ' ')) {
//                   characterStack.push(x);
//                   normalBraceCount += 1;
//               }
//
//               if(normalBraceCount %2==1) {
//                   return false;
//               } else if (normalBraceCount == 0) {
//                   return true;
//    static boolean checkParentheses(String testString) {
//        Stack stack = new Stack();
//        for (int i = 0; i < testString.length(); i++) {
//            char x = testString.charAt(i);
//            if (x == '(' || x == '[' || x == '{') {
//                stack.push(x);
//                continue;
//            }
//            if (stack.isEmpty()) return false;
//            char check;
//            switch (x) {
//                case ')':
//                    check = stack.pop();
//                    if (check == '{' || check == '[') return false;
//                    break;
//                case '}':
//                    check = stack.pop();
//                    if (check == '(' || check == '[') return false;
//                    break;
//                case ']':
//                    check = stack.pop();
//                    if (check == '(' || check == '{') return false;
//                    break;
//            }
//        }
//        return (stack.isEmpty());
//    }}
//









