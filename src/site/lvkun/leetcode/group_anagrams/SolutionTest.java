package site.lvkun.leetcode.group_anagrams;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SolutionTest {
    @Test
    public void testGroupAnagrams() {
        Solution solution = new Solution();
        List<List<String>> resultList = solution.groupAnagrams((String[]) Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat").toArray());

        Assert.assertEquals(3, resultList.size());
        HashSet<HashSet<String>> resultSet = new HashSet<>();
        for (List<String> result : resultList) {
            resultSet.add(new HashSet<>(result));
        }

        Assert.assertTrue(resultSet.contains(new HashSet<>(Arrays.asList("ate","eat","tea"))));
        Assert.assertTrue(resultSet.contains(new HashSet<>(Arrays.asList("nat","tan"))));
        Assert.assertTrue(resultSet.contains(new HashSet<>(Arrays.asList("bat"))));
    }
}
