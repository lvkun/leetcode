package site.lvkun.leetcode.construct_binary_tree_from_inorder_and_postorder_traversal;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.leetcode.common.TreeNode;

import static site.lvkun.leetcode.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testBuildTree() {
        Solution solution = new Solution();
        TreeNode node = solution.buildTree(array(9,3,15,20,7),
                array(9,15,7,20,3));
        Assert.assertEquals("[3,9,20,null,null,15,7]", node.toString());
    }
}
