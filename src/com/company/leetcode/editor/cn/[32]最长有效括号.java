//package com.company.leetcode.editor.cn;//给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。
////
//// 示例 1:
////
//// 输入: "(()"
////输出: 2
////解释: 最长有效括号子串为 "()"
////
////
//// 示例 2:
////
//// 输入: ")()())"
////输出: 4
////解释: 最长有效括号子串为 "()()"
////
//// Related Topics 字符串 动态规划
//// 👍 951 👎 0
//
//
//import java.util.Deque;
//import java.util.LinkedList;
//import java.util.Queue;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
////    public int longestValidParentheses(String s) {
////
////    }
//
////    public static void main(String[] args) {
////        System.out.println(new Solution().longestValidParentheses("()()"));
////        System.out.println(new Solution().longestValidParentheses(")()())"));
////        System.out.println(new Solution().longestValidParentheses("()(()"));
////    }
//
////    public int longestValidParentheses(String s) {
////
////    }
//
//
//    public int longestValidParentheses(String s) {
//        int max = 0;
//        Deque<Integer> stack = new LinkedList<>();
//        stack.add(-1);
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '(') {
//                stack.push(i);
//            } else {
//                stack.pop();
//                if (stack.isEmpty()) {
//                    stack.push(i);
//                } else {
//                    max = Math.max(max, i - stack.peek());
//                }
//            }
//        }
//
//        return max;
//    }
//
//
////    public int longestValidParentheses(String s) {
////        Queue<Character> stack = new LinkedList<>();
////        int count = 0;
////        int lastCount = 0;
////        for (int i = 0; i < s.length(); i++) {
////            char ch = s.charAt(i);
////            if (ch == '(') {
////                stack.add(ch);
////            } else if (ch == ')') {
////                if (stack.size() > 0) {
////                    stack.poll();
////                    count += 2;
////                }else {
////                    lastCount = Math.max(count, lastCount);
////                    count = 0;
////                }
////            } else {
////                return Math.max(count, lastCount);
////            }
////        }
////        return Math.max(count, lastCount);
////    }
//}
////leetcode submit region end(Prohibit modification and deletion)
