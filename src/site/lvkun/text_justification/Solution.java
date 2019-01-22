package site.lvkun.text_justification;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private void appendSpace(StringBuilder builder, int num) {
        for (int i = 0; i < num; i++) {
            builder.append(' ');
        }
    }

    private String build(String[] words, int start, int end, int leftspaces) {
        StringBuilder builder = new StringBuilder();
        if (start == end) {
            builder.append(words[start]);
            appendSpace(builder, leftspaces);
            return builder.toString();
        }

        int spots = end - start;
        int each = leftspaces / spots;
        int left = leftspaces % spots;

        for (int i = start; i <= end; i++) {
            builder.append(words[i]);

            if (i != end) {
                appendSpace(builder, each + (left > 0 ? 1 : 0));
                left--;
            }
        }

        return builder.toString();
    }

    private String buildLastLine(String[] words, int start, int end, int leftspaces) {
        StringBuilder builder = new StringBuilder();
        for (int i = start; i <= end; i++) {
            builder.append(words[i]);
            builder.append(' ');
            leftspaces--;
        }

        appendSpace(builder, leftspaces);

        return builder.toString();
    }

    public List<String> fullJustify(String[] words, int maxWidth) {
        int lineLength = 0;
        int wordLength = 0;
        int lastIndex = 0;
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (lineLength + word.length() + 1 > maxWidth) {
                resultList.add(build(words, lastIndex, i - 1, maxWidth - wordLength));

                lastIndex = i;
                lineLength = word.length();
                wordLength = word.length();
            } else {
                lineLength += word.length() + 1;
                wordLength += word.length();
            }
        }

        resultList.add(buildLastLine(words, lastIndex, words.length - 1, maxWidth - wordLength));

        return resultList;
    }
}