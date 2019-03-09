package site.lvkun.leetcode.restore_ip_addresses;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    @Test
    public void testRestoreIpAddresses() {
        Solution solution = new Solution();
        List<String> result = solution.restoreIpAddresses("25525511135");
        List<String> expected = Arrays.asList("255.255.11.135", "255.255.111.35");
        Assert.assertEquals(expected, result);
    }
}
