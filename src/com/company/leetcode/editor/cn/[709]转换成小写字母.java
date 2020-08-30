//package com.company.leetcode.editor.cn;
////实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
////
////
////
//// 示例 1：
////
////
////输入: "Hello"
////输出: "hello"
////
//// 示例 2：
////
////
////输入: "here"
////输出: "here"
////
//// 示例 3：
////
////
////输入: "LOVELY"
////输出: "lovely"
////
//// Related Topics 字符串
//// 👍 131 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//
////    public static void main(String[] args) {
////        System.out.print(new Solution().toLowerCase("al&phaBET"));
////    }
//
//
//    public String toLowerCase(String str) {
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < str.length(); i++) {
//            char s = str.charAt(i);
//            if(s >= 'A' && s <= 'Z') {
//                builder.append((char)(s + 32));
//            }else{
//                builder.append(s);
//            }
//        }
//        return builder.toString();
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
