package string_problems;

public class AnagramProblem {
    //https://leetcode.com/problems/valid-anagram/description/

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] appearanceCounter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            appearanceCounter[s.charAt(i) - 'a']++;
            appearanceCounter[t.charAt(i) - 'a']--;
        }
        for (int amount: appearanceCounter)
            if (amount != 0)
                return false;

        return true;
    }
}
