//package com.company.leetcode.editor.cn;
////给定一个字符串 S 和一个字符串 T，计算在 S 的子序列中 T 出现的个数。
////
//// 一个字符串的一个子序列是指，通过删除一些（也可以不删除）字符且不干扰剩余字符相对位置所组成的新字符串。（例如，"ACE" 是 "ABCDE" 的一个子序列
////，而 "AEC" 不是）
////
//// 题目数据保证答案符合 32 位带符号整数范围。
////
////
////
//// 示例 1：
////
//// 输入：S = "rabbbit", T = "rabbit"
////输出：3
////解释：
////
////如下图所示, 有 3 种可以从 S 中得到 "rabbit" 的方案。
////(上箭头符号 ^ 表示选取的字母)
////
////rabbbit
////^^^^ ^^
////rabbbit
////^^ ^^^^
////rabbbit
////^^^ ^^^
////
////
//// 示例 2：
////
//// 输入：S = "babgbag", T = "bag"
////输出：5
////解释：
////
////如下图所示, 有 5 种可以从 S 中得到 "bag" 的方案。
////(上箭头符号 ^ 表示选取的字母)
////
////babgbag
////^^ ^
////babgbag
////^^    ^
////babgbag
////^    ^^
////babgbag
////  ^  ^^
////babgbag
////    ^^^
//// Related Topics 字符串 动态规划
//// 👍 272 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    // 1
//    // 遍历t 中的每一个字母，在s中判断当前选择还是不选择，最后统计t结束后，s有多少个符合的
//    //
//
//
//    private int count = 0;
//
//    public static void main(String[] args) {
//        System.out.println(new Solution().numDistinct("rabbbit", "rabbit"));
//    }
//
//    public int numDistinct(String s, String t) {
//        dfs(s, t, "", 0, 0);
//        return count;
//    }
//
//    private void dfs(String s, String t, String currentS, int sIndex, int tIndex) {
//        // terminal
//        if (tIndex == t.length()) {
//            if (currentS.equals(t)) {
//                count++;
//            }
//            return;
//        }
//        if(sIndex >= s.length()) {
//            return;
//        }
//        // progress
//        // 检查字符串是否相同
//        for (int i = 0; i < currentS.length(); i++) {
//            if (currentS.charAt(i) != t.charAt(i)) {
//                return;
//            }
//        }
////        for (int i = tIndex + 1; i < t.length(); i++) {
//        // 选择
//        dfs(s, t, currentS + s.charAt(sIndex), sIndex + 1, tIndex + 1);
//        // 不选择
//        dfs(s, t, currentS, sIndex + 1, tIndex);
////        }
//        // down
//
//        // recover
//    }
//
//
//}
////leetcode submit region end(Prohibit modification and deletion)
