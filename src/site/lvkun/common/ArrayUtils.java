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

    public static char[][] matrix(String str) {
        str = str.replaceAll("\\[", "")
                .replaceAll("\\]", "");

        char[][] result = null;
        int row = 0;
        int col = 0;
        for (String line : str.split("\n")) {
            if (line.length() > 0) {
                String[] items = line.split(",");
                if (result == null) {
                    result = new char[items.length][items.length];
                }

                for (String item : items) {
                    result[row][col] = item.trim().charAt(1);
                    col++;
                }
                col = 0;
                row++;
            }
        }
        return result;
    }

    public static void dump(char[][] matrix) {
        System.out.println("--------------------------------");
        for (int i = 0; i < matrix.length; i++) {
            char[] row = matrix[i];
            for (int j = 0; j < row.length; j ++) {
                System.out.print(row[j] + " ");
            }
            System.out.println();
        }
    }
}
