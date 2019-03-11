package site.lvkun.leetcode.binary_tree_right_side_view;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.leetcode.common.TreeNode;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    @Test
    public void testRightSideView() {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        List<Integer> result = solution.rightSideView(root);
        Assert.assertEquals(Arrays.asList(1, 3, 4), result);
    }
}
