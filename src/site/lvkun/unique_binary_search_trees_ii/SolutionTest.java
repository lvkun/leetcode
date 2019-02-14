package site.lvkun.unique_binary_search_trees_ii;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.common.TreeNode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SolutionTest {
    @Test
    public void testGenerateTrees() {
        Solution solution = new Solution();
        List<TreeNode> result = solution.generateTrees(3);

        Set<String> resultSet = new HashSet<>();
        for (TreeNode node : result) {
            resultSet.add(node.toString());
        }

        Set<String> expectedSet = new HashSet<>();
        expectedSet.add("[1,null,3,2]");
        expectedSet.add("[3,2,null,1]");
        expectedSet.add("[3,1,null,null,2]");
        expectedSet.add("[2,1,3]");
        expectedSet.add("[1,null,2,null,3]");

        Assert.assertEquals(expectedSet, resultSet);
    }
}
