//package com.company.leetcode.editor.cn;
////给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
////
//// 示例:
////
//// 输入: n = 4, k = 2
////输出:
////[
////  [2,4],
////  [3,4],
////  [2,3],
////  [1,2],
////  [1,3],
////  [1,4],
////]
//// Related Topics 回溯算法
//// 👍 316 👎 0
//
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.List;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//
////    public static void main(String[] args) {
////        List<List<Integer>> res = new Solution().combine(4, 2);
////        for (List<Integer> row : res) {
////            for (Integer value : row) {
////                System.out.print(value);
////                System.out.print(",");
////            }
////            System.out.println();
////        }
////    }
//
//    public List<List<Integer>> combine(int n, int k) {
//        List<List<Integer>> res = new LinkedList<>();
//        helper(res, 1, new LinkedList<>(), n, k);
//        return res;
//    }
//
//    private void helper(List<List<Integer>> res, Integer current,LinkedList<Integer> currentRes, int n, int k) {
//        if(currentRes.size() == k) {
//            res.add(new LinkedList<>(currentRes));
//        }
//        for (int i = current; i <= n; ++i) {
//            currentRes.addLast(i);
//            helper(res, i+1, currentRes, n, k);
//            currentRes.removeLast();
//        }
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
