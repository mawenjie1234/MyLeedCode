//package com.company.leetcode.editor.cn;
////给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
////
//// 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
////
//// 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
////
////
////
//// 示例 1:
////
//// 输入: [7,1,5,3,6,4]
////输出: 7
////解释: 在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
////     随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6-3 = 3 。
////
////
//// 示例 2:
////
//// 输入: [1,2,3,4,5]
////输出: 4
////解释: 在第 1 天（股票价格 = 1）的时候买入，在第 5 天 （股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
////     注意你不能在第 1 天和第 2 天接连购买股票，之后再将它们卖出。
////     因为这样属于同时参与了多笔交易，你必须在再次购买前出售掉之前的股票。
////
////
//// 示例 3:
////
//// 输入: [7,6,4,3,1]
////输出: 0
////解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
////
////
////
//// 提示：
////
////
//// 1 <= prices.length <= 3 * 10 ^ 4
//// 0 <= prices[i] <= 10 ^ 4
////
//// Related Topics 贪心算法 数组
//// 👍 797 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//
//    public static void main(String[] args) {
//        int[] prices = {7,1,5,3,6,4};
//        System.out.println(new Solution().maxProfit1(prices));
//    }
//
//    public int maxProfit1(int[] prices) {
//        int i_0 = 0;
//        int i_1 = Integer.MIN_VALUE; // 关键点
//        for (int i = 0; i < prices.length; i++) {
//            int temp = i_0;
//            i_0 = Math.max(temp, i_1 + prices[i]);
//            i_1 = Math.max(i_1, temp - prices[i]);
//        }
//        return i_0;
////        dp[i][0] = Math.max(dp[i-1][0] , dp[i-1][1] + prices[i]);
////        dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i]);
//    }
////    dp[i][1][0] = max(dp[i-1][1][0], dp[i-1][1][1] + prices[i])
////    dp[i][1][1] = max(dp[i-1][1][1], dp[i-1][0][0] - prices[i])
////            = max(dp[i-1][1][1], -prices[i])
////    解释：k = 0 的 base case，所以 dp[i-1][0][0] = 0。
////
////    现在发现 k 都是 1，不会改变，即 k 对状态转移已经没有影响了。
////    可以进行进一步化简去掉所有 k：
////    dp[i][0] = max(dp[i-1][0], dp[i-1][1] + prices[i])
////    dp[i][1] = max(dp[i-1][1], -prices[i])
////
////    作者：labuladong
////    链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-iii/solution/yi-ge-tong-yong-fang-fa-tuan-mie-6-dao-gu-piao-wen/
////    来源：力扣（LeetCode）
////    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
//
//
////    public int maxProfit(int[] prices) {
////        int maxCount = 0;
////        for (int i = 1; i < prices.length; i++) {
////            if(prices[i] > prices[i -1]) {
////                maxCount += prices[i] - prices[i-1];
////            }
////        }
////        return maxCount;
////    }
//}
////leetcode submit region end(Prohibit modification and deletion)
