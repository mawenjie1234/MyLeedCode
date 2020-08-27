//package com.company.leetcode.editor.cn;
////给出一个区间的集合，请合并所有重叠的区间。
////
////
////
//// 示例 1:
////
//// 输入: intervals = [[1,3],[2,6],[8,10],[15,18]]
////输出: [[1,6],[8,10],[15,18]]
////解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
////
////
//// 示例 2:
////
//// 输入: intervals = [[1,4],[4,5]]
////输出: [[1,5]]
////解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
////
//// 注意：输入类型已于2019年4月15日更改。 请重置默认代码定义以获取新方法签名。
////
////
////
//// 提示：
////
////
//// intervals[i][0] <= intervals[i][1]
////
//// Related Topics 排序 数组
//// 👍 580 👎 0
//
//
//import java.util.ArrayList;
//import java.util.List;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public static void main(String[] args) {
//        int[][] nums = {{5, 6}, {1, 2}};
//        new Solution().mergeSort(nums, 0, nums.length - 1);
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print("[");
//            for (int j = 0; j < nums[i].length; j++) {
//                System.out.print(nums[i][j]);
//                System.out.print(",");
//            }
//            System.out.print("]");
//        }
//    }
//
//    public int[][] merge(int[][] intervals) {
//        mergeSort(intervals, 0 , intervals.length-1);
//        List<List<Integer>> res = new ArrayList<>();
//        int lastRight = intervals[0][1];
//        for (int i = 0; i < intervals.length; i++) {
//            
//        }
//    }
//
//    private void mergeSort(int[][] intervals, int left, int right) {
//        if (left >= right) {
//            return;
//        }
//        int mid = (left + right) >> 1;
//        mergeSort(intervals, left, mid);
//        mergeSort(intervals, mid + 1, right);
//        mergeRes(intervals, left, mid, right);
//    }
//
//    private void mergeRes(int[][] intervals, int left, int mid, int right) {
//        int i = left;
//        int j = mid + 1;
//        int index = 0;
//        int[][] array = new int[right - left + 1][2];
//        while (i <= mid && j <= right) {
//            array[index++] = intervals[i][0] < intervals[j][0] ? intervals[i++] : intervals[j++];
//        }
//        while (i <= mid) {
//            array[index++] = intervals[i++];
//        }
//        while (j <= right) {
//            array[index++] = intervals[j++];
//        }
//        for (int k = 0; k < array.length; k++) {
//            intervals[left + k] = array[k];
//        }
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
