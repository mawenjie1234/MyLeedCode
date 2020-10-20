package com.company.leetcode.editor.cn;
//给定一个字符串 (s) 和一个字符模式 (p) ，实现一个支持 '?' 和 '*' 的通配符匹配。
//
// '?' 可以匹配任何单个字符。
//'*' 可以匹配任意字符串（包括空字符串）。
// 
//
// 两个字符串完全匹配才算匹配成功。 
//
// 说明: 
//
// 
// s 可能为空，且只包含从 a-z 的小写字母。 
// p 可能为空，且只包含从 a-z 的小写字母，以及字符 ? 和 *。 
// 
//
// 示例 1: 
//
// 输入:
//s = "aa"
//p = "a"
//输出: false
//解释: "a" 无法匹配 "aa" 整个字符串。 
//
// 示例 2: 
//
// 输入:
//s = "aa"
//p = "*"
//输出: true
//解释: '*' 可以匹配任意字符串。
// 
//
// 示例 3: 
//
// 输入:
//s = "cb"
//p = "?a"
//输出: false
//解释: '?' 可以匹配 'c', 但第二个 'a' 无法匹配 'b'。
// 
//
// 示例 4: 
//
// 输入:
//s = "adceb"
//p = "*a*b"
//输出: true
//解释: 第一个 '*' 可以匹配空字符串, 第二个 '*' 可以匹配字符串 "dce".
// 
//
// 示例 5: 
//
// 输入:
//s = "acdcb"
//p = "a*c?b"
//输出: false 
// Related Topics 贪心算法 字符串 动态规划 回溯算法 
// 👍 545 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public static void main(String[] args) {
//        System.out.println(new Solution().isMatch("aa", "a"));
        //System.out.println(new Solution().isMatch("adceb", "*a*b"));
        //System.out.println(new Solution().isMatch("acdcb", "a*c?b"));
        System.out.println(new Solution().isMatch("", "******"));
    }

//    public boolean isMatch(String s, String p) {
//
//    }


    // 递归，深度优先搜索，
    public boolean isMatch(String s, String p) {
        if(s.length() == 0 && p.length() == 0) {
            return true;
        }
//        if (s.length() == 0 && p.length() == 0) {
//            return true;
//        }
        return dfs(s, p, 0, 0);
    }

    private boolean dfs(String s, String p, int sIndex, int pIndex) {
        // terminal
        if (pIndex >= p.length()) {
            return false;
        }
        if (pIndex == p.length() - 1 && sIndex < p.length() - 1) {
            return false;
        }
        if (sIndex == s.length() - 1 && pIndex == p.length() - 1) {
            char lastP = p.charAt(pIndex);
            if (lastP == '?' || lastP == '*') {
                return true;
            } else if (p.charAt(pIndex) == s.charAt(sIndex)) {
                return true;
            } else {
                return false;
            }
        }

        // progress
        char currentP = p.charAt(pIndex);
        char currentS = s.charAt(sIndex);

        if (currentP == '?') {
            return dfs(s, p, sIndex + 1, pIndex + 1);
        } else if (currentP == '*') {
            // * 可以批评0 或者多个字符串
            // 0个 p ++
            // 只匹配 1 个 s++, p++
            // 匹配多个 s++, p
            return dfs(s, p, sIndex, pIndex + 1)
                    || dfs(s, p, sIndex + 1, pIndex + 1)
                    || dfs(s, p, sIndex + 1, pIndex);
        } else {
            if (currentP == currentS) {
                return dfs(s, p, sIndex + 1, pIndex + 1);
            } else {
                return false;
            }
        }

        // reverse
    }


}
//leetcode submit region end(Prohibit modification and deletion)
