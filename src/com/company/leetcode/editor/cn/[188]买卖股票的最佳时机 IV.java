//package com.company.leetcode.editor.cn;//给定一个整数数组 prices ，它的第 i 个元素 prices[i] 是一支给定的股票在第 i 天的价格。
////
//// 设计一个算法来计算你所能获取的最大利润。你最多可以完成 k 笔交易。
////
//// 注意: 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
////
////
////
//// 示例 1：
////
////
////输入：k = 2, prices = [2,4,1]
////输出：2
////解释：在第 1 天 (股票价格 = 2) 的时候买入，在第 2 天 (股票价格 = 4) 的时候卖出，这笔交易所能获得利润 = 4-2 = 2 。
////
//// 示例 2：
////
////
////输入：k = 2, prices = [3,2,6,5,0,3]
////输出：7
////解释：在第 2 天 (股票价格 = 2) 的时候买入，在第 3 天 (股票价格 = 6) 的时候卖出, 这笔交易所能获得利润 = 6-2 = 4 。
////     随后，在第 5 天 (股票价格 = 0) 的时候买入，在第 6 天 (股票价格 = 3) 的时候卖出, 这笔交易所能获得利润 = 3-0 = 3
////。
////
////
////
//// 提示：
////
////
//// 0 <= k <= 109
//// 0 <= prices.length <= 104
//// 0 <= prices[i] <= 1000
////
//// Related Topics 动态规划
//// 👍 314 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
////    public static void main(String[] args) {
//////        int[] p = {3, 2, 6, 5, 0, 3};
//////
//////        System.out.println(new Solution().maxProfit(2, p));
//////        System.out.println(new Solution().maxProfit(2, new int[]{2, 4, 1}));
////
////        int[] prices1 = {3,3,5,0,0,3,1,4};
////        System.out.println(new Solution().maxProfit(prices1));
////    }
//
//    public int maxProfit(int kM, int[] prices) {
//        int n = prices.length;
//        if(n < 1) {
//            return 0;
//        }
//        if (kM > n) {
//            return maxProfit(prices);
//        }
//        int[][][] dp = new int[n][kM + 1][2];
//        for (int i = 0; i < n; i++) {
//            for (int k = kM; k >= 1; k--) {
//                if (i == 0) {
//                    dp[i][k][0] = 0;
//                    dp[i][k][1] = -prices[i];
//                    continue;
//                }
//                dp[i][k][0] = Math.max(dp[i - 1][k][0], dp[i - 1][k][1] + prices[i]);
//                // 当前有， 前一天也有，或者前一天没有，但是买了
//                dp[i][k][1] = Math.max(dp[i - 1][k][1], dp[i - 1][k - 1][0] - prices[i]);
//            }
//        }
//        return dp[n - 1][kM][0];
//    }
//
//    private int maxProfit(int[] prices) {
//        int n = prices.length;
//        int[][] dp = new int[n][2];
//        dp[0][0] = 0;
//        dp[0][1] = -prices[0];
//        for (int i = 1; i < n; i++) {
//            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
//            // 当前有， 前一天也有，或者前一天没有，但是买了
//            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
//
//        }
//        return dp[n - 1][0];
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
