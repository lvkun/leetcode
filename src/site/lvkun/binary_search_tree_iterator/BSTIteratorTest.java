package site.lvkun.binary_search_tree_iterator;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.common.TreeNode;

public class BSTIteratorTest {
    @Test
    public void testBSTIterator() {
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(3);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(20);

        BSTIterator iterator = new BSTIterator(root);
        Assert.assertEquals(3, iterator.next());
        Assert.assertEquals(7, iterator.next());
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals(9, iterator.next());
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals(15, iterator.next());
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals(20, iterator.next());
        Assert.assertFalse(iterator.hasNext());

    }
}
