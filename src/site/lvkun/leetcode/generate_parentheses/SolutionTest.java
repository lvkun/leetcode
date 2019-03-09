package site.lvkun.leetcode.generate_parentheses;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SolutionTest {
    @Test
    public void testGenerateParenthesis() {
        Solution solution = new Solution();
        List<String> result = solution.generateParenthesis(3);
        Set<String> expectResult = new HashSet<>();
        expectResult.add("((()))");
        expectResult.add("(()())");
        expectResult.add("(())()");
        expectResult.add("()(())");
        expectResult.add("()()()");
        Assert.assertEquals(expectResult, new HashSet<>(result));
    }
}
