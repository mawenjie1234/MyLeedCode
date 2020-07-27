//package com.company.leetcode.editor.cn;
////实现 pow(x, n) ，即计算 x 的 n 次幂函数。
////
//// 示例 1:
////
//// 输入: 2.00000, 10
////输出: 1024.00000
////
////
//// 示例 2:
////
//// 输入: 2.10000, 3
////输出: 9.26100
////
////
//// 示例 3:
////
//// 输入: 2.00000, -2
////输出: 0.25000
////解释: 2-2 = 1/22 = 1/4 = 0.25
////
//// 说明:
////
////
//// -100.0 < x < 100.0
//// n 是 32 位有符号整数，其数值范围是 [−231, 231 − 1] 。
////
//// Related Topics 数学 二分查找
//// 👍 449 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
////    public static void main(String[] args) {
////        System.out.println(new Solution().myPow(2, 2));
////    }
//
//    public double myPow(double x, int n) {
//        return n < 0 ? 1/helper(x, -(long) n) : helper(x, (long)n);
//    }
//
//    private double helper(double x, long n) {
//        double res = 1.0;
//        double current = x;
//        while (n > 0) {
//            if(n % 2 == 1) {
//                res *= current;
//            }
//            current *= current;
//            n /= 2;
//        }
//        return res;
//    }
//
//
////    public double myPow(double x, int n) {
////        return n < 0 ? 1 / helper(x, -(long) n) : helper(x, n);
////    }
////
////    private double helper(double x, long n) {
////        if (n == 0) {
////            return 1.0;
////        }
////        double y = helper(x, n / 2);
////        return n % 2 == 0 ? y * y : y * y * x;
////    }
//
//
////    public double myPow(double x, int n) {
////        if (n == 0) {
////            return 1;
////        }
////        if (x == 1) {
////            return x;
////        }
////        if (n < 0) {
////            x = 1 / x;
////        }
////        double res = 1;
////        int iteratorCount = Math.abs(n);
////        for (int i = 0; i < iteratorCount; i++) {
////            res *= x;
////        }
////        return res;
////    }
//
////    private double helper(double x, ) {
////
////    }
//}
////leetcode submit region end(Prohibit modification and deletion)
