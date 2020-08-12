//package com.company.leetcode.editor.cn;
////一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
////
//// 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
////
//// 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
////
////
////
//// 网格中的障碍物和空位置分别用 1 和 0 来表示。
////
//// 说明：m 和 n 的值均不超过 100。
////
//// 示例 1:
////
//// 输入:
////[
////  [0,0,0],
////  [0,1,0],
////  [0,0,0]
////]
////输出: 2
////解释:
////3x3 网格的正中间有一个障碍物。
////从左上角到右下角一共有 2 条不同的路径：
////1. 向右 -> 向右 -> 向下 -> 向下
////2. 向下 -> 向下 -> 向右 -> 向右
////
//// Related Topics 数组 动态规划
//// 👍 392 👎 0
//
//
//import java.util.Arrays;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
////    public static void main(String[] args) {
//////        int[][] nums = {
//////                {0, 0, 0},
//////                {0, 1, 0},
//////                {0, 0, 0}
//////        };
////        int[][] nums = {
////                {0, 1}
////        };
////        System.out.println(new Solution().uniquePathsWithObstacles(nums));
////    }
//
//    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//        if (obstacleGrid == null || obstacleGrid.length == 0) {
//            return 0;
//        }
//        int m = obstacleGrid.length, n = obstacleGrid[0].length;
//        int[][] dp = new int[m][n];
//        for (int i = 0; i < m && obstacleGrid[i][0] == 0; i++) {
//            dp[i][0] = 1;
//        }
//        for (int i = 0; i < n && obstacleGrid[0][i] == 0; i++) {
//            dp[0][i] = 1;
//        }
//        for (int i = 1; i < m; i++) {
//            for (int j = 1; j < n; j++) {
//                if (obstacleGrid[i][j] == 0) {
//                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
//                }
//            }
//        }
//        return dp[m-1][n-1];
//    }
//
//
////    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
////        int row = obstacleGrid.length;
////        int column = obstacleGrid[0].length;
////        int[] f = new int[column];
////        f[0] = obstacleGrid[0][0] == 0 ? 1 : 0;
////        for (int i = 0; i < row; i++) {
////            for (int j = 0; j < column; j++) {
////                if (obstacleGrid[i][j] == 1) {
////                    f[j] = 0;
////                    continue;
////                }
////                if (j - 1 >= 0 && obstacleGrid[i][j - 1] == 0) {
////                    f[j] += f[j - 1];
////                }
////            }
////        }
////        return f[column - 1];
////    }
//}
////leetcode submit region end(Prohibit modification and deletion)
