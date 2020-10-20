//package com.company.leetcode.editor.cn;
////给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。
////
//// '.' 匹配任意单个字符
////'*' 匹配零个或多个前面的那一个元素
////
////
//// 所谓匹配，是要涵盖 整个 字符串 s的，而不是部分字符串。
////
//// 说明:
////
////
//// s 可能为空，且只包含从 a-z 的小写字母。
//// p 可能为空，且只包含从 a-z 的小写字母，以及字符 . 和 *。
////
////
//// 示例 1:
////
//// 输入:
////s = "aa"
////p = "a"
////输出: false
////解释: "a" 无法匹配 "aa" 整个字符串。
////
////
//// 示例 2:
////
//// 输入:
////s = "aa"
////p = "a*"
////输出: true
////解释: 因为 '*' 代表可以匹配零个或多个前面的那一个元素, 在这里前面的元素就是 'a'。因此，字符串 "aa" 可被视为 'a' 重复了一次。
////
////
//// 示例 3:
////
//// 输入:
////s = "ab"
////p = ".*"
////输出: true
////解释: ".*" 表示可匹配零个或多个（'*'）任意字符（'.'）。
////
////
//// 示例 4:
////
//// 输入:
////s = "aab"
////p = "c*a*b"
////输出: true
////解释: 因为 '*' 表示零个或多个，这里 'c' 为 0 个, 'a' 被重复一次。因此可以匹配字符串 "aab"。
////
////
//// 示例 5:
////
//// 输入:
////s = "mississippi"
////p = "mis*is*p*."
////输出: false
//// Related Topics 字符串 动态规划 回溯算法
//// 👍 1509 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//
//    public static void main(String[] args) {
//        System.out.println(new Solution().isMatch("aab", "c*a*b"));
//        System.out.println(new Solution().isMatch("aa", "*a"));
//    }
//
//
//    /**
//     *
//     * @param s
//     * @param p
//     * @return
//     *
//     * 构造一个二维表，一般两个字符串都是这样，
//     * (m + 1) * (n + 1) 表示第n个位置是否可以匹配
//     * 00 表示两个都没有选择，所以是true
//     * 0* 表示s没有选择，无论p有多少个，都没有用，都是false
//     * 只要p是 '.' 就表示可以随意个，所以无论如何都返回true
//     *
//     * if('*') 表示当前和前一个可以是0个和无穷个，所以这两个可以直接放弃， ij 第一层就可以从前面 j-2 赋值
//     *
//     *然后判断 是否相同，来判断*之前的是否有相同，
//     *
//     */
//    public boolean isMatch(String s, String p) {
//        int m = s.length();
//        int n = p.length();
//        boolean[][] res = new boolean[m + 1][n + 1];
//        res[0][0] = true;
//        for (int i = 0; i <= m; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (p.charAt(j - 1) == '*') {
//                    if (j > 1) {
//                        res[i][j] = res[i][j - 2];
//                    } else {
//                        res[i][j] = false;
//                    }
//                    if (match(s, p, i, j - 1)) {
//                        res[i][j] = res[i][j] || res[i - 1][j];
//                    }
//
//                } else {
//                    res[i][j] = match(s, p, i, j) && res[i - 1][j - 1];
//                }
//            }
//        }
//
//
//        return res[m][n];
//    }
//
//    private boolean match(String s, String p, int sIndex, int pIndex) {
//        if (sIndex == 0 || pIndex == 0) {
//            return false;
//        }
//        if (p.charAt(pIndex - 1) == '.') {
//            return true;
//        }
//        return s.charAt(sIndex - 1) == p.charAt(pIndex - 1);
//    }
//
//
////    public boolean isMatch(String s, String p) {
////        int m = s.length();
////        int n = p.length();
////        boolean res[][] = new boolean[m + 1][n + 1];
////        res[0][0] = true;
////        for (int i = 0; i <= m; i++) {
////            for (int j = 1; j <= n; j++) {
////                if (p.charAt(j - 1) == '*') {
////                    if (j > 1) {
////                        res[i][j] = res[i][j - 2];
////                    }else {
////                        res[i][j] = false;
////                        continue;
////                    }
////                    if (match(s, p, i, j - 1)) {
////                        res[i][j] = res[i][j] || res[i - 1][j];
////                    }
////                } else {
////                    res[i][j] = match(s, p, i, j) && res[i - 1][j - 1];
////                }
////            }
////        }
////        return res[m][n];
////    }
////
////    private boolean match(String s, String p, int i, int j) {
////        if (i == 0 || j == 0) {
////            return false;
////        }
////        if (p.charAt(j - 1) == '.') {
////            return true;
////        }
////        return s.charAt(i - 1) == p.charAt(j - 1);
////    }
//
//
////    public boolean isMatch(String s, String p) {
////        int m = s.length();
////        int n = p.length();
////        boolean[][] res = new boolean[m + 1][n + 1];
////        res[0][0] = true;
////        for (int i = 0; i <= m; i++) {
////            for (int j = 1; j <= n; j++) {
////                if (p.charAt(j - 1) == '*') {
////                    if (j > 1) {
////                        res[i][j] = res[i][j - 2];
////                    }else {
////                        res[i][j] = false;
////                    }
////                    if (match(s, p, i, j - 1)) {
////                        res[i][j] = res[i][j] || res[i - 1][j];
////                    }
////                } else {
////                    res[i][j] = match(s, p, i, j) && res[i - 1][j - 1];
////                }
////            }
////        }
////        return res[m][n];
////    }
////
////    private boolean match(String s, String p, int i, int j) {
////        if (i == 0) {
////            return false;
////        }
////        if(j == 0) {
////            return false;
////        }
////        if (p.charAt(j - 1) == '.') {
////            return true;
////        }
////        return s.charAt(i - 1) == p.charAt(j - 1);
////    }
//
//
//    /**
//     * 状态转移方程
//     * p[j] != '*'  res[i][j] = match(i,j) && res[i-1][j-1]
//     *
//     * p[j] == '*'
//     *     if match(i,j) res[i][j] = res[i-1][j] || res[i][j]
//     *     else  res[i][j] = res[i][j-2], p不匹配，将p的字母加*组合都去掉
//     *
//     * @param s
//     * @param p
//     * @return
//     */
////    public boolean isMatch(String s, String p) {
////        int m = s.length();
////        int n = p.length();
////        boolean[][] res = new boolean[m + 1][n + 1];
////        res[0][0] = true;
////        for (int i = 0; i <= m; i++) {
////            for (int j = 1; j <= n; j++) {
////                if (p.charAt(j - 1) == '*') {
////                    res[i][j] = res[i][j - 2];
////                    if (match(s, p, i, j - 1)) {
////                        res[i][j] = res[i][j] || res[i - 1][j];
////                    }
////                } else {
////                    res[i][j] = match(s, p, i, j) && res[i - 1][j - 1];
////                }
////            }
////        }
////        return res[m][n];
////    }
////
////    /**
////     * 第 j 个是. 就一定相等
////     * 判断 i j 是否相同
////     */
////    private boolean match(String s, String p, int i, int j) {
////        if (i == 0) {
////            return false;
////        }
////        if (p.charAt(j - 1) == '.') {
////            return true;
////        }
////        return s.charAt(i - 1) == p.charAt(j - 1);
////    }
//}
////leetcode submit region end(Prohibit modification and deletion)
