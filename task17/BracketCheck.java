package task17;

import java.util.Scanner;

public class BracketCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String brackets = s.nextLine();
        System.out.println(bracketCheck(brackets));
    }
    private static boolean bracketCheck(String brackets){
        char[] counter = brackets.toCharArray();
        int open = 0;
        int close = 0;

        for (char c : counter) {
            if (c == '(') {
                open += 1;
            } else if (c == ')') {
                close += 1;
            }
        }

        return open == close;
    }
}
