//package com.company.leetcode.editor.cn;
////给你一个整数数组 nums ，请你找出数组中乘积最大的连续子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。
////
////
////
//// 示例 1:
////
//// 输入: [2,3,-2,4]
////输出: 6
////解释: 子数组 [2,3] 有最大乘积 6。
////
////
//// 示例 2:
////
//// 输入: [-2,0,-1]
////输出: 0
////解释: 结果不能为 2, 因为 [-2,-1] 不是子数组。
//// Related Topics 数组 动态规划
//// 👍 814 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//
////    public static void main(String[] args) {
//////        System.out.println(new Solution().maxProduct(new int[]{2, 3, -2, 4}));
//////
//////        System.out.println(new Solution().maxProduct(new int[]{-2, 0, -1}));
//////        System.out.println(new Solution().maxProduct(new int[]{2, 3, 0, 0, 4, 5}));
//////        System.out.println(new Solution().maxProduct(new int[]{-2}));
//////        System.out.println(new Solution().maxProduct(new int[]{3, -1, 4}));
////    }
//
//    /**
//     * 用dp做的话，如果dp定义是 dp[i] 是当前最大的乘积，
//     * 为啥不能遍历直接乘出最后结果，是因为如果中间有0, 那么 可能就都为0了，
//     * if nums[i-1] != 0
//     * dp[i] = dp[i]
//     * else
//     * dp[i] = nums[i]
//     *
//     * @param nums
//     * @return
//     */
//    public int maxProduct(int[] nums) {
//        int n = nums.length;
//        if (n <= 0) {
//            return 0;
//        }
//        int[] maxdp = new int[n];
//        maxdp[0] = nums[0];
//        int[] mindp = new int[n];
//        mindp[0] = nums[0];
//        for (int i = 1; i < n; i++) {
//            maxdp[i] = Math.max(nums[i] * maxdp[i - 1], Math.max(nums[i], mindp[i - 1] * nums[i]));
//            mindp[i] = Math.min(nums[i] * mindp[i - 1], Math.min(nums[i], maxdp[i - 1] * nums[i]));
//        }
//        int ans = maxdp[0];
//        for (int i = 1; i < n; ++i) {
//            ans = Math.max(ans, maxdp[i]);
//        }
//
//        return ans;
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
