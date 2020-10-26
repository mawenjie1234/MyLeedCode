//package com.company.leetcode.editor.cn;
////给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
////
//// 如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。
////
//// 注意：你不能在买入股票前卖出股票。
////
////
////
//// 示例 1:
////
//// 输入: [7,1,5,3,6,4]
////输出: 5
////解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
////     注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
////
////
//// 示例 2:
////
//// 输入: [7,6,4,3,1]
////输出: 0
////解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
////
//// Related Topics 数组 动态规划
//// 👍 1240 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public static void main(String[] args) {
//        int[] arg = {7, 1, 5, 3, 6, 4};
//        System.out.println(new Solution().maxProfit(arg));
//    }
//
//    public int maxProfit(int[] prices) {
//        int n = prices.length;
//        if (n < 1) {
//            return 0;
//        }
//        int[][] dp = new int[n][2];
//        dp[0][0] = 0;
//        dp[0][1] = -prices[0];
//        for (int i = 1; i < n; i++) {
//            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
//            dp[i][1] = Math.max(dp[i - 1][1], -prices[i]);
//        }
//        return dp[n - 1][0];
//    }
//
////    dp[i][k][0] = max(dp[i-1][k][0], dp[i-1][k][1] + prices[i])
////    max(   选择 rest  ,             选择 sell      )
////
////    解释：今天我没有持有股票，有两种可能：
////    要么是我昨天就没有持有，然后今天选择 rest，所以我今天还是没有持有；
////    要么是我昨天持有股票，但是今天我 sell 了，所以我今天没有持有股票了。
////
////    dp[i][k][1] = max(dp[i-1][k][1], dp[i-1][k-1][0] - prices[i])
////    max(   选择 rest  ,           选择 buy         )
////
////    解释：今天我持有着股票，有两种可能：
////    要么我昨天就持有着股票，然后今天选择 rest，所以我今天还持有着股票；
////    要么我昨天本没有持有，但今天我选择 buy，所以今天我就持有股票了。
////
////    作者：labuladong
////    链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-iii/solution/yi-ge-tong-yong-fang-fa-tuan-mie-6-dao-gu-piao-wen/
////    来源：力扣（LeetCode）
////    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
//
//
////    public int maxProfit(int[] prices) {
////        int min = Integer.MAX_VALUE;
////        int max = 0;
////        for (int i = 0; i < prices.length; i++) {
////            if (prices[i] < min) {
////                min = prices[i];
////            } else if (prices[i] - min > max) {
////                max = prices[i] - min;
////            }
////        }
////        return max;
////    }
//
//
//    // 最简单的二维遍历
////    public int maxProfit(int[] prices) {
////        int max = 0;
////        for (int i = 0; i < prices.length; i++) {
////            for (int j = i+1; j < prices.length; j++) {
////                max = Math.max(prices[j] - prices[i], max);
////            }
////        }
////        return max;
////    }
//}
////leetcode submit region end(Prohibit modification and deletion)
