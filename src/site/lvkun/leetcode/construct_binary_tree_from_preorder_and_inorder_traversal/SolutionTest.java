package site.lvkun.leetcode.construct_binary_tree_from_preorder_and_inorder_traversal;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.leetcode.common.TreeNode;

import static site.lvkun.leetcode.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testBuildTree() {
        Solution solution = new Solution();

        TreeNode node = solution.buildTree(array(3,9,20,15,7), array(9,3,15,20,7));
        Assert.assertEquals("[3,9,20,null,null,15,7]", node.toString());
    }
}
