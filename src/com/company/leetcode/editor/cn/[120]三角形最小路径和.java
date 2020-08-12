//package com.company.leetcode.editor.cn;
////给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
////
//// 相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。
////
////
////
//// 例如，给定三角形：
////
//// [
////     [2],
////    [3,4],
////   [6,5,7],
////  [4,1,8,3]
////]
////
////
//// 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
////
////
////
//// 说明：
////
//// 如果你可以只使用 O(n) 的额外空间（n 为三角形的总行数）来解决这个问题，那么你的算法会很加分。
//// Related Topics 数组 动态规划
//// 👍 563 👎 0
//
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//
////    public static void main(String[] args) {
////        List<List<Integer>> lists = new ArrayList<>();
////        lists.add(Collections.singletonList(2));
////        lists.add(Arrays.asList(3, 4));
////        lists.add(Arrays.asList(6, 5, 7));
////        lists.add(Arrays.asList(4, 1, 8, 3));
////        System.out.println(new Solution().minimumTotal(lists));
////    }
//
//    public int minimumTotal(List<List<Integer>> triangle) {
//        int n = triangle.size();
//        int[] f = new int[n];
//        f[0] = triangle.get(0).get(0);
//        for (int i = 1; i < n; i++) {
//            f[i] = f[i - 1] + triangle.get(i).get(i);
//            for (int j = i - 1; j > 0; j--) {
//                f[j] = Math.min(f[j - 1], f[j]) + triangle.get(i).get(j);
//            }
//            f[0] += triangle.get(i).get(0);
//        }
//
//        int min = f[0];
//        for (int i = 1; i < n; i++) {
//            min = Math.min(f[i], min);
//        }
//        return min;
//    }
//
//
////    public int minimumTotal(List<List<Integer>> triangle) {
////        int n = triangle.size();
////        int[][] f = new int[2][n];
////        f[0][0] = triangle.get(0).get(0);
////        for (int i = 1; i < n; i++) {
////            int cur = i % 2;
////            int pre = 1 - cur;
////            f[cur][0] = f[pre][0] + triangle.get(i).get(0);
////            for (int j = 1; j < i; j++) {
////                f[cur][j] = Math.min(f[pre][j], f[pre][j - 1]) + triangle.get(i).get(j);
////            }
////            f[cur][i] = f[pre][i - 1] + triangle.get(i).get(i);
////        }
////        int min = f[(n - 1) % 2][0];
////        for (int i = 1; i < n; i++) {
////            min = Math.min(f[(n - 1) % 2][i], min);
////        }
////        return min;
////    }
//
//
////    public int minimumTotal(List<List<Integer>> triangle) {
////        int n = triangle.size();
////        int[][] f = new int[n][n];
////        f[0][0] = triangle.get(0).get(0);
////        for (int i = 1; i < n; i++) {
////            f[i][0] = f[i-1][0] + triangle.get(i).get(0);
////            for (int j = 1; j < i; j++) {
////                f[i][j] = Math.min(f[i-1][j], f[i-1][j-1]) + triangle.get(i).get(j);
////            }
////            f[i][i] = f[i-1][i-1] + triangle.get(i).get(i);
////        }
////        int res = f[n-1][0];
////        for (int i = 1; i < n; i++) {
////            res = Math.min(f[n-1][i], res);
////        }
////        return res;
////    }
//}
////leetcode submit region end(Prohibit modification and deletion)
