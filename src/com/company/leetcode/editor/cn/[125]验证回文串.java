//package com.company.leetcode.editor.cn;
////给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
////
//// 说明：本题中，我们将空字符串定义为有效的回文串。
////
//// 示例 1:
////
//// 输入: "A man, a plan, a canal: Panama"
////输出: true
////
////
//// 示例 2:
////
//// 输入: "race a car"
////输出: false
////
//// Related Topics 双指针 字符串
//// 👍 266 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public static void main(String[] args) {
////        System.out.print(new Solution().isPalindrome("A man, a plan, a canal: Panama"));
////        System.out.print(new Solution().isPalindrome("race a car"));
//
//    }
//
//    public boolean isPalindrome(String s) {
//        if(s == null || s.length() <= 1) {
//            return true;
//        }
//        s = s.toLowerCase();
//        for (int i = 0, j = s.length() -1; i < j;) {
//            char is = s.charAt(i);
//            if(!((is >= 'a' && is <= 'z') || (is >= '0' && is <= '9'))) {
//                i++;
//                continue;
//            }
//            char js = s.charAt(j);
//            if(!((js >= 'a' && js <= 'z') || (js >= '0' && js <= '9'))) {
//                j--;
//                continue;
//            }
//            if(is == js) {
//                i++;
//                j--;
//            }else {
//                return false;
//            }
//        }
//        return true;
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
