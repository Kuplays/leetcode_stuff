package array_problems;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleProblem {
    //https://leetcode.com/problems/pascals-triangle/
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resultList = new ArrayList<>();

        int[][] pascalTriangle = new int[numRows][numRows];
        for (int i = 0; i < numRows; i++)
            pascalTriangle[i][0] = 1;
        for (int i = 1; i < numRows; i++) {
            for (int j = 1; j < numRows; j++) {
                pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
            }
        }
        for (int i = 0; i < numRows; i++) {
            List<Integer> rowToAdd = new ArrayList<>();
            int j = 0;
            while (j < numRows && pascalTriangle[i][j] != 0) {
                rowToAdd.add(pascalTriangle[i][j]);
                j++;
            }
            resultList.add(rowToAdd);
        }
        return resultList;
    }
}
