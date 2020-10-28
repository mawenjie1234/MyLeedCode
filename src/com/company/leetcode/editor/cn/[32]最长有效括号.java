//package com.company.leetcode.editor.cn;
////给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。
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
//import java.util.Stack;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
////    public int longestValidParentheses(String s) {
////
////    }
//
////    public static void main(String[] args) {
//////        System.out.println(new Solution().longestValidParentheses("()()"));
////        System.out.println(new Solution().longestValidParentheses("()()"));
////
////        System.out.println(new Solution().longestValidParentheses(")()())"));
////        System.out.println(new Solution().longestValidParentheses("()(()"));
////    }
//
//    /**
//     * dp 方法
//     * dp[i] 表示第i个有效括号是多少个
//     * s[i] == ')'
//     * 检查前一个是否是'(' 如果是，那么 dp[i] = dp[i-2] + 2
//     * 不是，检查前 dp[i - dp[i-1] -1]
//     *
//     * @param s
//     * @return
//     */
//    public int longestValidParentheses(String s) {
//        int n = s.length();
//        int max = 0;
//        int[] dp = new int[n];
//        for (int i = 1; i < n; i++) {
//            if (s.charAt(i) == ')') {
//                if (s.charAt(i - 1) == '(') {
//                    dp[i] = (i > 1 ? dp[i - 2] : 0) + 2;
//                } else if (i - dp[i - 1] >= 1 && s.charAt(i - dp[i - 1] - 1) == '(') {
//                    dp[i] = dp[i - 1] + (i - dp[i - 1] >= 2 ? dp[i - dp[i - 1] - 2] : 0) + 2;
//                }
//                max = Math.max(max, dp[i]);
//            }
//        }
//        return max;
//    }
//
//    /**
//     * @param s
//     * @return dp 的算法, dp[i]  表示当前最大有多少个有效括号
//     * s[i] == ')' 那么就去检查之前是否有 （ 与之匹配
//     * 1 前一个是 '(' 那么 dp[i] = dp[i-2]  + 2;
//     * 2 前一个不是 '(' 有可能  (()')', 前3个是'(',  dp[i-1] 表示的是 （'(')） 第二个位置，
//     * 所以index = [i- dp[i-1] -1]表示第一个'(' 的位置，那么就检查s(index) 是不是'('
//     * 如果是, 那么 dp[i] = dp[i-1] + dp[第一个括号之前] + 2
//     * = dp[i-1] + dp[i-dp[i-1] -2] +2
//     */
////    public int longestValidParentheses(String s) {
////        int max = 0;
////        int[] dp = new int[s.length()];
////        for (int i = 1; i < s.length(); i++) {
////            if (s.charAt(i) == ')') {
////                if (s.charAt(i - 1) == '(') {
////                    dp[i] = (i > 1 ? dp[i - 2] : 0) + 2;
////                } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
////                    dp[i] = dp[i - 1] + (i - dp[i - 1] >= 2 ? dp[i - dp[i - 1] - 2] : 0) + 2;
////                }
////                max = Math.max(max, dp[i]);
////            }
////        }
////        return max;
////    }
//
////    public int longestValidParentheses1(String s) {
////        int max = 0;
////        Deque<Integer> stack = new LinkedList<Integer>();
////        stack.add(-1);
////        for (int i = 0; i < s.length(); i++) {
////            if(s.charAt(i) == '(') {
////                stack.push(i);
////            }else {
////                stack.pop();
////                if(stack.isEmpty()) {
////                    stack.push(i);
////                }else {
////                    max = Math.max(max, i - stack.peek());
////                }
////            }
////        }
////        return max;
////    }
////
////
////    public int longestValidParentheses(String s) {
////        int max = 0;
////        Deque<Integer> stack = new LinkedList<>();
////        stack.add(-1);
////        for (int i = 0; i < s.length(); i++) {
////            if (s.charAt(i) == '(') {
////                stack.push(i);
////            } else {
////                stack.pop();
////                if (stack.isEmpty()) {
////                    stack.push(i);
////                } else {
////                    max = Math.max(max, i - stack.peek());
////                }
////            }
////        }
////
////        return max;
////    }
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
