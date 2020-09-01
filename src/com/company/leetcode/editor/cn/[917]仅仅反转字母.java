//package com.company.leetcode.editor.cn;
////给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。
////
////
////
////
////
////
//// 示例 1：
////
//// 输入："ab-cd"
////输出："dc-ba"
////
////
//// 示例 2：
////
//// 输入："a-bC-dEf-ghIj"
////输出："j-Ih-gfE-dCba"
////
////
//// 示例 3：
////
//// 输入："Test1ng-Leet=code-Q!"
////输出："Qedo1ct-eeLg=ntse-T!"
////
////
////
////
//// 提示：
////
////
//// S.length <= 100
//// 33 <= S[i].ASCIIcode <= 122
//// S 中不包含 \ or "
////
//// Related Topics 字符串
//// 👍 60 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
////    public static void main(String[] args) {
////        System.out.print(new Solution().reverseOnlyLetters("a-bC-dEf-ghIj"));
//////        System.out.print(new Solution().reverseOnlyLetters("7_28]"));
////    }
//
//    public String reverseOnlyLetters(String S) {
//        if (S == null || S.length() <= 1) {
//            return S;
//        }
//        char[] chars = S.toCharArray();
//        for (int i = 0, j = chars.length - 1; i < j;) {
//            if(!((chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'Z')))  {
//                i++;
//                continue;
//            }
//            if(!((chars[j] >= 'a' && chars[j] <= 'z') || (chars[j] >= 'A' && chars[j] <= 'Z')))  {
//                j--;
//                continue;
//            }
//            char temp = chars[i];
//            chars[i] = chars[j];
//            chars[j] = temp;
//            i++;
//            j--;
//        }
//        return String.copyValueOf(chars);
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
