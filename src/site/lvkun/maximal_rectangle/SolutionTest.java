package site.lvkun.maximal_rectangle;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.common.ArrayUtils.matrixChar;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        String matrixStr = "[\n" +
                "  [\"1\",\"0\",\"1\",\"0\",\"0\"],\n" +
                "  [\"1\",\"0\",\"1\",\"1\",\"1\"],\n" +
                "  [\"1\",\"1\",\"1\",\"1\",\"1\"],\n" +
                "  [\"1\",\"0\",\"0\",\"1\",\"0\"]\n" +
                "]";
        char[][] matrix = matrixChar(matrixStr);
        int result = solution.maximalRectangle(matrix);

        Assert.assertEquals(6, result);
    }
}
