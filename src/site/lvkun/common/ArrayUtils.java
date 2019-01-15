package site.lvkun.common;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtils {
    public static List<Integer> from(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            result.add(arr[i]);
        }
        return result;
    }

    public static int[] array(int... items) {
        return items;
    }
}
