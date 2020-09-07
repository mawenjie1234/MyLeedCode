//package com.company.leetcode.editor.cn;
////给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
////
//// 示例 1：
////
//// 输入: "babad"
////输出: "bab"
////注意: "aba" 也是一个有效答案。
////
////
//// 示例 2：
////
//// 输入: "cbbd"
////输出: "bb"
////
//// Related Topics 字符串 动态规划
//// 👍 2637 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public static void main(String[] args) {
//        System.out.print(new Solution().longestPalindrome("babad"));
//    }
//
//    public String longestPalindrome(String s) {
//        int n = s.length();
//        String ans = "";
//        boolean[][] dp = new boolean[n][n];
//        for (int l = 0; l < n; l++) {
//            for (int i = 0; i + l < n; i++) {
//                int j = i + l;
//                if (l == 0) {
//                    dp[i][j] = true;
//                } else {
//                    boolean isSame = s.charAt(i) == s.charAt(j);
//                    if (j == 1) {
//                        dp[i][j] = isSame;
//                    } else {
//                        dp[i][j] = isSame && dp[i + 1][j - 1];
//                    }
//                }
//                if (dp[i][j] && i + l + 1 > ans.length()) {
//                    ans = s.substring(i, j + 1);
//                }
//            }
//        }
//        return ans;
//    }
//
//
////    public String longestPalindrome(String s) {
////        int n = s.length();
////        String ans = "";
////        boolean[][] dp = new boolean[n][n];
////        for (int l = 0; l < n; l++) {
////            for (int i = 0; i + l < n; i++) {
////                int j = i + l;
////                if (l == 0) {
////                    dp[i][j] = true;
////                } else {
////                    boolean isSame = s.charAt(i) == s.charAt(j);
////                    if (l == 1) {
////                        dp[i][j] = isSame;
////                    } else {
////                        dp[i][j] = (isSame && dp[i + 1][j - 1]);
////                    }
////                }
////                if (dp[i][j] && i + l + 1 > ans.length()) {
////                    ans = s.substring(i, i + l + 1);
////                }
////            }
////        }
////        return ans;
////    }
//
//}
////leetcode submit region end(Prohibit modification and deletion)
