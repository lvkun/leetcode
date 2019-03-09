package site.lvkun.leetcode.path_sum_ii;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.leetcode.common.TreeNode;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    @Test
    public void testPathSum() {
        Solution solution = new Solution();

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);

        List<List<Integer>> result = solution.pathSum(root, 22);
        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(5,4,11,2),
            Arrays.asList(5,8,4,5)
        );
        Assert.assertEquals(expected, result);
    }
}
