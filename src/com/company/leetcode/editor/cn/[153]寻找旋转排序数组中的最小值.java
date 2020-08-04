//package com.company.leetcode.editor.cn;
////假设按照升序排序的数组在预先未知的某个点上进行了旋转。
////
//// ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
////
//// 请找出其中最小的元素。
////
//// 你可以假设数组中不存在重复元素。
////
//// 示例 1:
////
//// 输入: [3,4,5,1,2]
////输出: 1
////
//// 示例 2:
////
//// 输入: [4,5,6,7,0,1,2]
////输出: 0
//// Related Topics 数组 二分查找
//// 👍 227 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
////    public static void main(String[] args) {
////        int[] nums = {5,1,3};
////        System.out.println(new Solution().findMin(nums));
////    }
//
//    public int findMin(int[] nums) {
//        int left = 0;
//        int right = nums.length - 1;
//        int min = Integer.MAX_VALUE;
//        while (left <= right) {
//            int mid = (left + right) / 2;
//            min = Math.min(nums[mid], min);
//            if (nums[left] <= nums[right]) {
//                right = mid - 1;
//            } else {
//                left = mid + 1;
//            }
//        }
//        return min;
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
