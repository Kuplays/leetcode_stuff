package string_problems;

public class LongestLastWordProblem {
    //https://leetcode.com/problems/length-of-last-word/description/
    public static int lengthOfLastWord(String s) {
        int sizeCounter = 0;
        boolean foundWord = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c != ' ') {
                foundWord = true;
                sizeCounter++;
            }
            if (foundWord && c == ' ') break;
        }
        return sizeCounter;
    }
}
