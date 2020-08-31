//package com.company.leetcode.editor.cn;
////编写一个函数来查找字符串数组中的最长公共前缀。
////
//// 如果不存在公共前缀，返回空字符串 ""。
////
//// 示例 1:
////
//// 输入: ["flower","flow","flight"]
////输出: "fl"
////
////
//// 示例 2:
////
//// 输入: ["dog","racecar","car"]
////输出: ""
////解释: 输入不存在公共前缀。
////
////
//// 说明:
////
//// 所有输入只包含小写字母 a-z 。
//// Related Topics 字符串
//// 👍 1234 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
////    public static void main(String[] args) {
////        String[] str = {"flower","flow","flight"};
////        String[] str1 = {"dog","racecar","car"};
////
////        System.out.println(new Solution().longestCommonPrefix(str1));
////    }
//
//    public String longestCommonPrefix(String[] strs) {
//        if(strs.length  == 0 ) {
//            return "";
//        }
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < strs[0].length(); i++) {
//            char first = strs[0].charAt(i);
//            for (int j = 0; j < strs.length; j++) {
//                if(strs[j].length() <= i) {
//                    return builder.toString();
//                }
//                if(strs[j].charAt(i) != first) {
//                    return builder.toString();
//                }
//            }
//            builder.append(first);
//        }
//
//        return strs[0];
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
