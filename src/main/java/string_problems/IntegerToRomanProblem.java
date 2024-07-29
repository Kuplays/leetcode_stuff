package string_problems;

import java.util.HashMap;

public class IntegerToRomanProblem {
    HashMap<Integer, String> table;
    public IntegerToRomanProblem() {
        table = new HashMap<>();
        table.put(1000, "M");
        table.put(500, "D");
        table.put(100, "C");
        table.put(50, "L");
        table.put(10, "X");
        table.put(5, "V");
        table.put(1, "I");
    }
    //https://leetcode.com/problems/integer-to-roman/description/
    public String intToRoman(int num) {
        StringBuilder romanString = new StringBuilder();
        String valAsString = String.valueOf(num);
        int repeatTimes = (int) (1 * Math.pow(10, valAsString.length() - 1));
        for (int i = 0; i < valAsString.length(); i++) {
            romanString.append(recursiveBuilder(valAsString.charAt(i) - '0', repeatTimes));
            repeatTimes = Math.floorDiv(repeatTimes, 10);
        }
        return romanString.toString();
    }

    private String recursiveBuilder(int digit, int numOfRepeats) {
        if (digit == 4 || digit == 9) {
            return recursiveBuilder(1, numOfRepeats) + recursiveBuilder(digit + 1, numOfRepeats);
        } else if (digit == 6 || digit == 7 || digit == 8) {
            return recursiveBuilder(digit - 1, numOfRepeats) + recursiveBuilder(1, numOfRepeats);
        } else if (digit == 2 || digit == 3) {
            return recursiveBuilder(1, numOfRepeats) + recursiveBuilder(digit - 1, numOfRepeats);
        } else if (digit == 0) return "";

        return table.get(digit * numOfRepeats);
    }
}
