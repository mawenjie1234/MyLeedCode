//package com.company.leetcode.editor.cn;
////假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
////
//// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
////
//// 注意：给定 n 是一个正整数。
////
//// 示例 1：
////
//// 输入： 2
////输出： 2
////解释： 有两种方法可以爬到楼顶。
////1.  1 阶 + 1 阶
////2.  2 阶
////
//// 示例 2：
////
//// 输入： 3
////输出： 3
////解释： 有三种方法可以爬到楼顶。
////1.  1 阶 + 1 阶 + 1 阶
////2.  1 阶 + 2 阶
////3.  2 阶 + 1 阶
////
//// Related Topics 动态规划
//
//
////leetcode submit region begin(Prohibit modification and deletion)
////假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
////
////        每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
////
////        注意：给定 n 是一个正整数。
//
//import java.util.HashMap;
//
//class Solution {
//    public static void main(String[] args) {
//        System.out.println(new Solution().climbStairs(4));
//    }
//
//    public int climbStairs(int n) {
//        if(n < 3) {
//            return n;
//        }
//        int stairs = 0;
//        int first = 1;
//        int sed = 2;
//        for (int i = 3; i <= n; i++) {
//            stairs = first + sed;
//            first = sed;
//            sed = stairs;
//        }
//        return stairs;
//    }
//
//
////    public int climbStairs(int n) {
////        HashMap<Integer, Integer> progress = new HashMap<>();
////        return helper(n, progress);
////    }
////
////    private int helper(int n, HashMap<Integer, Integer> progress) {
////        if (progress.containsKey(n)) {
////            return progress.get(n);
////        }
////        int res;
////        if (n == 1 || n == 2) {
////            res = n;
////        } else {
////            res = helper(n -1, progress) + helper(n - 2, progress);
////        }
////        progress.put(n, res);
////        return res;
////    }
//}
//
//
//// 第二遍
////class Solution {
////    public int climbStairs(int n) {
////        if(n < 3) {
////            return n;
////        }
////        int state = 0, first = 1, sec = 2;
////        for (int i = 3; i < n + 1; i++) {
////            state = first + sec;
////            first = sec;
////            sec = state;
////        }
////        return state;
////    }
////}
//
//
////leetcode submit region end(Prohibit modification and deletion)
