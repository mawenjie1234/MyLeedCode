//package com.company.leetcode.editor.cn;
////给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
////
//// 说明：不要使用任何内置的库函数，如 sqrt。
////
//// 示例 1：
////
//// 输入：16
////输出：True
////
//// 示例 2：
////
//// 输入：14
////输出：False
////
//// Related Topics 数学 二分查找
//// 👍 152 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//
////    public static void main(String[] args) {
////        System.out.println(new Solution().isPerfectSquare(9));
////    }
//
//    public boolean isPerfectSquare(int num) {
//        long left = 0;
//        long right = num;
//        int ans = -1;
//        while (left <= right) {
//            long mid = left + (right - left) / 2;
//            if (mid * mid <= num) {
//                left = mid + 1;
//                ans = (int)mid;
//            } else {
//                right = mid - 1;
//            }
//        }
//        return ans * ans == num;
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
