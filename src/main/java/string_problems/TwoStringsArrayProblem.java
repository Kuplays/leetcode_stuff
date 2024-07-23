package string_problems;

public class TwoStringsArrayProblem {
    //https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder b1 = new StringBuilder();
        StringBuilder b2 = new StringBuilder();
        int firstLength = word1.length, secondLength = word2.length;
        int maxSize = Math.max(firstLength, secondLength);
        for (int i = 0; i < maxSize; i++) {
            if (i < firstLength && i < secondLength) {
                b1.append(word1[i]);
                b2.append(word2[i]);
            } else if (i < secondLength) {
                b2.append(word2[i]);
            } else {
                b1.append(word1[i]);
            }
        }
        return b1.compareTo(b2) == 0;
    }
}
