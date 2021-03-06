//package com.company.leetcode.editor.cn;
////你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。这个地方所有的房屋都 围成一圈 ，这意味着第一个房屋和最后一个房屋是紧挨着的。同时，相邻的
////房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警 。
////
//// 给定一个代表每个房屋存放金额的非负整数数组，计算你 在不触动警报装置的情况下 ，能够偷窃到的最高金额。
////
////
////
//// 示例 1：
////
////
////输入：nums = [2,3,2]
////输出：3
////解释：你不能先偷窃 1 号房屋（金额 = 2），然后偷窃 3 号房屋（金额 = 2）, 因为他们是相邻的。
////
////
//// 示例 2：
////
////
////输入：nums = [1,2,3,1]
////输出：4
////解释：你可以先偷窃 1 号房屋（金额 = 1），然后偷窃 3 号房屋（金额 = 3）。
////     偷窃到的最高金额 = 1 + 3 = 4 。
////
//// 示例 3：
////
////
////输入：nums = [0]
////输出：0
////
////
////
////
//// 提示：
////
////
//// 1 <= nums.length <= 100
//// 0 <= nums[i] <= 1000
////
//// Related Topics 动态规划
//// 👍 406 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//
//    public static void main(String[] args) {
////        System.out.println(new Solution().robN(new int[]{2,7,9,3,1}, 0, 5));
//        System.out.println(new Solution().rob(new int[]{2, 3, 2}));
//        System.out.println(new Solution().rob(new int[]{1, 2, 3, 1}));
//        System.out.println(new Solution().rob(new int[]{0}));
//    }
//
//    public int rob(int[] nums) {
//        if (nums == null || nums.length == 0) {
//            return 0;
//        }
//        if (nums.length == 1) {
//            return nums[0];
//        }
//
//        int first = robN(nums, 0, nums.length - 2);
//        int last = robN(nums, 1, nums.length - 1);
//        return Math.max(first, last);
//    }
//
//    /**
//     *  [start, end]
//     * @param nums
//     * @param start
//     * @param end
//     * @return
//     */
//    private int robN(int[] nums, int start, int end) {
//        int n = end - start + 1;
//        int[][] dp = new int[n][2];
//        dp[0][0] = 0;
//        dp[0][1] = nums[start];
//        for (int i = 1; i < n; i++) {
//            // i0 表示当前没有偷，他的最大值就是
//            dp[i][0] = Math.max(dp[i-1][1], dp[i-1][0]);
//            dp[i][1] = dp[i-1][0] + nums[start + i];
//        }
//
//        return Math.max(dp[n-1][0], dp[n-1][1]);
//    }
//
//
//    /**
//     * 1 dp[i][*] 代表当前偷到最多钱的总和
//     * // 当前不偷，最大值就是前一个偷了，或者 没偷
//     * dp[i][0] = max(dp[i-1][1], dp[i-1][0])
//     * // 当前偷了 最大值，就是前一个没偷
//     * dp[i][1] = dp[i-1][0] + nums[i]
//     *
//     * @param nums
//     * @return
//     */
////    public int rob(int[] nums) {
////        if (nums == null || nums.length == 0) {
////            return 0;
////        }
////        int n = nums.length;
////        if (n == 1) {
////            return nums[0];
////        }
////        return Math.max(robN(nums, 0, n - 1), robN(nums, 1, n));
////    }
////
////    public int robN(int[] nums, int start, int end) {
////        int n = end - start;
//////        int[][] dp = new int[n][2];
//////        dp[0][0] = 0;
//////        dp[0][1] = nums[start];
////        int i0 = 0;
////        int i1 = nums[start];
////        for (int i = 1; i < n; i++) {
////            int i0Temp = i0;
//////            dp[i][0] = Math.max(dp[i - 1][1], dp[i - 1][0]);
////            i0 = Math.max(i1, i0Temp);
//////            dp[i][1] = dp[i - 1][0] + nums[start + i];
////            i1 = i0Temp + nums[start + i];
////        }
////        return Math.max(i0, i1);
//////        return Math.max(dp[n - 1][0], dp[n - 1][1]);
////    }
//
//}
////leetcode submit region end(Prohibit modification and deletion)
