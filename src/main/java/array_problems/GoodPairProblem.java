package array_problems;

import java.util.*;
import java.util.stream.Collectors;

public class GoodPairProblem {
    //https://leetcode.com/problems/number-of-good-pairs/description/
    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> frequencies = new HashMap<>();
        int numOfGoodPairs = 0;
        for (int num: nums)
            frequencies.merge(num, 1, Integer::sum);
        for (int key : frequencies.keySet()) {
            int occurences = frequencies.get(key);
            numOfGoodPairs += occurences * (occurences - 1) / 2;
        }
        return numOfGoodPairs;
    }
}
