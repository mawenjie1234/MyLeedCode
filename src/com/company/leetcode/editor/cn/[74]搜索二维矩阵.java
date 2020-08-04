//package com.company.leetcode.editor.cn;
////编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
////
////
//// 每行中的整数从左到右按升序排列。
//// 每行的第一个整数大于前一行的最后一个整数。
////
////
//// 示例 1:
////
//// 输入:
////matrix = [
////  [1,   3,  5,  7],
////  [10, 11, 16, 20],
////  [23, 30, 34, 50]
////]
////target = 3
////输出: true
////
////
//// 示例 2:
////
//// 输入:
////matrix = [
////  [1,   3,  5,  7],
////  [10, 11, 16, 20],
////  [23, 30, 34, 50]
////]
////target = 13
////输出: false
//// Related Topics 数组 二分查找
//// 👍 216 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
////    public static void main(String[] args) {
////        int[][] matrix = {
////                {1, 3, 5, 7},
////                {10, 11, 16, 20},
////                {23, 30, 34, 50}
////        };
////        System.out.println(new Solution().searchMatrix(matrix, 10));
////        System.out.println(new Solution().searchMatrix(matrix, 19));
////    }
//
//    public boolean searchMatrix(int[][] matrix, int target) {
//        int column = matrix.length;
//        if(column == 0) {
//            return false;
//        }
//        int row = matrix[0].length;
//        if(row == 0) {
//            return false;
//        }
//
//        int left = 0;
//        int right = row * column - 1;
//        while (left <= right) {
//            int mid = (left + right) / 2;
//            int x = mid / row;
//            int y = mid % row;
//            int midValue = matrix[x][y];
//            if (midValue == target) {
//                return true;
//            }
//            if (midValue < target) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//        return false;
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
