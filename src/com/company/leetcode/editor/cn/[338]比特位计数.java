//package com.company.leetcode.editor.cn;
////给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。
////
//// 示例 1:
////
//// 输入: 2
////输出: [0,1,1]
////
//// 示例 2:
////
//// 输入: 5
////输出: [0,1,1,2,1,2]
////
//// 进阶:
////
////
//// 给出时间复杂度为O(n*sizeof(integer))的解答非常容易。但你可以在线性时间O(n)内用一趟扫描做到吗？
//// 要求算法的空间复杂度为O(n)。
//// 你能进一步完善解法吗？要求在C++或任何其他语言中不使用任何内置函数（如 C++ 中的 __builtin_popcount）来执行此操作。
////
//// Related Topics 位运算 动态规划
//// 👍 390 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
////    public static void main(String[] args) {
////        int[] res = new Solution().countBits(5);
////        for (int i = 0; i < res.length; i++) {
////            System.out.println(res[i]);
////        }
////    }
//
//    public int[] countBits(int num) {
//        int[] res = new int[num + 1];
//        for (int i = 1; i <= num; i++) {
//            res[i] = res[(i & (i - 1))] + 1;
//        }
//        return res;
//    }
//
//
//    /**
//     * 第i个有几个1 是 i/2 个个数加上i的最后一位是否是1
//     *
//     * @param num
//     * @return
//     */
////    public int[] countBits(int num) {
////        int[] res = new int[num + 1];
////        for (int i = 1; i <= num; i++) {
////            res[i] = res[i >> 1] + (i & 1);
////        }
////        return res;
////    }
//
//
////    public int[] countBits(int num) {
////        int[] res = new int[num + 1];
////        int i = 0;
////        int b = 1;
////        while (b <= num) {
////            while (i < b && b + i <= num) {
////                res[i + b] = res[i] + 1;
////                i++;
////            }
////            i = 0;
////            b <<= 1;
////        }
////        return res;
////    }
//
//
//    /**
//     * 高位有效，[0~b] => {b~2b}
//     * @param num
//     * @return
//     */
////    public int[] countBits(int num) {
////        int[] res = new int[num + 1];
////        int i = 0;
////        int b = 1;
////        while (b <= num) {
////            while (i < b && i + b <= num) {
////                res[i + b] = res[i] + 1;
////                i++;
////            }
////            i = 0;
////            // b : 1, 2, 4, 8, 16
////            b <<= 1;
////        }
////        return res;
////    }
//
//
////    public int[] countBits(int num) {
////        int[] res = new int[num + 1];
////        for (int i = 0; i <= num; i++) {
////            res[i] = helper(i);
////        }
////        return res;
////    }
////
////    private int helper(int num) {
////        int res = 0;
////        while (num != 0) {
////            if ((num & 1) == 1) {
////                res++;
////            }
////            num >>= 1;
////        }
////        return res;
////    }
//}
////leetcode submit region end(Prohibit modification and deletion)
