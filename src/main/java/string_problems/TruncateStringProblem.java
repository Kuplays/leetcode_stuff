package string_problems;

public class TruncateStringProblem {
    //https://leetcode.com/problems/truncate-sentence/description/
    public static String truncateSentence(String s, int k) {
        StringBuilder builder = new StringBuilder();
        int currentWordCounter = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                builder.append(c);
            }
            if (c == ' ' && currentWordCounter < k) {
                currentWordCounter++;
                builder.append(c);
            }
            if (currentWordCounter >= k) {
                builder.deleteCharAt(builder.length() - 1);
                break;
            }
        }
        return builder.toString();
    }
}
