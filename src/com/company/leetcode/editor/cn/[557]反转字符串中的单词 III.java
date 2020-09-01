//package com.company.leetcode.editor.cn;
////给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
////
////
////
//// 示例：
////
//// 输入："Let's take LeetCode contest"
////输出："s'teL ekat edoCteeL tsetnoc"
////
////
////
////
//// 提示：
////
////
//// 在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
////
//// Related Topics 字符串
//// 👍 238 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public static void main(String[] args) {
//        System.out.print(new Solution().reverseWords("Let's take LeetCode contest"));
//    }
//
//    public String reverseWords(String s) {
//        if (s == null || s.length() <= 1) {
//            return s;
//        }
//        StringBuilder res = new StringBuilder(s.length());
//        int i = 0;
//        while (i < s.length()) {
//            int start = i;
//            while (i < s.length() && s.charAt(i) != ' ') {
//                i++;
//            }
//            for (int p = start; p < i; p++) {
//                res.append(s.charAt(start + i - p - 1));
//
//            }
//            while (i < s.length() && s.charAt(i) == ' ') {
//                res.append(' ');
//                i++;
//            }
//        }
//        return res.toString();
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
