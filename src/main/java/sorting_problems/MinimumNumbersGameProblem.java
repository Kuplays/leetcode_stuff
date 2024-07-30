package sorting_problems;

import java.util.Arrays;

public class MinimumNumbersGameProblem {
    //https://leetcode.com/problems/minimum-number-game/description/
    public static int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }
        return nums;
    }
}
