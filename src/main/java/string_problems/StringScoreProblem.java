package string_problems;

public class StringScoreProblem {
    //https://leetcode.com/problems/score-of-a-string/description/
    public static int scoreOfString(String s) {
        char[] chars = s.toCharArray();
        int abs_sum = 0;
        if (chars.length == 2)
            return Math.abs(chars[0] - chars[1]);
        char last_char = chars[0];
        for (int i = 1; i < chars.length; i++) {
            abs_sum += Math.abs(last_char - chars[i]);
            last_char = chars[i];
        }
        return abs_sum;
    }
}
