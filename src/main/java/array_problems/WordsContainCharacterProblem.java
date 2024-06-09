package array_problems;

import java.util.ArrayList;
import java.util.List;

public class WordsContainCharacterProblem {
    //https://leetcode.com/problems/find-words-containing-character/description/
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1)
                answer.add(i);
        }

        return answer;
    }
}
