package site.lvkun.leetcode.maximal_square;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testMaximalSquare() {
        Solution solution = new Solution();
        char[][] matrix = fromString("" +
                "1 0 1 0 0\n" +
                "1 0 1 1 1\n" +
                "1 1 1 1 1\n" +
                "1 0 0 1 0");
        Assert.assertEquals(4, solution.maximalSquare(matrix));
    }

    private char[][] fromString(String matrix) {
        String[] lines = matrix.split("\n");
        int row = lines.length;

        char[][] result = new char[row][];
        for (int i = 0; i < row; i++) {
            String[] items = lines[i].split(" ");
            result[i] = new char[items.length];

            for (int j = 0; j < items.length; j++) {
                result[i][j] = items[j].charAt(0);
            }
        }

        return result;
    }
}
