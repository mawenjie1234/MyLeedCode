//package com.company.leetcode.editor.cn;
////数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
////
////
////
//// 示例：
////
//// 输入：n = 3
////输出：[
////       "((()))",
////       "(()())",
////       "(())()",
////       "()(())",
////       "()()()"
////     ]
////
//// Related Topics 字符串 回溯算法
//// 👍 1172 👎 0
//
//
//import java.util.ArrayList;
//import java.util.List;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//
//    public static void main(String[] args) {
//        List<String> res = new Solution().generateParenthesis(3);
//        for (String s: res) {
//            System.out.println(s);
//        }
//    }
//
//    public List<String> generateParenthesis(int n) {
//        List<String> res = new ArrayList<>();
//        helper(res, n, "", 0,0);
//
//        return res;
//    }
//
//    private void helper(List<String> res, int n, String currentS, int leftNum, int rightNum) {
//        if(currentS.length() == 2 * n) {
//            if(leftNum == n) {
//                res.add(currentS);
//            }
//            return;
//        }
//        if(leftNum < n) {
//            helper(res, n, currentS + '(', leftNum + 1, rightNum);
//        }
//        if(rightNum < leftNum) {
//            helper(res, n, currentS + ')', leftNum, rightNum + 1);
//        }
//    }
//
//
////    public List<String> generateParenthesis(int n) {
////        List<String> res = new ArrayList<>();
////        recur(0, 0, n, "", res);
////        return res;
////    }
////
////    private void recur(int left, int right, int n, String s, List<String> res) {
////        if (left == n && right == n) {
////            res.add(s);
////            return;
////        }
////
////        if (left < n) {
////            recur(left + 1, right, n, s + '(', res);
////        }
////        if (right < left) {
////            recur(left, right + 1, n, s + ')', res);
////        }
////    }
//
//
////    private void recur(int left, int right, int n, String s, List<String> res) {
////        // terminal
////        if(left == n && right == n) {
////            res.add(s);
////            return;
////        }
////        // process
////        if(left < n) {
////            recur(left +1, right, n, s + "(", res);
////        }
////        if(right < left) {
////            recur(left, right + 1, n, s+")", res);
////        }
////    }
//}
////leetcode submit region end(Prohibit modification and deletion)
