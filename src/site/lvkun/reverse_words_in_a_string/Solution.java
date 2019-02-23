package site.lvkun.reverse_words_in_a_string;

public class Solution {
    public String reverseWords(String s) {
        char[] string = s.toCharArray();
        return reverseWords(string);
    }

    private String reverseWords(char[] string) {
        reverseWords(string, 0, string.length - 1);

        int wordEnd = 0;
        for (int i = 0; i < string.length; i++) {
            if (string[i] != ' ') {
                if (wordEnd != 0) {
                    string[wordEnd++] = ' ';
                }

                int j = i;
                while (j < string.length && string[j] != ' ') {
                    string[wordEnd++] = string[j++];
                }

                reverseWords(string, wordEnd - (j - i), wordEnd - 1);
                i = j;
            }
        }

        return new String(string, 0, wordEnd);
    }

    private void reverseWords(char[] string, int start, int end) {
        while (start <= end) {
            swap(string, start, end);
            start++;
            end--;
        }
    }

    private void swap(char[] string, int i, int j) {
        char temp = string[i];
        string[i] = string[j];
        string[j] = temp;
    }
}