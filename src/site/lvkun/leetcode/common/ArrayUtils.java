package site.lvkun.leetcode.common;

import org.junit.Assert;

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

    public static String[] array(String... items) {
        return items;
    }

    public static char[][] matrixChar(String str) {
        str = str.replaceAll("\\[", "")
                .replaceAll("\\]", "");

        int row = 0;
        int col = 0;

        String[] lines = str.split("\n");
        for (String line : lines) {
            if (line.length() > 0) {
                row++;
                String[] items = line.split(",");
                col = items.length;
            }
        }
        char[][] result = new char[row][col];

        row = 0;
        col = 0;
        for (String line : str.split("\n")) {
            if (line.length() > 0) {
                String[] items = line.split(",");

                for (String item : items) {
                    item = item.replaceAll("\"", "");
                    result[row][col] = item.trim().charAt(0);
                    col++;
                }
                col = 0;
                row++;
            }
        }
        return result;
    }

    public static int[][] matrixInt(String str) {
        str = str.replaceAll("\\[", "")
                .replaceAll("\\]", "");

        int row = 0;
        int col = 0;

        String[] lines = str.split("\n");
        for (String line : lines) {
            if (line.length() > 0) {
                row++;
                String[] items = line.split(",");
                col = items.length;
            }
        }
        int[][] result = new int[row][col];

        row = 0;
        col = 0;
        for (String line : str.split("\n")) {
            if (line.length() > 0) {
                String[] items = line.split(",");
                for (String item : items) {
                    result[row][col] = Integer.parseInt(item.trim());
                    col++;
                }
                col = 0;
                row++;
            }
        }
        return result;
    }

    public static void assertMatrixEquals(int[][] expected, int[][] result) {
        Assert.assertEquals(expected.length, result.length);

        for (int i = 0; i < expected.length; i++) {
            Assert.assertArrayEquals(expected[i], result[i]);
        }
    }

    public static void assertMatrixEquals(char[][] expected, char[][] result) {
        Assert.assertEquals(expected.length, result.length);

        for (int i = 0; i < expected.length; i++) {
            Assert.assertArrayEquals(expected[i], result[i]);
        }
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

    public static void dump(int[][] matrix) {
        System.out.println("--------------------------------");
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < row.length; j ++) {
                System.out.print(row[j] + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> from(String s) {
        s = s.replaceAll("\\[", "")
                .replaceAll("\\]", "");

        List<List<Integer>> result = new ArrayList<>();
        for (String line : s.split("\n")) {
            if (line.length() > 0) {
                List<Integer> list = new ArrayList<>();
                for (String item : line.split(",")) {
                    String value = item.trim();
                    if (value.length() > 0) {
                        list.add(Integer.parseInt(value));
                    }
                }
                result.add(list);
            }
        }

        return result;
    }
}
