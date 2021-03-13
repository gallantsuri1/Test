//Given an expression containing characters (,)  We have to write a code to check whether
// an input string has valid parentheses.
//        ((a+b) - (4+a))- True
//        {[]}) – False
//        {()}[] – True
//        )(-False
//        ()()()-True
//        ([]})- True

import java.util.*;

public class ExpressionMatcher {
    public static void main(String[] args) {
        //String str = "((a+b) - (4+a))";
        String[] inputs = new String[]{
        "((a+b) - (4+a))",
        "{[]})",
        "{()}[]e",
        ")(",
        "()()()",
        "([]})"
        };

        for (String str: inputs) {
            if (validate(str)) {
                System.out.println("Given string " + str + " is True");
            } else {
                System.out.println("Given string " + str + " is False");
            }
        }


    }
    public static boolean validate(String str) {
        char[] chars = str.toCharArray();
        List<String> list = new ArrayList<String>();
        try {
            for (char c : chars) {
                if (c == '(') list.add(String.valueOf(c));
                if (c == ')') list.remove(0);
            }
        } catch (Exception e) {
            // print exception or ignore index out of bounds
            return false;
        }
        return list.size() == 0 ? true : false;
    }
}
