package site.lvkun.simplify_path;

import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {
        Stack<String> pathList = new Stack<>();
        for (String dir : path.split("/")) {
            if (dir.contentEquals(".") || dir.length() == 0) {
                continue;
            }

            if (dir.contentEquals("..")) {
                if (!pathList.isEmpty()) {
                    pathList.pop();
                }
            } else {
                pathList.push(dir);
            }
        }

        return "/" + String.join("/", pathList);
    }
}
