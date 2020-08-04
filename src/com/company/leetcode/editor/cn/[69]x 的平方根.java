//package com.company.leetcode.editor.cn;//实现 int sqrt(int x) 函数。
////
//// 计算并返回 x 的平方根，其中 x 是非负整数。
////
//// 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
////
//// 示例 1:
////
//// 输入: 4
////输出: 2
////
////
//// 示例 2:
////
//// 输入: 8
////输出: 2
////说明: 8 的平方根是 2.82842...,
////     由于返回类型是整数，小数部分将被舍去。
////
//// Related Topics 数学 二分查找
//// 👍 462 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//
//    public static void main(String[] args) {
//        System.out.println(new Solution().mySqrt(9));
//    }
//
//    public int mySqrt(int x) {
//        long left = 0;
//        long right = x;
//        int ans = -1;
//        while (left <= right) {
//            long mid = left + (right - left)/ 2;
//            if (mid * mid <= x) {
//                left = mid + 1;
//                ans = (int) mid;
//            } else {
//                right = mid - 1;
//            }
//        }
//        return ans;
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
