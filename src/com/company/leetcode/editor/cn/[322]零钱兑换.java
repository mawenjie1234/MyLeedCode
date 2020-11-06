//package com.company.leetcode.editor.cn;
////给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回
//// -1。
////
////
////
//// 示例 1:
////
//// 输入: coins = [1, 2, 5], amount = 11
////输出: 3
////解释: 11 = 5 + 5 + 1
////
//// 示例 2:
////
//// 输入: coins = [2], amount = 3
////输出: -1
////
////
////
//// 说明:
////你可以认为每种硬币的数量是无限的。
//// Related Topics 动态规划
//// 👍 724 👎 0
//
//
//import java.util.Arrays;
//import java.util.Collections;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public static void main(String[] args) {
//        System.out.println(new Solution().coinChange(new int[]{1, 2, 5}, 11));
//        System.out.println(new Solution().coinChange(new int[]{2}, 3));
//    }
//
//    // dp[i] 表示第i个最小硬币数量，那么
//    // for each coins
//    // dp[i] = min(dp[i - coin] + 1, dp[i])
//    public int coinChange(int[] coins, int amount) {
//        int n = amount + 1;
//        int[] dp = new int[n];
//        dp[0] = 0;
//        for (int i = 1; i < n; i++) {
//            int min = n;
//            for (int j = 0; j < coins.length; j++) {
//                int before = i - coins[j];
//                if (before >= 0) {
//                    min = Math.min(min, dp[i - coins[j]] + 1);
//                }
//            }
//            dp[i] = min;
//        }
//        return dp[amount] > amount ? -1 : dp[amount];
//    }
//
////    public int coinChange(int[] coins, int amount) {
////        int[] dp = new int[amount + 1];
////        dp[0] = 0;
////        for (int i = 1; i <= amount; i++) {
////            int min = amount + 1;
////            for (int j = 0; j < coins.length; j++) {
////                int before = i - coins[j];
////                if(before >= 0) {
////                    min = Math.min(min, dp[i - coins[j]] + 1);
////                }
////            }
////            dp[i] = min;
////        }
////        return dp[amount] > amount ? -1 : dp[amount];
////    }
//
//
////    public int coinChange(int[] coins, int amount) {
////        if (amount < 1) {
////            return 0;
////        }
////        return coinChange(coins, amount, new int[amount]);
////    }
////
////    private int coinChange(int[] coins, int rem, int[] count) {
////        if (rem < 0) {
////            return -1;
////        }
////        if (rem == 0) {
////            return 0;
////        }
////        if (count[rem - 1] != 0) {
////            return count[rem - 1];
////        }
////        int min = Integer.MAX_VALUE;
////        for (int coin : coins) {
////            int res = coinChange(coins, rem - coin, count);
////            if (res >= 0 && res < min) {
////                min = 1 + res;
////            }
////        }
////        count[rem - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
////        return count[rem - 1];
////    }
//
//
////    public int coinChange(int[] coins, int amount) {
////        if(amount < 1) return 0;
////        return helper(coins, amount, new int[amount]);
////    }
////
////    private int helper(int[] coins, int rem, int[] count) {
////        if(rem < 0) {
////            return -1;
////        }
////        if(rem == 0) {
////            return 0;
////        }
////        if(count[rem-1] != 0) return count[rem-1];
////        int min = Integer.MAX_VALUE;
////        for (int coin: coins) {
////            int res = helper(coins, rem - coin, count);
////            if(res >= 0 && res < min) {
////                min = 1 + res;
////            }
////        }
////        count[rem -1] = (min == Integer.MAX_VALUE) ? -1 : min;
////        return count[rem -1];
////    }
//}
////leetcode submit region end(Prohibit modification and deletion)
