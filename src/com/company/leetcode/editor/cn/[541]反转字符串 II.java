//package com.company.leetcode.editor.cn;
////给定一个字符串 s 和一个整数 k，你需要对从字符串开头算起的每隔 2k 个字符的前 k 个字符进行反转。
////
////
//// 如果剩余字符少于 k 个，则将剩余字符全部反转。
//// 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
////
////
////
////
//// 示例:
////
//// 输入: s = "abcdefg", k = 2
////输出: "bacdfeg"
////
////
////
////
//// 提示：
////
////
//// 该字符串只包含小写英文字母。
//// 给定字符串的长度和 k 在 [1, 10000] 范围内。
////
//// Related Topics 字符串
//// 👍 89 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public static void main(String[] args) {
////        System.out.print(new Solution().reverseStr("abcdefg", 2));
////        System.out.print(new Solution().reverseStr("abcdefg", 3));
////        System.out.print(new Solution().reverseStr("abcd", 4));
//    }
//
//    public String reverseStr(String s, int k) {
//        if (k == 0 || s == null || s.length() == 0) {
//            return s;
//        }
//        char[] chars = s.toCharArray();
//        int index = 0;
//        while (index < s.length() - 1) {
//            int oriIndex = index;
//            int j = index + k - 1;
//            j = Math.min(j, s.length() - 1);
//            for (; index < j; index++, j--) {
//                char temp = chars[index];
//                chars[index] = chars[j];
//                chars[j] = temp;
//            }
//            index = oriIndex + 2 * k;
//        }
//        return String.copyValueOf(chars);
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
