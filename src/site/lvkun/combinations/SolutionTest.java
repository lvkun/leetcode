package site.lvkun.combinations;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SolutionTest {
    public Set<List<Integer>> from(String s) {
        s = s.replaceAll("\\[", "")
                .replaceAll("\\]", "");

        Set<List<Integer>> result = new HashSet<>();
        for (String line : s.split("\n")) {
            if (line.length() > 0) {
                List<Integer> list = new ArrayList<>();
                for (String item : line.split(",")) {
                    list.add(Integer.parseInt(item.trim()));
                }
                result.add(list);
            }
        }

        return result;
    }

    @Test
    public void testCombine() {
        Solution solution = new Solution();
        List<List<Integer>> resultList = solution.combine(4, 2);
        Set<List<Integer>> resultSet = new HashSet<>(resultList);
        Set<List<Integer>> expected = from("[\n" +
                "  [2,4],\n" +
                "  [3,4],\n" +
                "  [2,3],\n" +
                "  [1,2],\n" +
                "  [1,3],\n" +
                "  [1,4],\n" +
                "]");

        Assert.assertEquals(expected, resultSet);
    }
}
