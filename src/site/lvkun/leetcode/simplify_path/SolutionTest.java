package site.lvkun.leetcode.simplify_path;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testSimplifyPath() {
        Solution solution = new Solution();
        Assert.assertEquals("/home", solution.simplifyPath("/home/"));
        Assert.assertEquals("/", solution.simplifyPath("/../"));
        Assert.assertEquals("/home/foo", solution.simplifyPath("/home//foo/"));
        Assert.assertEquals("/c", solution.simplifyPath("/a/./b/../../c/"));
        Assert.assertEquals("/c", solution.simplifyPath("/a/../../b/../c//.//"));
        Assert.assertEquals("/a/b/c", solution.simplifyPath("/a//b////c/d//././/.."));
    }
}
