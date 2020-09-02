//package com.company.leetcode.editor.cn;
////给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
////
//// 示例 1:
////
////
////输入: "aba"
////输出: True
////
////
//// 示例 2:
////
////
////输入: "abca"
////输出: True
////解释: 你可以删除c字符。
////
////
//// 注意:
////
////
//// 字符串只包含从 a-z 的小写字母。字符串的最大长度是50000。
////
//// Related Topics 字符串
//// 👍 254 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
////    public static void main(String[] args) {
////        System.out.print(new Solution().validPalindrome("abca"));
////    }
//
//    public boolean validPalindrome(String s) {
//        if (s == null || s.length() <= 1) {
//            return true;
//        }
//        int low = 0, height = s.length() - 1;
//        while (low < height) {
//            if (s.charAt(low) == s.charAt(height)) {
//                low++;
//                height--;
//            } else {
//                boolean flage1 = true, flage2 = true;
//                for (int i = low, j = height - 1; i < j; i++, j--) {
//                    if(s.charAt(i) != s.charAt(j)) {
//                        flage1 = false;
//                        break;
//                    }
//                }
//
//                for (int i = low+1, j = height; i < j; i++, j--) {
//                    if(s.charAt(i) != s.charAt(j)) {
//                        flage2 = false;
//                        break;
//                    }
//                }
//                return flage1 || flage2;
//            }
//        }
//        return true;
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
