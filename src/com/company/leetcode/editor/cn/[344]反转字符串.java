//package com.company.leetcode.editor.cn;
////编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
////
//// 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
////
//// 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
////
////
////
//// 示例 1：
////
//// 输入：["h","e","l","l","o"]
////输出：["o","l","l","e","h"]
////
////
//// 示例 2：
////
//// 输入：["H","a","n","n","a","h"]
////输出：["h","a","n","n","a","H"]
//// Related Topics 双指针 字符串
//// 👍 275 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
////    public static void main(String[] args) {
////        char[] ch = {'h','e','l','l','o'};
////        new Solution().reverseString(ch);
////        for (int i = 0; i < ch.length; i++) {
////            System.out.print(ch[i]);
////            System.out.print(',');
////        }
////    }
//
//    public void reverseString(char[] s) {
//        for (int i = 0, j = s.length -1; i < j ; i++, j--) {
//            char temp = s[i];
//            s[i] = s[j];
//            s[j] = temp;
//        }
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
